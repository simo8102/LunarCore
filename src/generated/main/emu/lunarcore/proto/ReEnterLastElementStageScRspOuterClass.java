// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class ReEnterLastElementStageScRspOuterClass {
  /**
   * Protobuf type {@code ReEnterLastElementStageScRsp}
   */
  public static final class ReEnterLastElementStageScRsp extends ProtoMessage<ReEnterLastElementStageScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 stage_id = 10;</code>
     */
    private int stageId;

    /**
     * <code>optional .SceneBattleInfo battle_info = 15;</code>
     */
    private final SceneBattleInfoOuterClass.SceneBattleInfo battleInfo = SceneBattleInfoOuterClass.SceneBattleInfo.newInstance();

    private ReEnterLastElementStageScRsp() {
    }

    /**
     * @return a new empty instance of {@code ReEnterLastElementStageScRsp}
     */
    public static ReEnterLastElementStageScRsp newInstance() {
      return new ReEnterLastElementStageScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public ReEnterLastElementStageScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public ReEnterLastElementStageScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 stage_id = 10;</code>
     * @return whether the stageId field is set
     */
    public boolean hasStageId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 stage_id = 10;</code>
     * @return this
     */
    public ReEnterLastElementStageScRsp clearStageId() {
      bitField0_ &= ~0x00000002;
      stageId = 0;
      return this;
    }

    /**
     * <code>optional uint32 stage_id = 10;</code>
     * @return the stageId
     */
    public int getStageId() {
      return stageId;
    }

    /**
     * <code>optional uint32 stage_id = 10;</code>
     * @param value the stageId to set
     * @return this
     */
    public ReEnterLastElementStageScRsp setStageId(final int value) {
      bitField0_ |= 0x00000002;
      stageId = value;
      return this;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 15;</code>
     * @return whether the battleInfo field is set
     */
    public boolean hasBattleInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 15;</code>
     * @return this
     */
    public ReEnterLastElementStageScRsp clearBattleInfo() {
      bitField0_ &= ~0x00000004;
      battleInfo.clear();
      return this;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBattleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getBattleInfo() {
      return battleInfo;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneBattleInfoOuterClass.SceneBattleInfo getMutableBattleInfo() {
      bitField0_ |= 0x00000004;
      return battleInfo;
    }

    /**
     * <code>optional .SceneBattleInfo battle_info = 15;</code>
     * @param value the battleInfo to set
     * @return this
     */
    public ReEnterLastElementStageScRsp setBattleInfo(
        final SceneBattleInfoOuterClass.SceneBattleInfo value) {
      bitField0_ |= 0x00000004;
      battleInfo.copyFrom(value);
      return this;
    }

    @Override
    public ReEnterLastElementStageScRsp copyFrom(final ReEnterLastElementStageScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        stageId = other.stageId;
        battleInfo.copyFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public ReEnterLastElementStageScRsp mergeFrom(final ReEnterLastElementStageScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasStageId()) {
        setStageId(other.stageId);
      }
      if (other.hasBattleInfo()) {
        getMutableBattleInfo().mergeFrom(other.battleInfo);
      }
      return this;
    }

    @Override
    public ReEnterLastElementStageScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      stageId = 0;
      battleInfo.clear();
      return this;
    }

    @Override
    public ReEnterLastElementStageScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ReEnterLastElementStageScRsp)) {
        return false;
      }
      ReEnterLastElementStageScRsp other = (ReEnterLastElementStageScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasStageId() || stageId == other.stageId)
        && (!hasBattleInfo() || battleInfo.equals(other.battleInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(stageId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(battleInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stageId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(battleInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ReEnterLastElementStageScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // stageId
            stageId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // battleInfo
            input.readMessage(battleInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.stageId, stageId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.battleInfo, battleInfo);
      }
      output.endObject();
    }

    @Override
    public ReEnterLastElementStageScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1897528135:
          case 1306191356: {
            if (input.isAtField(FieldNames.stageId)) {
              if (!input.trySkipNullValue()) {
                stageId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2053377414:
          case -749633579: {
            if (input.isAtField(FieldNames.battleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(battleInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ReEnterLastElementStageScRsp clone() {
      return new ReEnterLastElementStageScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ReEnterLastElementStageScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ReEnterLastElementStageScRsp(), data).checkInitialized();
    }

    public static ReEnterLastElementStageScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ReEnterLastElementStageScRsp(), input).checkInitialized();
    }

    public static ReEnterLastElementStageScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ReEnterLastElementStageScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ReEnterLastElementStageScRsp messages
     */
    public static MessageFactory<ReEnterLastElementStageScRsp> getFactory() {
      return ReEnterLastElementStageScRspFactory.INSTANCE;
    }

    private enum ReEnterLastElementStageScRspFactory implements MessageFactory<ReEnterLastElementStageScRsp> {
      INSTANCE;

      @Override
      public ReEnterLastElementStageScRsp create() {
        return ReEnterLastElementStageScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName stageId = FieldName.forField("stageId", "stage_id");

      static final FieldName battleInfo = FieldName.forField("battleInfo", "battle_info");
    }
  }
}
