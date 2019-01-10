// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/log/config.proto

package com.v2ray.core.app.log;

/**
 * Protobuf type {@code v2ray.core.app.log.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.log.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    errorLogType_ = 0;
    errorLogLevel_ = 0;
    errorLogPath_ = "";
    accessLogType_ = 0;
    accessLogPath_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
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
          case 8: {
            int rawValue = input.readEnum();

            errorLogType_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            errorLogLevel_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            errorLogPath_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            accessLogType_ = rawValue;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            accessLogPath_ = s;
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
    return com.v2ray.core.app.log.ConfigOuterClass.internal_static_v2ray_core_app_log_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.log.ConfigOuterClass.internal_static_v2ray_core_app_log_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.log.Config.class, com.v2ray.core.app.log.Config.Builder.class);
  }

  public static final int ERROR_LOG_TYPE_FIELD_NUMBER = 1;
  private int errorLogType_;
  /**
   * <code>.v2ray.core.app.log.LogType error_log_type = 1;</code>
   */
  public int getErrorLogTypeValue() {
    return errorLogType_;
  }
  /**
   * <code>.v2ray.core.app.log.LogType error_log_type = 1;</code>
   */
  public com.v2ray.core.app.log.LogType getErrorLogType() {
    com.v2ray.core.app.log.LogType result = com.v2ray.core.app.log.LogType.valueOf(errorLogType_);
    return result == null ? com.v2ray.core.app.log.LogType.UNRECOGNIZED : result;
  }

  public static final int ERROR_LOG_LEVEL_FIELD_NUMBER = 2;
  private int errorLogLevel_;
  /**
   * <code>.v2ray.core.common.log.Severity error_log_level = 2;</code>
   */
  public int getErrorLogLevelValue() {
    return errorLogLevel_;
  }
  /**
   * <code>.v2ray.core.common.log.Severity error_log_level = 2;</code>
   */
  public com.v2ray.core.common.log.Severity getErrorLogLevel() {
    com.v2ray.core.common.log.Severity result = com.v2ray.core.common.log.Severity.valueOf(errorLogLevel_);
    return result == null ? com.v2ray.core.common.log.Severity.UNRECOGNIZED : result;
  }

  public static final int ERROR_LOG_PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object errorLogPath_;
  /**
   * <code>string error_log_path = 3;</code>
   */
  public java.lang.String getErrorLogPath() {
    java.lang.Object ref = errorLogPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorLogPath_ = s;
      return s;
    }
  }
  /**
   * <code>string error_log_path = 3;</code>
   */
  public com.google.protobuf.ByteString
      getErrorLogPathBytes() {
    java.lang.Object ref = errorLogPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorLogPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_LOG_TYPE_FIELD_NUMBER = 4;
  private int accessLogType_;
  /**
   * <code>.v2ray.core.app.log.LogType access_log_type = 4;</code>
   */
  public int getAccessLogTypeValue() {
    return accessLogType_;
  }
  /**
   * <code>.v2ray.core.app.log.LogType access_log_type = 4;</code>
   */
  public com.v2ray.core.app.log.LogType getAccessLogType() {
    com.v2ray.core.app.log.LogType result = com.v2ray.core.app.log.LogType.valueOf(accessLogType_);
    return result == null ? com.v2ray.core.app.log.LogType.UNRECOGNIZED : result;
  }

  public static final int ACCESS_LOG_PATH_FIELD_NUMBER = 5;
  private volatile java.lang.Object accessLogPath_;
  /**
   * <code>string access_log_path = 5;</code>
   */
  public java.lang.String getAccessLogPath() {
    java.lang.Object ref = accessLogPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessLogPath_ = s;
      return s;
    }
  }
  /**
   * <code>string access_log_path = 5;</code>
   */
  public com.google.protobuf.ByteString
      getAccessLogPathBytes() {
    java.lang.Object ref = accessLogPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessLogPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (errorLogType_ != com.v2ray.core.app.log.LogType.None.getNumber()) {
      output.writeEnum(1, errorLogType_);
    }
    if (errorLogLevel_ != com.v2ray.core.common.log.Severity.Unknown.getNumber()) {
      output.writeEnum(2, errorLogLevel_);
    }
    if (!getErrorLogPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorLogPath_);
    }
    if (accessLogType_ != com.v2ray.core.app.log.LogType.None.getNumber()) {
      output.writeEnum(4, accessLogType_);
    }
    if (!getAccessLogPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, accessLogPath_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorLogType_ != com.v2ray.core.app.log.LogType.None.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, errorLogType_);
    }
    if (errorLogLevel_ != com.v2ray.core.common.log.Severity.Unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, errorLogLevel_);
    }
    if (!getErrorLogPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorLogPath_);
    }
    if (accessLogType_ != com.v2ray.core.app.log.LogType.None.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, accessLogType_);
    }
    if (!getAccessLogPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, accessLogPath_);
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
    if (!(obj instanceof com.v2ray.core.app.log.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.log.Config other = (com.v2ray.core.app.log.Config) obj;

    boolean result = true;
    result = result && errorLogType_ == other.errorLogType_;
    result = result && errorLogLevel_ == other.errorLogLevel_;
    result = result && getErrorLogPath()
        .equals(other.getErrorLogPath());
    result = result && accessLogType_ == other.accessLogType_;
    result = result && getAccessLogPath()
        .equals(other.getAccessLogPath());
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
    hash = (37 * hash) + ERROR_LOG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + errorLogType_;
    hash = (37 * hash) + ERROR_LOG_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + errorLogLevel_;
    hash = (37 * hash) + ERROR_LOG_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getErrorLogPath().hashCode();
    hash = (37 * hash) + ACCESS_LOG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + accessLogType_;
    hash = (37 * hash) + ACCESS_LOG_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getAccessLogPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.log.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.log.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.log.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.log.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.log.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.log.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.log.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.log.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.log.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.log.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.log.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.log.Config parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.app.log.Config prototype) {
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
   * Protobuf type {@code v2ray.core.app.log.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.log.Config)
      com.v2ray.core.app.log.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.log.ConfigOuterClass.internal_static_v2ray_core_app_log_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.log.ConfigOuterClass.internal_static_v2ray_core_app_log_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.log.Config.class, com.v2ray.core.app.log.Config.Builder.class);
    }

    // Construct using com.v2ray.core.app.log.Config.newBuilder()
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
      errorLogType_ = 0;

      errorLogLevel_ = 0;

      errorLogPath_ = "";

      accessLogType_ = 0;

      accessLogPath_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.log.ConfigOuterClass.internal_static_v2ray_core_app_log_Config_descriptor;
    }

    public com.v2ray.core.app.log.Config getDefaultInstanceForType() {
      return com.v2ray.core.app.log.Config.getDefaultInstance();
    }

    public com.v2ray.core.app.log.Config build() {
      com.v2ray.core.app.log.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.app.log.Config buildPartial() {
      com.v2ray.core.app.log.Config result = new com.v2ray.core.app.log.Config(this);
      result.errorLogType_ = errorLogType_;
      result.errorLogLevel_ = errorLogLevel_;
      result.errorLogPath_ = errorLogPath_;
      result.accessLogType_ = accessLogType_;
      result.accessLogPath_ = accessLogPath_;
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
      if (other instanceof com.v2ray.core.app.log.Config) {
        return mergeFrom((com.v2ray.core.app.log.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.log.Config other) {
      if (other == com.v2ray.core.app.log.Config.getDefaultInstance()) return this;
      if (other.errorLogType_ != 0) {
        setErrorLogTypeValue(other.getErrorLogTypeValue());
      }
      if (other.errorLogLevel_ != 0) {
        setErrorLogLevelValue(other.getErrorLogLevelValue());
      }
      if (!other.getErrorLogPath().isEmpty()) {
        errorLogPath_ = other.errorLogPath_;
        onChanged();
      }
      if (other.accessLogType_ != 0) {
        setAccessLogTypeValue(other.getAccessLogTypeValue());
      }
      if (!other.getAccessLogPath().isEmpty()) {
        accessLogPath_ = other.accessLogPath_;
        onChanged();
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
      com.v2ray.core.app.log.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.app.log.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int errorLogType_ = 0;
    /**
     * <code>.v2ray.core.app.log.LogType error_log_type = 1;</code>
     */
    public int getErrorLogTypeValue() {
      return errorLogType_;
    }
    /**
     * <code>.v2ray.core.app.log.LogType error_log_type = 1;</code>
     */
    public Builder setErrorLogTypeValue(int value) {
      errorLogType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.app.log.LogType error_log_type = 1;</code>
     */
    public com.v2ray.core.app.log.LogType getErrorLogType() {
      com.v2ray.core.app.log.LogType result = com.v2ray.core.app.log.LogType.valueOf(errorLogType_);
      return result == null ? com.v2ray.core.app.log.LogType.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.app.log.LogType error_log_type = 1;</code>
     */
    public Builder setErrorLogType(com.v2ray.core.app.log.LogType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errorLogType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.app.log.LogType error_log_type = 1;</code>
     */
    public Builder clearErrorLogType() {
      
      errorLogType_ = 0;
      onChanged();
      return this;
    }

    private int errorLogLevel_ = 0;
    /**
     * <code>.v2ray.core.common.log.Severity error_log_level = 2;</code>
     */
    public int getErrorLogLevelValue() {
      return errorLogLevel_;
    }
    /**
     * <code>.v2ray.core.common.log.Severity error_log_level = 2;</code>
     */
    public Builder setErrorLogLevelValue(int value) {
      errorLogLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.common.log.Severity error_log_level = 2;</code>
     */
    public com.v2ray.core.common.log.Severity getErrorLogLevel() {
      com.v2ray.core.common.log.Severity result = com.v2ray.core.common.log.Severity.valueOf(errorLogLevel_);
      return result == null ? com.v2ray.core.common.log.Severity.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.common.log.Severity error_log_level = 2;</code>
     */
    public Builder setErrorLogLevel(com.v2ray.core.common.log.Severity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errorLogLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.common.log.Severity error_log_level = 2;</code>
     */
    public Builder clearErrorLogLevel() {
      
      errorLogLevel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errorLogPath_ = "";
    /**
     * <code>string error_log_path = 3;</code>
     */
    public java.lang.String getErrorLogPath() {
      java.lang.Object ref = errorLogPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorLogPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error_log_path = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorLogPathBytes() {
      java.lang.Object ref = errorLogPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorLogPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error_log_path = 3;</code>
     */
    public Builder setErrorLogPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorLogPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error_log_path = 3;</code>
     */
    public Builder clearErrorLogPath() {
      
      errorLogPath_ = getDefaultInstance().getErrorLogPath();
      onChanged();
      return this;
    }
    /**
     * <code>string error_log_path = 3;</code>
     */
    public Builder setErrorLogPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorLogPath_ = value;
      onChanged();
      return this;
    }

    private int accessLogType_ = 0;
    /**
     * <code>.v2ray.core.app.log.LogType access_log_type = 4;</code>
     */
    public int getAccessLogTypeValue() {
      return accessLogType_;
    }
    /**
     * <code>.v2ray.core.app.log.LogType access_log_type = 4;</code>
     */
    public Builder setAccessLogTypeValue(int value) {
      accessLogType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.app.log.LogType access_log_type = 4;</code>
     */
    public com.v2ray.core.app.log.LogType getAccessLogType() {
      com.v2ray.core.app.log.LogType result = com.v2ray.core.app.log.LogType.valueOf(accessLogType_);
      return result == null ? com.v2ray.core.app.log.LogType.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.app.log.LogType access_log_type = 4;</code>
     */
    public Builder setAccessLogType(com.v2ray.core.app.log.LogType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      accessLogType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.app.log.LogType access_log_type = 4;</code>
     */
    public Builder clearAccessLogType() {
      
      accessLogType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object accessLogPath_ = "";
    /**
     * <code>string access_log_path = 5;</code>
     */
    public java.lang.String getAccessLogPath() {
      java.lang.Object ref = accessLogPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessLogPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string access_log_path = 5;</code>
     */
    public com.google.protobuf.ByteString
        getAccessLogPathBytes() {
      java.lang.Object ref = accessLogPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessLogPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string access_log_path = 5;</code>
     */
    public Builder setAccessLogPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accessLogPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string access_log_path = 5;</code>
     */
    public Builder clearAccessLogPath() {
      
      accessLogPath_ = getDefaultInstance().getAccessLogPath();
      onChanged();
      return this;
    }
    /**
     * <code>string access_log_path = 5;</code>
     */
    public Builder setAccessLogPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accessLogPath_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.log.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.log.Config)
  private static final com.v2ray.core.app.log.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.log.Config();
  }

  public static com.v2ray.core.app.log.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.app.log.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

