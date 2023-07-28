/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class GetOpenTxnsResponse implements org.apache.thrift.TBase<GetOpenTxnsResponse, GetOpenTxnsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetOpenTxnsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetOpenTxnsResponse");

  private static final org.apache.thrift.protocol.TField TXN_HIGH_WATER_MARK_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_high_water_mark", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField OPEN_TXNS_FIELD_DESC = new org.apache.thrift.protocol.TField("open_txns", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField MIN_OPEN_TXN_FIELD_DESC = new org.apache.thrift.protocol.TField("min_open_txn", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetOpenTxnsResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetOpenTxnsResponseTupleSchemeFactory();

  private long txn_high_water_mark; // required
  private @org.apache.thrift.annotation.Nullable java.util.Set<java.lang.Long> open_txns; // required
  private long min_open_txn; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXN_HIGH_WATER_MARK((short)1, "txn_high_water_mark"),
    OPEN_TXNS((short)2, "open_txns"),
    MIN_OPEN_TXN((short)3, "min_open_txn");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TXN_HIGH_WATER_MARK
          return TXN_HIGH_WATER_MARK;
        case 2: // OPEN_TXNS
          return OPEN_TXNS;
        case 3: // MIN_OPEN_TXN
          return MIN_OPEN_TXN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TXN_HIGH_WATER_MARK_ISSET_ID = 0;
  private static final int __MIN_OPEN_TXN_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MIN_OPEN_TXN};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXN_HIGH_WATER_MARK, new org.apache.thrift.meta_data.FieldMetaData("txn_high_water_mark", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OPEN_TXNS, new org.apache.thrift.meta_data.FieldMetaData("open_txns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.MIN_OPEN_TXN, new org.apache.thrift.meta_data.FieldMetaData("min_open_txn", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetOpenTxnsResponse.class, metaDataMap);
  }

  public GetOpenTxnsResponse() {
  }

  public GetOpenTxnsResponse(
    long txn_high_water_mark,
    java.util.Set<java.lang.Long> open_txns)
  {
    this();
    this.txn_high_water_mark = txn_high_water_mark;
    setTxn_high_water_markIsSet(true);
    this.open_txns = open_txns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetOpenTxnsResponse(GetOpenTxnsResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txn_high_water_mark = other.txn_high_water_mark;
    if (other.isSetOpen_txns()) {
      java.util.Set<java.lang.Long> __this__open_txns = new java.util.HashSet<java.lang.Long>(other.open_txns);
      this.open_txns = __this__open_txns;
    }
    this.min_open_txn = other.min_open_txn;
  }

  public GetOpenTxnsResponse deepCopy() {
    return new GetOpenTxnsResponse(this);
  }

  @Override
  public void clear() {
    setTxn_high_water_markIsSet(false);
    this.txn_high_water_mark = 0;
    this.open_txns = null;
    setMin_open_txnIsSet(false);
    this.min_open_txn = 0;
  }

  public long getTxn_high_water_mark() {
    return this.txn_high_water_mark;
  }

  public void setTxn_high_water_mark(long txn_high_water_mark) {
    this.txn_high_water_mark = txn_high_water_mark;
    setTxn_high_water_markIsSet(true);
  }

  public void unsetTxn_high_water_mark() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXN_HIGH_WATER_MARK_ISSET_ID);
  }

  /** Returns true if field txn_high_water_mark is set (has been assigned a value) and false otherwise */
  public boolean isSetTxn_high_water_mark() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXN_HIGH_WATER_MARK_ISSET_ID);
  }

  public void setTxn_high_water_markIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXN_HIGH_WATER_MARK_ISSET_ID, value);
  }

  public int getOpen_txnsSize() {
    return (this.open_txns == null) ? 0 : this.open_txns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getOpen_txnsIterator() {
    return (this.open_txns == null) ? null : this.open_txns.iterator();
  }

  public void addToOpen_txns(long elem) {
    if (this.open_txns == null) {
      this.open_txns = new java.util.HashSet<java.lang.Long>();
    }
    this.open_txns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Set<java.lang.Long> getOpen_txns() {
    return this.open_txns;
  }

  public void setOpen_txns(@org.apache.thrift.annotation.Nullable java.util.Set<java.lang.Long> open_txns) {
    this.open_txns = open_txns;
  }

  public void unsetOpen_txns() {
    this.open_txns = null;
  }

  /** Returns true if field open_txns is set (has been assigned a value) and false otherwise */
  public boolean isSetOpen_txns() {
    return this.open_txns != null;
  }

  public void setOpen_txnsIsSet(boolean value) {
    if (!value) {
      this.open_txns = null;
    }
  }

  public long getMin_open_txn() {
    return this.min_open_txn;
  }

  public void setMin_open_txn(long min_open_txn) {
    this.min_open_txn = min_open_txn;
    setMin_open_txnIsSet(true);
  }

  public void unsetMin_open_txn() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIN_OPEN_TXN_ISSET_ID);
  }

  /** Returns true if field min_open_txn is set (has been assigned a value) and false otherwise */
  public boolean isSetMin_open_txn() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIN_OPEN_TXN_ISSET_ID);
  }

  public void setMin_open_txnIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIN_OPEN_TXN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TXN_HIGH_WATER_MARK:
      if (value == null) {
        unsetTxn_high_water_mark();
      } else {
        setTxn_high_water_mark((java.lang.Long)value);
      }
      break;

    case OPEN_TXNS:
      if (value == null) {
        unsetOpen_txns();
      } else {
        setOpen_txns((java.util.Set<java.lang.Long>)value);
      }
      break;

    case MIN_OPEN_TXN:
      if (value == null) {
        unsetMin_open_txn();
      } else {
        setMin_open_txn((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TXN_HIGH_WATER_MARK:
      return getTxn_high_water_mark();

    case OPEN_TXNS:
      return getOpen_txns();

    case MIN_OPEN_TXN:
      return getMin_open_txn();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TXN_HIGH_WATER_MARK:
      return isSetTxn_high_water_mark();
    case OPEN_TXNS:
      return isSetOpen_txns();
    case MIN_OPEN_TXN:
      return isSetMin_open_txn();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetOpenTxnsResponse)
      return this.equals((GetOpenTxnsResponse)that);
    return false;
  }

  public boolean equals(GetOpenTxnsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_txn_high_water_mark = true;
    boolean that_present_txn_high_water_mark = true;
    if (this_present_txn_high_water_mark || that_present_txn_high_water_mark) {
      if (!(this_present_txn_high_water_mark && that_present_txn_high_water_mark))
        return false;
      if (this.txn_high_water_mark != that.txn_high_water_mark)
        return false;
    }

    boolean this_present_open_txns = true && this.isSetOpen_txns();
    boolean that_present_open_txns = true && that.isSetOpen_txns();
    if (this_present_open_txns || that_present_open_txns) {
      if (!(this_present_open_txns && that_present_open_txns))
        return false;
      if (!this.open_txns.equals(that.open_txns))
        return false;
    }

    boolean this_present_min_open_txn = true && this.isSetMin_open_txn();
    boolean that_present_min_open_txn = true && that.isSetMin_open_txn();
    if (this_present_min_open_txn || that_present_min_open_txn) {
      if (!(this_present_min_open_txn && that_present_min_open_txn))
        return false;
      if (this.min_open_txn != that.min_open_txn)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txn_high_water_mark);

    hashCode = hashCode * 8191 + ((isSetOpen_txns()) ? 131071 : 524287);
    if (isSetOpen_txns())
      hashCode = hashCode * 8191 + open_txns.hashCode();

    hashCode = hashCode * 8191 + ((isSetMin_open_txn()) ? 131071 : 524287);
    if (isSetMin_open_txn())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(min_open_txn);

    return hashCode;
  }

  @Override
  public int compareTo(GetOpenTxnsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTxn_high_water_mark(), other.isSetTxn_high_water_mark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxn_high_water_mark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_high_water_mark, other.txn_high_water_mark);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOpen_txns(), other.isSetOpen_txns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpen_txns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.open_txns, other.open_txns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMin_open_txn(), other.isSetMin_open_txn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMin_open_txn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.min_open_txn, other.min_open_txn);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetOpenTxnsResponse(");
    boolean first = true;

    sb.append("txn_high_water_mark:");
    sb.append(this.txn_high_water_mark);
    first = false;
    if (!first) sb.append(", ");
    sb.append("open_txns:");
    if (this.open_txns == null) {
      sb.append("null");
    } else {
      sb.append(this.open_txns);
    }
    first = false;
    if (isSetMin_open_txn()) {
      if (!first) sb.append(", ");
      sb.append("min_open_txn:");
      sb.append(this.min_open_txn);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxn_high_water_mark()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txn_high_water_mark' is unset! Struct:" + toString());
    }

    if (!isSetOpen_txns()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'open_txns' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetOpenTxnsResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetOpenTxnsResponseStandardScheme getScheme() {
      return new GetOpenTxnsResponseStandardScheme();
    }
  }

  private static class GetOpenTxnsResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetOpenTxnsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetOpenTxnsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXN_HIGH_WATER_MARK
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txn_high_water_mark = iprot.readI64();
              struct.setTxn_high_water_markIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPEN_TXNS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set500 = iprot.readSetBegin();
                struct.open_txns = new java.util.HashSet<java.lang.Long>(2*_set500.size);
                long _elem501;
                for (int _i502 = 0; _i502 < _set500.size; ++_i502)
                {
                  _elem501 = iprot.readI64();
                  struct.open_txns.add(_elem501);
                }
                iprot.readSetEnd();
              }
              struct.setOpen_txnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MIN_OPEN_TXN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.min_open_txn = iprot.readI64();
              struct.setMin_open_txnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetOpenTxnsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXN_HIGH_WATER_MARK_FIELD_DESC);
      oprot.writeI64(struct.txn_high_water_mark);
      oprot.writeFieldEnd();
      if (struct.open_txns != null) {
        oprot.writeFieldBegin(OPEN_TXNS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.open_txns.size()));
          for (long _iter503 : struct.open_txns)
          {
            oprot.writeI64(_iter503);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetMin_open_txn()) {
        oprot.writeFieldBegin(MIN_OPEN_TXN_FIELD_DESC);
        oprot.writeI64(struct.min_open_txn);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetOpenTxnsResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetOpenTxnsResponseTupleScheme getScheme() {
      return new GetOpenTxnsResponseTupleScheme();
    }
  }

  private static class GetOpenTxnsResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetOpenTxnsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetOpenTxnsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.txn_high_water_mark);
      {
        oprot.writeI32(struct.open_txns.size());
        for (long _iter504 : struct.open_txns)
        {
          oprot.writeI64(_iter504);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMin_open_txn()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMin_open_txn()) {
        oprot.writeI64(struct.min_open_txn);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetOpenTxnsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.txn_high_water_mark = iprot.readI64();
      struct.setTxn_high_water_markIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set505 = iprot.readSetBegin(org.apache.thrift.protocol.TType.I64);
        struct.open_txns = new java.util.HashSet<java.lang.Long>(2*_set505.size);
        long _elem506;
        for (int _i507 = 0; _i507 < _set505.size; ++_i507)
        {
          _elem506 = iprot.readI64();
          struct.open_txns.add(_elem506);
        }
      }
      struct.setOpen_txnsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.min_open_txn = iprot.readI64();
        struct.setMin_open_txnIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

