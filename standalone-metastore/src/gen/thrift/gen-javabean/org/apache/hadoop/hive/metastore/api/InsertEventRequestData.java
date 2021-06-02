/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class InsertEventRequestData implements org.apache.thrift.TBase<InsertEventRequestData, InsertEventRequestData._Fields>, java.io.Serializable, Cloneable, Comparable<InsertEventRequestData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InsertEventRequestData");

  private static final org.apache.thrift.protocol.TField REPLACE_FIELD_DESC = new org.apache.thrift.protocol.TField("replace", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField FILES_ADDED_FIELD_DESC = new org.apache.thrift.protocol.TField("filesAdded", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField FILES_ADDED_CHECKSUM_FIELD_DESC = new org.apache.thrift.protocol.TField("filesAddedChecksum", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InsertEventRequestDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InsertEventRequestDataTupleSchemeFactory());
  }

  private boolean replace; // optional
  private List<String> filesAdded; // required
  private List<String> filesAddedChecksum; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REPLACE((short)1, "replace"),
    FILES_ADDED((short)2, "filesAdded"),
    FILES_ADDED_CHECKSUM((short)3, "filesAddedChecksum");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REPLACE
          return REPLACE;
        case 2: // FILES_ADDED
          return FILES_ADDED;
        case 3: // FILES_ADDED_CHECKSUM
          return FILES_ADDED_CHECKSUM;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REPLACE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.REPLACE,_Fields.FILES_ADDED_CHECKSUM};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REPLACE, new org.apache.thrift.meta_data.FieldMetaData("replace", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FILES_ADDED, new org.apache.thrift.meta_data.FieldMetaData("filesAdded", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.FILES_ADDED_CHECKSUM, new org.apache.thrift.meta_data.FieldMetaData("filesAddedChecksum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InsertEventRequestData.class, metaDataMap);
  }

  public InsertEventRequestData() {
  }

  public InsertEventRequestData(
    List<String> filesAdded)
  {
    this();
    this.filesAdded = filesAdded;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InsertEventRequestData(InsertEventRequestData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.replace = other.replace;
    if (other.isSetFilesAdded()) {
      List<String> __this__filesAdded = new ArrayList<String>(other.filesAdded);
      this.filesAdded = __this__filesAdded;
    }
    if (other.isSetFilesAddedChecksum()) {
      List<String> __this__filesAddedChecksum = new ArrayList<String>(other.filesAddedChecksum);
      this.filesAddedChecksum = __this__filesAddedChecksum;
    }
  }

  public InsertEventRequestData deepCopy() {
    return new InsertEventRequestData(this);
  }

  @Override
  public void clear() {
    setReplaceIsSet(false);
    this.replace = false;
    this.filesAdded = null;
    this.filesAddedChecksum = null;
  }

  public boolean isReplace() {
    return this.replace;
  }

  public void setReplace(boolean replace) {
    this.replace = replace;
    setReplaceIsSet(true);
  }

  public void unsetReplace() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REPLACE_ISSET_ID);
  }

  /** Returns true if field replace is set (has been assigned a value) and false otherwise */
  public boolean isSetReplace() {
    return EncodingUtils.testBit(__isset_bitfield, __REPLACE_ISSET_ID);
  }

  public void setReplaceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REPLACE_ISSET_ID, value);
  }

  public int getFilesAddedSize() {
    return (this.filesAdded == null) ? 0 : this.filesAdded.size();
  }

  public java.util.Iterator<String> getFilesAddedIterator() {
    return (this.filesAdded == null) ? null : this.filesAdded.iterator();
  }

  public void addToFilesAdded(String elem) {
    if (this.filesAdded == null) {
      this.filesAdded = new ArrayList<String>();
    }
    this.filesAdded.add(elem);
  }

  public List<String> getFilesAdded() {
    return this.filesAdded;
  }

  public void setFilesAdded(List<String> filesAdded) {
    this.filesAdded = filesAdded;
  }

  public void unsetFilesAdded() {
    this.filesAdded = null;
  }

  /** Returns true if field filesAdded is set (has been assigned a value) and false otherwise */
  public boolean isSetFilesAdded() {
    return this.filesAdded != null;
  }

  public void setFilesAddedIsSet(boolean value) {
    if (!value) {
      this.filesAdded = null;
    }
  }

  public int getFilesAddedChecksumSize() {
    return (this.filesAddedChecksum == null) ? 0 : this.filesAddedChecksum.size();
  }

  public java.util.Iterator<String> getFilesAddedChecksumIterator() {
    return (this.filesAddedChecksum == null) ? null : this.filesAddedChecksum.iterator();
  }

  public void addToFilesAddedChecksum(String elem) {
    if (this.filesAddedChecksum == null) {
      this.filesAddedChecksum = new ArrayList<String>();
    }
    this.filesAddedChecksum.add(elem);
  }

  public List<String> getFilesAddedChecksum() {
    return this.filesAddedChecksum;
  }

  public void setFilesAddedChecksum(List<String> filesAddedChecksum) {
    this.filesAddedChecksum = filesAddedChecksum;
  }

  public void unsetFilesAddedChecksum() {
    this.filesAddedChecksum = null;
  }

  /** Returns true if field filesAddedChecksum is set (has been assigned a value) and false otherwise */
  public boolean isSetFilesAddedChecksum() {
    return this.filesAddedChecksum != null;
  }

  public void setFilesAddedChecksumIsSet(boolean value) {
    if (!value) {
      this.filesAddedChecksum = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REPLACE:
      if (value == null) {
        unsetReplace();
      } else {
        setReplace((Boolean)value);
      }
      break;

    case FILES_ADDED:
      if (value == null) {
        unsetFilesAdded();
      } else {
        setFilesAdded((List<String>)value);
      }
      break;

    case FILES_ADDED_CHECKSUM:
      if (value == null) {
        unsetFilesAddedChecksum();
      } else {
        setFilesAddedChecksum((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REPLACE:
      return isReplace();

    case FILES_ADDED:
      return getFilesAdded();

    case FILES_ADDED_CHECKSUM:
      return getFilesAddedChecksum();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REPLACE:
      return isSetReplace();
    case FILES_ADDED:
      return isSetFilesAdded();
    case FILES_ADDED_CHECKSUM:
      return isSetFilesAddedChecksum();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InsertEventRequestData)
      return this.equals((InsertEventRequestData)that);
    return false;
  }

  public boolean equals(InsertEventRequestData that) {
    if (that == null)
      return false;

    boolean this_present_replace = true && this.isSetReplace();
    boolean that_present_replace = true && that.isSetReplace();
    if (this_present_replace || that_present_replace) {
      if (!(this_present_replace && that_present_replace))
        return false;
      if (this.replace != that.replace)
        return false;
    }

    boolean this_present_filesAdded = true && this.isSetFilesAdded();
    boolean that_present_filesAdded = true && that.isSetFilesAdded();
    if (this_present_filesAdded || that_present_filesAdded) {
      if (!(this_present_filesAdded && that_present_filesAdded))
        return false;
      if (!this.filesAdded.equals(that.filesAdded))
        return false;
    }

    boolean this_present_filesAddedChecksum = true && this.isSetFilesAddedChecksum();
    boolean that_present_filesAddedChecksum = true && that.isSetFilesAddedChecksum();
    if (this_present_filesAddedChecksum || that_present_filesAddedChecksum) {
      if (!(this_present_filesAddedChecksum && that_present_filesAddedChecksum))
        return false;
      if (!this.filesAddedChecksum.equals(that.filesAddedChecksum))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_replace = true && (isSetReplace());
    list.add(present_replace);
    if (present_replace)
      list.add(replace);

    boolean present_filesAdded = true && (isSetFilesAdded());
    list.add(present_filesAdded);
    if (present_filesAdded)
      list.add(filesAdded);

    boolean present_filesAddedChecksum = true && (isSetFilesAddedChecksum());
    list.add(present_filesAddedChecksum);
    if (present_filesAddedChecksum)
      list.add(filesAddedChecksum);

    return list.hashCode();
  }

  @Override
  public int compareTo(InsertEventRequestData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReplace()).compareTo(other.isSetReplace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replace, other.replace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilesAdded()).compareTo(other.isSetFilesAdded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilesAdded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filesAdded, other.filesAdded);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilesAddedChecksum()).compareTo(other.isSetFilesAddedChecksum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilesAddedChecksum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filesAddedChecksum, other.filesAddedChecksum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InsertEventRequestData(");
    boolean first = true;

    if (isSetReplace()) {
      sb.append("replace:");
      sb.append(this.replace);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("filesAdded:");
    if (this.filesAdded == null) {
      sb.append("null");
    } else {
      sb.append(this.filesAdded);
    }
    first = false;
    if (isSetFilesAddedChecksum()) {
      if (!first) sb.append(", ");
      sb.append("filesAddedChecksum:");
      if (this.filesAddedChecksum == null) {
        sb.append("null");
      } else {
        sb.append(this.filesAddedChecksum);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFilesAdded()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'filesAdded' is unset! Struct:" + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InsertEventRequestDataStandardSchemeFactory implements SchemeFactory {
    public InsertEventRequestDataStandardScheme getScheme() {
      return new InsertEventRequestDataStandardScheme();
    }
  }

  private static class InsertEventRequestDataStandardScheme extends StandardScheme<InsertEventRequestData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REPLACE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.replace = iprot.readBool();
              struct.setReplaceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILES_ADDED
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list724 = iprot.readListBegin();
                struct.filesAdded = new ArrayList<String>(_list724.size);
                String _elem725;
                for (int _i726 = 0; _i726 < _list724.size; ++_i726)
                {
                  _elem725 = iprot.readString();
                  struct.filesAdded.add(_elem725);
                }
                iprot.readListEnd();
              }
              struct.setFilesAddedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FILES_ADDED_CHECKSUM
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list727 = iprot.readListBegin();
                struct.filesAddedChecksum = new ArrayList<String>(_list727.size);
                String _elem728;
                for (int _i729 = 0; _i729 < _list727.size; ++_i729)
                {
                  _elem728 = iprot.readString();
                  struct.filesAddedChecksum.add(_elem728);
                }
                iprot.readListEnd();
              }
              struct.setFilesAddedChecksumIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetReplace()) {
        oprot.writeFieldBegin(REPLACE_FIELD_DESC);
        oprot.writeBool(struct.replace);
        oprot.writeFieldEnd();
      }
      if (struct.filesAdded != null) {
        oprot.writeFieldBegin(FILES_ADDED_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.filesAdded.size()));
          for (String _iter730 : struct.filesAdded)
          {
            oprot.writeString(_iter730);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.filesAddedChecksum != null) {
        if (struct.isSetFilesAddedChecksum()) {
          oprot.writeFieldBegin(FILES_ADDED_CHECKSUM_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.filesAddedChecksum.size()));
            for (String _iter731 : struct.filesAddedChecksum)
            {
              oprot.writeString(_iter731);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InsertEventRequestDataTupleSchemeFactory implements SchemeFactory {
    public InsertEventRequestDataTupleScheme getScheme() {
      return new InsertEventRequestDataTupleScheme();
    }
  }

  private static class InsertEventRequestDataTupleScheme extends TupleScheme<InsertEventRequestData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.filesAdded.size());
        for (String _iter732 : struct.filesAdded)
        {
          oprot.writeString(_iter732);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetReplace()) {
        optionals.set(0);
      }
      if (struct.isSetFilesAddedChecksum()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReplace()) {
        oprot.writeBool(struct.replace);
      }
      if (struct.isSetFilesAddedChecksum()) {
        {
          oprot.writeI32(struct.filesAddedChecksum.size());
          for (String _iter733 : struct.filesAddedChecksum)
          {
            oprot.writeString(_iter733);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InsertEventRequestData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list734 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.filesAdded = new ArrayList<String>(_list734.size);
        String _elem735;
        for (int _i736 = 0; _i736 < _list734.size; ++_i736)
        {
          _elem735 = iprot.readString();
          struct.filesAdded.add(_elem735);
        }
      }
      struct.setFilesAddedIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.replace = iprot.readBool();
        struct.setReplaceIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list737 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.filesAddedChecksum = new ArrayList<String>(_list737.size);
          String _elem738;
          for (int _i739 = 0; _i739 < _list737.size; ++_i739)
          {
            _elem738 = iprot.readString();
            struct.filesAddedChecksum.add(_elem738);
          }
        }
        struct.setFilesAddedChecksumIsSet(true);
      }
    }
  }

}

