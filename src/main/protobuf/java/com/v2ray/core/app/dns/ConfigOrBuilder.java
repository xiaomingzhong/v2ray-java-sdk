// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/dns/config.proto

package com.v2ray.core.app.dns;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.dns.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at the moment.
   * A special value 'localhost' as a domain address can be set to use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1;</code>
   */
  java.util.List<com.v2ray.core.common.net.Endpoint> 
      getNameServersList();
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at the moment.
   * A special value 'localhost' as a domain address can be set to use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1;</code>
   */
  com.v2ray.core.common.net.Endpoint getNameServers(int index);
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at the moment.
   * A special value 'localhost' as a domain address can be set to use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1;</code>
   */
  int getNameServersCount();
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at the moment.
   * A special value 'localhost' as a domain address can be set to use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1;</code>
   */
  java.util.List<? extends com.v2ray.core.common.net.EndpointOrBuilder> 
      getNameServersOrBuilderList();
  /**
   * <pre>
   * Nameservers used by this DNS. Only traditional UDP servers are support at the moment.
   * A special value 'localhost' as a domain address can be set to use DNS on local system.
   * </pre>
   *
   * <code>repeated .v2ray.core.common.net.Endpoint NameServers = 1;</code>
   */
  com.v2ray.core.common.net.EndpointOrBuilder getNameServersOrBuilder(
      int index);

  /**
   * <pre>
   * Static hosts. Domain to IP.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2;</code>
   */
  int getHostsCount();
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2;</code>
   */
  boolean containsHosts(
      java.lang.String key);
  /**
   * Use {@link #getHostsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.v2ray.core.common.net.IPOrDomain>
  getHosts();
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2;</code>
   */
  java.util.Map<java.lang.String, com.v2ray.core.common.net.IPOrDomain>
  getHostsMap();
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2;</code>
   */

  com.v2ray.core.common.net.IPOrDomain getHostsOrDefault(
      java.lang.String key,
      com.v2ray.core.common.net.IPOrDomain defaultValue);
  /**
   * <pre>
   * Static hosts. Domain to IP.
   * </pre>
   *
   * <code>map&lt;string, .v2ray.core.common.net.IPOrDomain&gt; Hosts = 2;</code>
   */

  com.v2ray.core.common.net.IPOrDomain getHostsOrThrow(
      java.lang.String key);
}
