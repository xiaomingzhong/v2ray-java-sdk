// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/protocol/command.proto

package com.v2ray.core.common.protocol;

/**
 * Protobuf type {@code v2ray.core.common.protocol.AlternativeOutboundConfig}
 */
public  final class AlternativeOutboundConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.common.protocol.AlternativeOutboundConfig)
    AlternativeOutboundConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlternativeOutboundConfig.newBuilder() to construct.
  private AlternativeOutboundConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlternativeOutboundConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlternativeOutboundConfig(
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
            com.v2ray.core.common.serial.TypedMessage.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.v2ray.core.common.serial.TypedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.v2ray.core.transport.internet.StreamConfig.Builder subBuilder = null;
            if (streamSettings_ != null) {
              subBuilder = streamSettings_.toBuilder();
            }
            streamSettings_ = input.readMessage(com.v2ray.core.transport.internet.StreamConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(streamSettings_);
              streamSettings_ = subBuilder.buildPartial();
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
    return com.v2ray.core.common.protocol.Command.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.common.protocol.Command.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.common.protocol.AlternativeOutboundConfig.class, com.v2ray.core.common.protocol.AlternativeOutboundConfig.Builder.class);
  }

  public static final int SETTINGS_FIELD_NUMBER = 1;
  private com.v2ray.core.common.serial.TypedMessage settings_;
  /**
   * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
   */
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
   */
  public com.v2ray.core.common.serial.TypedMessage getSettings() {
    return settings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : settings_;
  }
  /**
   * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
   */
  public com.v2ray.core.common.serial.TypedMessageOrBuilder getSettingsOrBuilder() {
    return getSettings();
  }

  public static final int STREAM_SETTINGS_FIELD_NUMBER = 3;
  private com.v2ray.core.transport.internet.StreamConfig streamSettings_;
  /**
   * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
   */
  public boolean hasStreamSettings() {
    return streamSettings_ != null;
  }
  /**
   * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
   */
  public com.v2ray.core.transport.internet.StreamConfig getStreamSettings() {
    return streamSettings_ == null ? com.v2ray.core.transport.internet.StreamConfig.getDefaultInstance() : streamSettings_;
  }
  /**
   * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
   */
  public com.v2ray.core.transport.internet.StreamConfigOrBuilder getStreamSettingsOrBuilder() {
    return getStreamSettings();
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
    if (settings_ != null) {
      output.writeMessage(1, getSettings());
    }
    if (streamSettings_ != null) {
      output.writeMessage(3, getStreamSettings());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSettings());
    }
    if (streamSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStreamSettings());
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
    if (!(obj instanceof com.v2ray.core.common.protocol.AlternativeOutboundConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.common.protocol.AlternativeOutboundConfig other = (com.v2ray.core.common.protocol.AlternativeOutboundConfig) obj;

    boolean result = true;
    result = result && (hasSettings() == other.hasSettings());
    if (hasSettings()) {
      result = result && getSettings()
          .equals(other.getSettings());
    }
    result = result && (hasStreamSettings() == other.hasStreamSettings());
    if (hasStreamSettings()) {
      result = result && getStreamSettings()
          .equals(other.getStreamSettings());
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
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    if (hasStreamSettings()) {
      hash = (37 * hash) + STREAM_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getStreamSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.common.protocol.AlternativeOutboundConfig prototype) {
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
   * Protobuf type {@code v2ray.core.common.protocol.AlternativeOutboundConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.common.protocol.AlternativeOutboundConfig)
      com.v2ray.core.common.protocol.AlternativeOutboundConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.common.protocol.Command.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.common.protocol.Command.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.common.protocol.AlternativeOutboundConfig.class, com.v2ray.core.common.protocol.AlternativeOutboundConfig.Builder.class);
    }

    // Construct using com.v2ray.core.common.protocol.AlternativeOutboundConfig.newBuilder()
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
      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      if (streamSettingsBuilder_ == null) {
        streamSettings_ = null;
      } else {
        streamSettings_ = null;
        streamSettingsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.common.protocol.Command.internal_static_v2ray_core_common_protocol_AlternativeOutboundConfig_descriptor;
    }

    public com.v2ray.core.common.protocol.AlternativeOutboundConfig getDefaultInstanceForType() {
      return com.v2ray.core.common.protocol.AlternativeOutboundConfig.getDefaultInstance();
    }

    public com.v2ray.core.common.protocol.AlternativeOutboundConfig build() {
      com.v2ray.core.common.protocol.AlternativeOutboundConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.common.protocol.AlternativeOutboundConfig buildPartial() {
      com.v2ray.core.common.protocol.AlternativeOutboundConfig result = new com.v2ray.core.common.protocol.AlternativeOutboundConfig(this);
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
      if (streamSettingsBuilder_ == null) {
        result.streamSettings_ = streamSettings_;
      } else {
        result.streamSettings_ = streamSettingsBuilder_.build();
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
      if (other instanceof com.v2ray.core.common.protocol.AlternativeOutboundConfig) {
        return mergeFrom((com.v2ray.core.common.protocol.AlternativeOutboundConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.common.protocol.AlternativeOutboundConfig other) {
      if (other == com.v2ray.core.common.protocol.AlternativeOutboundConfig.getDefaultInstance()) return this;
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      if (other.hasStreamSettings()) {
        mergeStreamSettings(other.getStreamSettings());
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
      com.v2ray.core.common.protocol.AlternativeOutboundConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.common.protocol.AlternativeOutboundConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.v2ray.core.common.serial.TypedMessage settings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> settingsBuilder_;
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public Builder setSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public Builder setSettings(
        com.v2ray.core.common.serial.TypedMessage.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public Builder mergeSettings(com.v2ray.core.common.serial.TypedMessage value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.v2ray.core.common.serial.TypedMessage.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public com.v2ray.core.common.serial.TypedMessage.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    public com.v2ray.core.common.serial.TypedMessageOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.v2ray.core.common.serial.TypedMessage.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>.v2ray.core.common.serial.TypedMessage settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.serial.TypedMessage, com.v2ray.core.common.serial.TypedMessage.Builder, com.v2ray.core.common.serial.TypedMessageOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    private com.v2ray.core.transport.internet.StreamConfig streamSettings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.StreamConfig, com.v2ray.core.transport.internet.StreamConfig.Builder, com.v2ray.core.transport.internet.StreamConfigOrBuilder> streamSettingsBuilder_;
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public boolean hasStreamSettings() {
      return streamSettingsBuilder_ != null || streamSettings_ != null;
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.StreamConfig getStreamSettings() {
      if (streamSettingsBuilder_ == null) {
        return streamSettings_ == null ? com.v2ray.core.transport.internet.StreamConfig.getDefaultInstance() : streamSettings_;
      } else {
        return streamSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public Builder setStreamSettings(com.v2ray.core.transport.internet.StreamConfig value) {
      if (streamSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamSettings_ = value;
        onChanged();
      } else {
        streamSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public Builder setStreamSettings(
        com.v2ray.core.transport.internet.StreamConfig.Builder builderForValue) {
      if (streamSettingsBuilder_ == null) {
        streamSettings_ = builderForValue.build();
        onChanged();
      } else {
        streamSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public Builder mergeStreamSettings(com.v2ray.core.transport.internet.StreamConfig value) {
      if (streamSettingsBuilder_ == null) {
        if (streamSettings_ != null) {
          streamSettings_ =
            com.v2ray.core.transport.internet.StreamConfig.newBuilder(streamSettings_).mergeFrom(value).buildPartial();
        } else {
          streamSettings_ = value;
        }
        onChanged();
      } else {
        streamSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public Builder clearStreamSettings() {
      if (streamSettingsBuilder_ == null) {
        streamSettings_ = null;
        onChanged();
      } else {
        streamSettings_ = null;
        streamSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.StreamConfig.Builder getStreamSettingsBuilder() {
      
      onChanged();
      return getStreamSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.StreamConfigOrBuilder getStreamSettingsOrBuilder() {
      if (streamSettingsBuilder_ != null) {
        return streamSettingsBuilder_.getMessageOrBuilder();
      } else {
        return streamSettings_ == null ?
            com.v2ray.core.transport.internet.StreamConfig.getDefaultInstance() : streamSettings_;
      }
    }
    /**
     * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.StreamConfig, com.v2ray.core.transport.internet.StreamConfig.Builder, com.v2ray.core.transport.internet.StreamConfigOrBuilder> 
        getStreamSettingsFieldBuilder() {
      if (streamSettingsBuilder_ == null) {
        streamSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.transport.internet.StreamConfig, com.v2ray.core.transport.internet.StreamConfig.Builder, com.v2ray.core.transport.internet.StreamConfigOrBuilder>(
                getStreamSettings(),
                getParentForChildren(),
                isClean());
        streamSettings_ = null;
      }
      return streamSettingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.common.protocol.AlternativeOutboundConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.common.protocol.AlternativeOutboundConfig)
  private static final com.v2ray.core.common.protocol.AlternativeOutboundConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.common.protocol.AlternativeOutboundConfig();
  }

  public static com.v2ray.core.common.protocol.AlternativeOutboundConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlternativeOutboundConfig>
      PARSER = new com.google.protobuf.AbstractParser<AlternativeOutboundConfig>() {
    public AlternativeOutboundConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlternativeOutboundConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlternativeOutboundConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlternativeOutboundConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.common.protocol.AlternativeOutboundConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

