package emu.lunarcore;

import java.io.*;

import org.jline.reader.EndOfFileException;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.LineReaderImpl;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ch.qos.logback.classic.Logger;
import emu.lunarcore.command.CommandManager;
import emu.lunarcore.data.ResourceLoader;
import emu.lunarcore.database.DatabaseManager;
import emu.lunarcore.server.game.GameServer;
import emu.lunarcore.server.http.HttpServer;
import emu.lunarcore.util.Handbook;
import emu.lunarcore.util.JsonUtils;
import lombok.Getter;

import javax.swing.*;

public class LunarCore {
    private static final Logger log = (Logger) LoggerFactory.getLogger(LunarCore.class);
    private static File configFile = new File("./config.json");
    @Getter private static Config config;

    @Getter private static DatabaseManager accountDatabase;
    @Getter private static DatabaseManager gameDatabase;

    @Getter private static HttpServer httpServer;
    @Getter private static GameServer gameServer;

    @Getter private static CommandManager commandManager;
    @Getter private static ServerType serverType = ServerType.BOTH;

    private static LineReaderImpl reader;
    @Getter private static boolean usingDumbTerminal;

    static {
        // Setup console reader
        try {
            reader = (LineReaderImpl) LineReaderBuilder.builder()
                    .terminal(TerminalBuilder.builder().dumb(true).build())
                    .build();

            usingDumbTerminal = Terminal.TYPE_DUMB.equals(reader.getTerminal().getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load config
        LunarCore.loadConfig();
    }

    public static void main(String[] args) {
        // Start Server
        JOptionPane.showMessageDialog(null,"项目永久免费，倒卖者死全家！！项目由Mr.Su编译打包！ 频道号：79ce679ob6","消息提示",JOptionPane.WARNING_MESSAGE);
        LunarCore.getLogger().info("项目永久免费，倒卖者死全家！！项目由Mr.Su编译打包！ 频道号：79ce679ob6");
        LunarCore.getLogger().info("Starting Lunar Core...");
        LunarCore.getLogger().info("Git hash: " + getGitHash());
        LunarCore.getLogger().info("Game version: " + GameConstants.VERSION);
        boolean generateHandbook = true;

        // Load commands
        LunarCore.commandManager = new CommandManager();

        // Parse arguments
        for (String arg : args) {
            switch (arg) {
            case "-dispatch":
                serverType = ServerType.DISPATCH;
                break;
            case "-game":
                serverType = ServerType.GAME;
                break;
            case "-nohandbook":
            case "-skiphandbook":
                generateHandbook = false;
                break;
            case "-database":
                // Database only
                DatabaseManager.startInternalMongoServer(LunarCore.getConfig().getInternalMongoServer());
                LunarCore.getLogger().info("Running local mongo server at " + DatabaseManager.getServer().getConnectionString());
                // Console
                LunarCore.startConsole();
                return;
            }
        }

        // Skip these if we are only running the http server in dispatch mode
        if (serverType.runGame()) {
            // Load resources
            ResourceLoader.loadAll();

            // Build handbook
            if (generateHandbook) {
                Handbook.generate();
            }
        }

        try {
            // Start Database(s)
            LunarCore.initDatabases();
        } catch (Exception exception) {
            LunarCore.getLogger().error("Unable to start the database(s).", exception);
        }

        try {
            // Always run http server as it is needed by for dispatch and gateserver
            httpServer = new HttpServer(serverType);
            httpServer.start();
        } catch (Exception exception) {
            LunarCore.getLogger().error("Unable to start the HTTP server.", exception);
        }

        // Start game server
        if (serverType.runGame()) try {
            gameServer = new GameServer(getConfig().getGameServer());
            gameServer.start();
        } catch (Exception exception) {
            LunarCore.getLogger().error("Unable to start the game server.", exception);
        }

        // Hook into shutdown event
        Runtime.getRuntime().addShutdownHook(new Thread(LunarCore::onShutdown));

        // Start console
        LunarCore.startConsole();
    }

    public static Logger getLogger() {
        return log;
    }

    public static LineReaderImpl getLineReader() {
        return reader;
    }

    // Database

    private static void initDatabases() {
        if (LunarCore.getConfig().useSameDatabase) {
            // Setup account and game database
            accountDatabase = new DatabaseManager(LunarCore.getConfig().getAccountDatabase(), serverType);
            // Optimization: Dont run a 2nd database manager if we are not running a gameserver
            if (serverType.runGame()) {
                gameDatabase = accountDatabase;
            }
        } else {
            // Run separate databases
            accountDatabase = new DatabaseManager(LunarCore.getConfig().getAccountDatabase(), ServerType.DISPATCH);
            // Optimization: Dont run a 2nd database manager if we are not running a gameserver
            if (serverType.runGame()) {
                gameDatabase = new DatabaseManager(LunarCore.getConfig().getGameDatabase(), ServerType.GAME);
            }
        }
    }

    // Config

    public static void loadConfig() {
        try (FileReader file = new FileReader(configFile)) {
            config = JsonUtils.loadToClass(file, Config.class);
        } catch (Exception e) {
            LunarCore.config = new Config();
        }
        saveConfig();
    }

    public static void saveConfig() {
        try (FileWriter file = new FileWriter(configFile)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
            file.write(gson.toJson(config));
        } catch (Exception e) {
            getLogger().error("Config save error");
        }
    }

    // Git hash

    private static String getGitHash() {
        // Safely get the build config without errors even if it hasnt been generated yet
        try {
            Class<?> buildConfig = Class.forName("emu.lunarcore.BuildConfig");
            return buildConfig.getField("GIT_HASH").get(null).toString();
        } catch (Exception e) {
            // Ignored
        }
        return "Unknown";
    }

    // Server console

    private static void startConsole() {
        try {
            while (true) {
                String input = reader.readLine("> ");
                if (input == null || input.length() == 0) {
                    continue;
                }

                LunarCore.getCommandManager().invoke(null, input);
            }
        } catch (UserInterruptException | EndOfFileException e) {
            // CTRL + C / CTRL + D
            System.exit(0);
        } catch (Exception e) {
            LunarCore.getLogger().error("Terminal error: ", e);
        }
    }

    // Shutdown event

    private static void onShutdown() {
        if (gameServer != null) {
            gameServer.onShutdown();
        }
    }

    // Server enums

    public enum ServerType {
        DISPATCH    (0x1),
        GAME        (0x2),
        BOTH        (0x3);

        private final int flags;

        ServerType(int flags) {
            this.flags = flags;
        }

        public boolean runDispatch() {
            return (this.flags & 0x1) == 0x1;
        }

        public boolean runGame() {
            return (this.flags & 0x2) == 0x2;
        }
    }

    // Hiro was here
}
