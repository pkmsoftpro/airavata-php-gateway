/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.messaging.event;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-11")
public class ExperimentStatusChangeEvent implements org.apache.thrift.TBase<ExperimentStatusChangeEvent, ExperimentStatusChangeEvent._Fields>, java.io.Serializable, Cloneable, Comparable<ExperimentStatusChangeEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExperimentStatusChangeEvent");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EXPERIMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayId", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExperimentStatusChangeEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExperimentStatusChangeEventTupleSchemeFactory());
  }

  private org.apache.airavata.model.status.ExperimentState state; // required
  private String experimentId; // required
  private String gatewayId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.airavata.model.status.ExperimentState
     */
    STATE((short)1, "state"),
    EXPERIMENT_ID((short)2, "experimentId"),
    GATEWAY_ID((short)3, "gatewayId");

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
        case 1: // STATE
          return STATE;
        case 2: // EXPERIMENT_ID
          return EXPERIMENT_ID;
        case 3: // GATEWAY_ID
          return GATEWAY_ID;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.airavata.model.status.ExperimentState.class)));
    tmpMap.put(_Fields.EXPERIMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("experimentId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExperimentStatusChangeEvent.class, metaDataMap);
  }

  public ExperimentStatusChangeEvent() {
  }

  public ExperimentStatusChangeEvent(
    org.apache.airavata.model.status.ExperimentState state,
    String experimentId,
    String gatewayId)
  {
    this();
    this.state = state;
    this.experimentId = experimentId;
    this.gatewayId = gatewayId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExperimentStatusChangeEvent(ExperimentStatusChangeEvent other) {
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetExperimentId()) {
      this.experimentId = other.experimentId;
    }
    if (other.isSetGatewayId()) {
      this.gatewayId = other.gatewayId;
    }
  }

  public ExperimentStatusChangeEvent deepCopy() {
    return new ExperimentStatusChangeEvent(this);
  }

  @Override
  public void clear() {
    this.state = null;
    this.experimentId = null;
    this.gatewayId = null;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.ExperimentState
   */
  public org.apache.airavata.model.status.ExperimentState getState() {
    return this.state;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.ExperimentState
   */
  public void setState(org.apache.airavata.model.status.ExperimentState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public String getExperimentId() {
    return this.experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = experimentId;
  }

  public void unsetExperimentId() {
    this.experimentId = null;
  }

  /** Returns true if field experimentId is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentId() {
    return this.experimentId != null;
  }

  public void setExperimentIdIsSet(boolean value) {
    if (!value) {
      this.experimentId = null;
    }
  }

  public String getGatewayId() {
    return this.gatewayId;
  }

  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }

  public void unsetGatewayId() {
    this.gatewayId = null;
  }

  /** Returns true if field gatewayId is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayId() {
    return this.gatewayId != null;
  }

  public void setGatewayIdIsSet(boolean value) {
    if (!value) {
      this.gatewayId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((org.apache.airavata.model.status.ExperimentState)value);
      }
      break;

    case EXPERIMENT_ID:
      if (value == null) {
        unsetExperimentId();
      } else {
        setExperimentId((String)value);
      }
      break;

    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayId();
      } else {
        setGatewayId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case EXPERIMENT_ID:
      return getExperimentId();

    case GATEWAY_ID:
      return getGatewayId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case EXPERIMENT_ID:
      return isSetExperimentId();
    case GATEWAY_ID:
      return isSetGatewayId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExperimentStatusChangeEvent)
      return this.equals((ExperimentStatusChangeEvent)that);
    return false;
  }

  public boolean equals(ExperimentStatusChangeEvent that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_experimentId = true && this.isSetExperimentId();
    boolean that_present_experimentId = true && that.isSetExperimentId();
    if (this_present_experimentId || that_present_experimentId) {
      if (!(this_present_experimentId && that_present_experimentId))
        return false;
      if (!this.experimentId.equals(that.experimentId))
        return false;
    }

    boolean this_present_gatewayId = true && this.isSetGatewayId();
    boolean that_present_gatewayId = true && that.isSetGatewayId();
    if (this_present_gatewayId || that_present_gatewayId) {
      if (!(this_present_gatewayId && that_present_gatewayId))
        return false;
      if (!this.gatewayId.equals(that.gatewayId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state.getValue());

    boolean present_experimentId = true && (isSetExperimentId());
    list.add(present_experimentId);
    if (present_experimentId)
      list.add(experimentId);

    boolean present_gatewayId = true && (isSetGatewayId());
    list.add(present_gatewayId);
    if (present_gatewayId)
      list.add(gatewayId);

    return list.hashCode();
  }

  @Override
  public int compareTo(ExperimentStatusChangeEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExperimentId()).compareTo(other.isSetExperimentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentId, other.experimentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGatewayId()).compareTo(other.isSetGatewayId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayId, other.gatewayId);
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
    StringBuilder sb = new StringBuilder("ExperimentStatusChangeEvent(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("experimentId:");
    if (this.experimentId == null) {
      sb.append("null");
    } else {
      sb.append(this.experimentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gatewayId:");
    if (this.gatewayId == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetState()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' is unset! Struct:" + toString());
    }

    if (!isSetExperimentId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'experimentId' is unset! Struct:" + toString());
    }

    if (!isSetGatewayId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayId' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExperimentStatusChangeEventStandardSchemeFactory implements SchemeFactory {
    public ExperimentStatusChangeEventStandardScheme getScheme() {
      return new ExperimentStatusChangeEventStandardScheme();
    }
  }

  private static class ExperimentStatusChangeEventStandardScheme extends StandardScheme<ExperimentStatusChangeEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExperimentStatusChangeEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = org.apache.airavata.model.status.ExperimentState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXPERIMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentId = iprot.readString();
              struct.setExperimentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayId = iprot.readString();
              struct.setGatewayIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExperimentStatusChangeEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.experimentId != null) {
        oprot.writeFieldBegin(EXPERIMENT_ID_FIELD_DESC);
        oprot.writeString(struct.experimentId);
        oprot.writeFieldEnd();
      }
      if (struct.gatewayId != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExperimentStatusChangeEventTupleSchemeFactory implements SchemeFactory {
    public ExperimentStatusChangeEventTupleScheme getScheme() {
      return new ExperimentStatusChangeEventTupleScheme();
    }
  }

  private static class ExperimentStatusChangeEventTupleScheme extends TupleScheme<ExperimentStatusChangeEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExperimentStatusChangeEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.state.getValue());
      oprot.writeString(struct.experimentId);
      oprot.writeString(struct.gatewayId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExperimentStatusChangeEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.state = org.apache.airavata.model.status.ExperimentState.findByValue(iprot.readI32());
      struct.setStateIsSet(true);
      struct.experimentId = iprot.readString();
      struct.setExperimentIdIsSet(true);
      struct.gatewayId = iprot.readString();
      struct.setGatewayIdIsSet(true);
    }
  }

}

