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

public final class ExpUpEquipmentScRspOuterClass {
  /**
   * Protobuf type {@code ExpUpEquipmentScRsp}
   */
  public static final class ExpUpEquipmentScRsp extends ProtoMessage<ExpUpEquipmentScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <code>repeated .PileItem return_item_list = 10;</code>
     */
    private final RepeatedMessage<PileItemOuterClass.PileItem> returnItemList = RepeatedMessage.newEmptyInstance(PileItemOuterClass.PileItem.getFactory());

    private ExpUpEquipmentScRsp() {
    }

    /**
     * @return a new empty instance of {@code ExpUpEquipmentScRsp}
     */
    public static ExpUpEquipmentScRsp newInstance() {
      return new ExpUpEquipmentScRsp();
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return this
     */
    public ExpUpEquipmentScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @param value the retcode to set
     * @return this
     */
    public ExpUpEquipmentScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .PileItem return_item_list = 10;</code>
     * @return whether the returnItemList field is set
     */
    public boolean hasReturnItemList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .PileItem return_item_list = 10;</code>
     * @return this
     */
    public ExpUpEquipmentScRsp clearReturnItemList() {
      bitField0_ &= ~0x00000002;
      returnItemList.clear();
      return this;
    }

    /**
     * <code>repeated .PileItem return_item_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableReturnItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<PileItemOuterClass.PileItem> getReturnItemList() {
      return returnItemList;
    }

    /**
     * <code>repeated .PileItem return_item_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<PileItemOuterClass.PileItem> getMutableReturnItemList() {
      bitField0_ |= 0x00000002;
      return returnItemList;
    }

    /**
     * <code>repeated .PileItem return_item_list = 10;</code>
     * @param value the returnItemList to add
     * @return this
     */
    public ExpUpEquipmentScRsp addReturnItemList(final PileItemOuterClass.PileItem value) {
      bitField0_ |= 0x00000002;
      returnItemList.add(value);
      return this;
    }

    /**
     * <code>repeated .PileItem return_item_list = 10;</code>
     * @param values the returnItemList to add
     * @return this
     */
    public ExpUpEquipmentScRsp addAllReturnItemList(final PileItemOuterClass.PileItem... values) {
      bitField0_ |= 0x00000002;
      returnItemList.addAll(values);
      return this;
    }

    @Override
    public ExpUpEquipmentScRsp copyFrom(final ExpUpEquipmentScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        returnItemList.copyFrom(other.returnItemList);
      }
      return this;
    }

    @Override
    public ExpUpEquipmentScRsp mergeFrom(final ExpUpEquipmentScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasReturnItemList()) {
        getMutableReturnItemList().addAll(other.returnItemList);
      }
      return this;
    }

    @Override
    public ExpUpEquipmentScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      returnItemList.clear();
      return this;
    }

    @Override
    public ExpUpEquipmentScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      returnItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ExpUpEquipmentScRsp)) {
        return false;
      }
      ExpUpEquipmentScRsp other = (ExpUpEquipmentScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasReturnItemList() || returnItemList.equals(other.returnItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < returnItemList.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(returnItemList.get(i));
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
        size += (1 * returnItemList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(returnItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ExpUpEquipmentScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // returnItemList
            tag = input.readRepeatedMessage(returnItemList, tag);
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
        output.writeRepeatedMessage(FieldNames.returnItemList, returnItemList);
      }
      output.endObject();
    }

    @Override
    public ExpUpEquipmentScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -6533215:
          case -807051781: {
            if (input.isAtField(FieldNames.returnItemList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(returnItemList);
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
    public ExpUpEquipmentScRsp clone() {
      return new ExpUpEquipmentScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ExpUpEquipmentScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ExpUpEquipmentScRsp(), data).checkInitialized();
    }

    public static ExpUpEquipmentScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExpUpEquipmentScRsp(), input).checkInitialized();
    }

    public static ExpUpEquipmentScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExpUpEquipmentScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ExpUpEquipmentScRsp messages
     */
    public static MessageFactory<ExpUpEquipmentScRsp> getFactory() {
      return ExpUpEquipmentScRspFactory.INSTANCE;
    }

    private enum ExpUpEquipmentScRspFactory implements MessageFactory<ExpUpEquipmentScRsp> {
      INSTANCE;

      @Override
      public ExpUpEquipmentScRsp create() {
        return ExpUpEquipmentScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName returnItemList = FieldName.forField("returnItemList", "return_item_list");
    }
  }
}
