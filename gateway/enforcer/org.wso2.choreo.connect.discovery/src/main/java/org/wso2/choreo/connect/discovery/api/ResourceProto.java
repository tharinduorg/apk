// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/Resource.proto

package org.wso2.choreo.connect.discovery.api;

public final class ResourceProto {
  private ResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Resource_SecurityEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Resource_SecurityEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_OperationPolicies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_OperationPolicies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Policy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Policy_ParametersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Policy_ParametersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!wso2/discovery/api/Resource.proto\022\022wso" +
      "2.discovery.api\032)wso2/discovery/api/endp" +
      "oint_cluster.proto\032(wso2/discovery/api/s" +
      "ecurity_scheme.proto\032*wso2/discovery/api" +
      "/mocked_api_config.proto\"\233\003\n\010Resource\022\n\n" +
      "\002id\030\001 \001(\t\022\014\n\004path\030\002 \001(\t\022.\n\007methods\030\003 \003(\013" +
      "2\035.wso2.discovery.api.Operation\022\017\n\007summa" +
      "ry\030\004 \001(\t\022\023\n\013description\030\005 \001(\t\022@\n\023product" +
      "ionEndpoints\030\006 \001(\0132#.wso2.discovery.api." +
      "EndpointCluster\022=\n\020sandboxEndpoints\030\007 \001(" +
      "\0132#.wso2.discovery.api.EndpointCluster\022<" +
      "\n\010security\030\010 \003(\0132*.wso2.discovery.api.Re" +
      "source.SecurityEntry\022\020\n\010consumes\030\t \003(\t\022\017" +
      "\n\007schemes\030\n \003(\t\022\014\n\004tags\030\013 \003(\t\032/\n\rSecurit" +
      "yEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\355" +
      "\001\n\tOperation\022\016\n\006method\030\001 \001(\t\0222\n\010security" +
      "\030\002 \003(\0132 .wso2.discovery.api.SecurityList" +
      "\022\014\n\004tier\030\003 \001(\t\022\027\n\017disableSecurity\030\004 \001(\010\022" +
      "7\n\010policies\030\005 \001(\0132%.wso2.discovery.api.O" +
      "perationPolicies\022<\n\017mockedApiConfig\030\006 \001(" +
      "\0132#.wso2.discovery.api.MockedApiConfig\"\231" +
      "\001\n\021OperationPolicies\022+\n\007request\030\001 \003(\0132\032." +
      "wso2.discovery.api.Policy\022,\n\010response\030\002 " +
      "\003(\0132\032.wso2.discovery.api.Policy\022)\n\005fault" +
      "\030\003 \003(\0132\032.wso2.discovery.api.Policy\"\213\001\n\006P" +
      "olicy\022\016\n\006action\030\001 \001(\t\022>\n\nparameters\030\002 \003(" +
      "\0132*.wso2.discovery.api.Policy.Parameters" +
      "Entry\0321\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t\022\r\n" +
      "\005value\030\002 \001(\t:\0028\001Bw\n%org.wso2.choreo.conn" +
      "ect.discovery.apiB\rResourceProtoP\001Z=gith" +
      "ub.com/envoyproxy/go-control-plane/wso2/" +
      "discovery/api;apib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.choreo.connect.discovery.api.EndpointClusterProto.getDescriptor(),
          org.wso2.choreo.connect.discovery.api.SecuritySchemeProto.getDescriptor(),
          org.wso2.choreo.connect.discovery.api.MockedApiConfigProto.getDescriptor(),
        });
    internal_static_wso2_discovery_api_Resource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_api_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Resource_descriptor,
        new java.lang.String[] { "Id", "Path", "Methods", "Summary", "Description", "ProductionEndpoints", "SandboxEndpoints", "Security", "Consumes", "Schemes", "Tags", });
    internal_static_wso2_discovery_api_Resource_SecurityEntry_descriptor =
      internal_static_wso2_discovery_api_Resource_descriptor.getNestedTypes().get(0);
    internal_static_wso2_discovery_api_Resource_SecurityEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Resource_SecurityEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_wso2_discovery_api_Operation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wso2_discovery_api_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Operation_descriptor,
        new java.lang.String[] { "Method", "Security", "Tier", "DisableSecurity", "Policies", "MockedApiConfig", });
    internal_static_wso2_discovery_api_OperationPolicies_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wso2_discovery_api_OperationPolicies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_OperationPolicies_descriptor,
        new java.lang.String[] { "Request", "Response", "Fault", });
    internal_static_wso2_discovery_api_Policy_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_wso2_discovery_api_Policy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Policy_descriptor,
        new java.lang.String[] { "Action", "Parameters", });
    internal_static_wso2_discovery_api_Policy_ParametersEntry_descriptor =
      internal_static_wso2_discovery_api_Policy_descriptor.getNestedTypes().get(0);
    internal_static_wso2_discovery_api_Policy_ParametersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Policy_ParametersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.wso2.choreo.connect.discovery.api.EndpointClusterProto.getDescriptor();
    org.wso2.choreo.connect.discovery.api.SecuritySchemeProto.getDescriptor();
    org.wso2.choreo.connect.discovery.api.MockedApiConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}