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

public final class GroupStateChangeScRspOuterClass {
  /**
   * Protobuf type {@code GroupStateChangeScRsp}
   */
  public static final class GroupStateChangeScRsp extends ProtoMessage<GroupStateChangeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>optional .GroupStateInfo group_state_info = 3;</code>
     */
    private final GroupStateInfoOuterClass.GroupStateInfo groupStateInfo = GroupStateInfoOuterClass.GroupStateInfo.newInstance();

    private GroupStateChangeScRsp() {
    }

    /**
     * @return a new empty instance of {@code GroupStateChangeScRsp}
     */
    public static GroupStateChangeScRsp newInstance() {
      return new GroupStateChangeScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public GroupStateChangeScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public GroupStateChangeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 3;</code>
     * @return whether the groupStateInfo field is set
     */
    public boolean hasGroupStateInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 3;</code>
     * @return this
     */
    public GroupStateChangeScRsp clearGroupStateInfo() {
      bitField0_ &= ~0x00000002;
      groupStateInfo.clear();
      return this;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGroupStateInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public GroupStateInfoOuterClass.GroupStateInfo getGroupStateInfo() {
      return groupStateInfo;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public GroupStateInfoOuterClass.GroupStateInfo getMutableGroupStateInfo() {
      bitField0_ |= 0x00000002;
      return groupStateInfo;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 3;</code>
     * @param value the groupStateInfo to set
     * @return this
     */
    public GroupStateChangeScRsp setGroupStateInfo(
        final GroupStateInfoOuterClass.GroupStateInfo value) {
      bitField0_ |= 0x00000002;
      groupStateInfo.copyFrom(value);
      return this;
    }

    @Override
    public GroupStateChangeScRsp copyFrom(final GroupStateChangeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        groupStateInfo.copyFrom(other.groupStateInfo);
      }
      return this;
    }

    @Override
    public GroupStateChangeScRsp mergeFrom(final GroupStateChangeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasGroupStateInfo()) {
        getMutableGroupStateInfo().mergeFrom(other.groupStateInfo);
      }
      return this;
    }

    @Override
    public GroupStateChangeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      groupStateInfo.clear();
      return this;
    }

    @Override
    public GroupStateChangeScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupStateInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GroupStateChangeScRsp)) {
        return false;
      }
      GroupStateChangeScRsp other = (GroupStateChangeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasGroupStateInfo() || groupStateInfo.equals(other.groupStateInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(groupStateInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(groupStateInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GroupStateChangeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // groupStateInfo
            input.readMessage(groupStateInfo);
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.groupStateInfo, groupStateInfo);
      }
      output.endObject();
    }

    @Override
    public GroupStateChangeScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1415312672:
          case 1198732636: {
            if (input.isAtField(FieldNames.groupStateInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(groupStateInfo);
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
    public GroupStateChangeScRsp clone() {
      return new GroupStateChangeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GroupStateChangeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GroupStateChangeScRsp(), data).checkInitialized();
    }

    public static GroupStateChangeScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GroupStateChangeScRsp(), input).checkInitialized();
    }

    public static GroupStateChangeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GroupStateChangeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GroupStateChangeScRsp messages
     */
    public static MessageFactory<GroupStateChangeScRsp> getFactory() {
      return GroupStateChangeScRspFactory.INSTANCE;
    }

    private enum GroupStateChangeScRspFactory implements MessageFactory<GroupStateChangeScRsp> {
      INSTANCE;

      @Override
      public GroupStateChangeScRsp create() {
        return GroupStateChangeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName groupStateInfo = FieldName.forField("groupStateInfo", "group_state_info");
    }
  }
}
