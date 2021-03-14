// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processor_message.proto

package com.github.bondhan.grpctutor;

public interface GPUOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.bondhan.grpctutor.GPU)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string brand = 1;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 1;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double min_ghz = 3;</code>
   * @return The minGhz.
   */
  double getMinGhz();

  /**
   * <code>double max_ghz = 4;</code>
   * @return The maxGhz.
   */
  double getMaxGhz();

  /**
   * <code>.com.github.bondhan.grpctutor.Memory memory = 5;</code>
   * @return Whether the memory field is set.
   */
  boolean hasMemory();
  /**
   * <code>.com.github.bondhan.grpctutor.Memory memory = 5;</code>
   * @return The memory.
   */
  com.github.bondhan.grpctutor.Memory getMemory();
  /**
   * <code>.com.github.bondhan.grpctutor.Memory memory = 5;</code>
   */
  com.github.bondhan.grpctutor.MemoryOrBuilder getMemoryOrBuilder();
}
