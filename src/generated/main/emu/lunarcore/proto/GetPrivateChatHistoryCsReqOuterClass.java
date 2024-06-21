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

public final class GetPrivateChatHistoryCsReqOuterClass {
  /**
   * Protobuf type {@code GetPrivateChatHistoryCsReq}
   */
  public static final class GetPrivateChatHistoryCsReq extends ProtoMessage<GetPrivateChatHistoryCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 to_uid = 10;</code>
     */
    private int toUid;

    /**
     * <code>optional uint32 sender_uid = 13;</code>
     */
    private int senderUid;

    private GetPrivateChatHistoryCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetPrivateChatHistoryCsReq}
     */
    public static GetPrivateChatHistoryCsReq newInstance() {
      return new GetPrivateChatHistoryCsReq();
    }

    /**
     * <code>optional uint32 to_uid = 10;</code>
     * @return whether the toUid field is set
     */
    public boolean hasToUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 to_uid = 10;</code>
     * @return this
     */
    public GetPrivateChatHistoryCsReq clearToUid() {
      bitField0_ &= ~0x00000001;
      toUid = 0;
      return this;
    }

    /**
     * <code>optional uint32 to_uid = 10;</code>
     * @return the toUid
     */
    public int getToUid() {
      return toUid;
    }

    /**
     * <code>optional uint32 to_uid = 10;</code>
     * @param value the toUid to set
     * @return this
     */
    public GetPrivateChatHistoryCsReq setToUid(final int value) {
      bitField0_ |= 0x00000001;
      toUid = value;
      return this;
    }

    /**
     * <code>optional uint32 sender_uid = 13;</code>
     * @return whether the senderUid field is set
     */
    public boolean hasSenderUid() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 sender_uid = 13;</code>
     * @return this
     */
    public GetPrivateChatHistoryCsReq clearSenderUid() {
      bitField0_ &= ~0x00000002;
      senderUid = 0;
      return this;
    }

    /**
     * <code>optional uint32 sender_uid = 13;</code>
     * @return the senderUid
     */
    public int getSenderUid() {
      return senderUid;
    }

    /**
     * <code>optional uint32 sender_uid = 13;</code>
     * @param value the senderUid to set
     * @return this
     */
    public GetPrivateChatHistoryCsReq setSenderUid(final int value) {
      bitField0_ |= 0x00000002;
      senderUid = value;
      return this;
    }

    @Override
    public GetPrivateChatHistoryCsReq copyFrom(final GetPrivateChatHistoryCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        toUid = other.toUid;
        senderUid = other.senderUid;
      }
      return this;
    }

    @Override
    public GetPrivateChatHistoryCsReq mergeFrom(final GetPrivateChatHistoryCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasToUid()) {
        setToUid(other.toUid);
      }
      if (other.hasSenderUid()) {
        setSenderUid(other.senderUid);
      }
      return this;
    }

    @Override
    public GetPrivateChatHistoryCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      toUid = 0;
      senderUid = 0;
      return this;
    }

    @Override
    public GetPrivateChatHistoryCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetPrivateChatHistoryCsReq)) {
        return false;
      }
      GetPrivateChatHistoryCsReq other = (GetPrivateChatHistoryCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasToUid() || toUid == other.toUid)
        && (!hasSenderUid() || senderUid == other.senderUid);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(toUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(senderUid);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(toUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(senderUid);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetPrivateChatHistoryCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // toUid
            toUid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // senderUid
            senderUid = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.toUid, toUid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.senderUid, senderUid);
      }
      output.endObject();
    }

    @Override
    public GetPrivateChatHistoryCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 110520277:
          case -868529012: {
            if (input.isAtField(FieldNames.toUid)) {
              if (!input.trySkipNullValue()) {
                toUid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 32180699:
          case 997911366: {
            if (input.isAtField(FieldNames.senderUid)) {
              if (!input.trySkipNullValue()) {
                senderUid = input.readUInt32();
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
    public GetPrivateChatHistoryCsReq clone() {
      return new GetPrivateChatHistoryCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetPrivateChatHistoryCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetPrivateChatHistoryCsReq(), data).checkInitialized();
    }

    public static GetPrivateChatHistoryCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPrivateChatHistoryCsReq(), input).checkInitialized();
    }

    public static GetPrivateChatHistoryCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPrivateChatHistoryCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetPrivateChatHistoryCsReq messages
     */
    public static MessageFactory<GetPrivateChatHistoryCsReq> getFactory() {
      return GetPrivateChatHistoryCsReqFactory.INSTANCE;
    }

    private enum GetPrivateChatHistoryCsReqFactory implements MessageFactory<GetPrivateChatHistoryCsReq> {
      INSTANCE;

      @Override
      public GetPrivateChatHistoryCsReq create() {
        return GetPrivateChatHistoryCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName toUid = FieldName.forField("toUid", "to_uid");

      static final FieldName senderUid = FieldName.forField("senderUid", "sender_uid");
    }
  }
}
