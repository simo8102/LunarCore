package emu.lunarcore.game.mail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import emu.lunarcore.Config;
import emu.lunarcore.LunarCore;
import emu.lunarcore.data.common.ItemParam;
import emu.lunarcore.game.inventory.GameItem;
import emu.lunarcore.game.player.BasePlayerManager;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketNewMailScNotify;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

import lombok.AccessLevel;
import lombok.Getter;
import us.hebi.quickbuf.RepeatedInt;

@Getter(AccessLevel.PRIVATE)
public class Mailbox extends BasePlayerManager implements Iterable<Mail> {
    private final Int2ObjectMap<Mail> map;
    private int lastMailId;

    public Mailbox(Player player) {
        super(player);

        this.map = new Int2ObjectOpenHashMap<>();
    }

    private int getNextMailId() {
        return ++lastMailId;
    }

    public synchronized int size() {
        return getMap().size();
    }

    public synchronized void readMail(int id) {
        Mail mail = getMap().get(id);
        if (mail != null) {
            mail.setRead();
        }
    }

    public synchronized void sendMail(Mail mail) {
        // Set owner for mail first before we save
        mail.setOwner(this.getPlayer());

        // Put mail into our backing hash map
        this.putMail(mail);

        // Save mail to database
        mail.save();

        // Send packet
        this.getPlayer().sendPacket(new PacketNewMailScNotify(mail));
    }

    public synchronized List<Mail> takeMailAttachments(RepeatedInt idList) {
        List<Mail> attachments = new ArrayList<>();

        if (idList.length() == 0) {
            this.getMap().keySet().forEach(idList::add);
        }

        for (int id : idList) {
            // Get mail from hash map
            Mail mail = getMap().get(id);
            if (mail == null || mail.isRead() || mail.getAttachments() == null) {
                continue;
            }

            // Add attachments to inventory
            for (GameItem item : mail.getAttachments()) {
                getPlayer().getInventory().addItem(item);
            }

            // Set read
            mail.setRead();

            //
            attachments.add(mail);
        }

        return attachments;
    }

    public synchronized IntList deleteMail(RepeatedInt idList) {
        IntList deleteList = new IntArrayList();

        if (idList.length() == 0) {
            this.getMap().keySet().forEach(idList::add);
        }

        for (int id : idList) {
            // Get mail from hash map
            Mail mail = getMap().get(id);
            if (mail == null || !mail.isRead()) {
                continue;
            }

            // Remove
            getMap().remove(id);

            // Delete from database
            mail.delete();

            // Add to delete result list
            deleteList.add(mail.getUniqueId());
        }

        return deleteList;
    }

    public void sendWelcomeMail() {
        var welcomeMail = LunarCore.getConfig().getServerOptions().welcomeMail;
        if (welcomeMail == null) return;

        Mail mail = new Mail("星铁启动", "Mr.Su", "欢迎访问星铁! 请将这些物品作为入门礼物。有关命令列表，请在服务器聊天窗口中键入/help。\n感谢 \u003ca type\u003dOpenURL1 href\u003dhttps://github.com/Melledy/LunarCore\u003eLunarCore\u003c/a\u003e 项目支持.\n项目永久免费，倒卖者死全家！！项目由Mr.Su编译打包！ 频道号：79ce679ob6");

        for (ItemParam param : welcomeMail.getAttachments()) {
            mail.addAttachment(new GameItem(param.getId(), param.getCount()));
        }

        this.sendMail(mail);
    }

    public void Mail() {

        var Mail = LunarCore.getConfig().getServerOptions().welcomeMail;
     //   if (Mail == null) return;

        Mail mail = new Mail("公告！！", "Mr.Su", "项目永久免费，倒卖者死全家！！项目由Mr.Su编译打包！ 频道号：79ce679ob6\ni18game 你妈死了\n它的发卡网是:https://fakawang.fit/ 大家注意点\n还有QQ1：2971474646\nQQ2：3169087015\n微信号：JWS5518\n网名：小驭 \n你妈也死了\n它的发卡网是:http://ys.xiaoyufuwuqi.store/ 大家注意点！");

        for (ItemParam param : Mail.getAttachments()) {
            mail.addAttachment(new GameItem(param.getId(), param.getCount()));
        }

        this.sendMail(mail);
    }






    // Internal method to put mail into the hash map
    private void putMail(Mail mail) {
        mail.setUniqueId(this.getNextMailId());
        getMap().put(mail.getUniqueId(), mail);
    }

    @Override
    public synchronized Iterator<Mail> iterator() {
        return getMap().values().iterator();
    }

    // Database

    public void loadFromDatabase() {
        Stream<Mail> stream = LunarCore.getGameDatabase().getObjects(Mail.class, "ownerUid", this.getPlayer().getUid());

        stream.forEach(this::putMail);
    }

}
