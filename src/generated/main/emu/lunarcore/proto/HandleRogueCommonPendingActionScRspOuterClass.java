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

public final class HandleRogueCommonPendingActionScRspOuterClass {
  /**
   * Protobuf type {@code HandleRogueCommonPendingActionScRsp}
   */
  public static final class HandleRogueCommonPendingActionScRsp extends ProtoMessage<HandleRogueCommonPendingActionScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 times = 6;</code>
     */
    private int times;

    /**
     * <pre>
     * JNFKIKEOCDJ PMKFBIDBNMD = 278;
     * NBBNKDNALML NHMMLPMPOGJ = 1188;
     * </pre>
     *
     * <code>optional .RogueRerollBuff rogue_reroll_buff = 726;</code>
     */
    private final RogueRerollBuffOuterClass.RogueRerollBuff rogueRerollBuff = RogueRerollBuffOuterClass.RogueRerollBuff.newInstance();

    /**
     * <pre>
     * CAJPKNLHPKI EDNKJDKBFBK = 1063;
     * HAAFONHLFGK LMMCDOMELIG = 703;
     * CFEFNJGJLMO CLLEHKCPKPF = 337;
     * IAAPDOPPHGN NIMIHAMIMDC = 283;
     * </pre>
     *
     * <code>optional .RogueBonusSelect bonus_select = 1149;</code>
     */
    private final RogueBonusSelectOuterClass.RogueBonusSelect bonusSelect = RogueBonusSelectOuterClass.RogueBonusSelect.newInstance();

    /**
     * <code>optional .RogueBuffSelect rogue_buff_select = 1258;</code>
     */
    private final RogueBuffSelectOuterClass.RogueBuffSelect rogueBuffSelect = RogueBuffSelectOuterClass.RogueBuffSelect.newInstance();

    /**
     * <code>optional .RogueMiracleSelect miracle_select = 1655;</code>
     */
    private final RogueMiracleSelectOuterClass.RogueMiracleSelect miracleSelect = RogueMiracleSelectOuterClass.RogueMiracleSelect.newInstance();

    private HandleRogueCommonPendingActionScRsp() {
    }

    /**
     * @return a new empty instance of {@code HandleRogueCommonPendingActionScRsp}
     */
    public static HandleRogueCommonPendingActionScRsp newInstance() {
      return new HandleRogueCommonPendingActionScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 times = 6;</code>
     * @return whether the times field is set
     */
    public boolean hasTimes() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 times = 6;</code>
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp clearTimes() {
      bitField0_ &= ~0x00000002;
      times = 0;
      return this;
    }

    /**
     * <code>optional uint32 times = 6;</code>
     * @return the times
     */
    public int getTimes() {
      return times;
    }

    /**
     * <code>optional uint32 times = 6;</code>
     * @param value the times to set
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp setTimes(final int value) {
      bitField0_ |= 0x00000002;
      times = value;
      return this;
    }

    /**
     * <pre>
     * JNFKIKEOCDJ PMKFBIDBNMD = 278;
     * NBBNKDNALML NHMMLPMPOGJ = 1188;
     * </pre>
     *
     * <code>optional .RogueRerollBuff rogue_reroll_buff = 726;</code>
     * @return whether the rogueRerollBuff field is set
     */
    public boolean hasRogueRerollBuff() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     * JNFKIKEOCDJ PMKFBIDBNMD = 278;
     * NBBNKDNALML NHMMLPMPOGJ = 1188;
     * </pre>
     *
     * <code>optional .RogueRerollBuff rogue_reroll_buff = 726;</code>
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp clearRogueRerollBuff() {
      bitField0_ &= ~0x00000004;
      rogueRerollBuff.clear();
      return this;
    }

    /**
     * <pre>
     * JNFKIKEOCDJ PMKFBIDBNMD = 278;
     * NBBNKDNALML NHMMLPMPOGJ = 1188;
     * </pre>
     *
     * <code>optional .RogueRerollBuff rogue_reroll_buff = 726;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueRerollBuff()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueRerollBuffOuterClass.RogueRerollBuff getRogueRerollBuff() {
      return rogueRerollBuff;
    }

    /**
     * <pre>
     * JNFKIKEOCDJ PMKFBIDBNMD = 278;
     * NBBNKDNALML NHMMLPMPOGJ = 1188;
     * </pre>
     *
     * <code>optional .RogueRerollBuff rogue_reroll_buff = 726;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueRerollBuffOuterClass.RogueRerollBuff getMutableRogueRerollBuff() {
      bitField0_ |= 0x00000004;
      return rogueRerollBuff;
    }

    /**
     * <pre>
     * JNFKIKEOCDJ PMKFBIDBNMD = 278;
     * NBBNKDNALML NHMMLPMPOGJ = 1188;
     * </pre>
     *
     * <code>optional .RogueRerollBuff rogue_reroll_buff = 726;</code>
     * @param value the rogueRerollBuff to set
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp setRogueRerollBuff(
        final RogueRerollBuffOuterClass.RogueRerollBuff value) {
      bitField0_ |= 0x00000004;
      rogueRerollBuff.copyFrom(value);
      return this;
    }

    /**
     * <pre>
     * CAJPKNLHPKI EDNKJDKBFBK = 1063;
     * HAAFONHLFGK LMMCDOMELIG = 703;
     * CFEFNJGJLMO CLLEHKCPKPF = 337;
     * IAAPDOPPHGN NIMIHAMIMDC = 283;
     * </pre>
     *
     * <code>optional .RogueBonusSelect bonus_select = 1149;</code>
     * @return whether the bonusSelect field is set
     */
    public boolean hasBonusSelect() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     * CAJPKNLHPKI EDNKJDKBFBK = 1063;
     * HAAFONHLFGK LMMCDOMELIG = 703;
     * CFEFNJGJLMO CLLEHKCPKPF = 337;
     * IAAPDOPPHGN NIMIHAMIMDC = 283;
     * </pre>
     *
     * <code>optional .RogueBonusSelect bonus_select = 1149;</code>
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp clearBonusSelect() {
      bitField0_ &= ~0x00000008;
      bonusSelect.clear();
      return this;
    }

    /**
     * <pre>
     * CAJPKNLHPKI EDNKJDKBFBK = 1063;
     * HAAFONHLFGK LMMCDOMELIG = 703;
     * CFEFNJGJLMO CLLEHKCPKPF = 337;
     * IAAPDOPPHGN NIMIHAMIMDC = 283;
     * </pre>
     *
     * <code>optional .RogueBonusSelect bonus_select = 1149;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBonusSelect()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBonusSelectOuterClass.RogueBonusSelect getBonusSelect() {
      return bonusSelect;
    }

    /**
     * <pre>
     * CAJPKNLHPKI EDNKJDKBFBK = 1063;
     * HAAFONHLFGK LMMCDOMELIG = 703;
     * CFEFNJGJLMO CLLEHKCPKPF = 337;
     * IAAPDOPPHGN NIMIHAMIMDC = 283;
     * </pre>
     *
     * <code>optional .RogueBonusSelect bonus_select = 1149;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBonusSelectOuterClass.RogueBonusSelect getMutableBonusSelect() {
      bitField0_ |= 0x00000008;
      return bonusSelect;
    }

    /**
     * <pre>
     * CAJPKNLHPKI EDNKJDKBFBK = 1063;
     * HAAFONHLFGK LMMCDOMELIG = 703;
     * CFEFNJGJLMO CLLEHKCPKPF = 337;
     * IAAPDOPPHGN NIMIHAMIMDC = 283;
     * </pre>
     *
     * <code>optional .RogueBonusSelect bonus_select = 1149;</code>
     * @param value the bonusSelect to set
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp setBonusSelect(
        final RogueBonusSelectOuterClass.RogueBonusSelect value) {
      bitField0_ |= 0x00000008;
      bonusSelect.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueBuffSelect rogue_buff_select = 1258;</code>
     * @return whether the rogueBuffSelect field is set
     */
    public boolean hasRogueBuffSelect() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueBuffSelect rogue_buff_select = 1258;</code>
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp clearRogueBuffSelect() {
      bitField0_ &= ~0x00000010;
      rogueBuffSelect.clear();
      return this;
    }

    /**
     * <code>optional .RogueBuffSelect rogue_buff_select = 1258;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueBuffSelect()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBuffSelectOuterClass.RogueBuffSelect getRogueBuffSelect() {
      return rogueBuffSelect;
    }

    /**
     * <code>optional .RogueBuffSelect rogue_buff_select = 1258;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBuffSelectOuterClass.RogueBuffSelect getMutableRogueBuffSelect() {
      bitField0_ |= 0x00000010;
      return rogueBuffSelect;
    }

    /**
     * <code>optional .RogueBuffSelect rogue_buff_select = 1258;</code>
     * @param value the rogueBuffSelect to set
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp setRogueBuffSelect(
        final RogueBuffSelectOuterClass.RogueBuffSelect value) {
      bitField0_ |= 0x00000010;
      rogueBuffSelect.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueMiracleSelect miracle_select = 1655;</code>
     * @return whether the miracleSelect field is set
     */
    public boolean hasMiracleSelect() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .RogueMiracleSelect miracle_select = 1655;</code>
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp clearMiracleSelect() {
      bitField0_ &= ~0x00000020;
      miracleSelect.clear();
      return this;
    }

    /**
     * <code>optional .RogueMiracleSelect miracle_select = 1655;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMiracleSelect()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueMiracleSelectOuterClass.RogueMiracleSelect getMiracleSelect() {
      return miracleSelect;
    }

    /**
     * <code>optional .RogueMiracleSelect miracle_select = 1655;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueMiracleSelectOuterClass.RogueMiracleSelect getMutableMiracleSelect() {
      bitField0_ |= 0x00000020;
      return miracleSelect;
    }

    /**
     * <code>optional .RogueMiracleSelect miracle_select = 1655;</code>
     * @param value the miracleSelect to set
     * @return this
     */
    public HandleRogueCommonPendingActionScRsp setMiracleSelect(
        final RogueMiracleSelectOuterClass.RogueMiracleSelect value) {
      bitField0_ |= 0x00000020;
      miracleSelect.copyFrom(value);
      return this;
    }

    @Override
    public HandleRogueCommonPendingActionScRsp copyFrom(
        final HandleRogueCommonPendingActionScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        times = other.times;
        rogueRerollBuff.copyFrom(other.rogueRerollBuff);
        bonusSelect.copyFrom(other.bonusSelect);
        rogueBuffSelect.copyFrom(other.rogueBuffSelect);
        miracleSelect.copyFrom(other.miracleSelect);
      }
      return this;
    }

    @Override
    public HandleRogueCommonPendingActionScRsp mergeFrom(
        final HandleRogueCommonPendingActionScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTimes()) {
        setTimes(other.times);
      }
      if (other.hasRogueRerollBuff()) {
        getMutableRogueRerollBuff().mergeFrom(other.rogueRerollBuff);
      }
      if (other.hasBonusSelect()) {
        getMutableBonusSelect().mergeFrom(other.bonusSelect);
      }
      if (other.hasRogueBuffSelect()) {
        getMutableRogueBuffSelect().mergeFrom(other.rogueBuffSelect);
      }
      if (other.hasMiracleSelect()) {
        getMutableMiracleSelect().mergeFrom(other.miracleSelect);
      }
      return this;
    }

    @Override
    public HandleRogueCommonPendingActionScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      times = 0;
      rogueRerollBuff.clear();
      bonusSelect.clear();
      rogueBuffSelect.clear();
      miracleSelect.clear();
      return this;
    }

    @Override
    public HandleRogueCommonPendingActionScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueRerollBuff.clearQuick();
      bonusSelect.clearQuick();
      rogueBuffSelect.clearQuick();
      miracleSelect.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof HandleRogueCommonPendingActionScRsp)) {
        return false;
      }
      HandleRogueCommonPendingActionScRsp other = (HandleRogueCommonPendingActionScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTimes() || times == other.times)
        && (!hasRogueRerollBuff() || rogueRerollBuff.equals(other.rogueRerollBuff))
        && (!hasBonusSelect() || bonusSelect.equals(other.bonusSelect))
        && (!hasRogueBuffSelect() || rogueBuffSelect.equals(other.rogueBuffSelect))
        && (!hasMiracleSelect() || miracleSelect.equals(other.miracleSelect));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(times);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawLittleEndian16((short) 11698);
        output.writeMessageNoTag(rogueRerollBuff);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawLittleEndian16((short) 18410);
        output.writeMessageNoTag(bonusSelect);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawLittleEndian16((short) 20178);
        output.writeMessageNoTag(rogueBuffSelect);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawLittleEndian16((short) 26554);
        output.writeMessageNoTag(miracleSelect);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(times);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(rogueRerollBuff);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(bonusSelect);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(rogueBuffSelect);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2 + ProtoSink.computeMessageSizeNoTag(miracleSelect);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public HandleRogueCommonPendingActionScRsp mergeFrom(final ProtoSource input) throws
        IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // times
            times = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 5810) {
              break;
            }
          }
          case 5810: {
            // rogueRerollBuff
            input.readMessage(rogueRerollBuff);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 9194) {
              break;
            }
          }
          case 9194: {
            // bonusSelect
            input.readMessage(bonusSelect);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 10066) {
              break;
            }
          }
          case 10066: {
            // rogueBuffSelect
            input.readMessage(rogueBuffSelect);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 13242) {
              break;
            }
          }
          case 13242: {
            // miracleSelect
            input.readMessage(miracleSelect);
            bitField0_ |= 0x00000020;
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
        output.writeUInt32(FieldNames.times, times);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueRerollBuff, rogueRerollBuff);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.bonusSelect, bonusSelect);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.rogueBuffSelect, rogueBuffSelect);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.miracleSelect, miracleSelect);
      }
      output.endObject();
    }

    @Override
    public HandleRogueCommonPendingActionScRsp mergeFrom(final JsonSource input) throws
        IOException {
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
          case 110364486: {
            if (input.isAtField(FieldNames.times)) {
              if (!input.trySkipNullValue()) {
                times = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -620807395:
          case -555127011: {
            if (input.isAtField(FieldNames.rogueRerollBuff)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueRerollBuff);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1904635387:
          case 1368817948: {
            if (input.isAtField(FieldNames.bonusSelect)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(bonusSelect);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -183502679:
          case -1750117501: {
            if (input.isAtField(FieldNames.rogueBuffSelect)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueBuffSelect);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 788622541:
          case 1132158090: {
            if (input.isAtField(FieldNames.miracleSelect)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(miracleSelect);
                bitField0_ |= 0x00000020;
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
    public HandleRogueCommonPendingActionScRsp clone() {
      return new HandleRogueCommonPendingActionScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static HandleRogueCommonPendingActionScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new HandleRogueCommonPendingActionScRsp(), data).checkInitialized();
    }

    public static HandleRogueCommonPendingActionScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new HandleRogueCommonPendingActionScRsp(), input).checkInitialized();
    }

    public static HandleRogueCommonPendingActionScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new HandleRogueCommonPendingActionScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating HandleRogueCommonPendingActionScRsp messages
     */
    public static MessageFactory<HandleRogueCommonPendingActionScRsp> getFactory() {
      return HandleRogueCommonPendingActionScRspFactory.INSTANCE;
    }

    private enum HandleRogueCommonPendingActionScRspFactory implements MessageFactory<HandleRogueCommonPendingActionScRsp> {
      INSTANCE;

      @Override
      public HandleRogueCommonPendingActionScRsp create() {
        return HandleRogueCommonPendingActionScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName times = FieldName.forField("times");

      static final FieldName rogueRerollBuff = FieldName.forField("rogueRerollBuff", "rogue_reroll_buff");

      static final FieldName bonusSelect = FieldName.forField("bonusSelect", "bonus_select");

      static final FieldName rogueBuffSelect = FieldName.forField("rogueBuffSelect", "rogue_buff_select");

      static final FieldName miracleSelect = FieldName.forField("miracleSelect", "miracle_select");
    }
  }
}
