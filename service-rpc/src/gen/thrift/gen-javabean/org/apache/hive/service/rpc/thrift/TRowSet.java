/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class TRowSet implements org.apache.thrift.TBase<TRowSet, TRowSet._Fields>, java.io.Serializable, Cloneable, Comparable<TRowSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRowSet");

  private static final org.apache.thrift.protocol.TField START_ROW_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("startRowOffset", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("rows", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField BINARY_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("binaryColumns", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField COLUMN_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("columnCount", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRowSetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRowSetTupleSchemeFactory();

  private long startRowOffset; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<TRow> rows; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<TColumn> columns; // optional
  private @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer binaryColumns; // optional
  private int columnCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_ROW_OFFSET((short)1, "startRowOffset"),
    ROWS((short)2, "rows"),
    COLUMNS((short)3, "columns"),
    BINARY_COLUMNS((short)4, "binaryColumns"),
    COLUMN_COUNT((short)5, "columnCount");

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
        case 1: // START_ROW_OFFSET
          return START_ROW_OFFSET;
        case 2: // ROWS
          return ROWS;
        case 3: // COLUMNS
          return COLUMNS;
        case 4: // BINARY_COLUMNS
          return BINARY_COLUMNS;
        case 5: // COLUMN_COUNT
          return COLUMN_COUNT;
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
  private static final int __STARTROWOFFSET_ISSET_ID = 0;
  private static final int __COLUMNCOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COLUMNS,_Fields.BINARY_COLUMNS,_Fields.COLUMN_COUNT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_ROW_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("startRowOffset", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ROWS, new org.apache.thrift.meta_data.FieldMetaData("rows", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TRow.class))));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumn.class))));
    tmpMap.put(_Fields.BINARY_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("binaryColumns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMN_COUNT, new org.apache.thrift.meta_data.FieldMetaData("columnCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRowSet.class, metaDataMap);
  }

  public TRowSet() {
  }

  public TRowSet(
    long startRowOffset,
    java.util.List<TRow> rows)
  {
    this();
    this.startRowOffset = startRowOffset;
    setStartRowOffsetIsSet(true);
    this.rows = rows;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRowSet(TRowSet other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startRowOffset = other.startRowOffset;
    if (other.isSetRows()) {
      java.util.List<TRow> __this__rows = new java.util.ArrayList<TRow>(other.rows.size());
      for (TRow other_element : other.rows) {
        __this__rows.add(new TRow(other_element));
      }
      this.rows = __this__rows;
    }
    if (other.isSetColumns()) {
      java.util.List<TColumn> __this__columns = new java.util.ArrayList<TColumn>(other.columns.size());
      for (TColumn other_element : other.columns) {
        __this__columns.add(new TColumn(other_element));
      }
      this.columns = __this__columns;
    }
    if (other.isSetBinaryColumns()) {
      this.binaryColumns = org.apache.thrift.TBaseHelper.copyBinary(other.binaryColumns);
    }
    this.columnCount = other.columnCount;
  }

  public TRowSet deepCopy() {
    return new TRowSet(this);
  }

  @Override
  public void clear() {
    setStartRowOffsetIsSet(false);
    this.startRowOffset = 0;
    this.rows = null;
    this.columns = null;
    this.binaryColumns = null;
    setColumnCountIsSet(false);
    this.columnCount = 0;
  }

  public long getStartRowOffset() {
    return this.startRowOffset;
  }

  public void setStartRowOffset(long startRowOffset) {
    this.startRowOffset = startRowOffset;
    setStartRowOffsetIsSet(true);
  }

  public void unsetStartRowOffset() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTROWOFFSET_ISSET_ID);
  }

  /** Returns true if field startRowOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetStartRowOffset() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTROWOFFSET_ISSET_ID);
  }

  public void setStartRowOffsetIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTROWOFFSET_ISSET_ID, value);
  }

  public int getRowsSize() {
    return (this.rows == null) ? 0 : this.rows.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TRow> getRowsIterator() {
    return (this.rows == null) ? null : this.rows.iterator();
  }

  public void addToRows(TRow elem) {
    if (this.rows == null) {
      this.rows = new java.util.ArrayList<TRow>();
    }
    this.rows.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TRow> getRows() {
    return this.rows;
  }

  public void setRows(@org.apache.thrift.annotation.Nullable java.util.List<TRow> rows) {
    this.rows = rows;
  }

  public void unsetRows() {
    this.rows = null;
  }

  /** Returns true if field rows is set (has been assigned a value) and false otherwise */
  public boolean isSetRows() {
    return this.rows != null;
  }

  public void setRowsIsSet(boolean value) {
    if (!value) {
      this.rows = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TColumn> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(TColumn elem) {
    if (this.columns == null) {
      this.columns = new java.util.ArrayList<TColumn>();
    }
    this.columns.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TColumn> getColumns() {
    return this.columns;
  }

  public void setColumns(@org.apache.thrift.annotation.Nullable java.util.List<TColumn> columns) {
    this.columns = columns;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public byte[] getBinaryColumns() {
    setBinaryColumns(org.apache.thrift.TBaseHelper.rightSize(binaryColumns));
    return binaryColumns == null ? null : binaryColumns.array();
  }

  public java.nio.ByteBuffer bufferForBinaryColumns() {
    return org.apache.thrift.TBaseHelper.copyBinary(binaryColumns);
  }

  public void setBinaryColumns(byte[] binaryColumns) {
    this.binaryColumns = binaryColumns == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(binaryColumns.clone());
  }

  public void setBinaryColumns(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer binaryColumns) {
    this.binaryColumns = org.apache.thrift.TBaseHelper.copyBinary(binaryColumns);
  }

  public void unsetBinaryColumns() {
    this.binaryColumns = null;
  }

  /** Returns true if field binaryColumns is set (has been assigned a value) and false otherwise */
  public boolean isSetBinaryColumns() {
    return this.binaryColumns != null;
  }

  public void setBinaryColumnsIsSet(boolean value) {
    if (!value) {
      this.binaryColumns = null;
    }
  }

  public int getColumnCount() {
    return this.columnCount;
  }

  public void setColumnCount(int columnCount) {
    this.columnCount = columnCount;
    setColumnCountIsSet(true);
  }

  public void unsetColumnCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COLUMNCOUNT_ISSET_ID);
  }

  /** Returns true if field columnCount is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COLUMNCOUNT_ISSET_ID);
  }

  public void setColumnCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COLUMNCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case START_ROW_OFFSET:
      if (value == null) {
        unsetStartRowOffset();
      } else {
        setStartRowOffset((java.lang.Long)value);
      }
      break;

    case ROWS:
      if (value == null) {
        unsetRows();
      } else {
        setRows((java.util.List<TRow>)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((java.util.List<TColumn>)value);
      }
      break;

    case BINARY_COLUMNS:
      if (value == null) {
        unsetBinaryColumns();
      } else {
        if (value instanceof byte[]) {
          setBinaryColumns((byte[])value);
        } else {
          setBinaryColumns((java.nio.ByteBuffer)value);
        }
      }
      break;

    case COLUMN_COUNT:
      if (value == null) {
        unsetColumnCount();
      } else {
        setColumnCount((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START_ROW_OFFSET:
      return getStartRowOffset();

    case ROWS:
      return getRows();

    case COLUMNS:
      return getColumns();

    case BINARY_COLUMNS:
      return getBinaryColumns();

    case COLUMN_COUNT:
      return getColumnCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case START_ROW_OFFSET:
      return isSetStartRowOffset();
    case ROWS:
      return isSetRows();
    case COLUMNS:
      return isSetColumns();
    case BINARY_COLUMNS:
      return isSetBinaryColumns();
    case COLUMN_COUNT:
      return isSetColumnCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TRowSet)
      return this.equals((TRowSet)that);
    return false;
  }

  public boolean equals(TRowSet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_startRowOffset = true;
    boolean that_present_startRowOffset = true;
    if (this_present_startRowOffset || that_present_startRowOffset) {
      if (!(this_present_startRowOffset && that_present_startRowOffset))
        return false;
      if (this.startRowOffset != that.startRowOffset)
        return false;
    }

    boolean this_present_rows = true && this.isSetRows();
    boolean that_present_rows = true && that.isSetRows();
    if (this_present_rows || that_present_rows) {
      if (!(this_present_rows && that_present_rows))
        return false;
      if (!this.rows.equals(that.rows))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_binaryColumns = true && this.isSetBinaryColumns();
    boolean that_present_binaryColumns = true && that.isSetBinaryColumns();
    if (this_present_binaryColumns || that_present_binaryColumns) {
      if (!(this_present_binaryColumns && that_present_binaryColumns))
        return false;
      if (!this.binaryColumns.equals(that.binaryColumns))
        return false;
    }

    boolean this_present_columnCount = true && this.isSetColumnCount();
    boolean that_present_columnCount = true && that.isSetColumnCount();
    if (this_present_columnCount || that_present_columnCount) {
      if (!(this_present_columnCount && that_present_columnCount))
        return false;
      if (this.columnCount != that.columnCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startRowOffset);

    hashCode = hashCode * 8191 + ((isSetRows()) ? 131071 : 524287);
    if (isSetRows())
      hashCode = hashCode * 8191 + rows.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumns()) ? 131071 : 524287);
    if (isSetColumns())
      hashCode = hashCode * 8191 + columns.hashCode();

    hashCode = hashCode * 8191 + ((isSetBinaryColumns()) ? 131071 : 524287);
    if (isSetBinaryColumns())
      hashCode = hashCode * 8191 + binaryColumns.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumnCount()) ? 131071 : 524287);
    if (isSetColumnCount())
      hashCode = hashCode * 8191 + columnCount;

    return hashCode;
  }

  @Override
  public int compareTo(TRowSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStartRowOffset(), other.isSetStartRowOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartRowOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startRowOffset, other.startRowOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRows(), other.isSetRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rows, other.rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumns(), other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetBinaryColumns(), other.isSetBinaryColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinaryColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binaryColumns, other.binaryColumns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumnCount(), other.isSetColumnCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnCount, other.columnCount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRowSet(");
    boolean first = true;

    sb.append("startRowOffset:");
    sb.append(this.startRowOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rows:");
    if (this.rows == null) {
      sb.append("null");
    } else {
      sb.append(this.rows);
    }
    first = false;
    if (isSetColumns()) {
      if (!first) sb.append(", ");
      sb.append("columns:");
      if (this.columns == null) {
        sb.append("null");
      } else {
        sb.append(this.columns);
      }
      first = false;
    }
    if (isSetBinaryColumns()) {
      if (!first) sb.append(", ");
      sb.append("binaryColumns:");
      if (this.binaryColumns == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.binaryColumns, sb);
      }
      first = false;
    }
    if (isSetColumnCount()) {
      if (!first) sb.append(", ");
      sb.append("columnCount:");
      sb.append(this.columnCount);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStartRowOffset()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'startRowOffset' is unset! Struct:" + toString());
    }

    if (!isSetRows()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'rows' is unset! Struct:" + toString());
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

  private static class TRowSetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRowSetStandardScheme getScheme() {
      return new TRowSetStandardScheme();
    }
  }

  private static class TRowSetStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRowSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRowSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_ROW_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startRowOffset = iprot.readI64();
              struct.setStartRowOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list118 = iprot.readListBegin();
                struct.rows = new java.util.ArrayList<TRow>(_list118.size);
                @org.apache.thrift.annotation.Nullable TRow _elem119;
                for (int _i120 = 0; _i120 < _list118.size; ++_i120)
                {
                  _elem119 = new TRow();
                  _elem119.read(iprot);
                  struct.rows.add(_elem119);
                }
                iprot.readListEnd();
              }
              struct.setRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list121 = iprot.readListBegin();
                struct.columns = new java.util.ArrayList<TColumn>(_list121.size);
                @org.apache.thrift.annotation.Nullable TColumn _elem122;
                for (int _i123 = 0; _i123 < _list121.size; ++_i123)
                {
                  _elem122 = new TColumn();
                  _elem122.read(iprot);
                  struct.columns.add(_elem122);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BINARY_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.binaryColumns = iprot.readBinary();
              struct.setBinaryColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COLUMN_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.columnCount = iprot.readI32();
              struct.setColumnCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRowSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(START_ROW_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.startRowOffset);
      oprot.writeFieldEnd();
      if (struct.rows != null) {
        oprot.writeFieldBegin(ROWS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.rows.size()));
          for (TRow _iter124 : struct.rows)
          {
            _iter124.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        if (struct.isSetColumns()) {
          oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
            for (TColumn _iter125 : struct.columns)
            {
              _iter125.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.binaryColumns != null) {
        if (struct.isSetBinaryColumns()) {
          oprot.writeFieldBegin(BINARY_COLUMNS_FIELD_DESC);
          oprot.writeBinary(struct.binaryColumns);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetColumnCount()) {
        oprot.writeFieldBegin(COLUMN_COUNT_FIELD_DESC);
        oprot.writeI32(struct.columnCount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRowSetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRowSetTupleScheme getScheme() {
      return new TRowSetTupleScheme();
    }
  }

  private static class TRowSetTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRowSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRowSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.startRowOffset);
      {
        oprot.writeI32(struct.rows.size());
        for (TRow _iter126 : struct.rows)
        {
          _iter126.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetColumns()) {
        optionals.set(0);
      }
      if (struct.isSetBinaryColumns()) {
        optionals.set(1);
      }
      if (struct.isSetColumnCount()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (TColumn _iter127 : struct.columns)
          {
            _iter127.write(oprot);
          }
        }
      }
      if (struct.isSetBinaryColumns()) {
        oprot.writeBinary(struct.binaryColumns);
      }
      if (struct.isSetColumnCount()) {
        oprot.writeI32(struct.columnCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRowSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.startRowOffset = iprot.readI64();
      struct.setStartRowOffsetIsSet(true);
      {
        org.apache.thrift.protocol.TList _list128 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.rows = new java.util.ArrayList<TRow>(_list128.size);
        @org.apache.thrift.annotation.Nullable TRow _elem129;
        for (int _i130 = 0; _i130 < _list128.size; ++_i130)
        {
          _elem129 = new TRow();
          _elem129.read(iprot);
          struct.rows.add(_elem129);
        }
      }
      struct.setRowsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list131 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.columns = new java.util.ArrayList<TColumn>(_list131.size);
          @org.apache.thrift.annotation.Nullable TColumn _elem132;
          for (int _i133 = 0; _i133 < _list131.size; ++_i133)
          {
            _elem132 = new TColumn();
            _elem132.read(iprot);
            struct.columns.add(_elem132);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.binaryColumns = iprot.readBinary();
        struct.setBinaryColumnsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.columnCount = iprot.readI32();
        struct.setColumnCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

