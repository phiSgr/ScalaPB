// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



/** Describes a value within an enum.
  */
@SerialVersionUID(0L)
final case class EnumValueDescriptorProto(
    name: scala.Option[String] = None,
    number: scala.Option[Int] = None,
    options: scala.Option[com.google.protobuf.descriptor.EnumValueOptions] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[EnumValueDescriptorProto] with com.trueaccord.lenses.Updatable[EnumValueDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      if (number.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, number.get) }
      if (options.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      name.foreach { __v =>
        _output__.writeString(1, __v)
      };
      number.foreach { __v =>
        _output__.writeInt32(2, __v)
      };
      options.foreach { __v =>
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.EnumValueDescriptorProto = {
      var __name = this.name
      var __number = this.number
      var __options = this.options
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 16 =>
            __number = Some(_input__.readInt32())
          case 26 =>
            __options = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.EnumValueOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.EnumValueDescriptorProto(
          name = __name,
          number = __number,
          options = __options
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: EnumValueDescriptorProto = copy(name = None)
    def withName(__v: String): EnumValueDescriptorProto = copy(name = Some(__v))
    def getNumber: Int = number.getOrElse(0)
    def clearNumber: EnumValueDescriptorProto = copy(number = None)
    def withNumber(__v: Int): EnumValueDescriptorProto = copy(number = Some(__v))
    def getOptions: com.google.protobuf.descriptor.EnumValueOptions = options.getOrElse(com.google.protobuf.descriptor.EnumValueOptions.defaultInstance)
    def clearOptions: EnumValueDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.EnumValueOptions): EnumValueDescriptorProto = copy(options = Some(__v))
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      __fieldNumber match {
        case 1 => name.orNull
        case 2 => number.orNull
        case 3 => options.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      __field.number match {
        case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => number.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => options.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.EnumValueDescriptorProto
}

object EnumValueDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumValueDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.EnumValueDescriptorProto] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.EnumValueDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.EnumValueDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.EnumValueOptions]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.EnumValueDescriptorProto] = _root_.scalapb.descriptors.Reads(_ match {
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.EnumValueDescriptorProto(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[scala.Option[String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[scala.Option[Int]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[scala.Option[com.google.protobuf.descriptor.EnumValueOptions]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  })
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __fieldNumber match {
      case 3 => __out = com.google.protobuf.descriptor.EnumValueOptions
    }
    __out
  }
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.EnumValueDescriptorProto(
  )
  implicit class EnumValueDescriptorProtoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumValueDescriptorProto]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.EnumValueDescriptorProto](_l) {
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def number: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getNumber)((c_, f_) => c_.copy(number = Some(f_)))
    def optionalNumber: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.number)((c_, f_) => c_.copy(number = f_))
    def options: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.EnumValueOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.EnumValueOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val NUMBER_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
}
