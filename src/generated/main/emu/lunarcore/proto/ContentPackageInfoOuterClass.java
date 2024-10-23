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

public final class ContentPackageInfoOuterClass {
  /**
   * Protobuf type {@code ContentPackageInfo}
   */
  public static final class ContentPackageInfo extends ProtoMessage<ContentPackageInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 content_id = 8;</code>
     */
    private int contentId;

    /**
     * <code>optional .ContentPackageStatus status = 12;</code>
     */
    private int status;

    private ContentPackageInfo() {
    }

    /**
     * @return a new empty instance of {@code ContentPackageInfo}
     */
    public static ContentPackageInfo newInstance() {
      return new ContentPackageInfo();
    }

    /**
     * <code>optional uint32 content_id = 8;</code>
     * @return whether the contentId field is set
     */
    public boolean hasContentId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 content_id = 8;</code>
     * @return this
     */
    public ContentPackageInfo clearContentId() {
      bitField0_ &= ~0x00000001;
      contentId = 0;
      return this;
    }

    /**
     * <code>optional uint32 content_id = 8;</code>
     * @return the contentId
     */
    public int getContentId() {
      return contentId;
    }

    /**
     * <code>optional uint32 content_id = 8;</code>
     * @param value the contentId to set
     * @return this
     */
    public ContentPackageInfo setContentId(final int value) {
      bitField0_ |= 0x00000001;
      contentId = value;
      return this;
    }

    /**
     * <code>optional .ContentPackageStatus status = 12;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ContentPackageStatus status = 12;</code>
     * @return this
     */
    public ContentPackageInfo clearStatus() {
      bitField0_ &= ~0x00000002;
      status = 0;
      return this;
    }

    /**
     * <code>optional .ContentPackageStatus status = 12;</code>
     * @return the status
     */
    public ContentPackageStatusOuterClass.ContentPackageStatus getStatus() {
      return ContentPackageStatusOuterClass.ContentPackageStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link ContentPackageInfo#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ContentPackageStatusOuterClass.ContentPackageStatus}. Setting an invalid value
     * can cause {@link ContentPackageInfo#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public ContentPackageInfo setStatusValue(final int value) {
      bitField0_ |= 0x00000002;
      status = value;
      return this;
    }

    /**
     * <code>optional .ContentPackageStatus status = 12;</code>
     * @param value the status to set
     * @return this
     */
    public ContentPackageInfo setStatus(
        final ContentPackageStatusOuterClass.ContentPackageStatus value) {
      bitField0_ |= 0x00000002;
      status = value.getNumber();
      return this;
    }

    @Override
    public ContentPackageInfo copyFrom(final ContentPackageInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        contentId = other.contentId;
        status = other.status;
      }
      return this;
    }

    @Override
    public ContentPackageInfo mergeFrom(final ContentPackageInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasContentId()) {
        setContentId(other.contentId);
      }
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      return this;
    }

    @Override
    public ContentPackageInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      contentId = 0;
      status = 0;
      return this;
    }

    @Override
    public ContentPackageInfo clearQuick() {
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
      if (!(o instanceof ContentPackageInfo)) {
        return false;
      }
      ContentPackageInfo other = (ContentPackageInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasContentId() || contentId == other.contentId)
        && (!hasStatus() || status == other.status);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(contentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeEnumNoTag(status);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(contentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ContentPackageInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // contentId
            contentId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // status
            final int value = input.readInt32();
            if (ContentPackageStatusOuterClass.ContentPackageStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000002;
            }
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
        output.writeUInt32(FieldNames.contentId, contentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.status, status, ContentPackageStatusOuterClass.ContentPackageStatus.converter());
      }
      output.endObject();
    }

    @Override
    public ContentPackageInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -407108748:
          case 264552097: {
            if (input.isAtField(FieldNames.contentId)) {
              if (!input.trySkipNullValue()) {
                contentId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final ContentPackageStatusOuterClass.ContentPackageStatus value = input.readEnum(ContentPackageStatusOuterClass.ContentPackageStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000002;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public ContentPackageInfo clone() {
      return new ContentPackageInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ContentPackageInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ContentPackageInfo(), data).checkInitialized();
    }

    public static ContentPackageInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageInfo(), input).checkInitialized();
    }

    public static ContentPackageInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ContentPackageInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ContentPackageInfo messages
     */
    public static MessageFactory<ContentPackageInfo> getFactory() {
      return ContentPackageInfoFactory.INSTANCE;
    }

    private enum ContentPackageInfoFactory implements MessageFactory<ContentPackageInfo> {
      INSTANCE;

      @Override
      public ContentPackageInfo create() {
        return ContentPackageInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName contentId = FieldName.forField("contentId", "content_id");

      static final FieldName status = FieldName.forField("status");
    }
  }
}