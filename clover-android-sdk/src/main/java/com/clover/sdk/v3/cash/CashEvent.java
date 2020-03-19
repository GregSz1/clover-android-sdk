/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

/*
 * Copyright (C) 2019 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.cash;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getType type}</li>
 * <li>{@link #getAmountChange amountChange}</li>
 * <li>{@link #getTimestamp timestamp}</li>
 * <li>{@link #getNote note}</li>
 * <li>{@link #getEmployee employee}</li>
 * <li>{@link #getDevice device}</li>
 * <li>{@link #getMerchant merchant}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CashEvent extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The type of event that occurred
   */
  public com.clover.sdk.v3.cash.Type getType() {
    return genClient.cacheGet(CacheKey.type);
  }

  /**
   * The amount that was either added, removed of modified by the event
   */
  public java.lang.Long getAmountChange() {
    return genClient.cacheGet(CacheKey.amountChange);
  }

  /**
   * Time at which the event was executed
   */
  public java.lang.Long getTimestamp() {
    return genClient.cacheGet(CacheKey.timestamp);
  }

  /**
   * Any additional information regarding the event
   */
  public java.lang.String getNote() {
    return genClient.cacheGet(CacheKey.note);
  }

  /**
   * The employee who performed the event
   */
  public com.clover.sdk.v3.employees.Employee getEmployee() {
    return genClient.cacheGet(CacheKey.employee);
  }

  /**
   * The device that initiated the event
   */
  public com.clover.sdk.v3.device.Device getDevice() {
    return genClient.cacheGet(CacheKey.device);
  }

  /**
   * The event occurred for this merchant.
   */
  public com.clover.sdk.v3.base.Reference getMerchant() {
    return genClient.cacheGet(CacheKey.merchant);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    type
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.cash.Type.class)),
    amountChange
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    timestamp
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    note
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    employee
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.employees.Employee.JSON_CREATOR)),
    device
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.device.Device.JSON_CREATOR)),
    merchant
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.base.Reference.JSON_CREATOR)),
      ;

    private final com.clover.sdk.extractors.ExtractionStrategy extractionStrategy;

    private CacheKey(com.clover.sdk.extractors.ExtractionStrategy s) {
      extractionStrategy = s;
    }

    @Override
    public com.clover.sdk.extractors.ExtractionStrategy getExtractionStrategy() {
      return extractionStrategy;
    }
  }

  private final GenericClient<CashEvent> genClient;

  /**
   * Constructs a new empty instance.
   */
  public CashEvent() {
    genClient = new GenericClient<CashEvent>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected CashEvent(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CashEvent(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public CashEvent(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CashEvent(CashEvent src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateReferences(CacheKey.merchant);
  }

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'amountChange' field is set and is not null */
  public boolean isNotNullAmountChange() {
    return genClient.cacheValueIsNotNull(CacheKey.amountChange);
  }

  /** Checks whether the 'timestamp' field is set and is not null */
  public boolean isNotNullTimestamp() {
    return genClient.cacheValueIsNotNull(CacheKey.timestamp);
  }

  /** Checks whether the 'note' field is set and is not null */
  public boolean isNotNullNote() {
    return genClient.cacheValueIsNotNull(CacheKey.note);
  }

  /** Checks whether the 'employee' field is set and is not null */
  public boolean isNotNullEmployee() {
    return genClient.cacheValueIsNotNull(CacheKey.employee);
  }

  /** Checks whether the 'device' field is set and is not null */
  public boolean isNotNullDevice() {
    return genClient.cacheValueIsNotNull(CacheKey.device);
  }

  /** Checks whether the 'merchant' field is set and is not null */
  public boolean isNotNullMerchant() {
    return genClient.cacheValueIsNotNull(CacheKey.merchant);
  }



  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'amountChange' field has been set, however the value could be null */
  public boolean hasAmountChange() {
    return genClient.cacheHasKey(CacheKey.amountChange);
  }

  /** Checks whether the 'timestamp' field has been set, however the value could be null */
  public boolean hasTimestamp() {
    return genClient.cacheHasKey(CacheKey.timestamp);
  }

  /** Checks whether the 'note' field has been set, however the value could be null */
  public boolean hasNote() {
    return genClient.cacheHasKey(CacheKey.note);
  }

  /** Checks whether the 'employee' field has been set, however the value could be null */
  public boolean hasEmployee() {
    return genClient.cacheHasKey(CacheKey.employee);
  }

  /** Checks whether the 'device' field has been set, however the value could be null */
  public boolean hasDevice() {
    return genClient.cacheHasKey(CacheKey.device);
  }

  /** Checks whether the 'merchant' field has been set, however the value could be null */
  public boolean hasMerchant() {
    return genClient.cacheHasKey(CacheKey.merchant);
  }


  /**
   * Sets the field 'type'.
   */
  public CashEvent setType(com.clover.sdk.v3.cash.Type type) {
    return genClient.setOther(type, CacheKey.type);
  }

  /**
   * Sets the field 'amountChange'.
   */
  public CashEvent setAmountChange(java.lang.Long amountChange) {
    return genClient.setOther(amountChange, CacheKey.amountChange);
  }

  /**
   * Sets the field 'timestamp'.
   */
  public CashEvent setTimestamp(java.lang.Long timestamp) {
    return genClient.setOther(timestamp, CacheKey.timestamp);
  }

  /**
   * Sets the field 'note'.
   */
  public CashEvent setNote(java.lang.String note) {
    return genClient.setOther(note, CacheKey.note);
  }

  /**
   * Sets the field 'employee'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CashEvent setEmployee(com.clover.sdk.v3.employees.Employee employee) {
    return genClient.setRecord(employee, CacheKey.employee);
  }

  /**
   * Sets the field 'device'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CashEvent setDevice(com.clover.sdk.v3.device.Device device) {
    return genClient.setRecord(device, CacheKey.device);
  }

  /**
   * Sets the field 'merchant'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CashEvent setMerchant(com.clover.sdk.v3.base.Reference merchant) {
    return genClient.setRecord(merchant, CacheKey.merchant);
  }


  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    genClient.clear(CacheKey.type);
  }
  /** Clears the 'amountChange' field, the 'has' method for this field will now return false */
  public void clearAmountChange() {
    genClient.clear(CacheKey.amountChange);
  }
  /** Clears the 'timestamp' field, the 'has' method for this field will now return false */
  public void clearTimestamp() {
    genClient.clear(CacheKey.timestamp);
  }
  /** Clears the 'note' field, the 'has' method for this field will now return false */
  public void clearNote() {
    genClient.clear(CacheKey.note);
  }
  /** Clears the 'employee' field, the 'has' method for this field will now return false */
  public void clearEmployee() {
    genClient.clear(CacheKey.employee);
  }
  /** Clears the 'device' field, the 'has' method for this field will now return false */
  public void clearDevice() {
    genClient.clear(CacheKey.device);
  }
  /** Clears the 'merchant' field, the 'has' method for this field will now return false */
  public void clearMerchant() {
    genClient.clear(CacheKey.merchant);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public CashEvent copyChanges() {
    CashEvent copy = new CashEvent();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CashEvent src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CashEvent(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CashEvent> CREATOR = new android.os.Parcelable.Creator<CashEvent>() {
    @Override
    public CashEvent createFromParcel(android.os.Parcel in) {
      CashEvent instance = new CashEvent(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CashEvent[] newArray(int size) {
      return new CashEvent[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CashEvent> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CashEvent>() {
    public Class<CashEvent> getCreatedClass() {
      return CashEvent.class;
    }

    @Override
    public CashEvent create(org.json.JSONObject jsonObject) {
      return new CashEvent(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean TYPE_IS_REQUIRED = false;
    public static final boolean AMOUNTCHANGE_IS_REQUIRED = false;
    public static final boolean TIMESTAMP_IS_REQUIRED = false;
    public static final boolean NOTE_IS_REQUIRED = false;
    public static final boolean EMPLOYEE_IS_REQUIRED = false;
    public static final boolean DEVICE_IS_REQUIRED = false;
    public static final boolean MERCHANT_IS_REQUIRED = false;
  }

}
