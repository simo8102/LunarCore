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

public final class SelectRogueDialogueEventScRspOuterClass {
  /**
   * Protobuf type {@code SelectRogueDialogueEventScRsp}
   */
  public static final class SelectRogueDialogueEventScRsp extends ProtoMessage<SelectRogueDialogueEventScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <pre>
     * RogueDialogueEvent selected_dialogue_event = 14;
     * ODKKECCOLLB JJNBIFDOLFH = 15;
     * </pre>
     *
     * <code>optional uint32 dialogue_event_id = 10;</code>
     */
    private int dialogueEventId;

    private SelectRogueDialogueEventScRsp() {
    }

    /**
     * @return a new empty instance of {@code SelectRogueDialogueEventScRsp}
     */
    public static SelectRogueDialogueEventScRsp newInstance() {
      return new SelectRogueDialogueEventScRsp();
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public SelectRogueDialogueEventScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public SelectRogueDialogueEventScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <pre>
     * RogueDialogueEvent selected_dialogue_event = 14;
     * ODKKECCOLLB JJNBIFDOLFH = 15;
     * </pre>
     *
     * <code>optional uint32 dialogue_event_id = 10;</code>
     * @return whether the dialogueEventId field is set
     */
    public boolean hasDialogueEventId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     * RogueDialogueEvent selected_dialogue_event = 14;
     * ODKKECCOLLB JJNBIFDOLFH = 15;
     * </pre>
     *
     * <code>optional uint32 dialogue_event_id = 10;</code>
     * @return this
     */
    public SelectRogueDialogueEventScRsp clearDialogueEventId() {
      bitField0_ &= ~0x00000002;
      dialogueEventId = 0;
      return this;
    }

    /**
     * <pre>
     * RogueDialogueEvent selected_dialogue_event = 14;
     * ODKKECCOLLB JJNBIFDOLFH = 15;
     * </pre>
     *
     * <code>optional uint32 dialogue_event_id = 10;</code>
     * @return the dialogueEventId
     */
    public int getDialogueEventId() {
      return dialogueEventId;
    }

    /**
     * <pre>
     * RogueDialogueEvent selected_dialogue_event = 14;
     * ODKKECCOLLB JJNBIFDOLFH = 15;
     * </pre>
     *
     * <code>optional uint32 dialogue_event_id = 10;</code>
     * @param value the dialogueEventId to set
     * @return this
     */
    public SelectRogueDialogueEventScRsp setDialogueEventId(final int value) {
      bitField0_ |= 0x00000002;
      dialogueEventId = value;
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp copyFrom(final SelectRogueDialogueEventScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        dialogueEventId = other.dialogueEventId;
      }
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp mergeFrom(final SelectRogueDialogueEventScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasDialogueEventId()) {
        setDialogueEventId(other.dialogueEventId);
      }
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      dialogueEventId = 0;
      return this;
    }

    @Override
    public SelectRogueDialogueEventScRsp clearQuick() {
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
      if (!(o instanceof SelectRogueDialogueEventScRsp)) {
        return false;
      }
      SelectRogueDialogueEventScRsp other = (SelectRogueDialogueEventScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasDialogueEventId() || dialogueEventId == other.dialogueEventId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(dialogueEventId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dialogueEventId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SelectRogueDialogueEventScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // dialogueEventId
            dialogueEventId = input.readUInt32();
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
        output.writeUInt32(FieldNames.dialogueEventId, dialogueEventId);
      }
      output.endObject();
    }

    @Override
    public SelectRogueDialogueEventScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 88389725:
          case 1671736167: {
            if (input.isAtField(FieldNames.dialogueEventId)) {
              if (!input.trySkipNullValue()) {
                dialogueEventId = input.readUInt32();
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
    public SelectRogueDialogueEventScRsp clone() {
      return new SelectRogueDialogueEventScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SelectRogueDialogueEventScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventScRsp(), data).checkInitialized();
    }

    public static SelectRogueDialogueEventScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventScRsp(), input).checkInitialized();
    }

    public static SelectRogueDialogueEventScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new SelectRogueDialogueEventScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SelectRogueDialogueEventScRsp messages
     */
    public static MessageFactory<SelectRogueDialogueEventScRsp> getFactory() {
      return SelectRogueDialogueEventScRspFactory.INSTANCE;
    }

    private enum SelectRogueDialogueEventScRspFactory implements MessageFactory<SelectRogueDialogueEventScRsp> {
      INSTANCE;

      @Override
      public SelectRogueDialogueEventScRsp create() {
        return SelectRogueDialogueEventScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName dialogueEventId = FieldName.forField("dialogueEventId", "dialogue_event_id");
    }
  }
}