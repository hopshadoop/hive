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
public class WMGetTriggersForResourePlanResponse implements org.apache.thrift.TBase<WMGetTriggersForResourePlanResponse, WMGetTriggersForResourePlanResponse._Fields>, java.io.Serializable, Cloneable, Comparable<WMGetTriggersForResourePlanResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMGetTriggersForResourePlanResponse");

  private static final org.apache.thrift.protocol.TField TRIGGERS_FIELD_DESC = new org.apache.thrift.protocol.TField("triggers", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WMGetTriggersForResourePlanResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WMGetTriggersForResourePlanResponseTupleSchemeFactory());
  }

  private List<WMTrigger> triggers; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRIGGERS((short)1, "triggers");

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
        case 1: // TRIGGERS
          return TRIGGERS;
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
  private static final _Fields optionals[] = {_Fields.TRIGGERS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRIGGERS, new org.apache.thrift.meta_data.FieldMetaData("triggers", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WMTrigger.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMGetTriggersForResourePlanResponse.class, metaDataMap);
  }

  public WMGetTriggersForResourePlanResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMGetTriggersForResourePlanResponse(WMGetTriggersForResourePlanResponse other) {
    if (other.isSetTriggers()) {
      List<WMTrigger> __this__triggers = new ArrayList<WMTrigger>(other.triggers.size());
      for (WMTrigger other_element : other.triggers) {
        __this__triggers.add(new WMTrigger(other_element));
      }
      this.triggers = __this__triggers;
    }
  }

  public WMGetTriggersForResourePlanResponse deepCopy() {
    return new WMGetTriggersForResourePlanResponse(this);
  }

  @Override
  public void clear() {
    this.triggers = null;
  }

  public int getTriggersSize() {
    return (this.triggers == null) ? 0 : this.triggers.size();
  }

  public java.util.Iterator<WMTrigger> getTriggersIterator() {
    return (this.triggers == null) ? null : this.triggers.iterator();
  }

  public void addToTriggers(WMTrigger elem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<WMTrigger>();
    }
    this.triggers.add(elem);
  }

  public List<WMTrigger> getTriggers() {
    return this.triggers;
  }

  public void setTriggers(List<WMTrigger> triggers) {
    this.triggers = triggers;
  }

  public void unsetTriggers() {
    this.triggers = null;
  }

  /** Returns true if field triggers is set (has been assigned a value) and false otherwise */
  public boolean isSetTriggers() {
    return this.triggers != null;
  }

  public void setTriggersIsSet(boolean value) {
    if (!value) {
      this.triggers = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRIGGERS:
      if (value == null) {
        unsetTriggers();
      } else {
        setTriggers((List<WMTrigger>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRIGGERS:
      return getTriggers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRIGGERS:
      return isSetTriggers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WMGetTriggersForResourePlanResponse)
      return this.equals((WMGetTriggersForResourePlanResponse)that);
    return false;
  }

  public boolean equals(WMGetTriggersForResourePlanResponse that) {
    if (that == null)
      return false;

    boolean this_present_triggers = true && this.isSetTriggers();
    boolean that_present_triggers = true && that.isSetTriggers();
    if (this_present_triggers || that_present_triggers) {
      if (!(this_present_triggers && that_present_triggers))
        return false;
      if (!this.triggers.equals(that.triggers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_triggers = true && (isSetTriggers());
    list.add(present_triggers);
    if (present_triggers)
      list.add(triggers);

    return list.hashCode();
  }

  @Override
  public int compareTo(WMGetTriggersForResourePlanResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTriggers()).compareTo(other.isSetTriggers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTriggers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.triggers, other.triggers);
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
    StringBuilder sb = new StringBuilder("WMGetTriggersForResourePlanResponse(");
    boolean first = true;

    if (isSetTriggers()) {
      sb.append("triggers:");
      if (this.triggers == null) {
        sb.append("null");
      } else {
        sb.append(this.triggers);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WMGetTriggersForResourePlanResponseStandardSchemeFactory implements SchemeFactory {
    public WMGetTriggersForResourePlanResponseStandardScheme getScheme() {
      return new WMGetTriggersForResourePlanResponseStandardScheme();
    }
  }

  private static class WMGetTriggersForResourePlanResponseStandardScheme extends StandardScheme<WMGetTriggersForResourePlanResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WMGetTriggersForResourePlanResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRIGGERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list858 = iprot.readListBegin();
                struct.triggers = new ArrayList<WMTrigger>(_list858.size);
                WMTrigger _elem859;
                for (int _i860 = 0; _i860 < _list858.size; ++_i860)
                {
                  _elem859 = new WMTrigger();
                  _elem859.read(iprot);
                  struct.triggers.add(_elem859);
                }
                iprot.readListEnd();
              }
              struct.setTriggersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WMGetTriggersForResourePlanResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.triggers != null) {
        if (struct.isSetTriggers()) {
          oprot.writeFieldBegin(TRIGGERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.triggers.size()));
            for (WMTrigger _iter861 : struct.triggers)
            {
              _iter861.write(oprot);
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

  private static class WMGetTriggersForResourePlanResponseTupleSchemeFactory implements SchemeFactory {
    public WMGetTriggersForResourePlanResponseTupleScheme getScheme() {
      return new WMGetTriggersForResourePlanResponseTupleScheme();
    }
  }

  private static class WMGetTriggersForResourePlanResponseTupleScheme extends TupleScheme<WMGetTriggersForResourePlanResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMGetTriggersForResourePlanResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTriggers()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTriggers()) {
        {
          oprot.writeI32(struct.triggers.size());
          for (WMTrigger _iter862 : struct.triggers)
          {
            _iter862.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMGetTriggersForResourePlanResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list863 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.triggers = new ArrayList<WMTrigger>(_list863.size);
          WMTrigger _elem864;
          for (int _i865 = 0; _i865 < _list863.size; ++_i865)
          {
            _elem864 = new WMTrigger();
            _elem864.read(iprot);
            struct.triggers.add(_elem864);
          }
        }
        struct.setTriggersIsSet(true);
      }
    }
  }

}

