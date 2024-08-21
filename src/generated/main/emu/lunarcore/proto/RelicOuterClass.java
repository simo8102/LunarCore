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

public final class RelicOuterClass {
  /**
   * Protobuf type {@code Relic}
   */
  public static final class Relic extends ProtoMessage<Relic> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 main_affix_id = 5;</code>
     */
    private int mainAffixId;

    /**
     * <code>optional uint32 exp = 7;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 unique_id = 9;</code>
     */
    private int uniqueId;

    /**
     * <code>optional uint32 equip_avatar_id = 10;</code>
     */
    private int equipAvatarId;

    /**
     * <code>optional uint32 tid = 13;</code>
     */
    private int tid;

    /**
     * <code>optional uint32 level = 15;</code>
     */
    private int level;

    /**
     * <code>optional bool is_protected = 8;</code>
     */
    private boolean isProtected;

    /**
     * <code>optional bool is_discarded = 11;</code>
     */
    private boolean isDiscarded;

    /**
     * <code>repeated .RelicAffix sub_affix_list = 12;</code>
     */
    private final RepeatedMessage<RelicAffixOuterClass.RelicAffix> subAffixList = RepeatedMessage.newEmptyInstance(RelicAffixOuterClass.RelicAffix.getFactory());

    private Relic() {
    }

    /**
     * @return a new empty instance of {@code Relic}
     */
    public static Relic newInstance() {
      return new Relic();
    }

    /**
     * <code>optional uint32 main_affix_id = 5;</code>
     * @return whether the mainAffixId field is set
     */
    public boolean hasMainAffixId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 main_affix_id = 5;</code>
     * @return this
     */
    public Relic clearMainAffixId() {
      bitField0_ &= ~0x00000001;
      mainAffixId = 0;
      return this;
    }

    /**
     * <code>optional uint32 main_affix_id = 5;</code>
     * @return the mainAffixId
     */
    public int getMainAffixId() {
      return mainAffixId;
    }

    /**
     * <code>optional uint32 main_affix_id = 5;</code>
     * @param value the mainAffixId to set
     * @return this
     */
    public Relic setMainAffixId(final int value) {
      bitField0_ |= 0x00000001;
      mainAffixId = value;
      return this;
    }

    /**
     * <code>optional uint32 exp = 7;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 exp = 7;</code>
     * @return this
     */
    public Relic clearExp() {
      bitField0_ &= ~0x00000002;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 7;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 7;</code>
     * @param value the exp to set
     * @return this
     */
    public Relic setExp(final int value) {
      bitField0_ |= 0x00000002;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 9;</code>
     * @return whether the uniqueId field is set
     */
    public boolean hasUniqueId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 unique_id = 9;</code>
     * @return this
     */
    public Relic clearUniqueId() {
      bitField0_ &= ~0x00000004;
      uniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 9;</code>
     * @return the uniqueId
     */
    public int getUniqueId() {
      return uniqueId;
    }

    /**
     * <code>optional uint32 unique_id = 9;</code>
     * @param value the uniqueId to set
     * @return this
     */
    public Relic setUniqueId(final int value) {
      bitField0_ |= 0x00000004;
      uniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 10;</code>
     * @return whether the equipAvatarId field is set
     */
    public boolean hasEquipAvatarId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 10;</code>
     * @return this
     */
    public Relic clearEquipAvatarId() {
      bitField0_ &= ~0x00000008;
      equipAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 10;</code>
     * @return the equipAvatarId
     */
    public int getEquipAvatarId() {
      return equipAvatarId;
    }

    /**
     * <code>optional uint32 equip_avatar_id = 10;</code>
     * @param value the equipAvatarId to set
     * @return this
     */
    public Relic setEquipAvatarId(final int value) {
      bitField0_ |= 0x00000008;
      equipAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 tid = 13;</code>
     * @return whether the tid field is set
     */
    public boolean hasTid() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 tid = 13;</code>
     * @return this
     */
    public Relic clearTid() {
      bitField0_ &= ~0x00000010;
      tid = 0;
      return this;
    }

    /**
     * <code>optional uint32 tid = 13;</code>
     * @return the tid
     */
    public int getTid() {
      return tid;
    }

    /**
     * <code>optional uint32 tid = 13;</code>
     * @param value the tid to set
     * @return this
     */
    public Relic setTid(final int value) {
      bitField0_ |= 0x00000010;
      tid = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return this
     */
    public Relic clearLevel() {
      bitField0_ &= ~0x00000020;
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
    public Relic setLevel(final int value) {
      bitField0_ |= 0x00000020;
      level = value;
      return this;
    }

    /**
     * <code>optional bool is_protected = 8;</code>
     * @return whether the isProtected field is set
     */
    public boolean hasIsProtected() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional bool is_protected = 8;</code>
     * @return this
     */
    public Relic clearIsProtected() {
      bitField0_ &= ~0x00000040;
      isProtected = false;
      return this;
    }

    /**
     * <code>optional bool is_protected = 8;</code>
     * @return the isProtected
     */
    public boolean getIsProtected() {
      return isProtected;
    }

    /**
     * <code>optional bool is_protected = 8;</code>
     * @param value the isProtected to set
     * @return this
     */
    public Relic setIsProtected(final boolean value) {
      bitField0_ |= 0x00000040;
      isProtected = value;
      return this;
    }

    /**
     * <code>optional bool is_discarded = 11;</code>
     * @return whether the isDiscarded field is set
     */
    public boolean hasIsDiscarded() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional bool is_discarded = 11;</code>
     * @return this
     */
    public Relic clearIsDiscarded() {
      bitField0_ &= ~0x00000080;
      isDiscarded = false;
      return this;
    }

    /**
     * <code>optional bool is_discarded = 11;</code>
     * @return the isDiscarded
     */
    public boolean getIsDiscarded() {
      return isDiscarded;
    }

    /**
     * <code>optional bool is_discarded = 11;</code>
     * @param value the isDiscarded to set
     * @return this
     */
    public Relic setIsDiscarded(final boolean value) {
      bitField0_ |= 0x00000080;
      isDiscarded = value;
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 12;</code>
     * @return whether the subAffixList field is set
     */
    public boolean hasSubAffixList() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 12;</code>
     * @return this
     */
    public Relic clearSubAffixList() {
      bitField0_ &= ~0x00000100;
      subAffixList.clear();
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSubAffixList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getSubAffixList() {
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getMutableSubAffixList() {
      bitField0_ |= 0x00000100;
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 12;</code>
     * @param value the subAffixList to add
     * @return this
     */
    public Relic addSubAffixList(final RelicAffixOuterClass.RelicAffix value) {
      bitField0_ |= 0x00000100;
      subAffixList.add(value);
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 12;</code>
     * @param values the subAffixList to add
     * @return this
     */
    public Relic addAllSubAffixList(final RelicAffixOuterClass.RelicAffix... values) {
      bitField0_ |= 0x00000100;
      subAffixList.addAll(values);
      return this;
    }

    @Override
    public Relic copyFrom(final Relic other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mainAffixId = other.mainAffixId;
        exp = other.exp;
        uniqueId = other.uniqueId;
        equipAvatarId = other.equipAvatarId;
        tid = other.tid;
        level = other.level;
        isProtected = other.isProtected;
        isDiscarded = other.isDiscarded;
        subAffixList.copyFrom(other.subAffixList);
      }
      return this;
    }

    @Override
    public Relic mergeFrom(final Relic other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMainAffixId()) {
        setMainAffixId(other.mainAffixId);
      }
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasUniqueId()) {
        setUniqueId(other.uniqueId);
      }
      if (other.hasEquipAvatarId()) {
        setEquipAvatarId(other.equipAvatarId);
      }
      if (other.hasTid()) {
        setTid(other.tid);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasIsProtected()) {
        setIsProtected(other.isProtected);
      }
      if (other.hasIsDiscarded()) {
        setIsDiscarded(other.isDiscarded);
      }
      if (other.hasSubAffixList()) {
        getMutableSubAffixList().addAll(other.subAffixList);
      }
      return this;
    }

    @Override
    public Relic clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mainAffixId = 0;
      exp = 0;
      uniqueId = 0;
      equipAvatarId = 0;
      tid = 0;
      level = 0;
      isProtected = false;
      isDiscarded = false;
      subAffixList.clear();
      return this;
    }

    @Override
    public Relic clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      subAffixList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Relic)) {
        return false;
      }
      Relic other = (Relic) o;
      return bitField0_ == other.bitField0_
        && (!hasMainAffixId() || mainAffixId == other.mainAffixId)
        && (!hasExp() || exp == other.exp)
        && (!hasUniqueId() || uniqueId == other.uniqueId)
        && (!hasEquipAvatarId() || equipAvatarId == other.equipAvatarId)
        && (!hasTid() || tid == other.tid)
        && (!hasLevel() || level == other.level)
        && (!hasIsProtected() || isProtected == other.isProtected)
        && (!hasIsDiscarded() || isDiscarded == other.isDiscarded)
        && (!hasSubAffixList() || subAffixList.equals(other.subAffixList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(equipAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(tid);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 64);
        output.writeBoolNoTag(isProtected);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 88);
        output.writeBoolNoTag(isDiscarded);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < subAffixList.length(); i++) {
          output.writeRawByte((byte) 98);
          output.writeMessageNoTag(subAffixList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(equipAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(tid);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * subAffixList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(subAffixList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Relic mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // mainAffixId
            mainAffixId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // uniqueId
            uniqueId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // equipAvatarId
            equipAvatarId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // tid
            tid = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // isProtected
            isProtected = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // isDiscarded
            isDiscarded = input.readBool();
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // subAffixList
            tag = input.readRepeatedMessage(subAffixList, tag);
            bitField0_ |= 0x00000100;
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
        output.writeUInt32(FieldNames.mainAffixId, mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.uniqueId, uniqueId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.equipAvatarId, equipAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.tid, tid);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.isProtected, isProtected);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeBool(FieldNames.isDiscarded, isDiscarded);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.subAffixList, subAffixList);
      }
      output.endObject();
    }

    @Override
    public Relic mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1973876974:
          case -1426712144: {
            if (input.isAtField(FieldNames.mainAffixId)) {
              if (!input.trySkipNullValue()) {
                mainAffixId = input.readUInt32();
                bitField0_ |= 0x00000001;
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
                bitField0_ |= 0x00000002;
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
                bitField0_ |= 0x00000004;
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
                bitField0_ |= 0x00000008;
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
          case 569879972:
          case -1919645991: {
            if (input.isAtField(FieldNames.isProtected)) {
              if (!input.trySkipNullValue()) {
                isProtected = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1044162483:
          case -1445363480: {
            if (input.isAtField(FieldNames.isDiscarded)) {
              if (!input.trySkipNullValue()) {
                isDiscarded = input.readBool();
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -600836050:
          case 919890188: {
            if (input.isAtField(FieldNames.subAffixList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(subAffixList);
                bitField0_ |= 0x00000100;
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
    public Relic clone() {
      return new Relic().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Relic parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Relic(), data).checkInitialized();
    }

    public static Relic parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Relic(), input).checkInitialized();
    }

    public static Relic parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Relic(), input).checkInitialized();
    }

    /**
     * @return factory for creating Relic messages
     */
    public static MessageFactory<Relic> getFactory() {
      return RelicFactory.INSTANCE;
    }

    private enum RelicFactory implements MessageFactory<Relic> {
      INSTANCE;

      @Override
      public Relic create() {
        return Relic.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mainAffixId = FieldName.forField("mainAffixId", "main_affix_id");

      static final FieldName exp = FieldName.forField("exp");

      static final FieldName uniqueId = FieldName.forField("uniqueId", "unique_id");

      static final FieldName equipAvatarId = FieldName.forField("equipAvatarId", "equip_avatar_id");

      static final FieldName tid = FieldName.forField("tid");

      static final FieldName level = FieldName.forField("level");

      static final FieldName isProtected = FieldName.forField("isProtected", "is_protected");

      static final FieldName isDiscarded = FieldName.forField("isDiscarded", "is_discarded");

      static final FieldName subAffixList = FieldName.forField("subAffixList", "sub_affix_list");
    }
  }
}
