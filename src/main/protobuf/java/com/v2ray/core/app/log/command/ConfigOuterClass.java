// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/log/command/config.proto

package com.v2ray.core.app.log.command;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_log_command_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_log_command_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_log_command_RestartLoggerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_log_command_RestartLoggerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_app_log_command_RestartLoggerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_app_log_command_RestartLoggerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+v2ray.com/core/app/log/command/config." +
      "proto\022\032v2ray.core.app.log.command\"\010\n\006Con" +
      "fig\"\026\n\024RestartLoggerRequest\"\027\n\025RestartLo" +
      "ggerResponse2\207\001\n\rLoggerService\022v\n\rRestar" +
      "tLogger\0220.v2ray.core.app.log.command.Res" +
      "tartLoggerRequest\0321.v2ray.core.app.log.c" +
      "ommand.RestartLoggerResponse\"\000BH\n\036com.v2" +
      "ray.core.app.log.commandP\001Z\007command\252\002\032V2" +
      "Ray.Core.App.Log.Commandb\006proto3"
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
    internal_static_v2ray_core_app_log_command_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_app_log_command_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_log_command_Config_descriptor,
        new java.lang.String[] { });
    internal_static_v2ray_core_app_log_command_RestartLoggerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_v2ray_core_app_log_command_RestartLoggerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_log_command_RestartLoggerRequest_descriptor,
        new java.lang.String[] { });
    internal_static_v2ray_core_app_log_command_RestartLoggerResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_v2ray_core_app_log_command_RestartLoggerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_app_log_command_RestartLoggerResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
