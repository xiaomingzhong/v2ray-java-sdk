// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/net/network.proto

package com.v2ray.core.common.net;

public final class NetworkOuterClass {
  private NetworkOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_common_net_NetworkList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_common_net_NetworkList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'v2ray.com/core/common/net/network.prot" +
      "o\022\025v2ray.core.common.net\">\n\013NetworkList\022" +
      "/\n\007network\030\001 \003(\0162\036.v2ray.core.common.net" +
      ".Network*8\n\007Network\022\013\n\007Unknown\020\000\022\016\n\006RawT" +
      "CP\020\001\032\002\010\001\022\007\n\003TCP\020\002\022\007\n\003UDP\020\003B:\n\031com.v2ray." +
      "core.common.netP\001Z\003net\252\002\025V2Ray.Core.Comm" +
      "on.Netb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_v2ray_core_common_net_NetworkList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_common_net_NetworkList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_common_net_NetworkList_descriptor,
        new java.lang.String[] { "Network", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
