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

public final class SetClientPausedCsReqOuterClass {
  /**
   * Protobuf type {@code SetClientPausedCsReq}
   */
  public static final class SetClientPausedCsReq extends ProtoMessage<SetClientPausedCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional bool paused = 2;</code>
     */
    private boolean paused;

    private SetClientPausedCsReq() {
    }

    /**
     * @return a new empty instance of {@code SetClientPausedCsReq}
     */
    public static SetClientPausedCsReq newInstance() {
      return new SetClientPausedCsReq();
    }

    /**
     * <code>optional bool paused = 2;</code>
     * @return whether the paused field is set
     */
    public boolean hasPaused() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional bool paused = 2;</code>
     * @return this
     */
    public SetClientPausedCsReq clearPaused() {
      bitField0_ &= ~0x00000001;
      paused = false;
      return this;
    }

    /**
     * <code>optional bool paused = 2;</code>
     * @return the paused
     */
    public boolean getPaused() {
      return paused;
    }

    /**
     * <code>optional bool paused = 2;</code>
     * @param value the paused to set
     * @return this
     */
    public SetClientPausedCsReq setPaused(final boolean value) {
      bitField0_ |= 0x00000001;
      paused = value;
      return this;
    }

    @Override
    public SetClientPausedCsReq copyFrom(final SetClientPausedCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        paused = other.paused;
      }
      return this;
    }

    @Override
    public SetClientPausedCsReq mergeFrom(final SetClientPausedCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPaused()) {
        setPaused(other.paused);
      }
      return this;
    }

    @Override
    public SetClientPausedCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      paused = false;
      return this;
    }

    @Override
    public SetClientPausedCsReq clearQuick() {
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
      if (!(o instanceof SetClientPausedCsReq)) {
        return false;
      }
      SetClientPausedCsReq other = (SetClientPausedCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasPaused() || paused == other.paused);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeBoolNoTag(paused);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetClientPausedCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // paused
            paused = input.readBool();
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
        output.writeBool(FieldNames.paused, paused);
      }
      output.endObject();
    }

    @Override
    public SetClientPausedCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -995321554: {
            if (input.isAtField(FieldNames.paused)) {
              if (!input.trySkipNullValue()) {
                paused = input.readBool();
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
    public SetClientPausedCsReq clone() {
      return new SetClientPausedCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetClientPausedCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetClientPausedCsReq(), data).checkInitialized();
    }

    public static SetClientPausedCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetClientPausedCsReq(), input).checkInitialized();
    }

    public static SetClientPausedCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetClientPausedCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetClientPausedCsReq messages
     */
    public static MessageFactory<SetClientPausedCsReq> getFactory() {
      return SetClientPausedCsReqFactory.INSTANCE;
    }

    private enum SetClientPausedCsReqFactory implements MessageFactory<SetClientPausedCsReq> {
      INSTANCE;

      @Override
      public SetClientPausedCsReq create() {
        return SetClientPausedCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName paused = FieldName.forField("paused");
    }
  }
}
