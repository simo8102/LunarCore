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

public final class DestroyItemCsReqOuterClass {
  /**
   * Protobuf type {@code DestroyItemCsReq}
   */
  public static final class DestroyItemCsReq extends ProtoMessage<DestroyItemCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 item_count = 1;</code>
     */
    private int itemCount;

    /**
     * <code>optional uint32 item_id = 4;</code>
     */
    private int itemId;

    /**
     * <code>optional uint32 cur_item_count = 12;</code>
     */
    private int curItemCount;

    private DestroyItemCsReq() {
    }

    /**
     * @return a new empty instance of {@code DestroyItemCsReq}
     */
    public static DestroyItemCsReq newInstance() {
      return new DestroyItemCsReq();
    }

    /**
     * <code>optional uint32 item_count = 1;</code>
     * @return whether the itemCount field is set
     */
    public boolean hasItemCount() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 item_count = 1;</code>
     * @return this
     */
    public DestroyItemCsReq clearItemCount() {
      bitField0_ &= ~0x00000001;
      itemCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 item_count = 1;</code>
     * @return the itemCount
     */
    public int getItemCount() {
      return itemCount;
    }

    /**
     * <code>optional uint32 item_count = 1;</code>
     * @param value the itemCount to set
     * @return this
     */
    public DestroyItemCsReq setItemCount(final int value) {
      bitField0_ |= 0x00000001;
      itemCount = value;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 4;</code>
     * @return whether the itemId field is set
     */
    public boolean hasItemId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 item_id = 4;</code>
     * @return this
     */
    public DestroyItemCsReq clearItemId() {
      bitField0_ &= ~0x00000002;
      itemId = 0;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 4;</code>
     * @return the itemId
     */
    public int getItemId() {
      return itemId;
    }

    /**
     * <code>optional uint32 item_id = 4;</code>
     * @param value the itemId to set
     * @return this
     */
    public DestroyItemCsReq setItemId(final int value) {
      bitField0_ |= 0x00000002;
      itemId = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_item_count = 12;</code>
     * @return whether the curItemCount field is set
     */
    public boolean hasCurItemCount() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cur_item_count = 12;</code>
     * @return this
     */
    public DestroyItemCsReq clearCurItemCount() {
      bitField0_ &= ~0x00000004;
      curItemCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_item_count = 12;</code>
     * @return the curItemCount
     */
    public int getCurItemCount() {
      return curItemCount;
    }

    /**
     * <code>optional uint32 cur_item_count = 12;</code>
     * @param value the curItemCount to set
     * @return this
     */
    public DestroyItemCsReq setCurItemCount(final int value) {
      bitField0_ |= 0x00000004;
      curItemCount = value;
      return this;
    }

    @Override
    public DestroyItemCsReq copyFrom(final DestroyItemCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        itemCount = other.itemCount;
        itemId = other.itemId;
        curItemCount = other.curItemCount;
      }
      return this;
    }

    @Override
    public DestroyItemCsReq mergeFrom(final DestroyItemCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasItemCount()) {
        setItemCount(other.itemCount);
      }
      if (other.hasItemId()) {
        setItemId(other.itemId);
      }
      if (other.hasCurItemCount()) {
        setCurItemCount(other.curItemCount);
      }
      return this;
    }

    @Override
    public DestroyItemCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemCount = 0;
      itemId = 0;
      curItemCount = 0;
      return this;
    }

    @Override
    public DestroyItemCsReq clearQuick() {
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
      if (!(o instanceof DestroyItemCsReq)) {
        return false;
      }
      DestroyItemCsReq other = (DestroyItemCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasItemCount() || itemCount == other.itemCount)
        && (!hasItemId() || itemId == other.itemId)
        && (!hasCurItemCount() || curItemCount == other.curItemCount);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(itemCount);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(itemId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(curItemCount);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(itemCount);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(itemId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curItemCount);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DestroyItemCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // itemCount
            itemCount = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // itemId
            itemId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // curItemCount
            curItemCount = input.readUInt32();
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
        output.writeUInt32(FieldNames.itemCount, itemCount);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.itemId, itemId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.curItemCount, curItemCount);
      }
      output.endObject();
    }

    @Override
    public DestroyItemCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2127813052:
          case -1966910237: {
            if (input.isAtField(FieldNames.itemCount)) {
              if (!input.trySkipNullValue()) {
                itemCount = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1178662002:
          case 2116204999: {
            if (input.isAtField(FieldNames.itemId)) {
              if (!input.trySkipNullValue()) {
                itemId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -986513572:
          case -1822146494: {
            if (input.isAtField(FieldNames.curItemCount)) {
              if (!input.trySkipNullValue()) {
                curItemCount = input.readUInt32();
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
    public DestroyItemCsReq clone() {
      return new DestroyItemCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DestroyItemCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DestroyItemCsReq(), data).checkInitialized();
    }

    public static DestroyItemCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DestroyItemCsReq(), input).checkInitialized();
    }

    public static DestroyItemCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DestroyItemCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating DestroyItemCsReq messages
     */
    public static MessageFactory<DestroyItemCsReq> getFactory() {
      return DestroyItemCsReqFactory.INSTANCE;
    }

    private enum DestroyItemCsReqFactory implements MessageFactory<DestroyItemCsReq> {
      INSTANCE;

      @Override
      public DestroyItemCsReq create() {
        return DestroyItemCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName itemCount = FieldName.forField("itemCount", "item_count");

      static final FieldName itemId = FieldName.forField("itemId", "item_id");

      static final FieldName curItemCount = FieldName.forField("curItemCount", "cur_item_count");
    }
  }
}
