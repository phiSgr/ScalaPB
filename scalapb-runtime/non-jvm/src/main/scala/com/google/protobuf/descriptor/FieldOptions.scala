// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** @param ctype
  *   The ctype option instructs the C++ code generator to use a different
  *   representation of the field than it normally would.  See the specific
  *   options below.  This option is not yet implemented in the open source
  *   release -- sorry, we'll try to include it in a future version!
  * @param packed
  *   The packed option can be enabled for repeated primitive fields to enable
  *   a more efficient representation on the wire. Rather than repeatedly
  *   writing the tag and type for each element, the entire array is encoded as
  *   a single length-delimited blob. In proto3, only explicit setting it to
  *   false will avoid using packed encoding.
  * @param jstype
  *   The jstype option determines the JavaScript type used for values of the
  *   field.  The option is permitted only for 64 bit integral and fixed types
  *   (int64, uint64, sint64, fixed64, sfixed64).  By default these types are
  *   represented as JavaScript strings.  This avoids loss of precision that can
  *   happen when a large value is converted to a floating point JavaScript
  *   numbers.  Specifying JS_NUMBER for the jstype causes the generated
  *   JavaScript code to use the JavaScript "number" type instead of strings.
  *   This option is an enum to permit additional types to be added,
  *   e.g. goog.math.Integer.
  * @param lazy
  *   Should this field be parsed lazily?  Lazy applies only to message-type
  *   fields.  It means that when the outer message is initially parsed, the
  *   inner message's contents will not be parsed but instead stored in encoded
  *   form.  The inner message will actually be parsed when it is first accessed.
  *  
  *   This is only a hint.  Implementations are free to choose whether to use
  *   eager or lazy parsing regardless of the value of this option.  However,
  *   setting this option true suggests that the protocol author believes that
  *   using lazy parsing on this field is worth the additional bookkeeping
  *   overhead typically needed to implement it.
  *  
  *   This option does not affect the public interface of any generated code;
  *   all method signatures remain the same.  Furthermore, thread-safety of the
  *   interface is not affected by this option; const methods remain safe to
  *   call from multiple threads concurrently, while non-const methods continue
  *   to require exclusive access.
  *  
  *  
  *   Note that implementations may choose not to check required fields within
  *   a lazy sub-message.  That is, calling IsInitialized() on the outer message
  *   may return true even if the inner message has missing required fields.
  *   This is necessary because otherwise the inner message would have to be
  *   parsed in order to perform the check, defeating the purpose of lazy
  *   parsing.  An implementation which chooses not to check required fields
  *   must be consistent about it.  That is, for any particular sub-message, the
  *   implementation must either *always* check its required fields, or *never*
  *   check its required fields, regardless of whether or not the message has
  *   been parsed.
  * @param deprecated
  *   Is this field deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for accessors, or it will be completely ignored; in the very least, this
  *   is a formalization for deprecating fields.
  * @param weak
  *   For Google-internal migration only. Do not use.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class FieldOptions(
    ctype: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.CType] = None,
    packed: _root_.scala.Option[_root_.scala.Boolean] = None,
    jstype: _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.JSType] = None,
    `lazy`: _root_.scala.Option[_root_.scala.Boolean] = None,
    deprecated: _root_.scala.Option[_root_.scala.Boolean] = None,
    weak: _root_.scala.Option[_root_.scala.Boolean] = None,
    uninterpretedOption: _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.collection.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet()
    ) extends scalapb.GeneratedMessage with scalapb.Message[FieldOptions] with scalapb.lenses.Updatable[FieldOptions] with _root_.scalapb.ExtendableMessage[FieldOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (ctype.isDefined) {
        val __value = ctype.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value.value)
      };
      if (packed.isDefined) {
        val __value = packed.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
      };
      if (jstype.isDefined) {
        val __value = jstype.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(6, __value.value)
      };
      if (`lazy`.isDefined) {
        val __value = `lazy`.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
      };
      if (deprecated.isDefined) {
        val __value = deprecated.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
      };
      if (weak.isDefined) {
        val __value = weak.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(10, __value)
      };
      uninterpretedOption.foreach { __item =>
        val __value = __item
        __size += 2 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      ctype.foreach { __v =>
        val __m = __v
        _output__.writeEnum(1, __m.value)
      };
      packed.foreach { __v =>
        val __m = __v
        _output__.writeBool(2, __m)
      };
      deprecated.foreach { __v =>
        val __m = __v
        _output__.writeBool(3, __m)
      };
      `lazy`.foreach { __v =>
        val __m = __v
        _output__.writeBool(5, __m)
      };
      jstype.foreach { __v =>
        val __m = __v
        _output__.writeEnum(6, __m.value)
      };
      weak.foreach { __v =>
        val __m = __v
        _output__.writeBool(10, __m)
      };
      uninterpretedOption.foreach { __v =>
        val __m = __v
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.FieldOptions = {
      var __ctype = this.ctype
      var __packed = this.packed
      var __jstype = this.jstype
      var __lazy = this.`lazy`
      var __deprecated = this.deprecated
      var __weak = this.weak
      val __uninterpretedOption = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      val _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __ctype = Option(com.google.protobuf.descriptor.FieldOptions.CType.fromValue(_input__.readEnum()))
          case 16 =>
            __packed = Option(_input__.readBool())
          case 48 =>
            __jstype = Option(com.google.protobuf.descriptor.FieldOptions.JSType.fromValue(_input__.readEnum()))
          case 40 =>
            __lazy = Option(_input__.readBool())
          case 24 =>
            __deprecated = Option(_input__.readBool())
          case 80 =>
            __weak = Option(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.descriptor.FieldOptions(
          ctype = __ctype,
          packed = __packed,
          jstype = __jstype,
          `lazy` = __lazy,
          deprecated = __deprecated,
          weak = __weak,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = _unknownFields__.result()
      )
    }
    def getCtype: com.google.protobuf.descriptor.FieldOptions.CType = ctype.getOrElse(com.google.protobuf.descriptor.FieldOptions.CType.STRING)
    def clearCtype: FieldOptions = copy(ctype = None)
    def withCtype(__v: com.google.protobuf.descriptor.FieldOptions.CType): FieldOptions = copy(ctype = Option(__v))
    def getPacked: _root_.scala.Boolean = packed.getOrElse(false)
    def clearPacked: FieldOptions = copy(packed = None)
    def withPacked(__v: _root_.scala.Boolean): FieldOptions = copy(packed = Option(__v))
    def getJstype: com.google.protobuf.descriptor.FieldOptions.JSType = jstype.getOrElse(com.google.protobuf.descriptor.FieldOptions.JSType.JS_NORMAL)
    def clearJstype: FieldOptions = copy(jstype = None)
    def withJstype(__v: com.google.protobuf.descriptor.FieldOptions.JSType): FieldOptions = copy(jstype = Option(__v))
    def getLazy: _root_.scala.Boolean = `lazy`.getOrElse(false)
    def clearLazy: FieldOptions = copy(`lazy` = None)
    def withLazy(__v: _root_.scala.Boolean): FieldOptions = copy(`lazy` = Option(__v))
    def getDeprecated: _root_.scala.Boolean = deprecated.getOrElse(false)
    def clearDeprecated: FieldOptions = copy(deprecated = None)
    def withDeprecated(__v: _root_.scala.Boolean): FieldOptions = copy(deprecated = Option(__v))
    def getWeak: _root_.scala.Boolean = weak.getOrElse(false)
    def clearWeak: FieldOptions = copy(weak = None)
    def withWeak(__v: _root_.scala.Boolean): FieldOptions = copy(weak = Option(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.collection.Seq.empty)
    def addUninterpretedOption(__vs: com.google.protobuf.descriptor.UninterpretedOption*): FieldOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: TraversableOnce[com.google.protobuf.descriptor.UninterpretedOption]): FieldOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]): FieldOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => ctype.map(_.javaValueDescriptor).orNull
        case 2 => packed.orNull
        case 6 => jstype.map(_.javaValueDescriptor).orNull
        case 5 => `lazy`.orNull
        case 3 => deprecated.orNull
        case 10 => weak.orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => ctype.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => packed.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => jstype.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => `lazy`.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => deprecated.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => weak.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 999 => _root_.scalapb.descriptors.PRepeated(uninterpretedOption.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.FieldOptions
}

object FieldOptions extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.descriptor.FieldOptions = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.FieldOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.protobuf.descriptor.FieldOptions.CType.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[_root_.scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.protobuf.descriptor.FieldOptions.JSType.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.getOrElse(__fields.get(6), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.FieldOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.FieldOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.FieldOptions.CType.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => com.google.protobuf.descriptor.FieldOptions.JSType.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(11)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(11)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.google.protobuf.descriptor.FieldOptions.CType
      case 6 => com.google.protobuf.descriptor.FieldOptions.JSType
    }
  }
  lazy val defaultInstance = com.google.protobuf.descriptor.FieldOptions(
  )
  sealed trait CType extends _root_.scalapb.GeneratedEnum {
    type EnumType = CType
    def isString: _root_.scala.Boolean = false
    def isCord: _root_.scala.Boolean = false
    def isStringPiece: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[CType] = com.google.protobuf.descriptor.FieldOptions.CType
  }
  
  object CType extends _root_.scalapb.GeneratedEnumCompanion[CType] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[CType] = this
    @SerialVersionUID(0L)
    case object STRING extends CType {
      val value = 0
      val index = 0
      val name = "STRING"
      override def isString: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CORD extends CType {
      val value = 1
      val index = 1
      val name = "CORD"
      override def isCord: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object STRING_PIECE extends CType {
      val value = 2
      val index = 2
      val name = "STRING_PIECE"
      override def isStringPiece: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends CType with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(STRING, CORD, STRING_PIECE)
    def fromValue(value: _root_.scala.Int): CType = value match {
      case 0 => STRING
      case 1 => CORD
      case 2 => STRING_PIECE
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.scalaDescriptor.enums(0)
  }
  sealed trait JSType extends _root_.scalapb.GeneratedEnum {
    type EnumType = JSType
    def isJsNormal: _root_.scala.Boolean = false
    def isJsString: _root_.scala.Boolean = false
    def isJsNumber: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[JSType] = com.google.protobuf.descriptor.FieldOptions.JSType
  }
  
  object JSType extends _root_.scalapb.GeneratedEnumCompanion[JSType] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[JSType] = this
    @SerialVersionUID(0L)
    case object JS_NORMAL extends JSType {
      val value = 0
      val index = 0
      val name = "JS_NORMAL"
      override def isJsNormal: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object JS_STRING extends JSType {
      val value = 1
      val index = 1
      val name = "JS_STRING"
      override def isJsString: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object JS_NUMBER extends JSType {
      val value = 2
      val index = 2
      val name = "JS_NUMBER"
      override def isJsNumber: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends JSType with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(JS_NORMAL, JS_STRING, JS_NUMBER)
    def fromValue(value: _root_.scala.Int): JSType = value match {
      case 0 => JS_NORMAL
      case 1 => JS_STRING
      case 2 => JS_NUMBER
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.javaDescriptor.getEnumTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldOptions.scalaDescriptor.enums(1)
  }
  implicit class FieldOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.FieldOptions](_l) {
    def ctype: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions.CType] = field(_.getCtype)((c_, f_) => c_.copy(ctype = Option(f_)))
    def optionalCtype: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.CType]] = field(_.ctype)((c_, f_) => c_.copy(ctype = f_))
    def packed: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getPacked)((c_, f_) => c_.copy(packed = Option(f_)))
    def optionalPacked: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.packed)((c_, f_) => c_.copy(packed = f_))
    def jstype: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions.JSType] = field(_.getJstype)((c_, f_) => c_.copy(jstype = Option(f_)))
    def optionalJstype: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.descriptor.FieldOptions.JSType]] = field(_.jstype)((c_, f_) => c_.copy(jstype = f_))
    def `lazy`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getLazy)((c_, f_) => c_.copy(`lazy` = Option(f_)))
    def optionalLazy: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.`lazy`)((c_, f_) => c_.copy(`lazy` = f_))
    def deprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Option(f_)))
    def optionalDeprecated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def weak: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getWeak)((c_, f_) => c_.copy(weak = Option(f_)))
    def optionalWeak: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.weak)((c_, f_) => c_.copy(weak = f_))
    def uninterpretedOption: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val CTYPE_FIELD_NUMBER = 1
  final val PACKED_FIELD_NUMBER = 2
  final val JSTYPE_FIELD_NUMBER = 6
  final val LAZY_FIELD_NUMBER = 5
  final val DEPRECATED_FIELD_NUMBER = 3
  final val WEAK_FIELD_NUMBER = 10
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
}
