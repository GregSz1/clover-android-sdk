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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getCashAdvanceSerialNum cashAdvanceSerialNum}</li>
 * <li>{@link #getCashAdvanceCustomerIdentification cashAdvanceCustomerIdentification}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CashAdvanceExtra extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getCashAdvanceSerialNum() {
    return genClient.cacheGet(CacheKey.cashAdvanceSerialNum);
  }

  public com.clover.sdk.v3.payments.CashAdvanceCustomerIdentification getCashAdvanceCustomerIdentification() {
    return genClient.cacheGet(CacheKey.cashAdvanceCustomerIdentification);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    cashAdvanceSerialNum
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    cashAdvanceCustomerIdentification
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.payments.CashAdvanceCustomerIdentification.JSON_CREATOR)),
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

  private final GenericClient<CashAdvanceExtra> genClient;

  /**
   * Constructs a new empty instance.
   */
  public CashAdvanceExtra() {
    genClient = new GenericClient<CashAdvanceExtra>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected CashAdvanceExtra(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CashAdvanceExtra(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public CashAdvanceExtra(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CashAdvanceExtra(CashAdvanceExtra src) {
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
    genClient.validateLength(CacheKey.cashAdvanceSerialNum, getCashAdvanceSerialNum(), 10);
  }

  /** Checks whether the 'cashAdvanceSerialNum' field is set and is not null */
  public boolean isNotNullCashAdvanceSerialNum() {
    return genClient.cacheValueIsNotNull(CacheKey.cashAdvanceSerialNum);
  }

  /** Checks whether the 'cashAdvanceCustomerIdentification' field is set and is not null */
  public boolean isNotNullCashAdvanceCustomerIdentification() {
    return genClient.cacheValueIsNotNull(CacheKey.cashAdvanceCustomerIdentification);
  }



  /** Checks whether the 'cashAdvanceSerialNum' field has been set, however the value could be null */
  public boolean hasCashAdvanceSerialNum() {
    return genClient.cacheHasKey(CacheKey.cashAdvanceSerialNum);
  }

  /** Checks whether the 'cashAdvanceCustomerIdentification' field has been set, however the value could be null */
  public boolean hasCashAdvanceCustomerIdentification() {
    return genClient.cacheHasKey(CacheKey.cashAdvanceCustomerIdentification);
  }


  /**
   * Sets the field 'cashAdvanceSerialNum'.
   */
  public CashAdvanceExtra setCashAdvanceSerialNum(java.lang.String cashAdvanceSerialNum) {
    return genClient.setOther(cashAdvanceSerialNum, CacheKey.cashAdvanceSerialNum);
  }

  /**
   * Sets the field 'cashAdvanceCustomerIdentification'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CashAdvanceExtra setCashAdvanceCustomerIdentification(com.clover.sdk.v3.payments.CashAdvanceCustomerIdentification cashAdvanceCustomerIdentification) {
    return genClient.setRecord(cashAdvanceCustomerIdentification, CacheKey.cashAdvanceCustomerIdentification);
  }


  /** Clears the 'cashAdvanceSerialNum' field, the 'has' method for this field will now return false */
  public void clearCashAdvanceSerialNum() {
    genClient.clear(CacheKey.cashAdvanceSerialNum);
  }
  /** Clears the 'cashAdvanceCustomerIdentification' field, the 'has' method for this field will now return false */
  public void clearCashAdvanceCustomerIdentification() {
    genClient.clear(CacheKey.cashAdvanceCustomerIdentification);
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
  public CashAdvanceExtra copyChanges() {
    CashAdvanceExtra copy = new CashAdvanceExtra();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CashAdvanceExtra src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CashAdvanceExtra(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CashAdvanceExtra> CREATOR = new android.os.Parcelable.Creator<CashAdvanceExtra>() {
    @Override
    public CashAdvanceExtra createFromParcel(android.os.Parcel in) {
      CashAdvanceExtra instance = new CashAdvanceExtra(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CashAdvanceExtra[] newArray(int size) {
      return new CashAdvanceExtra[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CashAdvanceExtra> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CashAdvanceExtra>() {
    public Class<CashAdvanceExtra> getCreatedClass() {
      return CashAdvanceExtra.class;
    }

    @Override
    public CashAdvanceExtra create(org.json.JSONObject jsonObject) {
      return new CashAdvanceExtra(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean CASHADVANCESERIALNUM_IS_REQUIRED = false;
    public static final long CASHADVANCESERIALNUM_MAX_LEN = 10;
    public static final boolean CASHADVANCECUSTOMERIDENTIFICATION_IS_REQUIRED = false;
  }

}
