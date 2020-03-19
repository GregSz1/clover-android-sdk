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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getExternalPaymentId externalPaymentId}</li>
 * <li>{@link #getQueryStatus queryStatus}</li>
 * <li>{@link #getPayment payment}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class RetrievePaymentResponse extends com.clover.sdk.v3.remotepay.BaseResponse {

  /**
   * The externalPaymentId used when a payment was created
   */
  public java.lang.String getExternalPaymentId() {
    return genClient.cacheGet(CacheKey.externalPaymentId);
  }

  /**
   * The status of the query
   */
  public com.clover.sdk.v3.remotepay.QueryStatus getQueryStatus() {
    return genClient.cacheGet(CacheKey.queryStatus);
  }

  /**
   * Payment information
   */
  public com.clover.sdk.v3.payments.Payment getPayment() {
    return genClient.cacheGet(CacheKey.payment);
  }

  /**
   * If true then the requested operation succeeded
   */
  @Override
  public java.lang.Boolean getSuccess() {
    return genClient.cacheGet(CacheKey.success);
  }

  /**
   * The result of the requested operation.
   */
  @Override
  public com.clover.sdk.v3.remotepay.ResponseCode getResult() {
    return genClient.cacheGet(CacheKey.result);
  }

  /**
   * Optional information about result.
   */
  @Override
  public java.lang.String getReason() {
    return genClient.cacheGet(CacheKey.reason);
  }

  /**
   * Detailed information about result.
   */
  @Override
  public java.lang.String getMessage() {
    return genClient.cacheGet(CacheKey.message);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    externalPaymentId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    queryStatus
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.remotepay.QueryStatus.class)),
    payment
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.payments.Payment.JSON_CREATOR)),
    success
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    result
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.remotepay.ResponseCode.class)),
    reason
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    message
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

  private final GenericClient<RetrievePaymentResponse> genClient;

  /**
   * Constructs a new empty instance.
   */
  public RetrievePaymentResponse() {
    super(false);
    genClient = new GenericClient<RetrievePaymentResponse>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected RetrievePaymentResponse(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public RetrievePaymentResponse(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public RetrievePaymentResponse(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public RetrievePaymentResponse(RetrievePaymentResponse src) {
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

  /** Checks whether the 'externalPaymentId' field is set and is not null */
  public boolean isNotNullExternalPaymentId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'queryStatus' field is set and is not null */
  public boolean isNotNullQueryStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.queryStatus);
  }

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return genClient.cacheValueIsNotNull(CacheKey.payment);
  }

  /** Checks whether the 'success' field is set and is not null */
  @Override
  public boolean isNotNullSuccess() {
    return genClient.cacheValueIsNotNull(CacheKey.success);
  }

  /** Checks whether the 'result' field is set and is not null */
  @Override
  public boolean isNotNullResult() {
    return genClient.cacheValueIsNotNull(CacheKey.result);
  }

  /** Checks whether the 'reason' field is set and is not null */
  @Override
  public boolean isNotNullReason() {
    return genClient.cacheValueIsNotNull(CacheKey.reason);
  }

  /** Checks whether the 'message' field is set and is not null */
  @Override
  public boolean isNotNullMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.message);
  }



  /** Checks whether the 'externalPaymentId' field has been set, however the value could be null */
  public boolean hasExternalPaymentId() {
    return genClient.cacheHasKey(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'queryStatus' field has been set, however the value could be null */
  public boolean hasQueryStatus() {
    return genClient.cacheHasKey(CacheKey.queryStatus);
  }

  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return genClient.cacheHasKey(CacheKey.payment);
  }

  /** Checks whether the 'success' field has been set, however the value could be null */
  @Override
  public boolean hasSuccess() {
    return genClient.cacheHasKey(CacheKey.success);
  }

  /** Checks whether the 'result' field has been set, however the value could be null */
  @Override
  public boolean hasResult() {
    return genClient.cacheHasKey(CacheKey.result);
  }

  /** Checks whether the 'reason' field has been set, however the value could be null */
  @Override
  public boolean hasReason() {
    return genClient.cacheHasKey(CacheKey.reason);
  }

  /** Checks whether the 'message' field has been set, however the value could be null */
  @Override
  public boolean hasMessage() {
    return genClient.cacheHasKey(CacheKey.message);
  }


  /**
   * Sets the field 'externalPaymentId'.
   */
  public RetrievePaymentResponse setExternalPaymentId(java.lang.String externalPaymentId) {
    return genClient.setOther(externalPaymentId, CacheKey.externalPaymentId);
  }

  /**
   * Sets the field 'queryStatus'.
   */
  public RetrievePaymentResponse setQueryStatus(com.clover.sdk.v3.remotepay.QueryStatus queryStatus) {
    return genClient.setOther(queryStatus, CacheKey.queryStatus);
  }

  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public RetrievePaymentResponse setPayment(com.clover.sdk.v3.payments.Payment payment) {
    return genClient.setRecord(payment, CacheKey.payment);
  }

  /**
   * Sets the field 'success'.
   */
  @Override
  public BaseResponse setSuccess(java.lang.Boolean success) {
    return genClient.setOther(success, CacheKey.success);
  }

  /**
   * Sets the field 'result'.
   */
  @Override
  public BaseResponse setResult(com.clover.sdk.v3.remotepay.ResponseCode result) {
    return genClient.setOther(result, CacheKey.result);
  }

  /**
   * Sets the field 'reason'.
   */
  @Override
  public BaseResponse setReason(java.lang.String reason) {
    return genClient.setOther(reason, CacheKey.reason);
  }

  /**
   * Sets the field 'message'.
   */
  @Override
  public BaseResponse setMessage(java.lang.String message) {
    return genClient.setOther(message, CacheKey.message);
  }


  /** Clears the 'externalPaymentId' field, the 'has' method for this field will now return false */
  public void clearExternalPaymentId() {
    genClient.clear(CacheKey.externalPaymentId);
  }
  /** Clears the 'queryStatus' field, the 'has' method for this field will now return false */
  public void clearQueryStatus() {
    genClient.clear(CacheKey.queryStatus);
  }
  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    genClient.clear(CacheKey.payment);
  }
  /** Clears the 'success' field, the 'has' method for this field will now return false */
  @Override
  public void clearSuccess() {
    genClient.clear(CacheKey.success);
  }
  /** Clears the 'result' field, the 'has' method for this field will now return false */
  @Override
  public void clearResult() {
    genClient.clear(CacheKey.result);
  }
  /** Clears the 'reason' field, the 'has' method for this field will now return false */
  @Override
  public void clearReason() {
    genClient.clear(CacheKey.reason);
  }
  /** Clears the 'message' field, the 'has' method for this field will now return false */
  @Override
  public void clearMessage() {
    genClient.clear(CacheKey.message);
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
  public RetrievePaymentResponse copyChanges() {
    RetrievePaymentResponse copy = new RetrievePaymentResponse();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(RetrievePaymentResponse src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new RetrievePaymentResponse(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<RetrievePaymentResponse> CREATOR = new android.os.Parcelable.Creator<RetrievePaymentResponse>() {
    @Override
    public RetrievePaymentResponse createFromParcel(android.os.Parcel in) {
      RetrievePaymentResponse instance = new RetrievePaymentResponse(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public RetrievePaymentResponse[] newArray(int size) {
      return new RetrievePaymentResponse[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<RetrievePaymentResponse> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<RetrievePaymentResponse>() {
    public Class<RetrievePaymentResponse> getCreatedClass() {
      return RetrievePaymentResponse.class;
    }

    @Override
    public RetrievePaymentResponse create(org.json.JSONObject jsonObject) {
      return new RetrievePaymentResponse(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean EXTERNALPAYMENTID_IS_REQUIRED = false;
    public static final boolean QUERYSTATUS_IS_REQUIRED = false;
    public static final boolean PAYMENT_IS_REQUIRED = false;
    public static final boolean SUCCESS_IS_REQUIRED = false;
    public static final boolean RESULT_IS_REQUIRED = false;
    public static final boolean REASON_IS_REQUIRED = false;
    public static final boolean MESSAGE_IS_REQUIRED = false;
  }

}
