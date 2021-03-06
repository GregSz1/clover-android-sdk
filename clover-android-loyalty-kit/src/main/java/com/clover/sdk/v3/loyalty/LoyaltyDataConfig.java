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

package com.clover.sdk.v3.loyalty;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getType type}</li>
 * <li>{@link #getConfiguration configuration}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class LoyaltyDataConfig extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The string type of the loyalty data of interest.
   */
  public java.lang.String getType() {
    return genClient.cacheGet(CacheKey.type);
  }

  /**
   * Configuration for the data type.
   */
  public java.util.Map<java.lang.String,java.lang.String> getConfiguration() {
    return genClient.cacheGet(CacheKey.configuration);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    type
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    configuration
        (com.clover.sdk.extractors.MapExtractionStrategy.instance()),
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

  private final GenericClient<LoyaltyDataConfig> genClient;

  /**
   * Constructs a new empty instance.
   */
  public LoyaltyDataConfig() {
    genClient = new GenericClient<LoyaltyDataConfig>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected LoyaltyDataConfig(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public LoyaltyDataConfig(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public LoyaltyDataConfig(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public LoyaltyDataConfig(LoyaltyDataConfig src) {
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

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'configuration' field is set and is not null */
  public boolean isNotNullConfiguration() {
    return genClient.cacheValueIsNotNull(CacheKey.configuration);
  }

  /** Checks whether the 'configuration' field is set and is not null and is not empty */
  public boolean isNotEmptyConfiguration() { return isNotNullConfiguration() && !getConfiguration().isEmpty(); }



  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'configuration' field has been set, however the value could be null */
  public boolean hasConfiguration() {
    return genClient.cacheHasKey(CacheKey.configuration);
  }


  /**
   * Sets the field 'type'.
   */
  public LoyaltyDataConfig setType(java.lang.String type) {
    return genClient.setOther(type, CacheKey.type);
  }

  /**
   * Sets the field 'configuration'.
   */
  public LoyaltyDataConfig setConfiguration(java.util.Map<java.lang.String,java.lang.String> configuration) {
    return genClient.setOther(configuration, CacheKey.configuration);
  }


  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    genClient.clear(CacheKey.type);
  }
  /** Clears the 'configuration' field, the 'has' method for this field will now return false */
  public void clearConfiguration() {
    genClient.clear(CacheKey.configuration);
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
  public LoyaltyDataConfig copyChanges() {
    LoyaltyDataConfig copy = new LoyaltyDataConfig();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(LoyaltyDataConfig src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new LoyaltyDataConfig(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<LoyaltyDataConfig> CREATOR = new android.os.Parcelable.Creator<LoyaltyDataConfig>() {
    @Override
    public LoyaltyDataConfig createFromParcel(android.os.Parcel in) {
      LoyaltyDataConfig instance = new LoyaltyDataConfig(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public LoyaltyDataConfig[] newArray(int size) {
      return new LoyaltyDataConfig[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<LoyaltyDataConfig> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<LoyaltyDataConfig>() {
    @Override
    public LoyaltyDataConfig create(org.json.JSONObject jsonObject) {
      return new LoyaltyDataConfig(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean TYPE_IS_REQUIRED = false;
    public static final boolean CONFIGURATION_IS_REQUIRED = false;

  }

}
