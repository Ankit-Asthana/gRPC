// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package helloworld;

public final class Helloworld {
  private Helloworld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_RequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_RequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_ResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_ResponseMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloworld.proto\022\nhelloworld\"\036\n\016Reques" +
      "tMessage\022\014\n\004name\030\001 \001(\t\"\"\n\017ResponseMessag" +
      "e\022\017\n\007message\030\001 \001(\t2X\n\017GreetingService\022E\n" +
      "\010SayHello\022\032.helloworld.RequestMessage\032\033." +
      "helloworld.ResponseMessage\"\000B\016\n\nhellowor" +
      "ldP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_helloworld_RequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_RequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_RequestMessage_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_helloworld_ResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_ResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_ResponseMessage_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
