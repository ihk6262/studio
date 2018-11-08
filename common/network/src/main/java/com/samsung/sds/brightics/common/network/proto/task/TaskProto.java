// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package com.samsung.sds.brightics.common.network.proto.task;

public final class TaskProto {
  private TaskProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_task_ExecuteTaskMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_task_ExecuteTaskMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_task_StopTaskMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_task_StopTaskMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_samsung_sds_brightics_common_network_proto_task_ResultTaskMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_samsung_sds_brightics_common_network_proto_task_ResultTaskMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntask.proto\0223com.samsung.sds.brightics." +
      "common.network.proto.task\032\031google/protob" +
      "uf/any.proto\032\014common.proto\"h\n\022ExecuteTas" +
      "kMessage\022\016\n\006taskId\030\001 \001(\t\022\014\n\004user\030\002 \001(\t\022\014" +
      "\n\004name\030\003 \001(\t\022\022\n\nparameters\030\004 \001(\t\022\022\n\nattr" +
      "ibutes\030\005 \001(\t\"T\n\017StopTaskMessage\022\024\n\014targe" +
      "tTaskId\030\001 \001(\t\022\014\n\004user\030\002 \001(\t\022\014\n\004name\030\003 \001(" +
      "\t\022\017\n\007context\030\004 \001(\t\"\277\001\n\021ResultTaskMessage" +
      "\022\020\n\010clientId\030\001 \001(\t\022\016\n\006taskId\030\002 \001(\t\022\014\n\004us" +
      "er\030\003 \001(\t\022T\n\rmessageStatus\030\005 \001(\0162=.com.sa" +
      "msung.sds.brightics.common.network.proto" +
      ".MessageStatus\022$\n\006result\030\007 \001(\0132\024.google." +
      "protobuf.Any2\243\005\n\013TaskService\022\246\001\n\020receive" +
      "AsyncTask\022G.com.samsung.sds.brightics.co" +
      "mmon.network.proto.task.ExecuteTaskMessa" +
      "ge\032G.com.samsung.sds.brightics.common.ne" +
      "twork.proto.task.ExecuteTaskMessage\"\000\022\244\001" +
      "\n\017receiveSyncTask\022G.com.samsung.sds.brig" +
      "htics.common.network.proto.task.ExecuteT" +
      "askMessage\032F.com.samsung.sds.brightics.c" +
      "ommon.network.proto.task.ResultTaskMessa" +
      "ge\"\000\022\232\001\n\010stopTask\022D.com.samsung.sds.brig" +
      "htics.common.network.proto.task.StopTask" +
      "Message\032F.com.samsung.sds.brightics.comm" +
      "on.network.proto.task.ResultTaskMessage\"" +
      "\000\022\246\001\n\021receiveTaskResult\022F.com.samsung.sd" +
      "s.brightics.common.network.proto.task.Re" +
      "sultTaskMessage\032G.com.samsung.sds.bright" +
      "ics.common.network.proto.task.ExecuteTas" +
      "kMessage\"\000B\rB\tTaskProtoP\001b\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
          com.samsung.sds.brightics.common.network.proto.CommonProto.getDescriptor(),
        }, assigner);
    internal_static_com_samsung_sds_brightics_common_network_proto_task_ExecuteTaskMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_samsung_sds_brightics_common_network_proto_task_ExecuteTaskMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_task_ExecuteTaskMessage_descriptor,
        new java.lang.String[] { "TaskId", "User", "Name", "Parameters", "Attributes", });
    internal_static_com_samsung_sds_brightics_common_network_proto_task_StopTaskMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_samsung_sds_brightics_common_network_proto_task_StopTaskMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_task_StopTaskMessage_descriptor,
        new java.lang.String[] { "TargetTaskId", "User", "Name", "Context", });
    internal_static_com_samsung_sds_brightics_common_network_proto_task_ResultTaskMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_samsung_sds_brightics_common_network_proto_task_ResultTaskMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_samsung_sds_brightics_common_network_proto_task_ResultTaskMessage_descriptor,
        new java.lang.String[] { "ClientId", "TaskId", "User", "MessageStatus", "Result", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.samsung.sds.brightics.common.network.proto.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
