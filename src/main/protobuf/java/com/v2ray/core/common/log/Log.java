// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/log/log.proto

package com.v2ray.core.common.log;

public final class Log {
  private Log() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#v2ray.com/core/common/log/log.proto\022\025v" +
      "2ray.core.common.log*D\n\010Severity\022\013\n\007Unkn" +
      "own\020\000\022\t\n\005Error\020\001\022\013\n\007Warning\020\002\022\010\n\004Info\020\003\022" +
      "\t\n\005Debug\020\004B:\n\031com.v2ray.core.common.logP" +
      "\001Z\003log\252\002\025V2Ray.Core.Common.Logb\006proto3"
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
