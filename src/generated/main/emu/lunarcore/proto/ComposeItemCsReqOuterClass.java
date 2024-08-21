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

public final class ComposeItemCsReqOuterClass {
  /**
   * Protobuf type {@code ComposeItemCsReq}
   */
  public static final class ComposeItemCsReq extends ProtoMessage<ComposeItemCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 count = 4;</code>
     */
    private int count;

    /**
     * <code>optional uint32 compose_id = 9;</code>
     */
    private int composeId;

    /**
     * <code>optional .ItemCostList compose_item_list = 8;</code>
     */
    private final ItemCostListOuterClass.ItemCostList composeItemList = ItemCostListOuterClass.ItemCostList.newInstance();

    private ComposeItemCsReq() {
    }

    /**
     * @return a new empty instance of {@code ComposeItemCsReq}
     */
    public static ComposeItemCsReq newInstance() {
      return new ComposeItemCsReq();
    }

    /**
     * <code>optional uint32 count = 4;</code>
     * @return whether the count field is set
     */
    public boolean hasCount() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 count = 4;</code>
     * @return this
     */
    public ComposeItemCsReq clearCount() {
      bitField0_ &= ~0x00000001;
      count = 0;
      return this;
    }

    /**
     * <code>optional uint32 count = 4;</code>
     * @return the count
     */
    public int getCount() {
      return count;
    }

    /**
     * <code>optional uint32 count = 4;</code>
     * @param value the count to set
     * @return this
     */
    public ComposeItemCsReq setCount(final int value) {
      bitField0_ |= 0x00000001;
      count = value;
      return this;
    }

    /**
     * <code>optional uint32 compose_id = 9;</code>
     * @return whether the composeId field is set
     */
    public boolean hasComposeId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 compose_id = 9;</code>
     * @return this
     */
    public ComposeItemCsReq clearComposeId() {
      bitField0_ &= ~0x00000002;
      composeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 compose_id = 9;</code>
     * @return the composeId
     */
    public int getComposeId() {
      return composeId;
    }

    /**
     * <code>optional uint32 compose_id = 9;</code>
     * @param value the composeId to set
     * @return this
     */
    public ComposeItemCsReq setComposeId(final int value) {
      bitField0_ |= 0x00000002;
      composeId = value;
      return this;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 8;</code>
     * @return whether the composeItemList field is set
     */
    public boolean hasComposeItemList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 8;</code>
     * @return this
     */
    public ComposeItemCsReq clearComposeItemList() {
      bitField0_ &= ~0x00000004;
      composeItemList.clear();
      return this;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableComposeItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemCostListOuterClass.ItemCostList getComposeItemList() {
      return composeItemList;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemCostListOuterClass.ItemCostList getMutableComposeItemList() {
      bitField0_ |= 0x00000004;
      return composeItemList;
    }

    /**
     * <code>optional .ItemCostList compose_item_list = 8;</code>
     * @param value the composeItemList to set
     * @return this
     */
    public ComposeItemCsReq setComposeItemList(final ItemCostListOuterClass.ItemCostList value) {
      bitField0_ |= 0x00000004;
      composeItemList.copyFrom(value);
      return this;
    }

    @Override
    public ComposeItemCsReq copyFrom(final ComposeItemCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        count = other.count;
        composeId = other.composeId;
        composeItemList.copyFrom(other.composeItemList);
      }
      return this;
    }

    @Override
    public ComposeItemCsReq mergeFrom(final ComposeItemCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCount()) {
        setCount(other.count);
      }
      if (other.hasComposeId()) {
        setComposeId(other.composeId);
      }
      if (other.hasComposeItemList()) {
        getMutableComposeItemList().mergeFrom(other.composeItemList);
      }
      return this;
    }

    @Override
    public ComposeItemCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      count = 0;
      composeId = 0;
      composeItemList.clear();
      return this;
    }

    @Override
    public ComposeItemCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      composeItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ComposeItemCsReq)) {
        return false;
      }
      ComposeItemCsReq other = (ComposeItemCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasCount() || count == other.count)
        && (!hasComposeId() || composeId == other.composeId)
        && (!hasComposeItemList() || composeItemList.equals(other.composeItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(count);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(composeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(composeItemList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(count);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(composeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(composeItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ComposeItemCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // count
            count = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // composeId
            composeId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // composeItemList
            input.readMessage(composeItemList);
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
        output.writeUInt32(FieldNames.count, count);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.composeId, composeId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.composeItemList, composeItemList);
      }
      output.endObject();
    }

    @Override
    public ComposeItemCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 94851343: {
            if (input.isAtField(FieldNames.count)) {
              if (!input.trySkipNullValue()) {
                count = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1399759283:
          case -442843416: {
            if (input.isAtField(FieldNames.composeId)) {
              if (!input.trySkipNullValue()) {
                composeId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1347157501:
          case -656801827: {
            if (input.isAtField(FieldNames.composeItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(composeItemList);
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
    public ComposeItemCsReq clone() {
      return new ComposeItemCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ComposeItemCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ComposeItemCsReq(), data).checkInitialized();
    }

    public static ComposeItemCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ComposeItemCsReq(), input).checkInitialized();
    }

    public static ComposeItemCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ComposeItemCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ComposeItemCsReq messages
     */
    public static MessageFactory<ComposeItemCsReq> getFactory() {
      return ComposeItemCsReqFactory.INSTANCE;
    }

    private enum ComposeItemCsReqFactory implements MessageFactory<ComposeItemCsReq> {
      INSTANCE;

      @Override
      public ComposeItemCsReq create() {
        return ComposeItemCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName count = FieldName.forField("count");

      static final FieldName composeId = FieldName.forField("composeId", "compose_id");

      static final FieldName composeItemList = FieldName.forField("composeItemList", "compose_item_list");
    }
  }
}
