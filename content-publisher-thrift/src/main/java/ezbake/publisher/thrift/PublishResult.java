/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ezbake.publisher.thrift;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PublishResult implements org.apache.thrift.TBase<PublishResult, PublishResult._Fields>, java.io.Serializable, Cloneable, Comparable<PublishResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PublishResult");

  private static final org.apache.thrift.protocol.TField PROVENANCE_DOCUMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("provenanceDocumentId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField WAREHOUSE_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("warehouseTimestamp", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PublishResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PublishResultTupleSchemeFactory());
  }

  public long provenanceDocumentId; // optional
  public long warehouseTimestamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROVENANCE_DOCUMENT_ID((short)1, "provenanceDocumentId"),
    WAREHOUSE_TIMESTAMP((short)2, "warehouseTimestamp");

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
        case 1: // PROVENANCE_DOCUMENT_ID
          return PROVENANCE_DOCUMENT_ID;
        case 2: // WAREHOUSE_TIMESTAMP
          return WAREHOUSE_TIMESTAMP;
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
  private static final int __PROVENANCEDOCUMENTID_ISSET_ID = 0;
  private static final int __WAREHOUSETIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PROVENANCE_DOCUMENT_ID,_Fields.WAREHOUSE_TIMESTAMP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROVENANCE_DOCUMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("provenanceDocumentId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WAREHOUSE_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("warehouseTimestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PublishResult.class, metaDataMap);
  }

  public PublishResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PublishResult(PublishResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.provenanceDocumentId = other.provenanceDocumentId;
    this.warehouseTimestamp = other.warehouseTimestamp;
  }

  public PublishResult deepCopy() {
    return new PublishResult(this);
  }

  @Override
  public void clear() {
    setProvenanceDocumentIdIsSet(false);
    this.provenanceDocumentId = 0;
    setWarehouseTimestampIsSet(false);
    this.warehouseTimestamp = 0;
  }

  public long getProvenanceDocumentId() {
    return this.provenanceDocumentId;
  }

  public PublishResult setProvenanceDocumentId(long provenanceDocumentId) {
    this.provenanceDocumentId = provenanceDocumentId;
    setProvenanceDocumentIdIsSet(true);
    return this;
  }

  public void unsetProvenanceDocumentId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROVENANCEDOCUMENTID_ISSET_ID);
  }

  /** Returns true if field provenanceDocumentId is set (has been assigned a value) and false otherwise */
  public boolean isSetProvenanceDocumentId() {
    return EncodingUtils.testBit(__isset_bitfield, __PROVENANCEDOCUMENTID_ISSET_ID);
  }

  public void setProvenanceDocumentIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROVENANCEDOCUMENTID_ISSET_ID, value);
  }

  public long getWarehouseTimestamp() {
    return this.warehouseTimestamp;
  }

  public PublishResult setWarehouseTimestamp(long warehouseTimestamp) {
    this.warehouseTimestamp = warehouseTimestamp;
    setWarehouseTimestampIsSet(true);
    return this;
  }

  public void unsetWarehouseTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WAREHOUSETIMESTAMP_ISSET_ID);
  }

  /** Returns true if field warehouseTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetWarehouseTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __WAREHOUSETIMESTAMP_ISSET_ID);
  }

  public void setWarehouseTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WAREHOUSETIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROVENANCE_DOCUMENT_ID:
      if (value == null) {
        unsetProvenanceDocumentId();
      } else {
        setProvenanceDocumentId((Long)value);
      }
      break;

    case WAREHOUSE_TIMESTAMP:
      if (value == null) {
        unsetWarehouseTimestamp();
      } else {
        setWarehouseTimestamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROVENANCE_DOCUMENT_ID:
      return Long.valueOf(getProvenanceDocumentId());

    case WAREHOUSE_TIMESTAMP:
      return Long.valueOf(getWarehouseTimestamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROVENANCE_DOCUMENT_ID:
      return isSetProvenanceDocumentId();
    case WAREHOUSE_TIMESTAMP:
      return isSetWarehouseTimestamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PublishResult)
      return this.equals((PublishResult)that);
    return false;
  }

  public boolean equals(PublishResult that) {
    if (that == null)
      return false;

    boolean this_present_provenanceDocumentId = true && this.isSetProvenanceDocumentId();
    boolean that_present_provenanceDocumentId = true && that.isSetProvenanceDocumentId();
    if (this_present_provenanceDocumentId || that_present_provenanceDocumentId) {
      if (!(this_present_provenanceDocumentId && that_present_provenanceDocumentId))
        return false;
      if (this.provenanceDocumentId != that.provenanceDocumentId)
        return false;
    }

    boolean this_present_warehouseTimestamp = true && this.isSetWarehouseTimestamp();
    boolean that_present_warehouseTimestamp = true && that.isSetWarehouseTimestamp();
    if (this_present_warehouseTimestamp || that_present_warehouseTimestamp) {
      if (!(this_present_warehouseTimestamp && that_present_warehouseTimestamp))
        return false;
      if (this.warehouseTimestamp != that.warehouseTimestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PublishResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProvenanceDocumentId()).compareTo(other.isSetProvenanceDocumentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvenanceDocumentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.provenanceDocumentId, other.provenanceDocumentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWarehouseTimestamp()).compareTo(other.isSetWarehouseTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWarehouseTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.warehouseTimestamp, other.warehouseTimestamp);
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
    StringBuilder sb = new StringBuilder("PublishResult(");
    boolean first = true;

    if (isSetProvenanceDocumentId()) {
      sb.append("provenanceDocumentId:");
      sb.append(this.provenanceDocumentId);
      first = false;
    }
    if (isSetWarehouseTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("warehouseTimestamp:");
      sb.append(this.warehouseTimestamp);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PublishResultStandardSchemeFactory implements SchemeFactory {
    public PublishResultStandardScheme getScheme() {
      return new PublishResultStandardScheme();
    }
  }

  private static class PublishResultStandardScheme extends StandardScheme<PublishResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PublishResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROVENANCE_DOCUMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.provenanceDocumentId = iprot.readI64();
              struct.setProvenanceDocumentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WAREHOUSE_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.warehouseTimestamp = iprot.readI64();
              struct.setWarehouseTimestampIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PublishResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetProvenanceDocumentId()) {
        oprot.writeFieldBegin(PROVENANCE_DOCUMENT_ID_FIELD_DESC);
        oprot.writeI64(struct.provenanceDocumentId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWarehouseTimestamp()) {
        oprot.writeFieldBegin(WAREHOUSE_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.warehouseTimestamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PublishResultTupleSchemeFactory implements SchemeFactory {
    public PublishResultTupleScheme getScheme() {
      return new PublishResultTupleScheme();
    }
  }

  private static class PublishResultTupleScheme extends TupleScheme<PublishResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PublishResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProvenanceDocumentId()) {
        optionals.set(0);
      }
      if (struct.isSetWarehouseTimestamp()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetProvenanceDocumentId()) {
        oprot.writeI64(struct.provenanceDocumentId);
      }
      if (struct.isSetWarehouseTimestamp()) {
        oprot.writeI64(struct.warehouseTimestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PublishResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.provenanceDocumentId = iprot.readI64();
        struct.setProvenanceDocumentIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.warehouseTimestamp = iprot.readI64();
        struct.setWarehouseTimestampIsSet(true);
      }
    }
  }

}

