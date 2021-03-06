// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processor_message.proto

package com.github.bondhan.grpctutor;

public final class ProcessorMessage {
  private ProcessorMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_bondhan_grpctutor_CPU_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_bondhan_grpctutor_CPU_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_bondhan_grpctutor_GPU_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_bondhan_grpctutor_GPU_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027processor_message.proto\022\034com.github.bo" +
      "ndhan.grpctutor\032\024memory_message.proto\"q\n" +
      "\003CPU\022\r\n\005brand\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\024\n\014num" +
      "ber_cores\030\003 \001(\r\022\025\n\rnumber_thread\030\004 \001(\r\022\017" +
      "\n\007min_ghz\030\005 \001(\001\022\017\n\007max_ghz\030\006 \001(\001\"z\n\003GPU\022" +
      "\r\n\005brand\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\017\n\007min_ghz\030" +
      "\003 \001(\001\022\017\n\007max_ghz\030\004 \001(\001\0224\n\006memory\030\005 \001(\0132$" +
      ".com.github.bondhan.grpctutor.MemoryB&\n\034" +
      "com.github.bondhan.grpctutorP\001Z\004.;pbb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.github.bondhan.grpctutor.MemoryMessage.getDescriptor(),
        });
    internal_static_com_github_bondhan_grpctutor_CPU_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_bondhan_grpctutor_CPU_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_bondhan_grpctutor_CPU_descriptor,
        new java.lang.String[] { "Brand", "Name", "NumberCores", "NumberThread", "MinGhz", "MaxGhz", });
    internal_static_com_github_bondhan_grpctutor_GPU_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_github_bondhan_grpctutor_GPU_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_bondhan_grpctutor_GPU_descriptor,
        new java.lang.String[] { "Brand", "Name", "MinGhz", "MaxGhz", "Memory", });
    com.github.bondhan.grpctutor.MemoryMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
