// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: memory_message.proto

package com.github.bondhan.grpctutor;

public final class MemoryMessage {
  private MemoryMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_bondhan_grpctutor_Memory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_bondhan_grpctutor_Memory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024memory_message.proto\022\034com.github.bondh" +
      "an.grpctutor\"\260\001\n\006Memory\022\r\n\005value\030\001 \001(\004\0227" +
      "\n\004unit\030\002 \001(\0162).com.github.bondhan.grpctu" +
      "tor.Memory.Unit\"^\n\004Unit\022\013\n\007UNKNOWN\020\000\022\007\n\003" +
      "BIT\020\001\022\010\n\004BYTE\020\002\022\014\n\010KILOBYTE\020\003\022\014\n\010MEGABYT" +
      "E\020\004\022\014\n\010GIGABYTE\020\005\022\014\n\010TERABYTE\020\006B&\n\034com.g" +
      "ithub.bondhan.grpctutorP\001Z\004.;pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_github_bondhan_grpctutor_Memory_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_bondhan_grpctutor_Memory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_bondhan_grpctutor_Memory_descriptor,
        new java.lang.String[] { "Value", "Unit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
