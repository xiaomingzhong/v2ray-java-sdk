// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

public interface SenderConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.proxyman.SenderConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Send traffic through the given IP. Only IP is allowed.
   * </pre>
   *
   * <code>.v2ray.core.common.net.IPOrDomain via = 1;</code>
   */
  boolean hasVia();
  /**
   * <pre>
   * Send traffic through the given IP. Only IP is allowed.
   * </pre>
   *
   * <code>.v2ray.core.common.net.IPOrDomain via = 1;</code>
   */
  com.v2ray.core.common.net.IPOrDomain getVia();
  /**
   * <pre>
   * Send traffic through the given IP. Only IP is allowed.
   * </pre>
   *
   * <code>.v2ray.core.common.net.IPOrDomain via = 1;</code>
   */
  com.v2ray.core.common.net.IPOrDomainOrBuilder getViaOrBuilder();

  /**
   * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
   */
  boolean hasStreamSettings();
  /**
   * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
   */
  com.v2ray.core.transport.internet.StreamConfig getStreamSettings();
  /**
   * <code>.v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
   */
  com.v2ray.core.transport.internet.StreamConfigOrBuilder getStreamSettingsOrBuilder();

  /**
   * <code>.v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
   */
  boolean hasProxySettings();
  /**
   * <code>.v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
   */
  com.v2ray.core.transport.internet.ProxyConfig getProxySettings();
  /**
   * <code>.v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
   */
  com.v2ray.core.transport.internet.ProxyConfigOrBuilder getProxySettingsOrBuilder();

  /**
   * <code>.v2ray.core.app.proxyman.MultiplexingConfig multiplex_settings = 4;</code>
   */
  boolean hasMultiplexSettings();
  /**
   * <code>.v2ray.core.app.proxyman.MultiplexingConfig multiplex_settings = 4;</code>
   */
  com.v2ray.core.app.proxyman.MultiplexingConfig getMultiplexSettings();
  /**
   * <code>.v2ray.core.app.proxyman.MultiplexingConfig multiplex_settings = 4;</code>
   */
  com.v2ray.core.app.proxyman.MultiplexingConfigOrBuilder getMultiplexSettingsOrBuilder();
}
