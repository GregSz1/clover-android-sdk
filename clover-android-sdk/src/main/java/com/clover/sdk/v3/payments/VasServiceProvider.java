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
 * <li>{@link #getProviderPackage providerPackage}</li>
 * <li>{@link #getProtocolId protocolId}</li>
 * <li>{@link #getSupportedServices supportedServices}</li>
 * <li>{@link #getProtocolConfig protocolConfig}</li>
 * <li>{@link #getPushUrl pushUrl}</li>
 * <li>{@link #getPushTitle pushTitle}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class VasServiceProvider extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique package name identifier of provider
   */
  public java.lang.String getProviderPackage() {
    return genClient.cacheGet(CacheKey.providerPackage);
  }

  public com.clover.sdk.v3.payments.VasProtocol getProtocolId() {
    return genClient.cacheGet(CacheKey.protocolId);
  }

  /**
   * Service types supported by this provider.
   */
  public java.util.List<com.clover.sdk.v3.payments.VasDataType> getSupportedServices() {
    return genClient.cacheGet(CacheKey.supportedServices);
  }

  /**
   * protocol specific configuration
   */
  public java.util.Map<java.lang.String,java.lang.String> getProtocolConfig() {
    return genClient.cacheGet(CacheKey.protocolConfig);
  }

  /**
   * Populated for push use cases (e.g. send signup URL).
   */
  public java.lang.String getPushUrl() {
    return genClient.cacheGet(CacheKey.pushUrl);
  }

  /**
   * Optionally populated for vas push use cases (e.g. send signup URL).
   */
  public java.lang.String getPushTitle() {
    return genClient.cacheGet(CacheKey.pushTitle);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    providerPackage
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    protocolId
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.payments.VasProtocol.class)),
    supportedServices
        (com.clover.sdk.extractors.RecordListExtractionStrategy.instance(com.clover.sdk.v3.payments.VasDataType.JSON_CREATOR)),
    protocolConfig
        (com.clover.sdk.extractors.MapExtractionStrategy.instance()),
    pushUrl
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    pushTitle
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
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

  private final GenericClient<VasServiceProvider> genClient;

  /**
   * Constructs a new empty instance.
   */
  public VasServiceProvider() {
    genClient = new GenericClient<VasServiceProvider>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected VasServiceProvider(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public VasServiceProvider(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public VasServiceProvider(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public VasServiceProvider(VasServiceProvider src) {
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

  /** Checks whether the 'providerPackage' field is set and is not null */
  public boolean isNotNullProviderPackage() {
    return genClient.cacheValueIsNotNull(CacheKey.providerPackage);
  }

  /** Checks whether the 'protocolId' field is set and is not null */
  public boolean isNotNullProtocolId() {
    return genClient.cacheValueIsNotNull(CacheKey.protocolId);
  }

  /** Checks whether the 'supportedServices' field is set and is not null */
  public boolean isNotNullSupportedServices() {
    return genClient.cacheValueIsNotNull(CacheKey.supportedServices);
  }

  /** Checks whether the 'supportedServices' field is set and is not null and is not empty */
  public boolean isNotEmptySupportedServices() { return isNotNullSupportedServices() && !getSupportedServices().isEmpty(); }

  /** Checks whether the 'protocolConfig' field is set and is not null */
  public boolean isNotNullProtocolConfig() {
    return genClient.cacheValueIsNotNull(CacheKey.protocolConfig);
  }

  /** Checks whether the 'protocolConfig' field is set and is not null and is not empty */
  public boolean isNotEmptyProtocolConfig() { return isNotNullProtocolConfig() && !getProtocolConfig().isEmpty(); }

  /** Checks whether the 'pushUrl' field is set and is not null */
  public boolean isNotNullPushUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.pushUrl);
  }

  /** Checks whether the 'pushTitle' field is set and is not null */
  public boolean isNotNullPushTitle() {
    return genClient.cacheValueIsNotNull(CacheKey.pushTitle);
  }



  /** Checks whether the 'providerPackage' field has been set, however the value could be null */
  public boolean hasProviderPackage() {
    return genClient.cacheHasKey(CacheKey.providerPackage);
  }

  /** Checks whether the 'protocolId' field has been set, however the value could be null */
  public boolean hasProtocolId() {
    return genClient.cacheHasKey(CacheKey.protocolId);
  }

  /** Checks whether the 'supportedServices' field has been set, however the value could be null */
  public boolean hasSupportedServices() {
    return genClient.cacheHasKey(CacheKey.supportedServices);
  }

  /** Checks whether the 'protocolConfig' field has been set, however the value could be null */
  public boolean hasProtocolConfig() {
    return genClient.cacheHasKey(CacheKey.protocolConfig);
  }

  /** Checks whether the 'pushUrl' field has been set, however the value could be null */
  public boolean hasPushUrl() {
    return genClient.cacheHasKey(CacheKey.pushUrl);
  }

  /** Checks whether the 'pushTitle' field has been set, however the value could be null */
  public boolean hasPushTitle() {
    return genClient.cacheHasKey(CacheKey.pushTitle);
  }


  /**
   * Sets the field 'providerPackage'.
   */
  public VasServiceProvider setProviderPackage(java.lang.String providerPackage) {
    return genClient.setOther(providerPackage, CacheKey.providerPackage);
  }

  /**
   * Sets the field 'protocolId'.
   */
  public VasServiceProvider setProtocolId(com.clover.sdk.v3.payments.VasProtocol protocolId) {
    return genClient.setOther(protocolId, CacheKey.protocolId);
  }

  /**
   * Sets the field 'supportedServices'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public VasServiceProvider setSupportedServices(java.util.List<com.clover.sdk.v3.payments.VasDataType> supportedServices) {
    return genClient.setArrayRecord(supportedServices, CacheKey.supportedServices);
  }

  /**
   * Sets the field 'protocolConfig'.
   */
  public VasServiceProvider setProtocolConfig(java.util.Map<java.lang.String,java.lang.String> protocolConfig) {
    return genClient.setOther(protocolConfig, CacheKey.protocolConfig);
  }

  /**
   * Sets the field 'pushUrl'.
   */
  public VasServiceProvider setPushUrl(java.lang.String pushUrl) {
    return genClient.setOther(pushUrl, CacheKey.pushUrl);
  }

  /**
   * Sets the field 'pushTitle'.
   */
  public VasServiceProvider setPushTitle(java.lang.String pushTitle) {
    return genClient.setOther(pushTitle, CacheKey.pushTitle);
  }


  /** Clears the 'providerPackage' field, the 'has' method for this field will now return false */
  public void clearProviderPackage() {
    genClient.clear(CacheKey.providerPackage);
  }
  /** Clears the 'protocolId' field, the 'has' method for this field will now return false */
  public void clearProtocolId() {
    genClient.clear(CacheKey.protocolId);
  }
  /** Clears the 'supportedServices' field, the 'has' method for this field will now return false */
  public void clearSupportedServices() {
    genClient.clear(CacheKey.supportedServices);
  }
  /** Clears the 'protocolConfig' field, the 'has' method for this field will now return false */
  public void clearProtocolConfig() {
    genClient.clear(CacheKey.protocolConfig);
  }
  /** Clears the 'pushUrl' field, the 'has' method for this field will now return false */
  public void clearPushUrl() {
    genClient.clear(CacheKey.pushUrl);
  }
  /** Clears the 'pushTitle' field, the 'has' method for this field will now return false */
  public void clearPushTitle() {
    genClient.clear(CacheKey.pushTitle);
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
  public VasServiceProvider copyChanges() {
    VasServiceProvider copy = new VasServiceProvider();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(VasServiceProvider src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new VasServiceProvider(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<VasServiceProvider> CREATOR = new android.os.Parcelable.Creator<VasServiceProvider>() {
    @Override
    public VasServiceProvider createFromParcel(android.os.Parcel in) {
      VasServiceProvider instance = new VasServiceProvider(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public VasServiceProvider[] newArray(int size) {
      return new VasServiceProvider[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<VasServiceProvider> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<VasServiceProvider>() {
    public Class<VasServiceProvider> getCreatedClass() {
      return VasServiceProvider.class;
    }

    @Override
    public VasServiceProvider create(org.json.JSONObject jsonObject) {
      return new VasServiceProvider(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean PROVIDERPACKAGE_IS_REQUIRED = false;
    public static final boolean PROTOCOLID_IS_REQUIRED = false;
    public static final boolean SUPPORTEDSERVICES_IS_REQUIRED = false;
    public static final boolean PROTOCOLCONFIG_IS_REQUIRED = false;
    public static final boolean PUSHURL_IS_REQUIRED = false;
    public static final boolean PUSHTITLE_IS_REQUIRED = false;
  }

}
