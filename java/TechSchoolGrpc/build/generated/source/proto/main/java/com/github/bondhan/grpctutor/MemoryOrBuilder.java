// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: memory_message.proto

package com.github.bondhan.grpctutor;

public interface MemoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.bondhan.grpctutor.Memory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 value = 1;</code>
   * @return The value.
   */
  long getValue();

  /**
   * <code>.com.github.bondhan.grpctutor.Memory.Unit unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <code>.com.github.bondhan.grpctutor.Memory.Unit unit = 2;</code>
   * @return The unit.
   */
  com.github.bondhan.grpctutor.Memory.Unit getUnit();
}
