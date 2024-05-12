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

public final class StartChallengeStoryInfoOuterClass {
  /**
   * Protobuf type {@code StartChallengeStoryInfo}
   */
  public static final class StartChallengeStoryInfo extends ProtoMessage<StartChallengeStoryInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .StartChallengeStoryBuffInfo story_buff_info = 14;</code>
     */
    private final StartChallengeStoryBuffInfoOuterClass.StartChallengeStoryBuffInfo storyBuffInfo = StartChallengeStoryBuffInfoOuterClass.StartChallengeStoryBuffInfo.newInstance();

    private StartChallengeStoryInfo() {
    }

    /**
     * @return a new empty instance of {@code StartChallengeStoryInfo}
     */
    public static StartChallengeStoryInfo newInstance() {
      return new StartChallengeStoryInfo();
    }

    public boolean hasBuffInfo() {
      return (((bitField0_ & 0x00000001)) != 0);
    }

    public StartChallengeStoryInfo clearBuffInfo() {
      if (hasBuffInfo()) {
        clearStoryBuffInfo();
      }
      return this;
    }

    /**
     * <code>optional .StartChallengeStoryBuffInfo story_buff_info = 14;</code>
     * @return whether the storyBuffInfo field is set
     */
    public boolean hasStoryBuffInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .StartChallengeStoryBuffInfo story_buff_info = 14;</code>
     * @return this
     */
    public StartChallengeStoryInfo clearStoryBuffInfo() {
      bitField0_ &= ~0x00000001;
      storyBuffInfo.clear();
      return this;
    }

    /**
     * <code>optional .StartChallengeStoryBuffInfo story_buff_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableStoryBuffInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public StartChallengeStoryBuffInfoOuterClass.StartChallengeStoryBuffInfo getStoryBuffInfo() {
      return storyBuffInfo;
    }

    /**
     * <code>optional .StartChallengeStoryBuffInfo story_buff_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public StartChallengeStoryBuffInfoOuterClass.StartChallengeStoryBuffInfo getMutableStoryBuffInfo(
        ) {
      bitField0_ |= 0x00000001;
      return storyBuffInfo;
    }

    /**
     * <code>optional .StartChallengeStoryBuffInfo story_buff_info = 14;</code>
     * @param value the storyBuffInfo to set
     * @return this
     */
    public StartChallengeStoryInfo setStoryBuffInfo(
        final StartChallengeStoryBuffInfoOuterClass.StartChallengeStoryBuffInfo value) {
      bitField0_ |= 0x00000001;
      storyBuffInfo.copyFrom(value);
      return this;
    }

    @Override
    public StartChallengeStoryInfo copyFrom(final StartChallengeStoryInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        storyBuffInfo.copyFrom(other.storyBuffInfo);
      }
      return this;
    }

    @Override
    public StartChallengeStoryInfo mergeFrom(final StartChallengeStoryInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasStoryBuffInfo()) {
        getMutableStoryBuffInfo().mergeFrom(other.storyBuffInfo);
      }
      return this;
    }

    @Override
    public StartChallengeStoryInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      storyBuffInfo.clear();
      return this;
    }

    @Override
    public StartChallengeStoryInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      storyBuffInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof StartChallengeStoryInfo)) {
        return false;
      }
      StartChallengeStoryInfo other = (StartChallengeStoryInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasStoryBuffInfo() || storyBuffInfo.equals(other.storyBuffInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(storyBuffInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(storyBuffInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public StartChallengeStoryInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 114: {
            // storyBuffInfo
            input.readMessage(storyBuffInfo);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.storyBuffInfo, storyBuffInfo);
      }
      output.endObject();
    }

    @Override
    public StartChallengeStoryInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1230610506:
          case -1733882288: {
            if (input.isAtField(FieldNames.storyBuffInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(storyBuffInfo);
                bitField0_ |= 0x00000001;
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
    public StartChallengeStoryInfo clone() {
      return new StartChallengeStoryInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static StartChallengeStoryInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryInfo(), data).checkInitialized();
    }

    public static StartChallengeStoryInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryInfo(), input).checkInitialized();
    }

    public static StartChallengeStoryInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new StartChallengeStoryInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating StartChallengeStoryInfo messages
     */
    public static MessageFactory<StartChallengeStoryInfo> getFactory() {
      return StartChallengeStoryInfoFactory.INSTANCE;
    }

    private enum StartChallengeStoryInfoFactory implements MessageFactory<StartChallengeStoryInfo> {
      INSTANCE;

      @Override
      public StartChallengeStoryInfo create() {
        return StartChallengeStoryInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName storyBuffInfo = FieldName.forField("storyBuffInfo", "story_buff_info");
    }
  }
}
