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

public final class RogueBuffOuterClass {
  /**
   * Protobuf type {@code RogueBuff}
   */
  public static final class RogueBuff extends ProtoMessage<RogueBuff> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 buff_id = 7;</code>
     */
    private int buffId;

    /**
     * <code>optional uint32 level = 15;</code>
     */
    private int level;

    private RogueBuff() {
    }

    /**
     * @return a new empty instance of {@code RogueBuff}
     */
    public static RogueBuff newInstance() {
      return new RogueBuff();
    }

    /**
     * <code>optional uint32 buff_id = 7;</code>
     * @return whether the buffId field is set
     */
    public boolean hasBuffId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 buff_id = 7;</code>
     * @return this
     */
    public RogueBuff clearBuffId() {
      bitField0_ &= ~0x00000001;
      buffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 buff_id = 7;</code>
     * @return the buffId
     */
    public int getBuffId() {
      return buffId;
    }

    /**
     * <code>optional uint32 buff_id = 7;</code>
     * @param value the buffId to set
     * @return this
     */
    public RogueBuff setBuffId(final int value) {
      bitField0_ |= 0x00000001;
      buffId = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return this
     */
    public RogueBuff clearLevel() {
      bitField0_ &= ~0x00000002;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @param value the level to set
     * @return this
     */
    public RogueBuff setLevel(final int value) {
      bitField0_ |= 0x00000002;
      level = value;
      return this;
    }

    @Override
    public RogueBuff copyFrom(final RogueBuff other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        buffId = other.buffId;
        level = other.level;
      }
      return this;
    }

    @Override
    public RogueBuff mergeFrom(final RogueBuff other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBuffId()) {
        setBuffId(other.buffId);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      return this;
    }

    @Override
    public RogueBuff clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffId = 0;
      level = 0;
      return this;
    }

    @Override
    public RogueBuff clearQuick() {
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
      if (!(o instanceof RogueBuff)) {
        return false;
      }
      RogueBuff other = (RogueBuff) o;
      return bitField0_ == other.bitField0_
        && (!hasBuffId() || buffId == other.buffId)
        && (!hasLevel() || level == other.level);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(buffId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(level);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(buffId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueBuff mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // buffId
            buffId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // level
            level = input.readUInt32();
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
        output.writeUInt32(FieldNames.buffId, buffId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      output.endObject();
    }

    @Override
    public RogueBuff mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1378119474:
          case 227990663: {
            if (input.isAtField(FieldNames.buffId)) {
              if (!input.trySkipNullValue()) {
                buffId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
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
    public RogueBuff clone() {
      return new RogueBuff().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueBuff parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueBuff(), data).checkInitialized();
    }

    public static RogueBuff parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuff(), input).checkInitialized();
    }

    public static RogueBuff parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueBuff(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueBuff messages
     */
    public static MessageFactory<RogueBuff> getFactory() {
      return RogueBuffFactory.INSTANCE;
    }

    private enum RogueBuffFactory implements MessageFactory<RogueBuff> {
      INSTANCE;

      @Override
      public RogueBuff create() {
        return RogueBuff.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName buffId = FieldName.forField("buffId", "buff_id");

      static final FieldName level = FieldName.forField("level");
    }
  }
}
