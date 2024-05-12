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
import us.hebi.quickbuf.RepeatedMessage;

public final class GetFirstTalkNpcScRspOuterClass {
  /**
   * Protobuf type {@code GetFirstTalkNpcScRsp}
   */
  public static final class GetFirstTalkNpcScRsp extends ProtoMessage<GetFirstTalkNpcScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 10;</code>
     */
    private int retcode;

    /**
     * <code>repeated .FirstNpcTalkInfo npc_talk_info_list = 12;</code>
     */
    private final RepeatedMessage<FirstNpcTalkInfoOuterClass.FirstNpcTalkInfo> npcTalkInfoList = RepeatedMessage.newEmptyInstance(FirstNpcTalkInfoOuterClass.FirstNpcTalkInfo.getFactory());

    private GetFirstTalkNpcScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetFirstTalkNpcScRsp}
     */
    public static GetFirstTalkNpcScRsp newInstance() {
      return new GetFirstTalkNpcScRsp();
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return this
     */
    public GetFirstTalkNpcScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 10;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetFirstTalkNpcScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .FirstNpcTalkInfo npc_talk_info_list = 12;</code>
     * @return whether the npcTalkInfoList field is set
     */
    public boolean hasNpcTalkInfoList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .FirstNpcTalkInfo npc_talk_info_list = 12;</code>
     * @return this
     */
    public GetFirstTalkNpcScRsp clearNpcTalkInfoList() {
      bitField0_ &= ~0x00000002;
      npcTalkInfoList.clear();
      return this;
    }

    /**
     * <code>repeated .FirstNpcTalkInfo npc_talk_info_list = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNpcTalkInfoList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<FirstNpcTalkInfoOuterClass.FirstNpcTalkInfo> getNpcTalkInfoList() {
      return npcTalkInfoList;
    }

    /**
     * <code>repeated .FirstNpcTalkInfo npc_talk_info_list = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<FirstNpcTalkInfoOuterClass.FirstNpcTalkInfo> getMutableNpcTalkInfoList(
        ) {
      bitField0_ |= 0x00000002;
      return npcTalkInfoList;
    }

    /**
     * <code>repeated .FirstNpcTalkInfo npc_talk_info_list = 12;</code>
     * @param value the npcTalkInfoList to add
     * @return this
     */
    public GetFirstTalkNpcScRsp addNpcTalkInfoList(
        final FirstNpcTalkInfoOuterClass.FirstNpcTalkInfo value) {
      bitField0_ |= 0x00000002;
      npcTalkInfoList.add(value);
      return this;
    }

    /**
     * <code>repeated .FirstNpcTalkInfo npc_talk_info_list = 12;</code>
     * @param values the npcTalkInfoList to add
     * @return this
     */
    public GetFirstTalkNpcScRsp addAllNpcTalkInfoList(
        final FirstNpcTalkInfoOuterClass.FirstNpcTalkInfo... values) {
      bitField0_ |= 0x00000002;
      npcTalkInfoList.addAll(values);
      return this;
    }

    @Override
    public GetFirstTalkNpcScRsp copyFrom(final GetFirstTalkNpcScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        npcTalkInfoList.copyFrom(other.npcTalkInfoList);
      }
      return this;
    }

    @Override
    public GetFirstTalkNpcScRsp mergeFrom(final GetFirstTalkNpcScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasNpcTalkInfoList()) {
        getMutableNpcTalkInfoList().addAll(other.npcTalkInfoList);
      }
      return this;
    }

    @Override
    public GetFirstTalkNpcScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      npcTalkInfoList.clear();
      return this;
    }

    @Override
    public GetFirstTalkNpcScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      npcTalkInfoList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFirstTalkNpcScRsp)) {
        return false;
      }
      GetFirstTalkNpcScRsp other = (GetFirstTalkNpcScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasNpcTalkInfoList() || npcTalkInfoList.equals(other.npcTalkInfoList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < npcTalkInfoList.length(); i++) {
          output.writeRawByte((byte) 98);
          output.writeMessageNoTag(npcTalkInfoList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * npcTalkInfoList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(npcTalkInfoList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFirstTalkNpcScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // npcTalkInfoList
            tag = input.readRepeatedMessage(npcTalkInfoList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeRepeatedMessage(FieldNames.npcTalkInfoList, npcTalkInfoList);
      }
      output.endObject();
    }

    @Override
    public GetFirstTalkNpcScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -1326095175:
          case 2015989466: {
            if (input.isAtField(FieldNames.npcTalkInfoList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(npcTalkInfoList);
                bitField0_ |= 0x00000002;
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
    public GetFirstTalkNpcScRsp clone() {
      return new GetFirstTalkNpcScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFirstTalkNpcScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFirstTalkNpcScRsp(), data).checkInitialized();
    }

    public static GetFirstTalkNpcScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFirstTalkNpcScRsp(), input).checkInitialized();
    }

    public static GetFirstTalkNpcScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFirstTalkNpcScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFirstTalkNpcScRsp messages
     */
    public static MessageFactory<GetFirstTalkNpcScRsp> getFactory() {
      return GetFirstTalkNpcScRspFactory.INSTANCE;
    }

    private enum GetFirstTalkNpcScRspFactory implements MessageFactory<GetFirstTalkNpcScRsp> {
      INSTANCE;

      @Override
      public GetFirstTalkNpcScRsp create() {
        return GetFirstTalkNpcScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName npcTalkInfoList = FieldName.forField("npcTalkInfoList", "npc_talk_info_list");
    }
  }
}
