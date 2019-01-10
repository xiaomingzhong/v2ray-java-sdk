// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/config.proto

package com.v2ray.core;

/**
 * <pre>
 * InboundHandlerConfig is the configuration for inbound handler.
 * </pre>
 *
 * Protobuf type {@code v2ray.core.InboundHandlerConfig}
 */
public  final class InboundHandlerConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.InboundHandlerConfig)
    InboundHandlerConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InboundHandlerConfig.newBuilder() to construct.
  private InboundHandlerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InboundHandlerConfig() {
    tag_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InboundHandlerConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            tag_ = s;
            break;
          }
          case 18: {
            com.v2ray.core.common.serial.TypedMessage.Builder subBuilder = null;
            if (receiverSettings_ != null) {
              subBuilder = receiverSettings_.toBuilder();
            }
            receiverSettings_ = input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(receiverSettings_);
              receiverSettings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.v2ray.core.common.serial.TypedMessage.Builder subBuilder = null;
            if (proxySettings_ != null) {
              subBuilder = proxySettings_.toBuilder();
            }
            proxySettings_ = input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(proxySettings_);
              proxySettings_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.ConfigOuterClass.internal_static_v2ray_core_InboundHandlerConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.ConfigOuterClass.internal_static_v2ray_core_InboundHandlerConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.InboundHandlerConfig.class, com.v2ray.core.InboundHandlerConfig.Builder.class);
  }

  public static final int TAG_FIELD_NUMBER = 1;
  private volatile java.lang.Object tag_;
  /**
   * <pre>
   * Tag of the inbound handler. The tag must be unique among all inbound handlers
   * </pre>
   *
   * <code>string tag = 1;</code>
   */
  public java.lang.String getTag() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Tag of the inbound handler. The tag must be unique among all inbound handlers
   * </pre>
   *
   * <code>string tag = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTagBytes() {
    java.lang.Object ref = tag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVER_SETTINGS_FIELD_NUMBER = 2;
  private com.v2ray.core.common.serial.TypedMessage receiverSettings_;
  /**
   * <pre>
   * Settings for how this inbound proxy is handled.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  public boolean hasReceiverSettings() {
    return receiverSettings_ != null;
  }
  /**
   * <pre>
   * Settings for how this inbound proxy is handled.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getReceiverSettings() {
    return receiverSettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
  }
  /**
   * <pre>
   * Settings for how this inbound proxy is handled.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder() {
    return getReceiverSettings();
  }

  public static final int PROXY_SETTINGS_FIELD_NUMBER = 3;
  private com.v2ray.core.common.serial.TypedMessage proxySettings_;
  /**
   * <pre>
   * Settings for inbound proxy. Must be one of the inbound proxies.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  public boolean hasProxySettings() {
    return proxySettings_ != null;
  }
  /**
   * <pre>
   * Settings for inbound proxy. Must be one of the inbound proxies.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getProxySettings() {
    return proxySettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
  }
  /**
   * <pre>
   * Settings for inbound proxy. Must be one of the inbound proxies.
   * </pre>
   *
   * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder() {
    return getProxySettings();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tag_);
    }
    if (receiverSettings_ != null) {
      output.writeMessage(2, getReceiverSettings());
    }
    if (proxySettings_ != null) {
      output.writeMessage(3, getProxySettings());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tag_);
    }
    if (receiverSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getReceiverSettings());
    }
    if (proxySettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProxySettings());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.InboundHandlerConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.InboundHandlerConfig other = (com.v2ray.core.InboundHandlerConfig) obj;

    boolean result = true;
    result = result && getTag()
        .equals(other.getTag());
    result = result && (hasReceiverSettings() == other.hasReceiverSettings());
    if (hasReceiverSettings()) {
      result = result && getReceiverSettings()
          .equals(other.getReceiverSettings());
    }
    result = result && (hasProxySettings() == other.hasProxySettings());
    if (hasProxySettings()) {
      result = result && getProxySettings()
          .equals(other.getProxySettings());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TAG_FIELD_NUMBER;
    hash = (53 * hash) + getTag().hashCode();
    if (hasReceiverSettings()) {
      hash = (37 * hash) + RECEIVER_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getReceiverSettings().hashCode();
    }
    if (hasProxySettings()) {
      hash = (37 * hash) + PROXY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getProxySettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.InboundHandlerConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.InboundHandlerConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.InboundHandlerConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.InboundHandlerConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * InboundHandlerConfig is the configuration for inbound handler.
   * </pre>
   *
   * Protobuf type {@code v2ray.core.InboundHandlerConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.InboundHandlerConfig)
      com.v2ray.core.InboundHandlerConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.ConfigOuterClass.internal_static_v2ray_core_InboundHandlerConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.ConfigOuterClass.internal_static_v2ray_core_InboundHandlerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.InboundHandlerConfig.class, com.v2ray.core.InboundHandlerConfig.Builder.class);
    }

    // Construct using com.v2ray.core.InboundHandlerConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      tag_ = "";

      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = null;
      } else {
        receiverSettings_ = null;
        receiverSettingsBuilder_ = null;
      }
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.ConfigOuterClass.internal_static_v2ray_core_InboundHandlerConfig_descriptor;
    }

    public com.v2ray.core.InboundHandlerConfig getDefaultInstanceForType() {
      return com.v2ray.core.InboundHandlerConfig.getDefaultInstance();
    }

    public com.v2ray.core.InboundHandlerConfig build() {
      com.v2ray.core.InboundHandlerConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.InboundHandlerConfig buildPartial() {
      com.v2ray.core.InboundHandlerConfig result = new com.v2ray.core.InboundHandlerConfig(this);
      result.tag_ = tag_;
      if (receiverSettingsBuilder_ == null) {
        result.receiverSettings_ = receiverSettings_;
      } else {
        result.receiverSettings_ = receiverSettingsBuilder_.build();
      }
      if (proxySettingsBuilder_ == null) {
        result.proxySettings_ = proxySettings_;
      } else {
        result.proxySettings_ = proxySettingsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.InboundHandlerConfig) {
        return mergeFrom((com.v2ray.core.InboundHandlerConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.InboundHandlerConfig other) {
      if (other == com.v2ray.core.InboundHandlerConfig.getDefaultInstance()) return this;
      if (!other.getTag().isEmpty()) {
        tag_ = other.tag_;
        onChanged();
      }
      if (other.hasReceiverSettings()) {
        mergeReceiverSettings(other.getReceiverSettings());
      }
      if (other.hasProxySettings()) {
        mergeProxySettings(other.getProxySettings());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.InboundHandlerConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.InboundHandlerConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tag_ = "";
    /**
     * <pre>
     * Tag of the inbound handler. The tag must be unique among all inbound handlers
     * </pre>
     *
     * <code>string tag = 1;</code>
     */
    public java.lang.String getTag() {
      java.lang.Object ref = tag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Tag of the inbound handler. The tag must be unique among all inbound handlers
     * </pre>
     *
     * <code>string tag = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTagBytes() {
      java.lang.Object ref = tag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Tag of the inbound handler. The tag must be unique among all inbound handlers
     * </pre>
     *
     * <code>string tag = 1;</code>
     */
    public Builder setTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tag of the inbound handler. The tag must be unique among all inbound handlers
     * </pre>
     *
     * <code>string tag = 1;</code>
     */
    public Builder clearTag() {
      
      tag_ = getDefaultInstance().getTag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tag of the inbound handler. The tag must be unique among all inbound handlers
     * </pre>
     *
     * <code>string tag = 1;</code>
     */
    public Builder setTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tag_ = value;
      onChanged();
      return this;
    }

    private com.v2ray.core.common.serial.TypedMessage receiverSettings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> receiverSettingsBuilder_;
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public boolean hasReceiverSettings() {
      return receiverSettingsBuilder_ != null || receiverSettings_ != null;
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getReceiverSettings() {
      if (receiverSettingsBuilder_ == null) {
        return receiverSettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
      } else {
        return receiverSettingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder setReceiverSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (receiverSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        receiverSettings_ = value;
        onChanged();
      } else {
        receiverSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder setReceiverSettings(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = builderForValue.build();
        onChanged();
      } else {
        receiverSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder mergeReceiverSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (receiverSettingsBuilder_ == null) {
        if (receiverSettings_ != null) {
          receiverSettings_ =
            com.v2ray.core.common.serial.TypedMessage.newBuilder(receiverSettings_).mergeFrom(value).buildPartial();
        } else {
          receiverSettings_ = value;
        }
        onChanged();
      } else {
        receiverSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public Builder clearReceiverSettings() {
      if (receiverSettingsBuilder_ == null) {
        receiverSettings_ = null;
        onChanged();
      } else {
        receiverSettings_ = null;
        receiverSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getReceiverSettingsBuilder() {
      
      onChanged();
      return getReceiverSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getReceiverSettingsOrBuilder() {
      if (receiverSettingsBuilder_ != null) {
        return receiverSettingsBuilder_.getMessageOrBuilder();
      } else {
        return receiverSettings_ == null ?
            com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : receiverSettings_;
      }
    }
    /**
     * <pre>
     * Settings for how this inbound proxy is handled.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage receiver_settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getReceiverSettingsFieldBuilder() {
      if (receiverSettingsBuilder_ == null) {
        receiverSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                getReceiverSettings(),
                getParentForChildren(),
                isClean());
        receiverSettings_ = null;
      }
      return receiverSettingsBuilder_;
    }

    private com.v2ray.core.common.serial.TypedMessage proxySettings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> proxySettingsBuilder_;
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public boolean hasProxySettings() {
      return proxySettingsBuilder_ != null || proxySettings_ != null;
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getProxySettings() {
      if (proxySettingsBuilder_ == null) {
        return proxySettings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
      } else {
        return proxySettingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder setProxySettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (proxySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proxySettings_ = value;
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder setProxySettings(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = builderForValue.build();
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder mergeProxySettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (proxySettingsBuilder_ == null) {
        if (proxySettings_ != null) {
          proxySettings_ =
            com.v2ray.core.common.serial.TypedMessage.newBuilder(proxySettings_).mergeFrom(value).buildPartial();
        } else {
          proxySettings_ = value;
        }
        onChanged();
      } else {
        proxySettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public Builder clearProxySettings() {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
        onChanged();
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getProxySettingsBuilder() {
      
      onChanged();
      return getProxySettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getProxySettingsOrBuilder() {
      if (proxySettingsBuilder_ != null) {
        return proxySettingsBuilder_.getMessageOrBuilder();
      } else {
        return proxySettings_ == null ?
            com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : proxySettings_;
      }
    }
    /**
     * <pre>
     * Settings for inbound proxy. Must be one of the inbound proxies.
     * </pre>
     *
     * <code>.v2ray.core.common.serial.TypedMessage proxy_settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getProxySettingsFieldBuilder() {
      if (proxySettingsBuilder_ == null) {
        proxySettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                getProxySettings(),
                getParentForChildren(),
                isClean());
        proxySettings_ = null;
      }
      return proxySettingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.InboundHandlerConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.InboundHandlerConfig)
  private static final com.v2ray.core.InboundHandlerConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.InboundHandlerConfig();
  }

  public static com.v2ray.core.InboundHandlerConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InboundHandlerConfig>
      PARSER = new com.google.protobuf.AbstractParser<InboundHandlerConfig>() {
    public InboundHandlerConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InboundHandlerConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InboundHandlerConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InboundHandlerConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.InboundHandlerConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

