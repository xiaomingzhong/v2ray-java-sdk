// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/policy/config.proto

package com.v2ray.core.app.policy;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.policy.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, .v2ray.core.app.policy.Policy&gt; level = 1;</code>
   */
  int getLevelCount();
  /**
   * <code>map&lt;uint32, .v2ray.core.app.policy.Policy&gt; level = 1;</code>
   */
  boolean containsLevel(
      int key);
  /**
   * Use {@link #getLevelMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.v2ray.core.app.policy.Policy>
  getLevel();
  /**
   * <code>map&lt;uint32, .v2ray.core.app.policy.Policy&gt; level = 1;</code>
   */
  java.util.Map<java.lang.Integer, com.v2ray.core.app.policy.Policy>
  getLevelMap();
  /**
   * <code>map&lt;uint32, .v2ray.core.app.policy.Policy&gt; level = 1;</code>
   */

  com.v2ray.core.app.policy.Policy getLevelOrDefault(
      int key,
      com.v2ray.core.app.policy.Policy defaultValue);
  /**
   * <code>map&lt;uint32, .v2ray.core.app.policy.Policy&gt; level = 1;</code>
   */

  com.v2ray.core.app.policy.Policy getLevelOrThrow(
      int key);

  /**
   * <code>.v2ray.core.app.policy.SystemPolicy system = 2;</code>
   */
  boolean hasSystem();
  /**
   * <code>.v2ray.core.app.policy.SystemPolicy system = 2;</code>
   */
  com.v2ray.core.app.policy.SystemPolicy getSystem();
  /**
   * <code>.v2ray.core.app.policy.SystemPolicy system = 2;</code>
   */
  com.v2ray.core.app.policy.SystemPolicyOrBuilder getSystemOrBuilder();
}
