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

public final class EquipmentOuterClass {
  /**
   * Protobuf type {@code Equipment}
   */
  public static final class Equipment extends ProtoMessage<Equipment> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 promotion = 1;</code>
     */
    private int promotion;

    /**
     * <code>optional uint32 rank = 3;</code>
     */
    private int rank;

    /**
     * <code>optional uint32 equip_avatar_id = 4;</code>
     */
    private int equipAvatarId;

    /**
     * <code>optional uint32 unique_id = 6;</code>
     */
    private int uniqueId;

    /**
     * <code>optional uint32 exp = 9;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 level = 13;</code>
     */
    private int level;

    /**
     * <code>optional uint32 tid = 14;</code>
     */
    private int tid;

    /**
     * <code>optional bool is_protected = 15;</code>
     */
    private boolean isProtected;

    private Equipment() {
    }

    /**
     * @return a new empty instance of {@code Equipment}
     */
    public static Equipment newInstance() {
      return new Equipment();
    }

    /**
     * <code>optional uint32 promotion = 1;</code>
     * @return whether the promotion field is set
     */
    public boolean hasPromotion() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 promotion = 1;</code>
     * @return this
     */
    public Equipment clearPromotion() {
      bitField0_ &= ~0x00000001;
      promotion = 0;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 1;</code>
     * @return the promotion
     */
    public int getPromotion() {
      return promotion;
    }

    /**
     * <code>optional uint32 promotion = 1;</code>
     * @param value the promotion to set
     * @return this
     */
    public Equipment setPromotion(final int value) {
      bitField0_ |= 0x00000001;
      promotion = value;
      return this;
    }

    /**
     * <code>optional uint32 rank = 3;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 rank = 3;</code>
     * @return this
     */
    public Equipment clearRank() {
      bitField0_ &= ~0x00000002;
      rank = 0;
      return this;
    }

    /**
     * <code>optional uint32 rank = 3;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <code>optional uint32 rank = 3;</code>
     * @param value the rank to set
     * @return this
     */
    public Equipment setRank(final int value) {
      bitField0_ |= 0x00000002;
      rank = value;
      return this;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 4;</code>
     * @return whether the equipAvatarId field is set
     */
    public boolean hasEquipAvatarId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 4;</code>
     * @return this
     */
    public Equipment clearEquipAvatarId() {
      bitField0_ &= ~0x00000004;
      equipAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 4;</code>
     * @return the equipAvatarId
     */
    public int getEquipAvatarId() {
      return equipAvatarId;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 4;</code>
     * @param value the equipAvatarId to set
     * @return this
     */
    public Equipment setEquipAvatarId(final int value) {
      bitField0_ |= 0x00000004;
      equipAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 6;</code>
     * @return whether the uniqueId field is set
     */
    public boolean hasUniqueId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 unique_id = 6;</code>
     * @return this
     */
    public Equipment clearUniqueId() {
      bitField0_ &= ~0x00000008;
      uniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 6;</code>
     * @return the uniqueId
     */
    public int getUniqueId() {
      return uniqueId;
    }

    /**
     * <code>optional uint32 unique_id = 6;</code>
     * @param value the uniqueId to set
     * @return this
     */
    public Equipment setUniqueId(final int value) {
      bitField0_ |= 0x00000008;
      uniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 exp = 9;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 exp = 9;</code>
     * @return this
     */
    public Equipment clearExp() {
      bitField0_ &= ~0x00000010;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 9;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 9;</code>
     * @param value the exp to set
     * @return this
     */
    public Equipment setExp(final int value) {
      bitField0_ |= 0x00000010;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @return this
     */
    public Equipment clearLevel() {
      bitField0_ &= ~0x00000020;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @param value the level to set
     * @return this
     */
    public Equipment setLevel(final int value) {
      bitField0_ |= 0x00000020;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 tid = 14;</code>
     * @return whether the tid field is set
     */
    public boolean hasTid() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 tid = 14;</code>
     * @return this
     */
    public Equipment clearTid() {
      bitField0_ &= ~0x00000040;
      tid = 0;
      return this;
    }

    /**
     * <code>optional uint32 tid = 14;</code>
     * @return the tid
     */
    public int getTid() {
      return tid;
    }

    /**
     * <code>optional uint32 tid = 14;</code>
     * @param value the tid to set
     * @return this
     */
    public Equipment setTid(final int value) {
      bitField0_ |= 0x00000040;
      tid = value;
      return this;
    }

    /**
     * <code>optional bool is_protected = 15;</code>
     * @return whether the isProtected field is set
     */
    public boolean hasIsProtected() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional bool is_protected = 15;</code>
     * @return this
     */
    public Equipment clearIsProtected() {
      bitField0_ &= ~0x00000080;
      isProtected = false;
      return this;
    }

    /**
     * <code>optional bool is_protected = 15;</code>
     * @return the isProtected
     */
    public boolean getIsProtected() {
      return isProtected;
    }

    /**
     * <code>optional bool is_protected = 15;</code>
     * @param value the isProtected to set
     * @return this
     */
    public Equipment setIsProtected(final boolean value) {
      bitField0_ |= 0x00000080;
      isProtected = value;
      return this;
    }

    @Override
    public Equipment copyFrom(final Equipment other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        promotion = other.promotion;
        rank = other.rank;
        equipAvatarId = other.equipAvatarId;
        uniqueId = other.uniqueId;
        exp = other.exp;
        level = other.level;
        tid = other.tid;
        isProtected = other.isProtected;
      }
      return this;
    }

    @Override
    public Equipment mergeFrom(final Equipment other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPromotion()) {
        setPromotion(other.promotion);
      }
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasEquipAvatarId()) {
        setEquipAvatarId(other.equipAvatarId);
      }
      if (other.hasUniqueId()) {
        setUniqueId(other.uniqueId);
      }
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasTid()) {
        setTid(other.tid);
      }
      if (other.hasIsProtected()) {
        setIsProtected(other.isProtected);
      }
      return this;
    }

    @Override
    public Equipment clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      promotion = 0;
      rank = 0;
      equipAvatarId = 0;
      uniqueId = 0;
      exp = 0;
      level = 0;
      tid = 0;
      isProtected = false;
      return this;
    }

    @Override
    public Equipment clearQuick() {
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
      if (!(o instanceof Equipment)) {
        return false;
      }
      Equipment other = (Equipment) o;
      return bitField0_ == other.bitField0_
        && (!hasPromotion() || promotion == other.promotion)
        && (!hasRank() || rank == other.rank)
        && (!hasEquipAvatarId() || equipAvatarId == other.equipAvatarId)
        && (!hasUniqueId() || uniqueId == other.uniqueId)
        && (!hasExp() || exp == other.exp)
        && (!hasLevel() || level == other.level)
        && (!hasTid() || tid == other.tid)
        && (!hasIsProtected() || isProtected == other.isProtected);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(promotion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(equipAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(tid);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 120);
        output.writeBoolNoTag(isProtected);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(promotion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(equipAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(tid);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Equipment mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // promotion
            promotion = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // equipAvatarId
            equipAvatarId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // uniqueId
            uniqueId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // tid
            tid = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // isProtected
            isProtected = input.readBool();
            bitField0_ |= 0x00000080;
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
        output.writeUInt32(FieldNames.promotion, promotion);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.equipAvatarId, equipAvatarId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.uniqueId, uniqueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.tid, tid);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeBool(FieldNames.isProtected, isProtected);
      }
      output.endObject();
    }

    @Override
    public Equipment mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -799212381: {
            if (input.isAtField(FieldNames.promotion)) {
              if (!input.trySkipNullValue()) {
                promotion = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3492908: {
            if (input.isAtField(FieldNames.rank)) {
              if (!input.trySkipNullValue()) {
                rank = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 169047204:
          case 33057906: {
            if (input.isAtField(FieldNames.equipAvatarId)) {
              if (!input.trySkipNullValue()) {
                equipAvatarId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -294460212:
          case -538310583: {
            if (input.isAtField(FieldNames.uniqueId)) {
              if (!input.trySkipNullValue()) {
                uniqueId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100893: {
            if (input.isAtField(FieldNames.exp)) {
              if (!input.trySkipNullValue()) {
                exp = input.readUInt32();
                bitField0_ |= 0x00000010;
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
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 114831: {
            if (input.isAtField(FieldNames.tid)) {
              if (!input.trySkipNullValue()) {
                tid = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 569879972:
          case -1919645991: {
            if (input.isAtField(FieldNames.isProtected)) {
              if (!input.trySkipNullValue()) {
                isProtected = input.readBool();
                bitField0_ |= 0x00000080;
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
    public Equipment clone() {
      return new Equipment().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Equipment parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Equipment(), data).checkInitialized();
    }

    public static Equipment parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Equipment(), input).checkInitialized();
    }

    public static Equipment parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Equipment(), input).checkInitialized();
    }

    /**
     * @return factory for creating Equipment messages
     */
    public static MessageFactory<Equipment> getFactory() {
      return EquipmentFactory.INSTANCE;
    }

    private enum EquipmentFactory implements MessageFactory<Equipment> {
      INSTANCE;

      @Override
      public Equipment create() {
        return Equipment.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName promotion = FieldName.forField("promotion");

      static final FieldName rank = FieldName.forField("rank");

      static final FieldName equipAvatarId = FieldName.forField("equipAvatarId", "equip_avatar_id");

      static final FieldName uniqueId = FieldName.forField("uniqueId", "unique_id");

      static final FieldName exp = FieldName.forField("exp");

      static final FieldName level = FieldName.forField("level");

      static final FieldName tid = FieldName.forField("tid");

      static final FieldName isProtected = FieldName.forField("isProtected", "is_protected");
    }
  }
}
