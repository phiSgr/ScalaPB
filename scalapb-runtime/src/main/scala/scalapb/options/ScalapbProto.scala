// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

object ScalapbProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      scalapb.options.ScalaPbOptions,
      scalapb.options.MessageOptions,
      scalapb.options.FieldOptions,
      scalapb.options.EnumOptions,
      scalapb.options.EnumValueOptions,
      scalapb.options.OneofOptions
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChVzY2FsYXBiL3NjYWxhcGIucHJvdG8SB3NjYWxhcGIaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIsgSCg5TY
  2FsYVBiT3B0aW9ucxIzCgxwYWNrYWdlX25hbWUYASABKAlCEOI/DRILcGFja2FnZU5hbWVSC3BhY2thZ2VOYW1lEjMKDGZsYXRfc
  GFja2FnZRgCIAEoCEIQ4j8NEgtmbGF0UGFja2FnZVILZmxhdFBhY2thZ2USIwoGaW1wb3J0GAMgAygJQgviPwgSBmltcG9ydFIGa
  W1wb3J0EikKCHByZWFtYmxlGAQgAygJQg3iPwoSCHByZWFtYmxlUghwcmVhbWJsZRIwCgtzaW5nbGVfZmlsZRgFIAEoCEIP4j8ME
  gpzaW5nbGVGaWxlUgpzaW5nbGVGaWxlEkwKFW5vX3ByaW1pdGl2ZV93cmFwcGVycxgHIAEoCEIY4j8VEhNub1ByaW1pdGl2ZVdyY
  XBwZXJzUhNub1ByaW1pdGl2ZVdyYXBwZXJzEkUKEnByaW1pdGl2ZV93cmFwcGVycxgGIAEoCEIW4j8TEhFwcmltaXRpdmVXcmFwc
  GVyc1IRcHJpbWl0aXZlV3JhcHBlcnMSPAoPY29sbGVjdGlvbl90eXBlGAggASgJQhPiPxASDmNvbGxlY3Rpb25UeXBlUg5jb2xsZ
  WN0aW9uVHlwZRJYChdwcmVzZXJ2ZV91bmtub3duX2ZpZWxkcxgJIAEoCDoEdHJ1ZUIa4j8XEhVwcmVzZXJ2ZVVua25vd25GaWVsZ
  HNSFXByZXNlcnZlVW5rbm93bkZpZWxkcxIwCgtvYmplY3RfbmFtZRgKIAEoCUIP4j8MEgpvYmplY3ROYW1lUgpvYmplY3ROYW1lE
  kYKBXNjb3BlGAsgASgOMiQuc2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5PcHRpb25zU2NvcGVCCuI/BxIFc2NvcGVSBXNjb3BlEikKB
  mxlbnNlcxgMIAEoCDoEdHJ1ZUIL4j8IEgZsZW5zZXNSBmxlbnNlcxJQChdyZXRhaW5fc291cmNlX2NvZGVfaW5mbxgNIAEoCEIZ4
  j8WEhRyZXRhaW5Tb3VyY2VDb2RlSW5mb1IUcmV0YWluU291cmNlQ29kZUluZm8SJwoIbWFwX3R5cGUYDiABKAlCDOI/CRIHbWFwV
  HlwZVIHbWFwVHlwZRJpCiBub19kZWZhdWx0X3ZhbHVlc19pbl9jb25zdHJ1Y3RvchgPIAEoCEIh4j8eEhxub0RlZmF1bHRWYWx1Z
  XNJbkNvbnN0cnVjdG9yUhxub0RlZmF1bHRWYWx1ZXNJbkNvbnN0cnVjdG9yEmkKEWVudW1fdmFsdWVfbmFtaW5nGBAgASgOMicuc
  2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5FbnVtVmFsdWVOYW1pbmdCFOI/ERIPZW51bVZhbHVlTmFtaW5nUg9lbnVtVmFsdWVOYW1pb
  mcSRwoRZW51bV9zdHJpcF9wcmVmaXgYESABKAg6BWZhbHNlQhTiPxESD2VudW1TdHJpcFByZWZpeFIPZW51bVN0cmlwUHJlZml4E
  i0KCmJ5dGVzX3R5cGUYFSABKAlCDuI/CxIJYnl0ZXNUeXBlUglieXRlc1R5cGUSPwoQamF2YV9jb252ZXJzaW9ucxgXIAEoCEIU4
  j8REg9qYXZhQ29udmVyc2lvbnNSD2phdmFDb252ZXJzaW9ucxJxChNhdXhfbWVzc2FnZV9vcHRpb25zGBIgAygLMikuc2NhbGFwY
  i5TY2FsYVBiT3B0aW9ucy5BdXhNZXNzYWdlT3B0aW9uc0IW4j8TEhFhdXhNZXNzYWdlT3B0aW9uc1IRYXV4TWVzc2FnZU9wdGlvb
  nMSaQoRYXV4X2ZpZWxkX29wdGlvbnMYEyADKAsyJy5zY2FsYXBiLlNjYWxhUGJPcHRpb25zLkF1eEZpZWxkT3B0aW9uc0IU4j8RE
  g9hdXhGaWVsZE9wdGlvbnNSD2F1eEZpZWxkT3B0aW9ucxJlChBhdXhfZW51bV9vcHRpb25zGBQgAygLMiYuc2NhbGFwYi5TY2FsY
  VBiT3B0aW9ucy5BdXhFbnVtT3B0aW9uc0IT4j8QEg5hdXhFbnVtT3B0aW9uc1IOYXV4RW51bU9wdGlvbnMSegoWYXV4X2VudW1fd
  mFsdWVfb3B0aW9ucxgWIAMoCzIrLnNjYWxhcGIuU2NhbGFQYk9wdGlvbnMuQXV4RW51bVZhbHVlT3B0aW9uc0IY4j8VEhNhdXhFb
  nVtVmFsdWVPcHRpb25zUhNhdXhFbnVtVmFsdWVPcHRpb25zEmEKHXRlc3Rfb25seV9ub19qYXZhX2NvbnZlcnNpb25zGOkHIAEoC
  EIe4j8bEhl0ZXN0T25seU5vSmF2YUNvbnZlcnNpb25zUhl0ZXN0T25seU5vSmF2YUNvbnZlcnNpb25zGnkKEUF1eE1lc3NhZ2VPc
  HRpb25zEiMKBnRhcmdldBgBIAEoCUIL4j8IEgZ0YXJnZXRSBnRhcmdldBI/CgdvcHRpb25zGAIgASgLMhcuc2NhbGFwYi5NZXNzY
  WdlT3B0aW9uc0IM4j8JEgdvcHRpb25zUgdvcHRpb25zGnUKD0F1eEZpZWxkT3B0aW9ucxIjCgZ0YXJnZXQYASABKAlCC+I/CBIGd
  GFyZ2V0UgZ0YXJnZXQSPQoHb3B0aW9ucxgCIAEoCzIVLnNjYWxhcGIuRmllbGRPcHRpb25zQgziPwkSB29wdGlvbnNSB29wdGlvb
  nMacwoOQXV4RW51bU9wdGlvbnMSIwoGdGFyZ2V0GAEgASgJQgviPwgSBnRhcmdldFIGdGFyZ2V0EjwKB29wdGlvbnMYAiABKAsyF
  C5zY2FsYXBiLkVudW1PcHRpb25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMafQoTQXV4RW51bVZhbHVlT3B0aW9ucxIjCgZ0YXJnZ
  XQYASABKAlCC+I/CBIGdGFyZ2V0UgZ0YXJnZXQSQQoHb3B0aW9ucxgCIAEoCzIZLnNjYWxhcGIuRW51bVZhbHVlT3B0aW9uc0IM4
  j8JEgdvcHRpb25zUgdvcHRpb25zIiUKDE9wdGlvbnNTY29wZRIICgRGSUxFEAASCwoHUEFDS0FHRRABIjIKD0VudW1WYWx1ZU5hb
  WluZxIPCgtBU19JTl9QUk9UTxAAEg4KCkNBTUVMX0NBU0UQASoJCJBOEICAgIACIvUDCg5NZXNzYWdlT3B0aW9ucxImCgdleHRlb
  mRzGAEgAygJQgziPwkSB2V4dGVuZHNSB2V4dGVuZHMSQgoRY29tcGFuaW9uX2V4dGVuZHMYAiADKAlCFeI/EhIQY29tcGFuaW9uR
  Xh0ZW5kc1IQY29tcGFuaW9uRXh0ZW5kcxIyCgthbm5vdGF0aW9ucxgDIAMoCUIQ4j8NEgthbm5vdGF0aW9uc1ILYW5ub3RhdGlvb
  nMSHQoEdHlwZRgEIAEoCUIJ4j8GEgR0eXBlUgR0eXBlEk4KFWNvbXBhbmlvbl9hbm5vdGF0aW9ucxgFIAMoCUIZ4j8WEhRjb21wY
  W5pb25Bbm5vdGF0aW9uc1IUY29tcGFuaW9uQW5ub3RhdGlvbnMSSQoUc2VhbGVkX29uZW9mX2V4dGVuZHMYBiADKAlCF+I/FBISc
  2VhbGVkT25lb2ZFeHRlbmRzUhJzZWFsZWRPbmVvZkV4dGVuZHMSIQoGbm9fYm94GAcgASgIQgriPwcSBW5vQm94UgVub0JveBJbC
  hp1bmtub3duX2ZpZWxkc19hbm5vdGF0aW9ucxgIIAMoCUId4j8aEhh1bmtub3duRmllbGRzQW5ub3RhdGlvbnNSGHVua25vd25Ga
  WVsZHNBbm5vdGF0aW9ucyoJCJBOEICAgIACIv0CCgxGaWVsZE9wdGlvbnMSHQoEdHlwZRgBIAEoCUIJ4j8GEgR0eXBlUgR0eXBlE
  i0KCnNjYWxhX25hbWUYAiABKAlCDuI/CxIJc2NhbGFOYW1lUglzY2FsYU5hbWUSPAoPY29sbGVjdGlvbl90eXBlGAMgASgJQhPiP
  xASDmNvbGxlY3Rpb25UeXBlUg5jb2xsZWN0aW9uVHlwZRInCghrZXlfdHlwZRgEIAEoCUIM4j8JEgdrZXlUeXBlUgdrZXlUeXBlE
  i0KCnZhbHVlX3R5cGUYBSABKAlCDuI/CxIJdmFsdWVUeXBlUgl2YWx1ZVR5cGUSMgoLYW5ub3RhdGlvbnMYBiADKAlCEOI/DRILY
  W5ub3RhdGlvbnNSC2Fubm90YXRpb25zEicKCG1hcF90eXBlGAcgASgJQgziPwkSB21hcFR5cGVSB21hcFR5cGUSIQoGbm9fYm94G
  B4gASgIQgriPwcSBW5vQm94UgVub0JveCoJCJBOEICAgIACIqMBCgtFbnVtT3B0aW9ucxImCgdleHRlbmRzGAEgAygJQgziPwkSB
  2V4dGVuZHNSB2V4dGVuZHMSQgoRY29tcGFuaW9uX2V4dGVuZHMYAiADKAlCFeI/EhIQY29tcGFuaW9uRXh0ZW5kc1IQY29tcGFua
  W9uRXh0ZW5kcxIdCgR0eXBlGAMgASgJQgniPwYSBHR5cGVSBHR5cGUqCQiQThCAgICAAiJ0ChBFbnVtVmFsdWVPcHRpb25zEiYKB
  2V4dGVuZHMYASADKAlCDOI/CRIHZXh0ZW5kc1IHZXh0ZW5kcxItCgpzY2FsYV9uYW1lGAIgASgJQg7iPwsSCXNjYWxhTmFtZVIJc
  2NhbGFOYW1lKgkIkE4QgICAgAIicAoMT25lb2ZPcHRpb25zEiYKB2V4dGVuZHMYASADKAlCDOI/CRIHZXh0ZW5kc1IHZXh0ZW5kc
  xItCgpzY2FsYV9uYW1lGAIgASgJQg7iPwsSCXNjYWxhTmFtZVIJc2NhbGFOYW1lKgkIkE4QgICAgAI6UAoHb3B0aW9ucxIcLmdvb
  2dsZS5wcm90b2J1Zi5GaWxlT3B0aW9ucxj8ByABKAsyFy5zY2FsYXBiLlNjYWxhUGJPcHRpb25zUgdvcHRpb25zOlMKB21lc3NhZ
  2USHy5nb29nbGUucHJvdG9idWYuTWVzc2FnZU9wdGlvbnMY/AcgASgLMhcuc2NhbGFwYi5NZXNzYWdlT3B0aW9uc1IHbWVzc2FnZ
  TpLCgVmaWVsZBIdLmdvb2dsZS5wcm90b2J1Zi5GaWVsZE9wdGlvbnMY/AcgASgLMhUuc2NhbGFwYi5GaWVsZE9wdGlvbnNSBWZpZ
  WxkOlYKDGVudW1fb3B0aW9ucxIcLmdvb2dsZS5wcm90b2J1Zi5FbnVtT3B0aW9ucxj8ByABKAsyFC5zY2FsYXBiLkVudW1PcHRpb
  25zUgtlbnVtT3B0aW9uczpcCgplbnVtX3ZhbHVlEiEuZ29vZ2xlLnByb3RvYnVmLkVudW1WYWx1ZU9wdGlvbnMY/AcgASgLMhkuc
  2NhbGFwYi5FbnVtVmFsdWVPcHRpb25zUgllbnVtVmFsdWU6SwoFb25lb2YSHS5nb29nbGUucHJvdG9idWYuT25lb2ZPcHRpb25zG
  PwHIAEoCzIVLnNjYWxhcGIuT25lb2ZPcHRpb25zUgVvbmVvZkInCg9zY2FsYXBiLm9wdGlvbnPiPxMKD3NjYWxhcGIub3B0aW9uc
  xAB"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val options: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FileOptions, _root_.scala.Option[scalapb.options.ScalaPbOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.ScalaPbOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val message: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MessageOptions, _root_.scala.Option[scalapb.options.MessageOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.MessageOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val field: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FieldOptions, _root_.scala.Option[scalapb.options.FieldOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.FieldOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumOptions: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumOptions, _root_.scala.Option[scalapb.options.EnumOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumValue: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumValueOptions, _root_.scala.Option[scalapb.options.EnumValueOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumValueOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val oneof: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.OneofOptions, _root_.scala.Option[scalapb.options.OneofOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.OneofOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}