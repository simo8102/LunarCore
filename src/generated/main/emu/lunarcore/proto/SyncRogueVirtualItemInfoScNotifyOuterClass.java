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

public final class SyncRogueVirtualItemInfoScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncRogueVirtualItemInfoScNotify}
   */
  public static final class SyncRogueVirtualItemInfoScNotify extends ProtoMessage<SyncRogueVirtualItemInfoScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item_info = 4;</code>
     */
    private final RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo rogueVirtualItemInfo = RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo.newInstance();

    private SyncRogueVirtualItemInfoScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncRogueVirtualItemInfoScNotify}
     */
    public static SyncRogueVirtualItemInfoScNotify newInstance() {
      return new SyncRogueVirtualItemInfoScNotify();
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item_info = 4;</code>
     * @return whether the rogueVirtualItemInfo field is set
     */
    public boolean hasRogueVirtualItemInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item_info = 4;</code>
     * @return this
     */
    public SyncRogueVirtualItemInfoScNotify clearRogueVirtualItemInfo() {
      bitField0_ &= ~0x00000001;
      rogueVirtualItemInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item_info = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueVirtualItemInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo getRogueVirtualItemInfo() {
      return rogueVirtualItemInfo;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item_info = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo getMutableRogueVirtualItemInfo() {
      bitField0_ |= 0x00000001;
      return rogueVirtualItemInfo;
    }

    /**
     * <code>optional .RogueVirtualItemInfo rogue_virtual_item_info = 4;</code>
     * @param value the rogueVirtualItemInfo to set
     * @return this
     */
    public SyncRogueVirtualItemInfoScNotify setRogueVirtualItemInfo(
        final RogueVirtualItemInfoOuterClass.RogueVirtualItemInfo value) {
      bitField0_ |= 0x00000001;
      rogueVirtualItemInfo.copyFrom(value);
      return this;
    }

    @Override
    public SyncRogueVirtualItemInfoScNotify copyFrom(final SyncRogueVirtualItemInfoScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueVirtualItemInfo.copyFrom(other.rogueVirtualItemInfo);
      }
      return this;
    }

    @Override
    public SyncRogueVirtualItemInfoScNotify mergeFrom(
        final SyncRogueVirtualItemInfoScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueVirtualItemInfo()) {
        getMutableRogueVirtualItemInfo().mergeFrom(other.rogueVirtualItemInfo);
      }
      return this;
    }

    @Override
    public SyncRogueVirtualItemInfoScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueVirtualItemInfo.clear();
      return this;
    }

    @Override
    public SyncRogueVirtualItemInfoScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueVirtualItemInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncRogueVirtualItemInfoScNotify)) {
        return false;
      }
      SyncRogueVirtualItemInfoScNotify other = (SyncRogueVirtualItemInfoScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueVirtualItemInfo() || rogueVirtualItemInfo.equals(other.rogueVirtualItemInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(rogueVirtualItemInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueVirtualItemInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncRogueVirtualItemInfoScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // rogueVirtualItemInfo
            input.readMessage(rogueVirtualItemInfo);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.rogueVirtualItemInfo, rogueVirtualItemInfo);
      }
      output.endObject();
    }

    @Override
    public SyncRogueVirtualItemInfoScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1066755410:
          case 1452147457: {
            if (input.isAtField(FieldNames.rogueVirtualItemInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueVirtualItemInfo);
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
    public SyncRogueVirtualItemInfoScNotify clone() {
      return new SyncRogueVirtualItemInfoScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncRogueVirtualItemInfoScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncRogueVirtualItemInfoScNotify(), data).checkInitialized();
    }

    public static SyncRogueVirtualItemInfoScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncRogueVirtualItemInfoScNotify(), input).checkInitialized();
    }

    public static SyncRogueVirtualItemInfoScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SyncRogueVirtualItemInfoScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncRogueVirtualItemInfoScNotify messages
     */
    public static MessageFactory<SyncRogueVirtualItemInfoScNotify> getFactory() {
      return SyncRogueVirtualItemInfoScNotifyFactory.INSTANCE;
    }

    private enum SyncRogueVirtualItemInfoScNotifyFactory implements MessageFactory<SyncRogueVirtualItemInfoScNotify> {
      INSTANCE;

      @Override
      public SyncRogueVirtualItemInfoScNotify create() {
        return SyncRogueVirtualItemInfoScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueVirtualItemInfo = FieldName.forField("rogueVirtualItemInfo", "rogue_virtual_item_info");
    }
  }
}
