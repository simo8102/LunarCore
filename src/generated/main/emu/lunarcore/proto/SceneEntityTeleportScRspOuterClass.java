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

public final class SceneEntityTeleportScRspOuterClass {
  /**
   * Protobuf type {@code SceneEntityTeleportScRsp}
   */
  public static final class SceneEntityTeleportScRsp extends ProtoMessage<SceneEntityTeleportScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 6;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 client_pos_version = 12;</code>
     */
    private int clientPosVersion;

    /**
     * <code>optional .EntityMotion entity_motion = 9;</code>
     */
    private final EntityMotionOuterClass.EntityMotion entityMotion = EntityMotionOuterClass.EntityMotion.newInstance();

    private SceneEntityTeleportScRsp() {
    }

    /**
     * @return a new empty instance of {@code SceneEntityTeleportScRsp}
     */
    public static SceneEntityTeleportScRsp newInstance() {
      return new SceneEntityTeleportScRsp();
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return this
     */
    public SceneEntityTeleportScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @param value the retcode to set
     * @return this
     */
    public SceneEntityTeleportScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 client_pos_version = 12;</code>
     * @return whether the clientPosVersion field is set
     */
    public boolean hasClientPosVersion() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 client_pos_version = 12;</code>
     * @return this
     */
    public SceneEntityTeleportScRsp clearClientPosVersion() {
      bitField0_ &= ~0x00000002;
      clientPosVersion = 0;
      return this;
    }

    /**
     * <code>optional uint32 client_pos_version = 12;</code>
     * @return the clientPosVersion
     */
    public int getClientPosVersion() {
      return clientPosVersion;
    }

    /**
     * <code>optional uint32 client_pos_version = 12;</code>
     * @param value the clientPosVersion to set
     * @return this
     */
    public SceneEntityTeleportScRsp setClientPosVersion(final int value) {
      bitField0_ |= 0x00000002;
      clientPosVersion = value;
      return this;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 9;</code>
     * @return whether the entityMotion field is set
     */
    public boolean hasEntityMotion() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 9;</code>
     * @return this
     */
    public SceneEntityTeleportScRsp clearEntityMotion() {
      bitField0_ &= ~0x00000004;
      entityMotion.clear();
      return this;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntityMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public EntityMotionOuterClass.EntityMotion getEntityMotion() {
      return entityMotion;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public EntityMotionOuterClass.EntityMotion getMutableEntityMotion() {
      bitField0_ |= 0x00000004;
      return entityMotion;
    }

    /**
     * <code>optional .EntityMotion entity_motion = 9;</code>
     * @param value the entityMotion to set
     * @return this
     */
    public SceneEntityTeleportScRsp setEntityMotion(
        final EntityMotionOuterClass.EntityMotion value) {
      bitField0_ |= 0x00000004;
      entityMotion.copyFrom(value);
      return this;
    }

    @Override
    public SceneEntityTeleportScRsp copyFrom(final SceneEntityTeleportScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        clientPosVersion = other.clientPosVersion;
        entityMotion.copyFrom(other.entityMotion);
      }
      return this;
    }

    @Override
    public SceneEntityTeleportScRsp mergeFrom(final SceneEntityTeleportScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasClientPosVersion()) {
        setClientPosVersion(other.clientPosVersion);
      }
      if (other.hasEntityMotion()) {
        getMutableEntityMotion().mergeFrom(other.entityMotion);
      }
      return this;
    }

    @Override
    public SceneEntityTeleportScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      clientPosVersion = 0;
      entityMotion.clear();
      return this;
    }

    @Override
    public SceneEntityTeleportScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityMotion.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEntityTeleportScRsp)) {
        return false;
      }
      SceneEntityTeleportScRsp other = (SceneEntityTeleportScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasClientPosVersion() || clientPosVersion == other.clientPosVersion)
        && (!hasEntityMotion() || entityMotion.equals(other.entityMotion));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(entityMotion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(entityMotion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEntityTeleportScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // clientPosVersion
            clientPosVersion = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // entityMotion
            input.readMessage(entityMotion);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.clientPosVersion, clientPosVersion);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.entityMotion, entityMotion);
      }
      output.endObject();
    }

    @Override
    public SceneEntityTeleportScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1787644431:
          case 1278860153: {
            if (input.isAtField(FieldNames.clientPosVersion)) {
              if (!input.trySkipNullValue()) {
                clientPosVersion = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 558225785:
          case -1141226606: {
            if (input.isAtField(FieldNames.entityMotion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(entityMotion);
                bitField0_ |= 0x00000004;
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
    public SceneEntityTeleportScRsp clone() {
      return new SceneEntityTeleportScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEntityTeleportScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEntityTeleportScRsp(), data).checkInitialized();
    }

    public static SceneEntityTeleportScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityTeleportScRsp(), input).checkInitialized();
    }

    public static SceneEntityTeleportScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityTeleportScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEntityTeleportScRsp messages
     */
    public static MessageFactory<SceneEntityTeleportScRsp> getFactory() {
      return SceneEntityTeleportScRspFactory.INSTANCE;
    }

    private enum SceneEntityTeleportScRspFactory implements MessageFactory<SceneEntityTeleportScRsp> {
      INSTANCE;

      @Override
      public SceneEntityTeleportScRsp create() {
        return SceneEntityTeleportScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName clientPosVersion = FieldName.forField("clientPosVersion", "client_pos_version");

      static final FieldName entityMotion = FieldName.forField("entityMotion", "entity_motion");
    }
  }
}
