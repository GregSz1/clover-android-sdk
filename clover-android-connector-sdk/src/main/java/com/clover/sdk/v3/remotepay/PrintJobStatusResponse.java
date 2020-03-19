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
 * contains the status of the requested print job
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getStatus status}</li>
 * <li>{@link #getPrintRequestId printRequestId}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PrintJobStatusResponse extends com.clover.sdk.v3.remotepay.BaseResponse {

  /**
   * The current status of the requested print job
   */
  public com.clover.sdk.v3.printer.PrintJobStatus getStatus() {
    return genClient.cacheGet(CacheKey.status);
  }

  /**
   * The ID of the print job
   */
  public java.lang.String getPrintRequestId() {
    return genClient.cacheGet(CacheKey.printRequestId);
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
    status
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.printer.PrintJobStatus.class)),
    printRequestId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
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

  private final GenericClient<PrintJobStatusResponse> genClient;

  /**
   * Constructs a new empty instance.
   */
  public PrintJobStatusResponse() {
    super(false);
    genClient = new GenericClient<PrintJobStatusResponse>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected PrintJobStatusResponse(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PrintJobStatusResponse(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PrintJobStatusResponse(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PrintJobStatusResponse(PrintJobStatusResponse src) {
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

  /** Checks whether the 'status' field is set and is not null */
  public boolean isNotNullStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.status);
  }

  /** Checks whether the 'printRequestId' field is set and is not null */
  public boolean isNotNullPrintRequestId() {
    return genClient.cacheValueIsNotNull(CacheKey.printRequestId);
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



  /** Checks whether the 'status' field has been set, however the value could be null */
  public boolean hasStatus() {
    return genClient.cacheHasKey(CacheKey.status);
  }

  /** Checks whether the 'printRequestId' field has been set, however the value could be null */
  public boolean hasPrintRequestId() {
    return genClient.cacheHasKey(CacheKey.printRequestId);
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
   * Sets the field 'status'.
   */
  public PrintJobStatusResponse setStatus(com.clover.sdk.v3.printer.PrintJobStatus status) {
    return genClient.setOther(status, CacheKey.status);
  }

  /**
   * Sets the field 'printRequestId'.
   */
  public PrintJobStatusResponse setPrintRequestId(java.lang.String printRequestId) {
    return genClient.setOther(printRequestId, CacheKey.printRequestId);
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


  /** Clears the 'status' field, the 'has' method for this field will now return false */
  public void clearStatus() {
    genClient.clear(CacheKey.status);
  }
  /** Clears the 'printRequestId' field, the 'has' method for this field will now return false */
  public void clearPrintRequestId() {
    genClient.clear(CacheKey.printRequestId);
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
  public PrintJobStatusResponse copyChanges() {
    PrintJobStatusResponse copy = new PrintJobStatusResponse();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PrintJobStatusResponse src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PrintJobStatusResponse(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PrintJobStatusResponse> CREATOR = new android.os.Parcelable.Creator<PrintJobStatusResponse>() {
    @Override
    public PrintJobStatusResponse createFromParcel(android.os.Parcel in) {
      PrintJobStatusResponse instance = new PrintJobStatusResponse(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PrintJobStatusResponse[] newArray(int size) {
      return new PrintJobStatusResponse[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PrintJobStatusResponse> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PrintJobStatusResponse>() {
    public Class<PrintJobStatusResponse> getCreatedClass() {
      return PrintJobStatusResponse.class;
    }

    @Override
    public PrintJobStatusResponse create(org.json.JSONObject jsonObject) {
      return new PrintJobStatusResponse(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean STATUS_IS_REQUIRED = false;
    public static final boolean PRINTREQUESTID_IS_REQUIRED = false;
    public static final boolean SUCCESS_IS_REQUIRED = false;
    public static final boolean RESULT_IS_REQUIRED = false;
    public static final boolean REASON_IS_REQUIRED = false;
    public static final boolean MESSAGE_IS_REQUIRED = false;
  }

}
