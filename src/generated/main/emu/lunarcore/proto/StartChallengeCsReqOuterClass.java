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
import us.hebi.quickbuf.RepeatedInt;

public final class StartChallengeCsReqOuterClass {
  /**
   * Protobuf type {@code StartChallengeCsReq}
   */
  public static final class StartChallengeCsReq extends ProtoMessage<StartChallengeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 challenge_id = 12;</code>
     */
    private int challengeId;

    /**
     * <code>optional .StartChallengeStoryInfo ext_info = 2;</code>
     */
    private final StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo extInfo = StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo.newInstance();

    /**
     * <code>repeated uint32 first_half_lineup = 6;</code>
     */
    private final RepeatedInt firstHalfLineup = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 second_half_lineup = 14;</code>
     */
    private final RepeatedInt secondHalfLineup = RepeatedInt.newEmptyInstance();

    private StartChallengeCsReq() {
    }

    /**
     * @return a new empty instance of {@code StartChallengeCsReq}
     */
    public static StartChallengeCsReq newInstance() {
      return new StartChallengeCsReq();
    }

    /**
     * <code>optional uint32 challenge_id = 12;</code>
     * @return whether the challengeId field is set
     */
    public boolean hasChallengeId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 challenge_id = 12;</code>
     * @return this
     */
    public StartChallengeCsReq clearChallengeId() {
      bitField0_ &= ~0x00000001;
      challengeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 challenge_id = 12;</code>
     * @return the challengeId
     */
    public int getChallengeId() {
      return challengeId;
    }

    /**
     * <code>optional uint32 challenge_id = 12;</code>
     * @param value the challengeId to set
     * @return this
     */
    public StartChallengeCsReq setChallengeId(final int value) {
      bitField0_ |= 0x00000001;
      challengeId = value;
      return this;
    }

    /**
     * <code>optional .StartChallengeStoryInfo ext_info = 2;</code>
     * @return whether the extInfo field is set
     */
    public boolean hasExtInfo() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .StartChallengeStoryInfo ext_info = 2;</code>
     * @return this
     */
    public StartChallengeCsReq clearExtInfo() {
      bitField0_ &= ~0x00000002;
      extInfo.clear();
      return this;
    }

    /**
     * <code>optional .StartChallengeStoryInfo ext_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableExtInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo getExtInfo() {
      return extInfo;
    }

    /**
     * <code>optional .StartChallengeStoryInfo ext_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo getMutableExtInfo() {
      bitField0_ |= 0x00000002;
      return extInfo;
    }

    /**
     * <code>optional .StartChallengeStoryInfo ext_info = 2;</code>
     * @param value the extInfo to set
     * @return this
     */
    public StartChallengeCsReq setExtInfo(
        final StartChallengeStoryInfoOuterClass.StartChallengeStoryInfo value) {
      bitField0_ |= 0x00000002;
      extInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 first_half_lineup = 6;</code>
     * @return whether the firstHalfLineup field is set
     */
    public boolean hasFirstHalfLineup() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 first_half_lineup = 6;</code>
     * @return this
     */
    public StartChallengeCsReq clearFirstHalfLineup() {
      bitField0_ &= ~0x00000004;
      firstHalfLineup.clear();
      return this;
    }

    /**
     * <code>repeated uint32 first_half_lineup = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFirstHalfLineup()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getFirstHalfLineup() {
      return firstHalfLineup;
    }

    /**
     * <code>repeated uint32 first_half_lineup = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableFirstHalfLineup() {
      bitField0_ |= 0x00000004;
      return firstHalfLineup;
    }

    /**
     * <code>repeated uint32 first_half_lineup = 6;</code>
     * @param value the firstHalfLineup to add
     * @return this
     */
    public StartChallengeCsReq addFirstHalfLineup(final int value) {
      bitField0_ |= 0x00000004;
      firstHalfLineup.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 first_half_lineup = 6;</code>
     * @param values the firstHalfLineup to add
     * @return this
     */
    public StartChallengeCsReq addAllFirstHalfLineup(final int... values) {
      bitField0_ |= 0x00000004;
      firstHalfLineup.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 second_half_lineup = 14;</code>
     * @return whether the secondHalfLineup field is set
     */
    public boolean hasSecondHalfLineup() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 second_half_lineup = 14;</code>
     * @return this
     */
    public StartChallengeCsReq clearSecondHalfLineup() {
      bitField0_ &= ~0x00000008;
      secondHalfLineup.clear();
      return this;
    }

    /**
     * <code>repeated uint32 second_half_lineup = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSecondHalfLineup()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getSecondHalfLineup() {
      return secondHalfLineup;
    }

    /**
     * <code>repeated uint32 second_half_lineup = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableSecondHalfLineup() {
      bitField0_ |= 0x00000008;
      return secondHalfLineup;
    }

    /**
     * <code>repeated uint32 second_half_lineup = 14;</code>
     * @param value the secondHalfLineup to add
     * @return this
     */
    public StartChallengeCsReq addSecondHalfLineup(final int value) {
      bitField0_ |= 0x00000008;
      secondHalfLineup.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 second_half_lineup = 14;</code>
     * @param values the secondHalfLineup to add
     * @return this
     */
    public StartChallengeCsReq addAllSecondHalfLineup(final int... values) {
      bitField0_ |= 0x00000008;
      secondHalfLineup.addAll(values);
      return this;
    }

    @Override
    public StartChallengeCsReq copyFrom(final StartChallengeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        challengeId = other.challengeId;
        extInfo.copyFrom(other.extInfo);
        firstHalfLineup.copyFrom(other.firstHalfLineup);
        secondHalfLineup.copyFrom(other.secondHalfLineup);
      }
      return this;
    }

    @Override
    public StartChallengeCsReq mergeFrom(final StartChallengeCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasChallengeId()) {
        setChallengeId(other.challengeId);
      }
      if (other.hasExtInfo()) {
        getMutableExtInfo().mergeFrom(other.extInfo);
      }
      if (other.hasFirstHalfLineup()) {
        getMutableFirstHalfLineup().addAll(other.firstHalfLineup);
      }
      if (other.hasSecondHalfLineup()) {
        getMutableSecondHalfLineup().addAll(other.secondHalfLineup);
      }
      return this;
    }

    @Override
    public StartChallengeCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      challengeId = 0;
      extInfo.clear();
      firstHalfLineup.clear();
      secondHalfLineup.clear();
      return this;
    }

    @Override
    public StartChallengeCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      extInfo.clearQuick();
      firstHalfLineup.clear();
      secondHalfLineup.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartChallengeCsReq)) {
        return false;
      }
      StartChallengeCsReq other = (StartChallengeCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasChallengeId() || challengeId == other.challengeId)
        && (!hasExtInfo() || extInfo.equals(other.extInfo))
        && (!hasFirstHalfLineup() || firstHalfLineup.equals(other.firstHalfLineup))
        && (!hasSecondHalfLineup() || secondHalfLineup.equals(other.secondHalfLineup));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(extInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < firstHalfLineup.length(); i++) {
          output.writeRawByte((byte) 48);
          output.writeUInt32NoTag(firstHalfLineup.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < secondHalfLineup.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(secondHalfLineup.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(extInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * firstHalfLineup.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(firstHalfLineup);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * secondHalfLineup.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(secondHalfLineup);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartChallengeCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // challengeId
            challengeId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // extInfo
            input.readMessage(extInfo);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // firstHalfLineup [packed=true]
            input.readPackedUInt32(firstHalfLineup, tag);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // secondHalfLineup [packed=true]
            input.readPackedUInt32(secondHalfLineup, tag);
            bitField0_ |= 0x00000008;
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
          case 48: {
            // firstHalfLineup [packed=false]
            tag = input.readRepeatedUInt32(firstHalfLineup, tag);
            bitField0_ |= 0x00000004;
            break;
          }
          case 112: {
            // secondHalfLineup [packed=false]
            tag = input.readRepeatedUInt32(secondHalfLineup, tag);
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.challengeId, challengeId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.extInfo, extInfo);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.firstHalfLineup, firstHalfLineup);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.secondHalfLineup, secondHalfLineup);
      }
      output.endObject();
    }

    @Override
    public StartChallengeCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -689112866:
          case 112359031: {
            if (input.isAtField(FieldNames.challengeId)) {
              if (!input.trySkipNullValue()) {
                challengeId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1306498449:
          case -1826570228: {
            if (input.isAtField(FieldNames.extInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(extInfo);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -450421134:
          case 1848535052: {
            if (input.isAtField(FieldNames.firstHalfLineup)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(firstHalfLineup);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1414736694:
          case -1031121968: {
            if (input.isAtField(FieldNames.secondHalfLineup)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(secondHalfLineup);
                bitField0_ |= 0x00000008;
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
    public StartChallengeCsReq clone() {
      return new StartChallengeCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartChallengeCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartChallengeCsReq(), data).checkInitialized();
    }

    public static StartChallengeCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeCsReq(), input).checkInitialized();
    }

    public static StartChallengeCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartChallengeCsReq messages
     */
    public static MessageFactory<StartChallengeCsReq> getFactory() {
      return StartChallengeCsReqFactory.INSTANCE;
    }

    private enum StartChallengeCsReqFactory implements MessageFactory<StartChallengeCsReq> {
      INSTANCE;

      @Override
      public StartChallengeCsReq create() {
        return StartChallengeCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName challengeId = FieldName.forField("challengeId", "challenge_id");

      static final FieldName extInfo = FieldName.forField("extInfo", "ext_info");

      static final FieldName firstHalfLineup = FieldName.forField("firstHalfLineup", "first_half_lineup");

      static final FieldName secondHalfLineup = FieldName.forField("secondHalfLineup", "second_half_lineup");
    }
  }
}
