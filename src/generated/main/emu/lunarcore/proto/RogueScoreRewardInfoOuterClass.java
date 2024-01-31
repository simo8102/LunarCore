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

public final class RogueScoreRewardInfoOuterClass {
  /**
   * Protobuf type {@code RogueScoreRewardInfo}
   */
  public static final class RogueScoreRewardInfo extends ProtoMessage<RogueScoreRewardInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 begin_time = 2;</code>
     */
    private long beginTime;

    /**
     * <code>optional int64 end_time = 15;</code>
     */
    private long endTime;

    /**
     * <code>optional uint32 score = 8;</code>
     */
    private int score;

    /**
     * <code>optional uint32 pool_id = 11;</code>
     */
    private int poolId;

    /**
     * <code>optional bool has_taken_initial_score = 4;</code>
     */
    private boolean hasTakenInitialScore;

    /**
     * <code>optional bool pool_refreshed = 9;</code>
     */
    private boolean poolRefreshed;

    /**
     * <pre>
     *  guess
     * </pre>
     *
     * <code>repeated uint32 has_taken_reward = 1;</code>
     */
    private final RepeatedInt hasTakenReward = RepeatedInt.newEmptyInstance();

    private RogueScoreRewardInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueScoreRewardInfo}
     */
    public static RogueScoreRewardInfo newInstance() {
      return new RogueScoreRewardInfo();
    }

    /**
     * <code>optional int64 begin_time = 2;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 begin_time = 2;</code>
     * @return this
     */
    public RogueScoreRewardInfo clearBeginTime() {
      bitField0_ &= ~0x00000001;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 2;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 2;</code>
     * @param value the beginTime to set
     * @return this
     */
    public RogueScoreRewardInfo setBeginTime(final long value) {
      bitField0_ |= 0x00000001;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @return this
     */
    public RogueScoreRewardInfo clearEndTime() {
      bitField0_ &= ~0x00000002;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 15;</code>
     * @param value the endTime to set
     * @return this
     */
    public RogueScoreRewardInfo setEndTime(final long value) {
      bitField0_ |= 0x00000002;
      endTime = value;
      return this;
    }

    /**
     * <code>optional uint32 score = 8;</code>
     * @return whether the score field is set
     */
    public boolean hasScore() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 score = 8;</code>
     * @return this
     */
    public RogueScoreRewardInfo clearScore() {
      bitField0_ &= ~0x00000004;
      score = 0;
      return this;
    }

    /**
     * <code>optional uint32 score = 8;</code>
     * @return the score
     */
    public int getScore() {
      return score;
    }

    /**
     * <code>optional uint32 score = 8;</code>
     * @param value the score to set
     * @return this
     */
    public RogueScoreRewardInfo setScore(final int value) {
      bitField0_ |= 0x00000004;
      score = value;
      return this;
    }

    /**
     * <code>optional uint32 pool_id = 11;</code>
     * @return whether the poolId field is set
     */
    public boolean hasPoolId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 pool_id = 11;</code>
     * @return this
     */
    public RogueScoreRewardInfo clearPoolId() {
      bitField0_ &= ~0x00000008;
      poolId = 0;
      return this;
    }

    /**
     * <code>optional uint32 pool_id = 11;</code>
     * @return the poolId
     */
    public int getPoolId() {
      return poolId;
    }

    /**
     * <code>optional uint32 pool_id = 11;</code>
     * @param value the poolId to set
     * @return this
     */
    public RogueScoreRewardInfo setPoolId(final int value) {
      bitField0_ |= 0x00000008;
      poolId = value;
      return this;
    }

    /**
     * <code>optional bool has_taken_initial_score = 4;</code>
     * @return whether the hasTakenInitialScore field is set
     */
    public boolean hasHasTakenInitialScore() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool has_taken_initial_score = 4;</code>
     * @return this
     */
    public RogueScoreRewardInfo clearHasTakenInitialScore() {
      bitField0_ &= ~0x00000010;
      hasTakenInitialScore = false;
      return this;
    }

    /**
     * <code>optional bool has_taken_initial_score = 4;</code>
     * @return the hasTakenInitialScore
     */
    public boolean getHasTakenInitialScore() {
      return hasTakenInitialScore;
    }

    /**
     * <code>optional bool has_taken_initial_score = 4;</code>
     * @param value the hasTakenInitialScore to set
     * @return this
     */
    public RogueScoreRewardInfo setHasTakenInitialScore(final boolean value) {
      bitField0_ |= 0x00000010;
      hasTakenInitialScore = value;
      return this;
    }

    /**
     * <code>optional bool pool_refreshed = 9;</code>
     * @return whether the poolRefreshed field is set
     */
    public boolean hasPoolRefreshed() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional bool pool_refreshed = 9;</code>
     * @return this
     */
    public RogueScoreRewardInfo clearPoolRefreshed() {
      bitField0_ &= ~0x00000020;
      poolRefreshed = false;
      return this;
    }

    /**
     * <code>optional bool pool_refreshed = 9;</code>
     * @return the poolRefreshed
     */
    public boolean getPoolRefreshed() {
      return poolRefreshed;
    }

    /**
     * <code>optional bool pool_refreshed = 9;</code>
     * @param value the poolRefreshed to set
     * @return this
     */
    public RogueScoreRewardInfo setPoolRefreshed(final boolean value) {
      bitField0_ |= 0x00000020;
      poolRefreshed = value;
      return this;
    }

    /**
     * <pre>
     *  guess
     * </pre>
     *
     * <code>repeated uint32 has_taken_reward = 1;</code>
     * @return whether the hasTakenReward field is set
     */
    public boolean hasHasTakenReward() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <pre>
     *  guess
     * </pre>
     *
     * <code>repeated uint32 has_taken_reward = 1;</code>
     * @return this
     */
    public RogueScoreRewardInfo clearHasTakenReward() {
      bitField0_ &= ~0x00000040;
      hasTakenReward.clear();
      return this;
    }

    /**
     * <pre>
     *  guess
     * </pre>
     *
     * <code>repeated uint32 has_taken_reward = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableHasTakenReward()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getHasTakenReward() {
      return hasTakenReward;
    }

    /**
     * <pre>
     *  guess
     * </pre>
     *
     * <code>repeated uint32 has_taken_reward = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableHasTakenReward() {
      bitField0_ |= 0x00000040;
      return hasTakenReward;
    }

    /**
     * <pre>
     *  guess
     * </pre>
     *
     * <code>repeated uint32 has_taken_reward = 1;</code>
     * @param value the hasTakenReward to add
     * @return this
     */
    public RogueScoreRewardInfo addHasTakenReward(final int value) {
      bitField0_ |= 0x00000040;
      hasTakenReward.add(value);
      return this;
    }

    /**
     * <pre>
     *  guess
     * </pre>
     *
     * <code>repeated uint32 has_taken_reward = 1;</code>
     * @param values the hasTakenReward to add
     * @return this
     */
    public RogueScoreRewardInfo addAllHasTakenReward(final int... values) {
      bitField0_ |= 0x00000040;
      hasTakenReward.addAll(values);
      return this;
    }

    @Override
    public RogueScoreRewardInfo copyFrom(final RogueScoreRewardInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        beginTime = other.beginTime;
        endTime = other.endTime;
        score = other.score;
        poolId = other.poolId;
        hasTakenInitialScore = other.hasTakenInitialScore;
        poolRefreshed = other.poolRefreshed;
        hasTakenReward.copyFrom(other.hasTakenReward);
      }
      return this;
    }

    @Override
    public RogueScoreRewardInfo mergeFrom(final RogueScoreRewardInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasScore()) {
        setScore(other.score);
      }
      if (other.hasPoolId()) {
        setPoolId(other.poolId);
      }
      if (other.hasHasTakenInitialScore()) {
        setHasTakenInitialScore(other.hasTakenInitialScore);
      }
      if (other.hasPoolRefreshed()) {
        setPoolRefreshed(other.poolRefreshed);
      }
      if (other.hasHasTakenReward()) {
        getMutableHasTakenReward().addAll(other.hasTakenReward);
      }
      return this;
    }

    @Override
    public RogueScoreRewardInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      beginTime = 0L;
      endTime = 0L;
      score = 0;
      poolId = 0;
      hasTakenInitialScore = false;
      poolRefreshed = false;
      hasTakenReward.clear();
      return this;
    }

    @Override
    public RogueScoreRewardInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      hasTakenReward.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueScoreRewardInfo)) {
        return false;
      }
      RogueScoreRewardInfo other = (RogueScoreRewardInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasScore() || score == other.score)
        && (!hasPoolId() || poolId == other.poolId)
        && (!hasHasTakenInitialScore() || hasTakenInitialScore == other.hasTakenInitialScore)
        && (!hasPoolRefreshed() || poolRefreshed == other.poolRefreshed)
        && (!hasHasTakenReward() || hasTakenReward.equals(other.hasTakenReward));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(score);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(poolId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 32);
        output.writeBoolNoTag(hasTakenInitialScore);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 72);
        output.writeBoolNoTag(poolRefreshed);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < hasTakenReward.length(); i++) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(hasTakenReward.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(score);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(poolId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * hasTakenReward.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(hasTakenReward);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueScoreRewardInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // score
            score = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // poolId
            poolId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // hasTakenInitialScore
            hasTakenInitialScore = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // poolRefreshed
            poolRefreshed = input.readBool();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // hasTakenReward [packed=true]
            input.readPackedUInt32(hasTakenReward, tag);
            bitField0_ |= 0x00000040;
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
          case 8: {
            // hasTakenReward [packed=false]
            tag = input.readRepeatedUInt32(hasTakenReward, tag);
            bitField0_ |= 0x00000040;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.score, score);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.poolId, poolId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.hasTakenInitialScore, hasTakenInitialScore);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeBool(FieldNames.poolRefreshed, poolRefreshed);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedUInt32(FieldNames.hasTakenReward, hasTakenReward);
      }
      output.endObject();
    }

    @Override
    public RogueScoreRewardInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109264530: {
            if (input.isAtField(FieldNames.score)) {
              if (!input.trySkipNullValue()) {
                score = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -982578601:
          case -395144162: {
            if (input.isAtField(FieldNames.poolId)) {
              if (!input.trySkipNullValue()) {
                poolId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1561171099:
          case -1786836166: {
            if (input.isAtField(FieldNames.hasTakenInitialScore)) {
              if (!input.trySkipNullValue()) {
                hasTakenInitialScore = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1555416066:
          case -403409833: {
            if (input.isAtField(FieldNames.poolRefreshed)) {
              if (!input.trySkipNullValue()) {
                poolRefreshed = input.readBool();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1115551708:
          case 905949996: {
            if (input.isAtField(FieldNames.hasTakenReward)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(hasTakenReward);
                bitField0_ |= 0x00000040;
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
    public RogueScoreRewardInfo clone() {
      return new RogueScoreRewardInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueScoreRewardInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueScoreRewardInfo(), data).checkInitialized();
    }

    public static RogueScoreRewardInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueScoreRewardInfo(), input).checkInitialized();
    }

    public static RogueScoreRewardInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueScoreRewardInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueScoreRewardInfo messages
     */
    public static MessageFactory<RogueScoreRewardInfo> getFactory() {
      return RogueScoreRewardInfoFactory.INSTANCE;
    }

    private enum RogueScoreRewardInfoFactory implements MessageFactory<RogueScoreRewardInfo> {
      INSTANCE;

      @Override
      public RogueScoreRewardInfo create() {
        return RogueScoreRewardInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName score = FieldName.forField("score");

      static final FieldName poolId = FieldName.forField("poolId", "pool_id");

      static final FieldName hasTakenInitialScore = FieldName.forField("hasTakenInitialScore", "has_taken_initial_score");

      static final FieldName poolRefreshed = FieldName.forField("poolRefreshed", "pool_refreshed");

      static final FieldName hasTakenReward = FieldName.forField("hasTakenReward", "has_taken_reward");
    }
  }
}
