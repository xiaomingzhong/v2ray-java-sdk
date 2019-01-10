// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/shadowsocks/config.proto

package com.v2ray.core.proxy.shadowsocks;

/**
 * Protobuf enum {@code v2ray.core.proxy.shadowsocks.CipherType}
 */
public enum CipherType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>AES_128_CFB = 1;</code>
   */
  AES_128_CFB(1),
  /**
   * <code>AES_256_CFB = 2;</code>
   */
  AES_256_CFB(2),
  /**
   * <code>CHACHA20 = 3;</code>
   */
  CHACHA20(3),
  /**
   * <code>CHACHA20_IETF = 4;</code>
   */
  CHACHA20_IETF(4),
  /**
   * <code>AES_128_GCM = 5;</code>
   */
  AES_128_GCM(5),
  /**
   * <code>AES_256_GCM = 6;</code>
   */
  AES_256_GCM(6),
  /**
   * <code>CHACHA20_POLY1305 = 7;</code>
   */
  CHACHA20_POLY1305(7),
  /**
   * <code>NONE = 8;</code>
   */
  NONE(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>AES_128_CFB = 1;</code>
   */
  public static final int AES_128_CFB_VALUE = 1;
  /**
   * <code>AES_256_CFB = 2;</code>
   */
  public static final int AES_256_CFB_VALUE = 2;
  /**
   * <code>CHACHA20 = 3;</code>
   */
  public static final int CHACHA20_VALUE = 3;
  /**
   * <code>CHACHA20_IETF = 4;</code>
   */
  public static final int CHACHA20_IETF_VALUE = 4;
  /**
   * <code>AES_128_GCM = 5;</code>
   */
  public static final int AES_128_GCM_VALUE = 5;
  /**
   * <code>AES_256_GCM = 6;</code>
   */
  public static final int AES_256_GCM_VALUE = 6;
  /**
   * <code>CHACHA20_POLY1305 = 7;</code>
   */
  public static final int CHACHA20_POLY1305_VALUE = 7;
  /**
   * <code>NONE = 8;</code>
   */
  public static final int NONE_VALUE = 8;


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
  public static CipherType valueOf(int value) {
    return forNumber(value);
  }

  public static CipherType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return AES_128_CFB;
      case 2: return AES_256_CFB;
      case 3: return CHACHA20;
      case 4: return CHACHA20_IETF;
      case 5: return AES_128_GCM;
      case 6: return AES_256_GCM;
      case 7: return CHACHA20_POLY1305;
      case 8: return NONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CipherType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CipherType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CipherType>() {
          public CipherType findValueByNumber(int number) {
            return CipherType.forNumber(number);
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
    return com.v2ray.core.proxy.shadowsocks.Config.getDescriptor().getEnumTypes().get(0);
  }

  private static final CipherType[] VALUES = values();

  public static CipherType valueOf(
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

  private CipherType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:v2ray.core.proxy.shadowsocks.CipherType)
}

