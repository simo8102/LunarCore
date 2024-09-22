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

public final class RogueBuffEnhanceShopInfoOuterClass {
  /**
   * Protobuf type {@code RogueBuffEnhanceShopInfo}
   */
  public static final class RogueBuffEnhanceShopInfo extends ProtoMessage<RogueBuffEnhanceShopInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .RogueBuffEnhanceInfo buff_info = 1;</code>
     */
    private final RepeatedMessage<RogueBuffEnhanceInfoOuterClass.RogueBuffEnhanceInfo> buffInfo = RepeatedMessage.newEmptyInstance(RogueBuffEnhanceInfoOuterClass.RogueBuffEnhanceInfo.getFactory());

    private RogueBuffEnhanceShopInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueBuffEnhanceShopInfo}
     */
    public static RogueBuffEnhanceShopInfo newInstance() {
      return new RogueBuffEnhanceShopInfo();
    }

    /**
     * <code>repeated .RogueBuffEnhanceInfo buff_info = 1;</code>
     * @return whether the buffInfo field is set
     */
    public boolean hasBuffInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .RogueBuffEnhanceInfo buff_info = 1;</code>
     * @return this
     */
    public RogueBuffEnhanceShopInfo clearBuffInfo() {
      bitField0_ &= ~0x00000001;
      buffInfo.clear();
      return this;
    }

    /**
     * <code>repeated .RogueBuffEnhanceInfo buff_info = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueBuffEnhanceInfoOuterClass.RogueBuffEnhanceInfo> getBuffInfo() {
      return buffInfo;
    }

    /**
     * <code>repeated .RogueBuffEnhanceInfo buff_info = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueBuffEnhanceInfoOuterClass.RogueBuffEnhanceInfo> getMutableBuffInfo(
        ) {
      bitField0_ |= 0x00000001;
      return buffInfo;
    }

    /**
     * <code>repeated .RogueBuffEnhanceInfo buff_info = 1;</code>
     * @param value the buffInfo to add
     * @return this
     */
    public RogueBuffEnhanceShopInfo addBuffInfo(
        final RogueBuffEnhanceInfoOuterClass.RogueBuffEnhanceInfo value) {
      bitField0_ |= 0x00000001;
      buffInfo.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueBuffEnhanceInfo buff_info = 1;</code>
     * @param values the buffInfo to add
     * @return this
     */
    public RogueBuffEnhanceShopInfo addAllBuffInfo(
        final RogueBuffEnhanceInfoOuterClass.RogueBuffEnhanceInfo... values) {
      bitField0_ |= 0x00000001;
      buffInfo.addAll(values);
      return this;
    }

    @Override
    public RogueBuffEnhanceShopInfo copyFrom(final RogueBuffEnhanceShopInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        buffInfo.copyFrom(other.buffInfo);
      }
      return this;
    }

    @Override
    public RogueBuffEnhanceShopInfo mergeFrom(final RogueBuffEnhanceShopInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBuffInfo()) {
        getMutableBuffInfo().addAll(other.buffInfo);
      }
      return this;
    }

    @Override
    public RogueBuffEnhanceShopInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffInfo.clear();
      return this;
    }

    @Override
    public RogueBuffEnhanceShopInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueBuffEnhanceShopInfo)) {
        return false;
      }
      RogueBuffEnhanceShopInfo other = (RogueBuffEnhanceShopInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBuffInfo() || buffInfo.equals(other.buffInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < buffInfo.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(buffInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * buffInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(buffInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueBuffEnhanceShopInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 10: {
            // buffInfo
            tag = input.readRepeatedMessage(buffInfo, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.buffInfo, buffInfo);
      }
      output.endObject();
    }

    @Override
    public RogueBuffEnhanceShopInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1522874463:
          case 55707930: {
            if (input.isAtField(FieldNames.buffInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(buffInfo);
                bitField0_ |= 0x00000001;
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
    public RogueBuffEnhanceShopInfo clone() {
      return new RogueBuffEnhanceShopInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueBuffEnhanceShopInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueBuffEnhanceShopInfo(), data).checkInitialized();
    }

    public static RogueBuffEnhanceShopInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuffEnhanceShopInfo(), input).checkInitialized();
    }

    public static RogueBuffEnhanceShopInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuffEnhanceShopInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueBuffEnhanceShopInfo messages
     */
    public static MessageFactory<RogueBuffEnhanceShopInfo> getFactory() {
      return RogueBuffEnhanceShopInfoFactory.INSTANCE;
    }

    private enum RogueBuffEnhanceShopInfoFactory implements MessageFactory<RogueBuffEnhanceShopInfo> {
      INSTANCE;

      @Override
      public RogueBuffEnhanceShopInfo create() {
        return RogueBuffEnhanceShopInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName buffInfo = FieldName.forField("buffInfo", "buff_info");
    }
  }
}
