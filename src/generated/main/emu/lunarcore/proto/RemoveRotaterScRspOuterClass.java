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

public final class RemoveRotaterScRspOuterClass {
  /**
   * Protobuf type {@code RemoveRotaterScRsp}
   */
  public static final class RemoveRotaterScRsp extends ProtoMessage<RemoveRotaterScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 6;</code>
     */
    private final RotatorEnergyInfoOuterClass.RotatorEnergyInfo energyInfo = RotatorEnergyInfoOuterClass.RotatorEnergyInfo.newInstance();

    /**
     * <code>optional .RotaterData rotater_data = 7;</code>
     */
    private final RotaterDataOuterClass.RotaterData rotaterData = RotaterDataOuterClass.RotaterData.newInstance();

    private RemoveRotaterScRsp() {
    }

    /**
     * @return a new empty instance of {@code RemoveRotaterScRsp}
     */
    public static RemoveRotaterScRsp newInstance() {
      return new RemoveRotaterScRsp();
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public RemoveRotaterScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public RemoveRotaterScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 6;</code>
     * @return whether the energyInfo field is set
     */
    public boolean hasEnergyInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 6;</code>
     * @return this
     */
    public RemoveRotaterScRsp clearEnergyInfo() {
      bitField0_ &= ~0x00000002;
      energyInfo.clear();
      return this;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEnergyInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RotatorEnergyInfoOuterClass.RotatorEnergyInfo getEnergyInfo() {
      return energyInfo;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RotatorEnergyInfoOuterClass.RotatorEnergyInfo getMutableEnergyInfo() {
      bitField0_ |= 0x00000002;
      return energyInfo;
    }

    /**
     * <code>optional .RotatorEnergyInfo energy_info = 6;</code>
     * @param value the energyInfo to set
     * @return this
     */
    public RemoveRotaterScRsp setEnergyInfo(
        final RotatorEnergyInfoOuterClass.RotatorEnergyInfo value) {
      bitField0_ |= 0x00000002;
      energyInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RotaterData rotater_data = 7;</code>
     * @return whether the rotaterData field is set
     */
    public boolean hasRotaterData() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RotaterData rotater_data = 7;</code>
     * @return this
     */
    public RemoveRotaterScRsp clearRotaterData() {
      bitField0_ &= ~0x00000004;
      rotaterData.clear();
      return this;
    }

    /**
     * <code>optional .RotaterData rotater_data = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRotaterData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RotaterDataOuterClass.RotaterData getRotaterData() {
      return rotaterData;
    }

    /**
     * <code>optional .RotaterData rotater_data = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RotaterDataOuterClass.RotaterData getMutableRotaterData() {
      bitField0_ |= 0x00000004;
      return rotaterData;
    }

    /**
     * <code>optional .RotaterData rotater_data = 7;</code>
     * @param value the rotaterData to set
     * @return this
     */
    public RemoveRotaterScRsp setRotaterData(final RotaterDataOuterClass.RotaterData value) {
      bitField0_ |= 0x00000004;
      rotaterData.copyFrom(value);
      return this;
    }

    @Override
    public RemoveRotaterScRsp copyFrom(final RemoveRotaterScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        energyInfo.copyFrom(other.energyInfo);
        rotaterData.copyFrom(other.rotaterData);
      }
      return this;
    }

    @Override
    public RemoveRotaterScRsp mergeFrom(final RemoveRotaterScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasEnergyInfo()) {
        getMutableEnergyInfo().mergeFrom(other.energyInfo);
      }
      if (other.hasRotaterData()) {
        getMutableRotaterData().mergeFrom(other.rotaterData);
      }
      return this;
    }

    @Override
    public RemoveRotaterScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      energyInfo.clear();
      rotaterData.clear();
      return this;
    }

    @Override
    public RemoveRotaterScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      energyInfo.clearQuick();
      rotaterData.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RemoveRotaterScRsp)) {
        return false;
      }
      RemoveRotaterScRsp other = (RemoveRotaterScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasEnergyInfo() || energyInfo.equals(other.energyInfo))
        && (!hasRotaterData() || rotaterData.equals(other.rotaterData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(energyInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 58);
        output.writeMessageNoTag(rotaterData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(energyInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rotaterData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RemoveRotaterScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // energyInfo
            input.readMessage(energyInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // rotaterData
            input.readMessage(rotaterData);
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
        output.writeMessage(FieldNames.energyInfo, energyInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rotaterData, rotaterData);
      }
      output.endObject();
    }

    @Override
    public RemoveRotaterScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1464698710:
          case -1818804219: {
            if (input.isAtField(FieldNames.energyInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(energyInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1880563393:
          case -1807070094: {
            if (input.isAtField(FieldNames.rotaterData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rotaterData);
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
    public RemoveRotaterScRsp clone() {
      return new RemoveRotaterScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RemoveRotaterScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RemoveRotaterScRsp(), data).checkInitialized();
    }

    public static RemoveRotaterScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RemoveRotaterScRsp(), input).checkInitialized();
    }

    public static RemoveRotaterScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RemoveRotaterScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating RemoveRotaterScRsp messages
     */
    public static MessageFactory<RemoveRotaterScRsp> getFactory() {
      return RemoveRotaterScRspFactory.INSTANCE;
    }

    private enum RemoveRotaterScRspFactory implements MessageFactory<RemoveRotaterScRsp> {
      INSTANCE;

      @Override
      public RemoveRotaterScRsp create() {
        return RemoveRotaterScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName energyInfo = FieldName.forField("energyInfo", "energy_info");

      static final FieldName rotaterData = FieldName.forField("rotaterData", "rotater_data");
    }
  }
}