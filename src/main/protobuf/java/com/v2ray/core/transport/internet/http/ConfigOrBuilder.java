// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/http/config.proto

package com.v2ray.core.transport.internet.http;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.transport.internet.http.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string host = 1;</code>
   */
  java.util.List<java.lang.String>
      getHostList();
  /**
   * <code>repeated string host = 1;</code>
   */
  int getHostCount();
  /**
   * <code>repeated string host = 1;</code>
   */
  java.lang.String getHost(int index);
  /**
   * <code>repeated string host = 1;</code>
   */
  com.google.protobuf.ByteString
      getHostBytes(int index);

  /**
   * <code>string path = 2;</code>
   */
  java.lang.String getPath();
  /**
   * <code>string path = 2;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();
}
