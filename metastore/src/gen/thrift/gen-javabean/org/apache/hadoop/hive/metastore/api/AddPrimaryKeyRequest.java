/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class AddPrimaryKeyRequest implements org.apache.thrift.TBase<AddPrimaryKeyRequest, AddPrimaryKeyRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddPrimaryKeyRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddPrimaryKeyRequest");

  private static final org.apache.thrift.protocol.TField PRIMARY_KEY_COLS_FIELD_DESC = new org.apache.thrift.protocol.TField("primaryKeyCols", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddPrimaryKeyRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddPrimaryKeyRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<SQLPrimaryKey> primaryKeyCols; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIMARY_KEY_COLS((short)1, "primaryKeyCols");

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
        case 1: // PRIMARY_KEY_COLS
          return PRIMARY_KEY_COLS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIMARY_KEY_COLS, new org.apache.thrift.meta_data.FieldMetaData("primaryKeyCols", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLPrimaryKey.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddPrimaryKeyRequest.class, metaDataMap);
  }

  public AddPrimaryKeyRequest() {
  }

  public AddPrimaryKeyRequest(
    java.util.List<SQLPrimaryKey> primaryKeyCols)
  {
    this();
    this.primaryKeyCols = primaryKeyCols;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddPrimaryKeyRequest(AddPrimaryKeyRequest other) {
    if (other.isSetPrimaryKeyCols()) {
      java.util.List<SQLPrimaryKey> __this__primaryKeyCols = new java.util.ArrayList<SQLPrimaryKey>(other.primaryKeyCols.size());
      for (SQLPrimaryKey other_element : other.primaryKeyCols) {
        __this__primaryKeyCols.add(new SQLPrimaryKey(other_element));
      }
      this.primaryKeyCols = __this__primaryKeyCols;
    }
  }

  public AddPrimaryKeyRequest deepCopy() {
    return new AddPrimaryKeyRequest(this);
  }

  @Override
  public void clear() {
    this.primaryKeyCols = null;
  }

  public int getPrimaryKeyColsSize() {
    return (this.primaryKeyCols == null) ? 0 : this.primaryKeyCols.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SQLPrimaryKey> getPrimaryKeyColsIterator() {
    return (this.primaryKeyCols == null) ? null : this.primaryKeyCols.iterator();
  }

  public void addToPrimaryKeyCols(SQLPrimaryKey elem) {
    if (this.primaryKeyCols == null) {
      this.primaryKeyCols = new java.util.ArrayList<SQLPrimaryKey>();
    }
    this.primaryKeyCols.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SQLPrimaryKey> getPrimaryKeyCols() {
    return this.primaryKeyCols;
  }

  public void setPrimaryKeyCols(@org.apache.thrift.annotation.Nullable java.util.List<SQLPrimaryKey> primaryKeyCols) {
    this.primaryKeyCols = primaryKeyCols;
  }

  public void unsetPrimaryKeyCols() {
    this.primaryKeyCols = null;
  }

  /** Returns true if field primaryKeyCols is set (has been assigned a value) and false otherwise */
  public boolean isSetPrimaryKeyCols() {
    return this.primaryKeyCols != null;
  }

  public void setPrimaryKeyColsIsSet(boolean value) {
    if (!value) {
      this.primaryKeyCols = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PRIMARY_KEY_COLS:
      if (value == null) {
        unsetPrimaryKeyCols();
      } else {
        setPrimaryKeyCols((java.util.List<SQLPrimaryKey>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIMARY_KEY_COLS:
      return getPrimaryKeyCols();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRIMARY_KEY_COLS:
      return isSetPrimaryKeyCols();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AddPrimaryKeyRequest)
      return this.equals((AddPrimaryKeyRequest)that);
    return false;
  }

  public boolean equals(AddPrimaryKeyRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_primaryKeyCols = true && this.isSetPrimaryKeyCols();
    boolean that_present_primaryKeyCols = true && that.isSetPrimaryKeyCols();
    if (this_present_primaryKeyCols || that_present_primaryKeyCols) {
      if (!(this_present_primaryKeyCols && that_present_primaryKeyCols))
        return false;
      if (!this.primaryKeyCols.equals(that.primaryKeyCols))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPrimaryKeyCols()) ? 131071 : 524287);
    if (isSetPrimaryKeyCols())
      hashCode = hashCode * 8191 + primaryKeyCols.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AddPrimaryKeyRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPrimaryKeyCols(), other.isSetPrimaryKeyCols());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrimaryKeyCols()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.primaryKeyCols, other.primaryKeyCols);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AddPrimaryKeyRequest(");
    boolean first = true;

    sb.append("primaryKeyCols:");
    if (this.primaryKeyCols == null) {
      sb.append("null");
    } else {
      sb.append(this.primaryKeyCols);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPrimaryKeyCols()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'primaryKeyCols' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddPrimaryKeyRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddPrimaryKeyRequestStandardScheme getScheme() {
      return new AddPrimaryKeyRequestStandardScheme();
    }
  }

  private static class AddPrimaryKeyRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<AddPrimaryKeyRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddPrimaryKeyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIMARY_KEY_COLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list338 = iprot.readListBegin();
                struct.primaryKeyCols = new java.util.ArrayList<SQLPrimaryKey>(_list338.size);
                @org.apache.thrift.annotation.Nullable SQLPrimaryKey _elem339;
                for (int _i340 = 0; _i340 < _list338.size; ++_i340)
                {
                  _elem339 = new SQLPrimaryKey();
                  _elem339.read(iprot);
                  struct.primaryKeyCols.add(_elem339);
                }
                iprot.readListEnd();
              }
              struct.setPrimaryKeyColsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddPrimaryKeyRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.primaryKeyCols != null) {
        oprot.writeFieldBegin(PRIMARY_KEY_COLS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.primaryKeyCols.size()));
          for (SQLPrimaryKey _iter341 : struct.primaryKeyCols)
          {
            _iter341.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddPrimaryKeyRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddPrimaryKeyRequestTupleScheme getScheme() {
      return new AddPrimaryKeyRequestTupleScheme();
    }
  }

  private static class AddPrimaryKeyRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<AddPrimaryKeyRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddPrimaryKeyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.primaryKeyCols.size());
        for (SQLPrimaryKey _iter342 : struct.primaryKeyCols)
        {
          _iter342.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddPrimaryKeyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list343 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.primaryKeyCols = new java.util.ArrayList<SQLPrimaryKey>(_list343.size);
        @org.apache.thrift.annotation.Nullable SQLPrimaryKey _elem344;
        for (int _i345 = 0; _i345 < _list343.size; ++_i345)
        {
          _elem344 = new SQLPrimaryKey();
          _elem344.read(iprot);
          struct.primaryKeyCols.add(_elem344);
        }
      }
      struct.setPrimaryKeyColsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

