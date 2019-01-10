// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/websocket/config.proto

package com.v2ray.core.transport.internet.websocket;

/**
 * Protobuf type {@code v2ray.core.transport.internet.websocket.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.websocket.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    path_ = "";
    header_ = java.util.Collections.emptyList();
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              header_ = new java.util.ArrayList<com.v2ray.core.transport.internet.websocket.Header>();
              mutable_bitField0_ |= 0x00000002;
            }
            header_.add(
                input.readMessage(com.v2ray.core.transport.internet.websocket.Header.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        header_ = java.util.Collections.unmodifiableList(header_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.websocket.Config.class, com.v2ray.core.transport.internet.websocket.Config.Builder.class);
  }

  private int bitField0_;
  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * URL path to the WebSocket service. Empty value means root(/).
   * </pre>
   *
   * <code>string path = 2;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL path to the WebSocket service. Empty value means root(/).
   * </pre>
   *
   * <code>string path = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEADER_FIELD_NUMBER = 3;
  private java.util.List<com.v2ray.core.transport.internet.websocket.Header> header_;
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public java.util.List<com.v2ray.core.transport.internet.websocket.Header> getHeaderList() {
    return header_;
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public java.util.List<? extends com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> 
      getHeaderOrBuilderList() {
    return header_;
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public int getHeaderCount() {
    return header_.size();
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public com.v2ray.core.transport.internet.websocket.Header getHeader(int index) {
    return header_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public com.v2ray.core.transport.internet.websocket.HeaderOrBuilder getHeaderOrBuilder(
      int index) {
    return header_.get(index);
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
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    for (int i = 0; i < header_.size(); i++) {
      output.writeMessage(3, header_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
    }
    for (int i = 0; i < header_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, header_.get(i));
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
    if (!(obj instanceof com.v2ray.core.transport.internet.websocket.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.websocket.Config other = (com.v2ray.core.transport.internet.websocket.Config) obj;

    boolean result = true;
    result = result && getPath()
        .equals(other.getPath());
    result = result && getHeaderList()
        .equals(other.getHeaderList());
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (getHeaderCount() > 0) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeaderList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.websocket.Config parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.transport.internet.websocket.Config prototype) {
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
   * Protobuf type {@code v2ray.core.transport.internet.websocket.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.websocket.Config)
      com.v2ray.core.transport.internet.websocket.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.websocket.Config.class, com.v2ray.core.transport.internet.websocket.Config.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.websocket.Config.newBuilder()
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
        getHeaderFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      path_ = "";

      if (headerBuilder_ == null) {
        header_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        headerBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
    }

    public com.v2ray.core.transport.internet.websocket.Config getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.websocket.Config.getDefaultInstance();
    }

    public com.v2ray.core.transport.internet.websocket.Config build() {
      com.v2ray.core.transport.internet.websocket.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.internet.websocket.Config buildPartial() {
      com.v2ray.core.transport.internet.websocket.Config result = new com.v2ray.core.transport.internet.websocket.Config(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.path_ = path_;
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          header_ = java.util.Collections.unmodifiableList(header_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.v2ray.core.transport.internet.websocket.Config) {
        return mergeFrom((com.v2ray.core.transport.internet.websocket.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.websocket.Config other) {
      if (other == com.v2ray.core.transport.internet.websocket.Config.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (headerBuilder_ == null) {
        if (!other.header_.isEmpty()) {
          if (header_.isEmpty()) {
            header_ = other.header_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureHeaderIsMutable();
            header_.addAll(other.header_);
          }
          onChanged();
        }
      } else {
        if (!other.header_.isEmpty()) {
          if (headerBuilder_.isEmpty()) {
            headerBuilder_.dispose();
            headerBuilder_ = null;
            header_ = other.header_;
            bitField0_ = (bitField0_ & ~0x00000002);
            headerBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHeaderFieldBuilder() : null;
          } else {
            headerBuilder_.addAllMessages(other.header_);
          }
        }
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
      com.v2ray.core.transport.internet.websocket.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.websocket.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.v2ray.core.transport.internet.websocket.Header> header_ =
      java.util.Collections.emptyList();
    private void ensureHeaderIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        header_ = new java.util.ArrayList<com.v2ray.core.transport.internet.websocket.Header>(header_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.websocket.Header, com.v2ray.core.transport.internet.websocket.Header.Builder, com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> headerBuilder_;

    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.websocket.Header> getHeaderList() {
      if (headerBuilder_ == null) {
        return java.util.Collections.unmodifiableList(header_);
      } else {
        return headerBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public int getHeaderCount() {
      if (headerBuilder_ == null) {
        return header_.size();
      } else {
        return headerBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header getHeader(int index) {
      if (headerBuilder_ == null) {
        return header_.get(index);
      } else {
        return headerBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder setHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeaderIsMutable();
        header_.set(index, value);
        onChanged();
      } else {
        headerBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder setHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.set(index, builderForValue.build());
        onChanged();
      } else {
        headerBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(com.v2ray.core.transport.internet.websocket.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeaderIsMutable();
        header_.add(value);
        onChanged();
      } else {
        headerBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeaderIsMutable();
        header_.add(index, value);
        onChanged();
      } else {
        headerBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(
        com.v2ray.core.transport.internet.websocket.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.add(builderForValue.build());
        onChanged();
      } else {
        headerBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.add(index, builderForValue.build());
        onChanged();
      } else {
        headerBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addAllHeader(
        java.lang.Iterable<? extends com.v2ray.core.transport.internet.websocket.Header> values) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, header_);
        onChanged();
      } else {
        headerBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        headerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder removeHeader(int index) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.remove(index);
        onChanged();
      } else {
        headerBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header.Builder getHeaderBuilder(
        int index) {
      return getHeaderFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.HeaderOrBuilder getHeaderOrBuilder(
        int index) {
      if (headerBuilder_ == null) {
        return header_.get(index);  } else {
        return headerBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public java.util.List<? extends com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> 
         getHeaderOrBuilderList() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(header_);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header.Builder addHeaderBuilder() {
      return getHeaderFieldBuilder().addBuilder(
          com.v2ray.core.transport.internet.websocket.Header.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header.Builder addHeaderBuilder(
        int index) {
      return getHeaderFieldBuilder().addBuilder(
          index, com.v2ray.core.transport.internet.websocket.Header.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.websocket.Header.Builder> 
         getHeaderBuilderList() {
      return getHeaderFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.websocket.Header, com.v2ray.core.transport.internet.websocket.Header.Builder, com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.transport.internet.websocket.Header, com.v2ray.core.transport.internet.websocket.Header.Builder, com.v2ray.core.transport.internet.websocket.HeaderOrBuilder>(
                header_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.websocket.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.websocket.Config)
  private static final com.v2ray.core.transport.internet.websocket.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.websocket.Config();
  }

  public static com.v2ray.core.transport.internet.websocket.Config getDefaultInstance() {
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

  public com.v2ray.core.transport.internet.websocket.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

