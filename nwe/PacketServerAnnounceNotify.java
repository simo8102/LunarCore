package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.AnnounceData;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketServerAnnounceNotify extends BasePacket {

    public PacketServerAnnounceNotify() {
        super(CmdId.ServerAnnounceNotify);

        AnnounceData announceData = AnnounceData.newInstance()
            .setBeginTime(0L)
            .setEndTime(9999999999999L)
            .setCountDownText("项目永久免费，倒卖者死全家！！项目由Mr.Su编译打包！ 频道号：79ce679ob6")
            .setCenterSystemFrequency(100)
            .setCountDownFrequency(1)
            .setIsCenterSystemLast5EveryMinutes(true)
            .setConfigId(0);

        var data = ServerAnnounceNotify.newInstance()
            .addAnnounceDataList(announceData);

        this.setData(data);
    }
}
