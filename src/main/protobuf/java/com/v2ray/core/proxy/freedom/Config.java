// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/freedom/config.proto

package com.v2ray.core.proxy.freedom;

/**
 * Protobuf type {@code v2ray.core.proxy.freedom.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.proxy.freedom.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    domainStrategy_ = 0;
    timeout_ = 0;
    userLevel_ = 0;
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

            domainStrategy_ = rawValue;
            break;
          }
          case 16: {

            timeout_ = input.readUInt32();
            break;
          }
          case 26: {
            com.v2ray.core.proxy.freedom.DestinationOverride.Builder subBuilder = null;
            if (destinationOverride_ != null) {
              subBuilder = destinationOverride_.toBuilder();
            }
            destinationOverride_ = input.readMessage(com.v2ray.core.proxy.freedom.DestinationOverride.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(destinationOverride_);
              destinationOverride_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            userLevel_ = input.readUInt32();
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
    return com.v2ray.core.proxy.freedom.ConfigOuterClass.internal_static_v2ray_core_proxy_freedom_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.freedom.ConfigOuterClass.internal_static_v2ray_core_proxy_freedom_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.proxy.freedom.Config.class, com.v2ray.core.proxy.freedom.Config.Builder.class);
  }

  /**
   * Protobuf enum {@code v2ray.core.proxy.freedom.Config.DomainStrategy}
   */
  public enum DomainStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>AS_IS = 0;</code>
     */
    AS_IS(0),
    /**
     * <code>USE_IP = 1;</code>
     */
    USE_IP(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>AS_IS = 0;</code>
     */
    public static final int AS_IS_VALUE = 0;
    /**
     * <code>USE_IP = 1;</code>
     */
    public static final int USE_IP_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DomainStrategy valueOf(int value) {
      return forNumber(value);
    }

    public static DomainStrategy forNumber(int value) {
      switch (value) {
        case 0: return AS_IS;
        case 1: return USE_IP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DomainStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DomainStrategy> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DomainStrategy>() {
            public DomainStrategy findValueByNumber(int number) {
              return DomainStrategy.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.v2ray.core.proxy.freedom.Config.getDescriptor().getEnumTypes().get(0);
    }

    private static final DomainStrategy[] VALUES = values();

    public static DomainStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DomainStrategy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:v2ray.core.proxy.freedom.Config.DomainStrategy)
  }

  public static final int DOMAIN_STRATEGY_FIELD_NUMBER = 1;
  private int domainStrategy_;
  /**
   * <code>.v2ray.core.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
   */
  public int getDomainStrategyValue() {
    return domainStrategy_;
  }
  /**
   * <code>.v2ray.core.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
   */
  public com.v2ray.core.proxy.freedom.Config.DomainStrategy getDomainStrategy() {
    com.v2ray.core.proxy.freedom.Config.DomainStrategy result = com.v2ray.core.proxy.freedom.Config.DomainStrategy.valueOf(domainStrategy_);
    return result == null ? com.v2ray.core.proxy.freedom.Config.DomainStrategy.UNRECOGNIZED : result;
  }

  public static final int TIMEOUT_FIELD_NUMBER = 2;
  private int timeout_;
  /**
   * <code>uint32 timeout = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated public int getTimeout() {
    return timeout_;
  }

  public static final int DESTINATION_OVERRIDE_FIELD_NUMBER = 3;
  private com.v2ray.core.proxy.freedom.DestinationOverride destinationOverride_;
  /**
   * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
   */
  public boolean hasDestinationOverride() {
    return destinationOverride_ != null;
  }
  /**
   * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
   */
  public com.v2ray.core.proxy.freedom.DestinationOverride getDestinationOverride() {
    return destinationOverride_ == null ? com.v2ray.core.proxy.freedom.DestinationOverride.getDefaultInstance() : destinationOverride_;
  }
  /**
   * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
   */
  public com.v2ray.core.proxy.freedom.DestinationOverrideOrBuilder getDestinationOverrideOrBuilder() {
    return getDestinationOverride();
  }

  public static final int USER_LEVEL_FIELD_NUMBER = 4;
  private int userLevel_;
  /**
   * <code>uint32 user_level = 4;</code>
   */
  public int getUserLevel() {
    return userLevel_;
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
    if (domainStrategy_ != com.v2ray.core.proxy.freedom.Config.DomainStrategy.AS_IS.getNumber()) {
      output.writeEnum(1, domainStrategy_);
    }
    if (timeout_ != 0) {
      output.writeUInt32(2, timeout_);
    }
    if (destinationOverride_ != null) {
      output.writeMessage(3, getDestinationOverride());
    }
    if (userLevel_ != 0) {
      output.writeUInt32(4, userLevel_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (domainStrategy_ != com.v2ray.core.proxy.freedom.Config.DomainStrategy.AS_IS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, domainStrategy_);
    }
    if (timeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, timeout_);
    }
    if (destinationOverride_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDestinationOverride());
    }
    if (userLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, userLevel_);
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
    if (!(obj instanceof com.v2ray.core.proxy.freedom.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.proxy.freedom.Config other = (com.v2ray.core.proxy.freedom.Config) obj;

    boolean result = true;
    result = result && domainStrategy_ == other.domainStrategy_;
    result = result && (getTimeout()
        == other.getTimeout());
    result = result && (hasDestinationOverride() == other.hasDestinationOverride());
    if (hasDestinationOverride()) {
      result = result && getDestinationOverride()
          .equals(other.getDestinationOverride());
    }
    result = result && (getUserLevel()
        == other.getUserLevel());
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
    hash = (37 * hash) + DOMAIN_STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + domainStrategy_;
    hash = (37 * hash) + TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getTimeout();
    if (hasDestinationOverride()) {
      hash = (37 * hash) + DESTINATION_OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + getDestinationOverride().hashCode();
    }
    hash = (37 * hash) + USER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getUserLevel();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.proxy.freedom.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.freedom.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.freedom.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.proxy.freedom.Config parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.proxy.freedom.Config prototype) {
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
   * Protobuf type {@code v2ray.core.proxy.freedom.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.freedom.Config)
      com.v2ray.core.proxy.freedom.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.freedom.ConfigOuterClass.internal_static_v2ray_core_proxy_freedom_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.freedom.ConfigOuterClass.internal_static_v2ray_core_proxy_freedom_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.proxy.freedom.Config.class, com.v2ray.core.proxy.freedom.Config.Builder.class);
    }

    // Construct using com.v2ray.core.proxy.freedom.Config.newBuilder()
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
      domainStrategy_ = 0;

      timeout_ = 0;

      if (destinationOverrideBuilder_ == null) {
        destinationOverride_ = null;
      } else {
        destinationOverride_ = null;
        destinationOverrideBuilder_ = null;
      }
      userLevel_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.freedom.ConfigOuterClass.internal_static_v2ray_core_proxy_freedom_Config_descriptor;
    }

    public com.v2ray.core.proxy.freedom.Config getDefaultInstanceForType() {
      return com.v2ray.core.proxy.freedom.Config.getDefaultInstance();
    }

    public com.v2ray.core.proxy.freedom.Config build() {
      com.v2ray.core.proxy.freedom.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.proxy.freedom.Config buildPartial() {
      com.v2ray.core.proxy.freedom.Config result = new com.v2ray.core.proxy.freedom.Config(this);
      result.domainStrategy_ = domainStrategy_;
      result.timeout_ = timeout_;
      if (destinationOverrideBuilder_ == null) {
        result.destinationOverride_ = destinationOverride_;
      } else {
        result.destinationOverride_ = destinationOverrideBuilder_.build();
      }
      result.userLevel_ = userLevel_;
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
      if (other instanceof com.v2ray.core.proxy.freedom.Config) {
        return mergeFrom((com.v2ray.core.proxy.freedom.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.proxy.freedom.Config other) {
      if (other == com.v2ray.core.proxy.freedom.Config.getDefaultInstance()) return this;
      if (other.domainStrategy_ != 0) {
        setDomainStrategyValue(other.getDomainStrategyValue());
      }
      if (other.getTimeout() != 0) {
        setTimeout(other.getTimeout());
      }
      if (other.hasDestinationOverride()) {
        mergeDestinationOverride(other.getDestinationOverride());
      }
      if (other.getUserLevel() != 0) {
        setUserLevel(other.getUserLevel());
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
      com.v2ray.core.proxy.freedom.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.proxy.freedom.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int domainStrategy_ = 0;
    /**
     * <code>.v2ray.core.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     */
    public int getDomainStrategyValue() {
      return domainStrategy_;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     */
    public Builder setDomainStrategyValue(int value) {
      domainStrategy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     */
    public com.v2ray.core.proxy.freedom.Config.DomainStrategy getDomainStrategy() {
      com.v2ray.core.proxy.freedom.Config.DomainStrategy result = com.v2ray.core.proxy.freedom.Config.DomainStrategy.valueOf(domainStrategy_);
      return result == null ? com.v2ray.core.proxy.freedom.Config.DomainStrategy.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     */
    public Builder setDomainStrategy(com.v2ray.core.proxy.freedom.Config.DomainStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      domainStrategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.Config.DomainStrategy domain_strategy = 1;</code>
     */
    public Builder clearDomainStrategy() {
      
      domainStrategy_ = 0;
      onChanged();
      return this;
    }

    private int timeout_ ;
    /**
     * <code>uint32 timeout = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public int getTimeout() {
      return timeout_;
    }
    /**
     * <code>uint32 timeout = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setTimeout(int value) {
      
      timeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 timeout = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearTimeout() {
      
      timeout_ = 0;
      onChanged();
      return this;
    }

    private com.v2ray.core.proxy.freedom.DestinationOverride destinationOverride_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.proxy.freedom.DestinationOverride, com.v2ray.core.proxy.freedom.DestinationOverride.Builder, com.v2ray.core.proxy.freedom.DestinationOverrideOrBuilder> destinationOverrideBuilder_;
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public boolean hasDestinationOverride() {
      return destinationOverrideBuilder_ != null || destinationOverride_ != null;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public com.v2ray.core.proxy.freedom.DestinationOverride getDestinationOverride() {
      if (destinationOverrideBuilder_ == null) {
        return destinationOverride_ == null ? com.v2ray.core.proxy.freedom.DestinationOverride.getDefaultInstance() : destinationOverride_;
      } else {
        return destinationOverrideBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder setDestinationOverride(com.v2ray.core.proxy.freedom.DestinationOverride value) {
      if (destinationOverrideBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destinationOverride_ = value;
        onChanged();
      } else {
        destinationOverrideBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder setDestinationOverride(
        com.v2ray.core.proxy.freedom.DestinationOverride.Builder builderForValue) {
      if (destinationOverrideBuilder_ == null) {
        destinationOverride_ = builderForValue.build();
        onChanged();
      } else {
        destinationOverrideBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder mergeDestinationOverride(com.v2ray.core.proxy.freedom.DestinationOverride value) {
      if (destinationOverrideBuilder_ == null) {
        if (destinationOverride_ != null) {
          destinationOverride_ =
            com.v2ray.core.proxy.freedom.DestinationOverride.newBuilder(destinationOverride_).mergeFrom(value).buildPartial();
        } else {
          destinationOverride_ = value;
        }
        onChanged();
      } else {
        destinationOverrideBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public Builder clearDestinationOverride() {
      if (destinationOverrideBuilder_ == null) {
        destinationOverride_ = null;
        onChanged();
      } else {
        destinationOverride_ = null;
        destinationOverrideBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public com.v2ray.core.proxy.freedom.DestinationOverride.Builder getDestinationOverrideBuilder() {
      
      onChanged();
      return getDestinationOverrideFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    public com.v2ray.core.proxy.freedom.DestinationOverrideOrBuilder getDestinationOverrideOrBuilder() {
      if (destinationOverrideBuilder_ != null) {
        return destinationOverrideBuilder_.getMessageOrBuilder();
      } else {
        return destinationOverride_ == null ?
            com.v2ray.core.proxy.freedom.DestinationOverride.getDefaultInstance() : destinationOverride_;
      }
    }
    /**
     * <code>.v2ray.core.proxy.freedom.DestinationOverride destination_override = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.proxy.freedom.DestinationOverride, com.v2ray.core.proxy.freedom.DestinationOverride.Builder, com.v2ray.core.proxy.freedom.DestinationOverrideOrBuilder> 
        getDestinationOverrideFieldBuilder() {
      if (destinationOverrideBuilder_ == null) {
        destinationOverrideBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.proxy.freedom.DestinationOverride, com.v2ray.core.proxy.freedom.DestinationOverride.Builder, com.v2ray.core.proxy.freedom.DestinationOverrideOrBuilder>(
                getDestinationOverride(),
                getParentForChildren(),
                isClean());
        destinationOverride_ = null;
      }
      return destinationOverrideBuilder_;
    }

    private int userLevel_ ;
    /**
     * <code>uint32 user_level = 4;</code>
     */
    public int getUserLevel() {
      return userLevel_;
    }
    /**
     * <code>uint32 user_level = 4;</code>
     */
    public Builder setUserLevel(int value) {
      
      userLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 user_level = 4;</code>
     */
    public Builder clearUserLevel() {
      
      userLevel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.freedom.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.proxy.freedom.Config)
  private static final com.v2ray.core.proxy.freedom.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.proxy.freedom.Config();
  }

  public static com.v2ray.core.proxy.freedom.Config getDefaultInstance() {
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

  public com.v2ray.core.proxy.freedom.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

