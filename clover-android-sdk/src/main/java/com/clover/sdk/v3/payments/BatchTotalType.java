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
 * <li>{@link #getCount count}</li>
 * <li>{@link #getTotal total}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class BatchTotalType extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Total count of types
   */
  public java.lang.Long getCount() {
    return genClient.cacheGet(CacheKey.count);
  }

  /**
   * Total amount for type
   */
  public java.lang.Long getTotal() {
    return genClient.cacheGet(CacheKey.total);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    count
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    total
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
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

  private final GenericClient<BatchTotalType> genClient;

  /**
   * Constructs a new empty instance.
   */
  public BatchTotalType() {
    genClient = new GenericClient<BatchTotalType>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected BatchTotalType(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public BatchTotalType(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public BatchTotalType(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public BatchTotalType(BatchTotalType src) {
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
  }

  /** Checks whether the 'count' field is set and is not null */
  public boolean isNotNullCount() {
    return genClient.cacheValueIsNotNull(CacheKey.count);
  }

  /** Checks whether the 'total' field is set and is not null */
  public boolean isNotNullTotal() {
    return genClient.cacheValueIsNotNull(CacheKey.total);
  }



  /** Checks whether the 'count' field has been set, however the value could be null */
  public boolean hasCount() {
    return genClient.cacheHasKey(CacheKey.count);
  }

  /** Checks whether the 'total' field has been set, however the value could be null */
  public boolean hasTotal() {
    return genClient.cacheHasKey(CacheKey.total);
  }


  /**
   * Sets the field 'count'.
   */
  public BatchTotalType setCount(java.lang.Long count) {
    return genClient.setOther(count, CacheKey.count);
  }

  /**
   * Sets the field 'total'.
   */
  public BatchTotalType setTotal(java.lang.Long total) {
    return genClient.setOther(total, CacheKey.total);
  }


  /** Clears the 'count' field, the 'has' method for this field will now return false */
  public void clearCount() {
    genClient.clear(CacheKey.count);
  }
  /** Clears the 'total' field, the 'has' method for this field will now return false */
  public void clearTotal() {
    genClient.clear(CacheKey.total);
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
  public BatchTotalType copyChanges() {
    BatchTotalType copy = new BatchTotalType();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(BatchTotalType src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new BatchTotalType(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<BatchTotalType> CREATOR = new android.os.Parcelable.Creator<BatchTotalType>() {
    @Override
    public BatchTotalType createFromParcel(android.os.Parcel in) {
      BatchTotalType instance = new BatchTotalType(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public BatchTotalType[] newArray(int size) {
      return new BatchTotalType[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<BatchTotalType> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<BatchTotalType>() {
    public Class<BatchTotalType> getCreatedClass() {
      return BatchTotalType.class;
    }

    @Override
    public BatchTotalType create(org.json.JSONObject jsonObject) {
      return new BatchTotalType(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean COUNT_IS_REQUIRED = false;
    public static final boolean TOTAL_IS_REQUIRED = false;
  }

}
