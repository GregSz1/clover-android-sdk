/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.entitlements;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getMid mid}</li>
 * <li>{@link #getMccSource mccSource}</li>
 * <li>{@link #getMcc mcc}</li>
 * <li>{@link #getAcceleration acceleration}</li>
 * <li>{@link #getDefaultMid defaultMid}</li>
 * <li>{@link #getLastBoardedTime lastBoardedTime}</li>
 * <li>{@link #getCreatedTime createdTime}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * <li>{@link #getDeletedTime deletedTime}</li>
 * <li>{@link #getMerchantGatewayEntitlement merchantGatewayEntitlement}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class MerchantGatewayEntitlementConfiguration extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * MID
   */
  public String getMid() {
    return genClient.cacheGet(CacheKey.mid);
  }

  /**
   * MCC Source
   */
  public MccSource getMccSource() {
    return genClient.cacheGet(CacheKey.mccSource);
  }

  /**
   * Merchant Category Code
   */
  public Integer getMcc() {
    return genClient.cacheGet(CacheKey.mcc);
  }

  /**
   * Acceleration
   */
  public Integer getAcceleration() {
    return genClient.cacheGet(CacheKey.acceleration);
  }

  /**
   * Default MID
   */
  public DefaultMid getDefaultMid() {
    return genClient.cacheGet(CacheKey.defaultMid);
  }

  /**
   * Last Boarded timestamp.
   */
  public Long getLastBoardedTime() {
    return genClient.cacheGet(CacheKey.lastBoardedTime);
  }

  /**
   * Created timestamp.
   */
  public Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }

  /**
   * Modified timestamp.
   */
  public Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }

  /**
   * Deleted timestamp.
   */
  public Long getDeletedTime() {
    return genClient.cacheGet(CacheKey.deletedTime);
  }

  public com.clover.sdk.v3.base.Reference getMerchantGatewayEntitlement() {
    return genClient.cacheGet(CacheKey.merchantGatewayEntitlement);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<MerchantGatewayEntitlementConfiguration> {
    id {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    mid {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("mid", String.class);
      }
    },
    mccSource {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractEnum("mccSource", MccSource.class);
      }
    },
    mcc {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("mcc", Integer.class);
      }
    },
    acceleration {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("acceleration", Integer.class);
      }
    },
    defaultMid {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractEnum("defaultMid", DefaultMid.class);
      }
    },
    lastBoardedTime {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("lastBoardedTime", Long.class);
      }
    },
    createdTime {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("createdTime", Long.class);
      }
    },
    modifiedTime {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("modifiedTime", Long.class);
      }
    },
    deletedTime {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractOther("deletedTime", Long.class);
      }
    },
    merchantGatewayEntitlement {
      @Override
      public Object extractValue(MerchantGatewayEntitlementConfiguration instance) {
        return instance.genClient.extractRecord("merchantGatewayEntitlement", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<MerchantGatewayEntitlementConfiguration> genClient;

  /**
   * Constructs a new empty instance.
   */
  public MerchantGatewayEntitlementConfiguration() {
    genClient = new GenericClient<MerchantGatewayEntitlementConfiguration>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected MerchantGatewayEntitlementConfiguration(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantGatewayEntitlementConfiguration(String json) throws IllegalArgumentException {
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
  public MerchantGatewayEntitlementConfiguration(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantGatewayEntitlementConfiguration(MerchantGatewayEntitlementConfiguration src) {
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
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getMid(), 32);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'mid' field is set and is not null */
  public boolean isNotNullMid() {
    return genClient.cacheValueIsNotNull(CacheKey.mid);
  }

  /** Checks whether the 'mccSource' field is set and is not null */
  public boolean isNotNullMccSource() {
    return genClient.cacheValueIsNotNull(CacheKey.mccSource);
  }

  /** Checks whether the 'mcc' field is set and is not null */
  public boolean isNotNullMcc() {
    return genClient.cacheValueIsNotNull(CacheKey.mcc);
  }

  /** Checks whether the 'acceleration' field is set and is not null */
  public boolean isNotNullAcceleration() {
    return genClient.cacheValueIsNotNull(CacheKey.acceleration);
  }

  /** Checks whether the 'defaultMid' field is set and is not null */
  public boolean isNotNullDefaultMid() {
    return genClient.cacheValueIsNotNull(CacheKey.defaultMid);
  }

  /** Checks whether the 'lastBoardedTime' field is set and is not null */
  public boolean isNotNullLastBoardedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.lastBoardedTime);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field is set and is not null */
  public boolean isNotNullDeletedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.deletedTime);
  }

  /** Checks whether the 'merchantGatewayEntitlement' field is set and is not null */
  public boolean isNotNullMerchantGatewayEntitlement() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantGatewayEntitlement);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'mid' field has been set, however the value could be null */
  public boolean hasMid() {
    return genClient.cacheHasKey(CacheKey.mid);
  }

  /** Checks whether the 'mccSource' field has been set, however the value could be null */
  public boolean hasMccSource() {
    return genClient.cacheHasKey(CacheKey.mccSource);
  }

  /** Checks whether the 'mcc' field has been set, however the value could be null */
  public boolean hasMcc() {
    return genClient.cacheHasKey(CacheKey.mcc);
  }

  /** Checks whether the 'acceleration' field has been set, however the value could be null */
  public boolean hasAcceleration() {
    return genClient.cacheHasKey(CacheKey.acceleration);
  }

  /** Checks whether the 'defaultMid' field has been set, however the value could be null */
  public boolean hasDefaultMid() {
    return genClient.cacheHasKey(CacheKey.defaultMid);
  }

  /** Checks whether the 'lastBoardedTime' field has been set, however the value could be null */
  public boolean hasLastBoardedTime() {
    return genClient.cacheHasKey(CacheKey.lastBoardedTime);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }

  /** Checks whether the 'deletedTime' field has been set, however the value could be null */
  public boolean hasDeletedTime() {
    return genClient.cacheHasKey(CacheKey.deletedTime);
  }

  /** Checks whether the 'merchantGatewayEntitlement' field has been set, however the value could be null */
  public boolean hasMerchantGatewayEntitlement() {
    return genClient.cacheHasKey(CacheKey.merchantGatewayEntitlement);
  }


  /**
   * Sets the field 'id'.
   */
  public MerchantGatewayEntitlementConfiguration setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'mid'.
   */
  public MerchantGatewayEntitlementConfiguration setMid(String mid) {
    return genClient.setOther(mid, CacheKey.mid);
  }

  /**
   * Sets the field 'mccSource'.
   */
  public MerchantGatewayEntitlementConfiguration setMccSource(MccSource mccSource) {
    return genClient.setOther(mccSource, CacheKey.mccSource);
  }

  /**
   * Sets the field 'mcc'.
   */
  public MerchantGatewayEntitlementConfiguration setMcc(Integer mcc) {
    return genClient.setOther(mcc, CacheKey.mcc);
  }

  /**
   * Sets the field 'acceleration'.
   */
  public MerchantGatewayEntitlementConfiguration setAcceleration(Integer acceleration) {
    return genClient.setOther(acceleration, CacheKey.acceleration);
  }

  /**
   * Sets the field 'defaultMid'.
   */
  public MerchantGatewayEntitlementConfiguration setDefaultMid(DefaultMid defaultMid) {
    return genClient.setOther(defaultMid, CacheKey.defaultMid);
  }

  /**
   * Sets the field 'lastBoardedTime'.
   */
  public MerchantGatewayEntitlementConfiguration setLastBoardedTime(Long lastBoardedTime) {
    return genClient.setOther(lastBoardedTime, CacheKey.lastBoardedTime);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public MerchantGatewayEntitlementConfiguration setCreatedTime(Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public MerchantGatewayEntitlementConfiguration setModifiedTime(Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }

  /**
   * Sets the field 'deletedTime'.
   */
  public MerchantGatewayEntitlementConfiguration setDeletedTime(Long deletedTime) {
    return genClient.setOther(deletedTime, CacheKey.deletedTime);
  }

  /**
   * Sets the field 'merchantGatewayEntitlement'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantGatewayEntitlementConfiguration setMerchantGatewayEntitlement(com.clover.sdk.v3.base.Reference merchantGatewayEntitlement) {
    return genClient.setRecord(merchantGatewayEntitlement, CacheKey.merchantGatewayEntitlement);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'mid' field, the 'has' method for this field will now return false */
  public void clearMid() {
    genClient.clear(CacheKey.mid);
  }
  /** Clears the 'mccSource' field, the 'has' method for this field will now return false */
  public void clearMccSource() {
    genClient.clear(CacheKey.mccSource);
  }
  /** Clears the 'mcc' field, the 'has' method for this field will now return false */
  public void clearMcc() {
    genClient.clear(CacheKey.mcc);
  }
  /** Clears the 'acceleration' field, the 'has' method for this field will now return false */
  public void clearAcceleration() {
    genClient.clear(CacheKey.acceleration);
  }
  /** Clears the 'defaultMid' field, the 'has' method for this field will now return false */
  public void clearDefaultMid() {
    genClient.clear(CacheKey.defaultMid);
  }
  /** Clears the 'lastBoardedTime' field, the 'has' method for this field will now return false */
  public void clearLastBoardedTime() {
    genClient.clear(CacheKey.lastBoardedTime);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
  }
  /** Clears the 'deletedTime' field, the 'has' method for this field will now return false */
  public void clearDeletedTime() {
    genClient.clear(CacheKey.deletedTime);
  }
  /** Clears the 'merchantGatewayEntitlement' field, the 'has' method for this field will now return false */
  public void clearMerchantGatewayEntitlement() {
    genClient.clear(CacheKey.merchantGatewayEntitlement);
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
  public MerchantGatewayEntitlementConfiguration copyChanges() {
    MerchantGatewayEntitlementConfiguration copy = new MerchantGatewayEntitlementConfiguration();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantGatewayEntitlementConfiguration src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantGatewayEntitlementConfiguration(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<MerchantGatewayEntitlementConfiguration> CREATOR = new android.os.Parcelable.Creator<MerchantGatewayEntitlementConfiguration>() {
    @Override
    public MerchantGatewayEntitlementConfiguration createFromParcel(android.os.Parcel in) {
      MerchantGatewayEntitlementConfiguration instance = new MerchantGatewayEntitlementConfiguration(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantGatewayEntitlementConfiguration[] newArray(int size) {
      return new MerchantGatewayEntitlementConfiguration[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantGatewayEntitlementConfiguration> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantGatewayEntitlementConfiguration>() {
    @Override
    public MerchantGatewayEntitlementConfiguration create(org.json.JSONObject jsonObject) {
      return new MerchantGatewayEntitlementConfiguration(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean MID_IS_REQUIRED = false;
    public static final long MID_MAX_LEN = 32;
    public static final boolean MCCSOURCE_IS_REQUIRED = false;
    public static final boolean MCC_IS_REQUIRED = false;
    public static final boolean ACCELERATION_IS_REQUIRED = false;
    public static final boolean DEFAULTMID_IS_REQUIRED = false;
    public static final boolean LASTBOARDEDTIME_IS_REQUIRED = false;
    public static final boolean CREATEDTIME_IS_REQUIRED = false;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;
    public static final boolean DELETEDTIME_IS_REQUIRED = false;
    public static final boolean MERCHANTGATEWAYENTITLEMENT_IS_REQUIRED = false;

  }

}
