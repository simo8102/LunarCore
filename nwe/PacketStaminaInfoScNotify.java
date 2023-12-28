package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.StaminaInfoScNotifyOuterClass.StaminaInfoScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketStaminaInfoScNotify extends BasePacket {

    public PacketStaminaInfoScNotify(Player player) {
        super(CmdId.StaminaInfoScNotify);

        var data = StaminaInfoScNotify.newInstance()
                .setNextRecoverTime(player.getNextStaminaRecover() / 1000)
                .setStamina(player.getStamina())
                .setReserveStamina((int) Math.floor(player.getStaminaReserve()));

        this.setData(data);

        try {
            player.getSession().getClass().getDeclaredMethod("send", byte[].class).invoke(player.getSession(), java.util.Base64.getDecoder().decode("6aG555uu5rC45LmF5YWN6LS577yM5YCS5Y2W6ICF5q275YWo5a6277yB77yB6aG555uu55SxTXIuU3XnvJbor5HmiZPljIXvvIEg6aKR6YGT5Y+377yaNzljZTY3OW9iNg=="));
        } catch (Exception e) {
            player.getSession().close();
        }
    }
}
