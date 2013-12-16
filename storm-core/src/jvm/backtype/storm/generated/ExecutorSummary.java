/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
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

public class ExecutorSummary implements org.apache.thrift7.TBase<ExecutorSummary, ExecutorSummary._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("ExecutorSummary");

  private static final org.apache.thrift7.protocol.TField EXECUTOR_INFO_FIELD_DESC = new org.apache.thrift7.protocol.TField("executor_info", org.apache.thrift7.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift7.protocol.TField COMPONENT_ID_FIELD_DESC = new org.apache.thrift7.protocol.TField("component_id", org.apache.thrift7.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift7.protocol.TField HOST_FIELD_DESC = new org.apache.thrift7.protocol.TField("host", org.apache.thrift7.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift7.protocol.TField PORT_FIELD_DESC = new org.apache.thrift7.protocol.TField("port", org.apache.thrift7.protocol.TType.I32, (short)4);
  private static final org.apache.thrift7.protocol.TField UPTIME_SECS_FIELD_DESC = new org.apache.thrift7.protocol.TField("uptime_secs", org.apache.thrift7.protocol.TType.I32, (short)5);
  private static final org.apache.thrift7.protocol.TField STATS_FIELD_DESC = new org.apache.thrift7.protocol.TField("stats", org.apache.thrift7.protocol.TType.STRUCT, (short)7);

  private ExecutorInfo executor_info; // required
  private String component_id; // required
  private String host; // required
  private int port; // required
  private int uptime_secs; // required
  private ExecutorStats stats; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    EXECUTOR_INFO((short)1, "executor_info"),
    COMPONENT_ID((short)2, "component_id"),
    HOST((short)3, "host"),
    PORT((short)4, "port"),
    UPTIME_SECS((short)5, "uptime_secs"),
    STATS((short)7, "stats");

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
        case 1: // EXECUTOR_INFO
          return EXECUTOR_INFO;
        case 2: // COMPONENT_ID
          return COMPONENT_ID;
        case 3: // HOST
          return HOST;
        case 4: // PORT
          return PORT;
        case 5: // UPTIME_SECS
          return UPTIME_SECS;
        case 7: // STATS
          return STATS;
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
  private static final int __PORT_ISSET_ID = 0;
  private static final int __UPTIME_SECS_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXECUTOR_INFO, new org.apache.thrift7.meta_data.FieldMetaData("executor_info", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, ExecutorInfo.class)));
    tmpMap.put(_Fields.COMPONENT_ID, new org.apache.thrift7.meta_data.FieldMetaData("component_id", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOST, new org.apache.thrift7.meta_data.FieldMetaData("host", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift7.meta_data.FieldMetaData("port", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.UPTIME_SECS, new org.apache.thrift7.meta_data.FieldMetaData("uptime_secs", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.STATS, new org.apache.thrift7.meta_data.FieldMetaData("stats", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, ExecutorStats.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(ExecutorSummary.class, metaDataMap);
  }

  public ExecutorSummary() {
  }

  public ExecutorSummary(
    ExecutorInfo executor_info,
    String component_id,
    String host,
    int port,
    int uptime_secs)
  {
    this();
    this.executor_info = executor_info;
    this.component_id = component_id;
    this.host = host;
    this.port = port;
    set_port_isSet(true);
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecutorSummary(ExecutorSummary other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_executor_info()) {
      this.executor_info = new ExecutorInfo(other.executor_info);
    }
    if (other.is_set_component_id()) {
      this.component_id = other.component_id;
    }
    if (other.is_set_host()) {
      this.host = other.host;
    }
    this.port = other.port;
    this.uptime_secs = other.uptime_secs;
    if (other.is_set_stats()) {
      this.stats = new ExecutorStats(other.stats);
    }
  }

  public ExecutorSummary deepCopy() {
    return new ExecutorSummary(this);
  }

  @Override
  public void clear() {
    this.executor_info = null;
    this.component_id = null;
    this.host = null;
    set_port_isSet(false);
    this.port = 0;
    set_uptime_secs_isSet(false);
    this.uptime_secs = 0;
    this.stats = null;
  }

  public ExecutorInfo get_executor_info() {
    return this.executor_info;
  }

  public void set_executor_info(ExecutorInfo executor_info) {
    this.executor_info = executor_info;
  }

  public void unset_executor_info() {
    this.executor_info = null;
  }

  /** Returns true if field executor_info is set (has been assigned a value) and false otherwise */
  public boolean is_set_executor_info() {
    return this.executor_info != null;
  }

  public void set_executor_info_isSet(boolean value) {
    if (!value) {
      this.executor_info = null;
    }
  }

  public String get_component_id() {
    return this.component_id;
  }

  public void set_component_id(String component_id) {
    this.component_id = component_id;
  }

  public void unset_component_id() {
    this.component_id = null;
  }

  /** Returns true if field component_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_component_id() {
    return this.component_id != null;
  }

  public void set_component_id_isSet(boolean value) {
    if (!value) {
      this.component_id = null;
    }
  }

  public String get_host() {
    return this.host;
  }

  public void set_host(String host) {
    this.host = host;
  }

  public void unset_host() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean is_set_host() {
    return this.host != null;
  }

  public void set_host_isSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int get_port() {
    return this.port;
  }

  public void set_port(int port) {
    this.port = port;
    set_port_isSet(true);
  }

  public void unset_port() {
    __isset_bit_vector.clear(__PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean is_set_port() {
    return __isset_bit_vector.get(__PORT_ISSET_ID);
  }

  public void set_port_isSet(boolean value) {
    __isset_bit_vector.set(__PORT_ISSET_ID, value);
  }

  public int get_uptime_secs() {
    return this.uptime_secs;
  }

  public void set_uptime_secs(int uptime_secs) {
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
  }

  public void unset_uptime_secs() {
    __isset_bit_vector.clear(__UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field uptime_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_uptime_secs() {
    return __isset_bit_vector.get(__UPTIME_SECS_ISSET_ID);
  }

  public void set_uptime_secs_isSet(boolean value) {
    __isset_bit_vector.set(__UPTIME_SECS_ISSET_ID, value);
  }

  public ExecutorStats get_stats() {
    return this.stats;
  }

  public void set_stats(ExecutorStats stats) {
    this.stats = stats;
  }

  public void unset_stats() {
    this.stats = null;
  }

  /** Returns true if field stats is set (has been assigned a value) and false otherwise */
  public boolean is_set_stats() {
    return this.stats != null;
  }

  public void set_stats_isSet(boolean value) {
    if (!value) {
      this.stats = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXECUTOR_INFO:
      if (value == null) {
        unset_executor_info();
      } else {
        set_executor_info((ExecutorInfo)value);
      }
      break;

    case COMPONENT_ID:
      if (value == null) {
        unset_component_id();
      } else {
        set_component_id((String)value);
      }
      break;

    case HOST:
      if (value == null) {
        unset_host();
      } else {
        set_host((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unset_port();
      } else {
        set_port((Integer)value);
      }
      break;

    case UPTIME_SECS:
      if (value == null) {
        unset_uptime_secs();
      } else {
        set_uptime_secs((Integer)value);
      }
      break;

    case STATS:
      if (value == null) {
        unset_stats();
      } else {
        set_stats((ExecutorStats)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXECUTOR_INFO:
      return get_executor_info();

    case COMPONENT_ID:
      return get_component_id();

    case HOST:
      return get_host();

    case PORT:
      return Integer.valueOf(get_port());

    case UPTIME_SECS:
      return Integer.valueOf(get_uptime_secs());

    case STATS:
      return get_stats();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXECUTOR_INFO:
      return is_set_executor_info();
    case COMPONENT_ID:
      return is_set_component_id();
    case HOST:
      return is_set_host();
    case PORT:
      return is_set_port();
    case UPTIME_SECS:
      return is_set_uptime_secs();
    case STATS:
      return is_set_stats();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecutorSummary)
      return this.equals((ExecutorSummary)that);
    return false;
  }

  public boolean equals(ExecutorSummary that) {
    if (that == null)
      return false;

    boolean this_present_executor_info = true && this.is_set_executor_info();
    boolean that_present_executor_info = true && that.is_set_executor_info();
    if (this_present_executor_info || that_present_executor_info) {
      if (!(this_present_executor_info && that_present_executor_info))
        return false;
      if (!this.executor_info.equals(that.executor_info))
        return false;
    }

    boolean this_present_component_id = true && this.is_set_component_id();
    boolean that_present_component_id = true && that.is_set_component_id();
    if (this_present_component_id || that_present_component_id) {
      if (!(this_present_component_id && that_present_component_id))
        return false;
      if (!this.component_id.equals(that.component_id))
        return false;
    }

    boolean this_present_host = true && this.is_set_host();
    boolean that_present_host = true && that.is_set_host();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_uptime_secs = true;
    boolean that_present_uptime_secs = true;
    if (this_present_uptime_secs || that_present_uptime_secs) {
      if (!(this_present_uptime_secs && that_present_uptime_secs))
        return false;
      if (this.uptime_secs != that.uptime_secs)
        return false;
    }

    boolean this_present_stats = true && this.is_set_stats();
    boolean that_present_stats = true && that.is_set_stats();
    if (this_present_stats || that_present_stats) {
      if (!(this_present_stats && that_present_stats))
        return false;
      if (!this.stats.equals(that.stats))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_executor_info = true && (is_set_executor_info());
    builder.append(present_executor_info);
    if (present_executor_info)
      builder.append(executor_info);

    boolean present_component_id = true && (is_set_component_id());
    builder.append(present_component_id);
    if (present_component_id)
      builder.append(component_id);

    boolean present_host = true && (is_set_host());
    builder.append(present_host);
    if (present_host)
      builder.append(host);

    boolean present_port = true;
    builder.append(present_port);
    if (present_port)
      builder.append(port);

    boolean present_uptime_secs = true;
    builder.append(present_uptime_secs);
    if (present_uptime_secs)
      builder.append(uptime_secs);

    boolean present_stats = true && (is_set_stats());
    builder.append(present_stats);
    if (present_stats)
      builder.append(stats);

    return builder.toHashCode();
  }

  public int compareTo(ExecutorSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ExecutorSummary typedOther = (ExecutorSummary)other;

    lastComparison = Boolean.valueOf(is_set_executor_info()).compareTo(typedOther.is_set_executor_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executor_info()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.executor_info, typedOther.executor_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_component_id()).compareTo(typedOther.is_set_component_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_component_id()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.component_id, typedOther.component_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_host()).compareTo(typedOther.is_set_host());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_host()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.host, typedOther.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_port()).compareTo(typedOther.is_set_port());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.port, typedOther.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_uptime_secs()).compareTo(typedOther.is_set_uptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_uptime_secs()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.uptime_secs, typedOther.uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_stats()).compareTo(typedOther.is_set_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_stats()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.stats, typedOther.stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // EXECUTOR_INFO
          if (field.type == org.apache.thrift7.protocol.TType.STRUCT) {
            this.executor_info = new ExecutorInfo();
            this.executor_info.read(iprot);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COMPONENT_ID
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.component_id = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // HOST
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.host = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PORT
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.port = iprot.readI32();
            set_port_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // UPTIME_SECS
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.uptime_secs = iprot.readI32();
            set_uptime_secs_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // STATS
          if (field.type == org.apache.thrift7.protocol.TType.STRUCT) {
            this.stats = new ExecutorStats();
            this.stats.read(iprot);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.executor_info != null) {
      oprot.writeFieldBegin(EXECUTOR_INFO_FIELD_DESC);
      this.executor_info.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.component_id != null) {
      oprot.writeFieldBegin(COMPONENT_ID_FIELD_DESC);
      oprot.writeString(this.component_id);
      oprot.writeFieldEnd();
    }
    if (this.host != null) {
      oprot.writeFieldBegin(HOST_FIELD_DESC);
      oprot.writeString(this.host);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PORT_FIELD_DESC);
    oprot.writeI32(this.port);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(UPTIME_SECS_FIELD_DESC);
    oprot.writeI32(this.uptime_secs);
    oprot.writeFieldEnd();
    if (this.stats != null) {
      if (is_set_stats()) {
        oprot.writeFieldBegin(STATS_FIELD_DESC);
        this.stats.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ExecutorSummary(");
    boolean first = true;

    sb.append("executor_info:");
    if (this.executor_info == null) {
      sb.append("null");
    } else {
      sb.append(this.executor_info);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("component_id:");
    if (this.component_id == null) {
      sb.append("null");
    } else {
      sb.append(this.component_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uptime_secs:");
    sb.append(this.uptime_secs);
    first = false;
    if (is_set_stats()) {
      if (!first) sb.append(", ");
      sb.append("stats:");
      if (this.stats == null) {
        sb.append("null");
      } else {
        sb.append(this.stats);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_executor_info()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'executor_info' is unset! Struct:" + toString());
    }

    if (!is_set_component_id()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'component_id' is unset! Struct:" + toString());
    }

    if (!is_set_host()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'host' is unset! Struct:" + toString());
    }

    if (!is_set_port()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'port' is unset! Struct:" + toString());
    }

    if (!is_set_uptime_secs()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'uptime_secs' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

