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
 * <li>{@link #getCardEntryMethods cardEntryMethods}</li>
 * <li>{@link #getDisableCashBack disableCashBack}</li>
 * <li>{@link #getCloverShouldHandleReceipts cloverShouldHandleReceipts}</li>
 * <li>{@link #getForcePinEntryOnSwipe forcePinEntryOnSwipe}</li>
 * <li>{@link #getDisableRestartTransactionOnFailure disableRestartTransactionOnFailure}</li>
 * <li>{@link #getAllowOfflinePayment allowOfflinePayment}</li>
 * <li>{@link #getApproveOfflinePaymentWithoutPrompt approveOfflinePaymentWithoutPrompt}</li>
 * <li>{@link #getForceOfflinePayment forceOfflinePayment}</li>
 * <li>{@link #getSignatureThreshold signatureThreshold}</li>
 * <li>{@link #getSignatureEntryLocation signatureEntryLocation}</li>
 * <li>{@link #getTipMode tipMode}</li>
 * <li>{@link #getTippableAmount tippableAmount}</li>
 * <li>{@link #getDisableReceiptSelection disableReceiptSelection}</li>
 * <li>{@link #getDisableDuplicateCheck disableDuplicateCheck}</li>
 * <li>{@link #getAutoAcceptPaymentConfirmations autoAcceptPaymentConfirmations}</li>
 * <li>{@link #getAutoAcceptSignature autoAcceptSignature}</li>
 * <li>{@link #getReturnResultOnTransactionComplete returnResultOnTransactionComplete}</li>
 * <li>{@link #getTipSuggestions tipSuggestions}</li>
 * <li>{@link #getRegionalExtras regionalExtras}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TransactionSettings extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.Integer getCardEntryMethods() {
    return genClient.cacheGet(CacheKey.cardEntryMethods);
  }

  public java.lang.Boolean getDisableCashBack() {
    return genClient.cacheGet(CacheKey.disableCashBack);
  }

  public java.lang.Boolean getCloverShouldHandleReceipts() {
    return genClient.cacheGet(CacheKey.cloverShouldHandleReceipts);
  }

  public java.lang.Boolean getForcePinEntryOnSwipe() {
    return genClient.cacheGet(CacheKey.forcePinEntryOnSwipe);
  }

  public java.lang.Boolean getDisableRestartTransactionOnFailure() {
    return genClient.cacheGet(CacheKey.disableRestartTransactionOnFailure);
  }

  public java.lang.Boolean getAllowOfflinePayment() {
    return genClient.cacheGet(CacheKey.allowOfflinePayment);
  }

  public java.lang.Boolean getApproveOfflinePaymentWithoutPrompt() {
    return genClient.cacheGet(CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  public java.lang.Boolean getForceOfflinePayment() {
    return genClient.cacheGet(CacheKey.forceOfflinePayment);
  }

  public java.lang.Long getSignatureThreshold() {
    return genClient.cacheGet(CacheKey.signatureThreshold);
  }

  public com.clover.sdk.v3.payments.DataEntryLocation getSignatureEntryLocation() {
    return genClient.cacheGet(CacheKey.signatureEntryLocation);
  }

  public com.clover.sdk.v3.payments.TipMode getTipMode() {
    return genClient.cacheGet(CacheKey.tipMode);
  }

  public java.lang.Long getTippableAmount() {
    return genClient.cacheGet(CacheKey.tippableAmount);
  }

  public java.lang.Boolean getDisableReceiptSelection() {
    return genClient.cacheGet(CacheKey.disableReceiptSelection);
  }

  public java.lang.Boolean getDisableDuplicateCheck() {
    return genClient.cacheGet(CacheKey.disableDuplicateCheck);
  }

  /**
   * If set to true, confirmation requests triggered by a challenge at the payment gateway are automatically accepted, and confirmation requests are not transmitted back to the calling program. Be sure you are willing to accept the risk associated with accepting offline or duplicate payment challenges. See https://docs.clover.com/build/working-with-challenges for more information.
   */
  public java.lang.Boolean getAutoAcceptPaymentConfirmations() {
    return genClient.cacheGet(CacheKey.autoAcceptPaymentConfirmations);
  }

  public java.lang.Boolean getAutoAcceptSignature() {
    return genClient.cacheGet(CacheKey.autoAcceptSignature);
  }

  public java.lang.Boolean getReturnResultOnTransactionComplete() {
    return genClient.cacheGet(CacheKey.returnResultOnTransactionComplete);
  }

  public java.util.List<com.clover.sdk.v3.merchant.TipSuggestion> getTipSuggestions() {
    return genClient.cacheGet(CacheKey.tipSuggestions);
  }

  public java.util.Map<java.lang.String,java.lang.String> getRegionalExtras() {
    return genClient.cacheGet(CacheKey.regionalExtras);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    cardEntryMethods
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Integer.class)),
    disableCashBack
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    cloverShouldHandleReceipts
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    forcePinEntryOnSwipe
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    disableRestartTransactionOnFailure
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    allowOfflinePayment
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    approveOfflinePaymentWithoutPrompt
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    forceOfflinePayment
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    signatureThreshold
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    signatureEntryLocation
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.payments.DataEntryLocation.class)),
    tipMode
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.payments.TipMode.class)),
    tippableAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    disableReceiptSelection
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    disableDuplicateCheck
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    autoAcceptPaymentConfirmations
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    autoAcceptSignature
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    returnResultOnTransactionComplete
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    tipSuggestions
        (com.clover.sdk.extractors.RecordListExtractionStrategy.instance(com.clover.sdk.v3.merchant.TipSuggestion.JSON_CREATOR)),
    regionalExtras
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

  private final GenericClient<TransactionSettings> genClient;

  /**
   * Constructs a new empty instance.
   */
  public TransactionSettings() {
    genClient = new GenericClient<TransactionSettings>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected TransactionSettings(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TransactionSettings(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public TransactionSettings(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TransactionSettings(TransactionSettings src) {
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

  /** Checks whether the 'cardEntryMethods' field is set and is not null */
  public boolean isNotNullCardEntryMethods() {
    return genClient.cacheValueIsNotNull(CacheKey.cardEntryMethods);
  }

  /** Checks whether the 'disableCashBack' field is set and is not null */
  public boolean isNotNullDisableCashBack() {
    return genClient.cacheValueIsNotNull(CacheKey.disableCashBack);
  }

  /** Checks whether the 'cloverShouldHandleReceipts' field is set and is not null */
  public boolean isNotNullCloverShouldHandleReceipts() {
    return genClient.cacheValueIsNotNull(CacheKey.cloverShouldHandleReceipts);
  }

  /** Checks whether the 'forcePinEntryOnSwipe' field is set and is not null */
  public boolean isNotNullForcePinEntryOnSwipe() {
    return genClient.cacheValueIsNotNull(CacheKey.forcePinEntryOnSwipe);
  }

  /** Checks whether the 'disableRestartTransactionOnFailure' field is set and is not null */
  public boolean isNotNullDisableRestartTransactionOnFailure() {
    return genClient.cacheValueIsNotNull(CacheKey.disableRestartTransactionOnFailure);
  }

  /** Checks whether the 'allowOfflinePayment' field is set and is not null */
  public boolean isNotNullAllowOfflinePayment() {
    return genClient.cacheValueIsNotNull(CacheKey.allowOfflinePayment);
  }

  /** Checks whether the 'approveOfflinePaymentWithoutPrompt' field is set and is not null */
  public boolean isNotNullApproveOfflinePaymentWithoutPrompt() {
    return genClient.cacheValueIsNotNull(CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  /** Checks whether the 'forceOfflinePayment' field is set and is not null */
  public boolean isNotNullForceOfflinePayment() {
    return genClient.cacheValueIsNotNull(CacheKey.forceOfflinePayment);
  }

  /** Checks whether the 'signatureThreshold' field is set and is not null */
  public boolean isNotNullSignatureThreshold() {
    return genClient.cacheValueIsNotNull(CacheKey.signatureThreshold);
  }

  /** Checks whether the 'signatureEntryLocation' field is set and is not null */
  public boolean isNotNullSignatureEntryLocation() {
    return genClient.cacheValueIsNotNull(CacheKey.signatureEntryLocation);
  }

  /** Checks whether the 'tipMode' field is set and is not null */
  public boolean isNotNullTipMode() {
    return genClient.cacheValueIsNotNull(CacheKey.tipMode);
  }

  /** Checks whether the 'tippableAmount' field is set and is not null */
  public boolean isNotNullTippableAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tippableAmount);
  }

  /** Checks whether the 'disableReceiptSelection' field is set and is not null */
  public boolean isNotNullDisableReceiptSelection() {
    return genClient.cacheValueIsNotNull(CacheKey.disableReceiptSelection);
  }

  /** Checks whether the 'disableDuplicateCheck' field is set and is not null */
  public boolean isNotNullDisableDuplicateCheck() {
    return genClient.cacheValueIsNotNull(CacheKey.disableDuplicateCheck);
  }

  /** Checks whether the 'autoAcceptPaymentConfirmations' field is set and is not null */
  public boolean isNotNullAutoAcceptPaymentConfirmations() {
    return genClient.cacheValueIsNotNull(CacheKey.autoAcceptPaymentConfirmations);
  }

  /** Checks whether the 'autoAcceptSignature' field is set and is not null */
  public boolean isNotNullAutoAcceptSignature() {
    return genClient.cacheValueIsNotNull(CacheKey.autoAcceptSignature);
  }

  /** Checks whether the 'returnResultOnTransactionComplete' field is set and is not null */
  public boolean isNotNullReturnResultOnTransactionComplete() {
    return genClient.cacheValueIsNotNull(CacheKey.returnResultOnTransactionComplete);
  }

  /** Checks whether the 'tipSuggestions' field is set and is not null */
  public boolean isNotNullTipSuggestions() {
    return genClient.cacheValueIsNotNull(CacheKey.tipSuggestions);
  }

  /** Checks whether the 'tipSuggestions' field is set and is not null and is not empty */
  public boolean isNotEmptyTipSuggestions() { return isNotNullTipSuggestions() && !getTipSuggestions().isEmpty(); }

  /** Checks whether the 'regionalExtras' field is set and is not null */
  public boolean isNotNullRegionalExtras() {
    return genClient.cacheValueIsNotNull(CacheKey.regionalExtras);
  }

  /** Checks whether the 'regionalExtras' field is set and is not null and is not empty */
  public boolean isNotEmptyRegionalExtras() { return isNotNullRegionalExtras() && !getRegionalExtras().isEmpty(); }



  /** Checks whether the 'cardEntryMethods' field has been set, however the value could be null */
  public boolean hasCardEntryMethods() {
    return genClient.cacheHasKey(CacheKey.cardEntryMethods);
  }

  /** Checks whether the 'disableCashBack' field has been set, however the value could be null */
  public boolean hasDisableCashBack() {
    return genClient.cacheHasKey(CacheKey.disableCashBack);
  }

  /** Checks whether the 'cloverShouldHandleReceipts' field has been set, however the value could be null */
  public boolean hasCloverShouldHandleReceipts() {
    return genClient.cacheHasKey(CacheKey.cloverShouldHandleReceipts);
  }

  /** Checks whether the 'forcePinEntryOnSwipe' field has been set, however the value could be null */
  public boolean hasForcePinEntryOnSwipe() {
    return genClient.cacheHasKey(CacheKey.forcePinEntryOnSwipe);
  }

  /** Checks whether the 'disableRestartTransactionOnFailure' field has been set, however the value could be null */
  public boolean hasDisableRestartTransactionOnFailure() {
    return genClient.cacheHasKey(CacheKey.disableRestartTransactionOnFailure);
  }

  /** Checks whether the 'allowOfflinePayment' field has been set, however the value could be null */
  public boolean hasAllowOfflinePayment() {
    return genClient.cacheHasKey(CacheKey.allowOfflinePayment);
  }

  /** Checks whether the 'approveOfflinePaymentWithoutPrompt' field has been set, however the value could be null */
  public boolean hasApproveOfflinePaymentWithoutPrompt() {
    return genClient.cacheHasKey(CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  /** Checks whether the 'forceOfflinePayment' field has been set, however the value could be null */
  public boolean hasForceOfflinePayment() {
    return genClient.cacheHasKey(CacheKey.forceOfflinePayment);
  }

  /** Checks whether the 'signatureThreshold' field has been set, however the value could be null */
  public boolean hasSignatureThreshold() {
    return genClient.cacheHasKey(CacheKey.signatureThreshold);
  }

  /** Checks whether the 'signatureEntryLocation' field has been set, however the value could be null */
  public boolean hasSignatureEntryLocation() {
    return genClient.cacheHasKey(CacheKey.signatureEntryLocation);
  }

  /** Checks whether the 'tipMode' field has been set, however the value could be null */
  public boolean hasTipMode() {
    return genClient.cacheHasKey(CacheKey.tipMode);
  }

  /** Checks whether the 'tippableAmount' field has been set, however the value could be null */
  public boolean hasTippableAmount() {
    return genClient.cacheHasKey(CacheKey.tippableAmount);
  }

  /** Checks whether the 'disableReceiptSelection' field has been set, however the value could be null */
  public boolean hasDisableReceiptSelection() {
    return genClient.cacheHasKey(CacheKey.disableReceiptSelection);
  }

  /** Checks whether the 'disableDuplicateCheck' field has been set, however the value could be null */
  public boolean hasDisableDuplicateCheck() {
    return genClient.cacheHasKey(CacheKey.disableDuplicateCheck);
  }

  /** Checks whether the 'autoAcceptPaymentConfirmations' field has been set, however the value could be null */
  public boolean hasAutoAcceptPaymentConfirmations() {
    return genClient.cacheHasKey(CacheKey.autoAcceptPaymentConfirmations);
  }

  /** Checks whether the 'autoAcceptSignature' field has been set, however the value could be null */
  public boolean hasAutoAcceptSignature() {
    return genClient.cacheHasKey(CacheKey.autoAcceptSignature);
  }

  /** Checks whether the 'returnResultOnTransactionComplete' field has been set, however the value could be null */
  public boolean hasReturnResultOnTransactionComplete() {
    return genClient.cacheHasKey(CacheKey.returnResultOnTransactionComplete);
  }

  /** Checks whether the 'tipSuggestions' field has been set, however the value could be null */
  public boolean hasTipSuggestions() {
    return genClient.cacheHasKey(CacheKey.tipSuggestions);
  }

  /** Checks whether the 'regionalExtras' field has been set, however the value could be null */
  public boolean hasRegionalExtras() {
    return genClient.cacheHasKey(CacheKey.regionalExtras);
  }


  /**
   * Sets the field 'cardEntryMethods'.
   */
  public TransactionSettings setCardEntryMethods(java.lang.Integer cardEntryMethods) {
    return genClient.setOther(cardEntryMethods, CacheKey.cardEntryMethods);
  }

  /**
   * Sets the field 'disableCashBack'.
   */
  public TransactionSettings setDisableCashBack(java.lang.Boolean disableCashBack) {
    return genClient.setOther(disableCashBack, CacheKey.disableCashBack);
  }

  /**
   * Sets the field 'cloverShouldHandleReceipts'.
   */
  public TransactionSettings setCloverShouldHandleReceipts(java.lang.Boolean cloverShouldHandleReceipts) {
    return genClient.setOther(cloverShouldHandleReceipts, CacheKey.cloverShouldHandleReceipts);
  }

  /**
   * Sets the field 'forcePinEntryOnSwipe'.
   */
  public TransactionSettings setForcePinEntryOnSwipe(java.lang.Boolean forcePinEntryOnSwipe) {
    return genClient.setOther(forcePinEntryOnSwipe, CacheKey.forcePinEntryOnSwipe);
  }

  /**
   * Sets the field 'disableRestartTransactionOnFailure'.
   */
  public TransactionSettings setDisableRestartTransactionOnFailure(java.lang.Boolean disableRestartTransactionOnFailure) {
    return genClient.setOther(disableRestartTransactionOnFailure, CacheKey.disableRestartTransactionOnFailure);
  }

  /**
   * Sets the field 'allowOfflinePayment'.
   */
  public TransactionSettings setAllowOfflinePayment(java.lang.Boolean allowOfflinePayment) {
    return genClient.setOther(allowOfflinePayment, CacheKey.allowOfflinePayment);
  }

  /**
   * Sets the field 'approveOfflinePaymentWithoutPrompt'.
   */
  public TransactionSettings setApproveOfflinePaymentWithoutPrompt(java.lang.Boolean approveOfflinePaymentWithoutPrompt) {
    return genClient.setOther(approveOfflinePaymentWithoutPrompt, CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  /**
   * Sets the field 'forceOfflinePayment'.
   */
  public TransactionSettings setForceOfflinePayment(java.lang.Boolean forceOfflinePayment) {
    return genClient.setOther(forceOfflinePayment, CacheKey.forceOfflinePayment);
  }

  /**
   * Sets the field 'signatureThreshold'.
   */
  public TransactionSettings setSignatureThreshold(java.lang.Long signatureThreshold) {
    return genClient.setOther(signatureThreshold, CacheKey.signatureThreshold);
  }

  /**
   * Sets the field 'signatureEntryLocation'.
   */
  public TransactionSettings setSignatureEntryLocation(com.clover.sdk.v3.payments.DataEntryLocation signatureEntryLocation) {
    return genClient.setOther(signatureEntryLocation, CacheKey.signatureEntryLocation);
  }

  /**
   * Sets the field 'tipMode'.
   */
  public TransactionSettings setTipMode(com.clover.sdk.v3.payments.TipMode tipMode) {
    return genClient.setOther(tipMode, CacheKey.tipMode);
  }

  /**
   * Sets the field 'tippableAmount'.
   */
  public TransactionSettings setTippableAmount(java.lang.Long tippableAmount) {
    return genClient.setOther(tippableAmount, CacheKey.tippableAmount);
  }

  /**
   * Sets the field 'disableReceiptSelection'.
   */
  public TransactionSettings setDisableReceiptSelection(java.lang.Boolean disableReceiptSelection) {
    return genClient.setOther(disableReceiptSelection, CacheKey.disableReceiptSelection);
  }

  /**
   * Sets the field 'disableDuplicateCheck'.
   */
  public TransactionSettings setDisableDuplicateCheck(java.lang.Boolean disableDuplicateCheck) {
    return genClient.setOther(disableDuplicateCheck, CacheKey.disableDuplicateCheck);
  }

  /**
   * Sets the field 'autoAcceptPaymentConfirmations'.
   */
  public TransactionSettings setAutoAcceptPaymentConfirmations(java.lang.Boolean autoAcceptPaymentConfirmations) {
    return genClient.setOther(autoAcceptPaymentConfirmations, CacheKey.autoAcceptPaymentConfirmations);
  }

  /**
   * Sets the field 'autoAcceptSignature'.
   */
  public TransactionSettings setAutoAcceptSignature(java.lang.Boolean autoAcceptSignature) {
    return genClient.setOther(autoAcceptSignature, CacheKey.autoAcceptSignature);
  }

  /**
   * Sets the field 'returnResultOnTransactionComplete'.
   */
  public TransactionSettings setReturnResultOnTransactionComplete(java.lang.Boolean returnResultOnTransactionComplete) {
    return genClient.setOther(returnResultOnTransactionComplete, CacheKey.returnResultOnTransactionComplete);
  }

  /**
   * Sets the field 'tipSuggestions'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public TransactionSettings setTipSuggestions(java.util.List<com.clover.sdk.v3.merchant.TipSuggestion> tipSuggestions) {
    return genClient.setArrayRecord(tipSuggestions, CacheKey.tipSuggestions);
  }

  /**
   * Sets the field 'regionalExtras'.
   */
  public TransactionSettings setRegionalExtras(java.util.Map<java.lang.String,java.lang.String> regionalExtras) {
    return genClient.setOther(regionalExtras, CacheKey.regionalExtras);
  }


  /** Clears the 'cardEntryMethods' field, the 'has' method for this field will now return false */
  public void clearCardEntryMethods() {
    genClient.clear(CacheKey.cardEntryMethods);
  }
  /** Clears the 'disableCashBack' field, the 'has' method for this field will now return false */
  public void clearDisableCashBack() {
    genClient.clear(CacheKey.disableCashBack);
  }
  /** Clears the 'cloverShouldHandleReceipts' field, the 'has' method for this field will now return false */
  public void clearCloverShouldHandleReceipts() {
    genClient.clear(CacheKey.cloverShouldHandleReceipts);
  }
  /** Clears the 'forcePinEntryOnSwipe' field, the 'has' method for this field will now return false */
  public void clearForcePinEntryOnSwipe() {
    genClient.clear(CacheKey.forcePinEntryOnSwipe);
  }
  /** Clears the 'disableRestartTransactionOnFailure' field, the 'has' method for this field will now return false */
  public void clearDisableRestartTransactionOnFailure() {
    genClient.clear(CacheKey.disableRestartTransactionOnFailure);
  }
  /** Clears the 'allowOfflinePayment' field, the 'has' method for this field will now return false */
  public void clearAllowOfflinePayment() {
    genClient.clear(CacheKey.allowOfflinePayment);
  }
  /** Clears the 'approveOfflinePaymentWithoutPrompt' field, the 'has' method for this field will now return false */
  public void clearApproveOfflinePaymentWithoutPrompt() {
    genClient.clear(CacheKey.approveOfflinePaymentWithoutPrompt);
  }
  /** Clears the 'forceOfflinePayment' field, the 'has' method for this field will now return false */
  public void clearForceOfflinePayment() {
    genClient.clear(CacheKey.forceOfflinePayment);
  }
  /** Clears the 'signatureThreshold' field, the 'has' method for this field will now return false */
  public void clearSignatureThreshold() {
    genClient.clear(CacheKey.signatureThreshold);
  }
  /** Clears the 'signatureEntryLocation' field, the 'has' method for this field will now return false */
  public void clearSignatureEntryLocation() {
    genClient.clear(CacheKey.signatureEntryLocation);
  }
  /** Clears the 'tipMode' field, the 'has' method for this field will now return false */
  public void clearTipMode() {
    genClient.clear(CacheKey.tipMode);
  }
  /** Clears the 'tippableAmount' field, the 'has' method for this field will now return false */
  public void clearTippableAmount() {
    genClient.clear(CacheKey.tippableAmount);
  }
  /** Clears the 'disableReceiptSelection' field, the 'has' method for this field will now return false */
  public void clearDisableReceiptSelection() {
    genClient.clear(CacheKey.disableReceiptSelection);
  }
  /** Clears the 'disableDuplicateCheck' field, the 'has' method for this field will now return false */
  public void clearDisableDuplicateCheck() {
    genClient.clear(CacheKey.disableDuplicateCheck);
  }
  /** Clears the 'autoAcceptPaymentConfirmations' field, the 'has' method for this field will now return false */
  public void clearAutoAcceptPaymentConfirmations() {
    genClient.clear(CacheKey.autoAcceptPaymentConfirmations);
  }
  /** Clears the 'autoAcceptSignature' field, the 'has' method for this field will now return false */
  public void clearAutoAcceptSignature() {
    genClient.clear(CacheKey.autoAcceptSignature);
  }
  /** Clears the 'returnResultOnTransactionComplete' field, the 'has' method for this field will now return false */
  public void clearReturnResultOnTransactionComplete() {
    genClient.clear(CacheKey.returnResultOnTransactionComplete);
  }
  /** Clears the 'tipSuggestions' field, the 'has' method for this field will now return false */
  public void clearTipSuggestions() {
    genClient.clear(CacheKey.tipSuggestions);
  }
  /** Clears the 'regionalExtras' field, the 'has' method for this field will now return false */
  public void clearRegionalExtras() {
    genClient.clear(CacheKey.regionalExtras);
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
  public TransactionSettings copyChanges() {
    TransactionSettings copy = new TransactionSettings();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TransactionSettings src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TransactionSettings(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TransactionSettings> CREATOR = new android.os.Parcelable.Creator<TransactionSettings>() {
    @Override
    public TransactionSettings createFromParcel(android.os.Parcel in) {
      TransactionSettings instance = new TransactionSettings(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TransactionSettings[] newArray(int size) {
      return new TransactionSettings[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TransactionSettings> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TransactionSettings>() {
    public Class<TransactionSettings> getCreatedClass() {
      return TransactionSettings.class;
    }

    @Override
    public TransactionSettings create(org.json.JSONObject jsonObject) {
      return new TransactionSettings(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean CARDENTRYMETHODS_IS_REQUIRED = false;
    public static final boolean DISABLECASHBACK_IS_REQUIRED = false;
    public static final boolean CLOVERSHOULDHANDLERECEIPTS_IS_REQUIRED = false;
    public static final boolean FORCEPINENTRYONSWIPE_IS_REQUIRED = false;
    public static final boolean DISABLERESTARTTRANSACTIONONFAILURE_IS_REQUIRED = false;
    public static final boolean ALLOWOFFLINEPAYMENT_IS_REQUIRED = false;
    public static final boolean APPROVEOFFLINEPAYMENTWITHOUTPROMPT_IS_REQUIRED = false;
    public static final boolean FORCEOFFLINEPAYMENT_IS_REQUIRED = false;
    public static final boolean SIGNATURETHRESHOLD_IS_REQUIRED = false;
    public static final boolean SIGNATUREENTRYLOCATION_IS_REQUIRED = false;
    public static final boolean TIPMODE_IS_REQUIRED = false;
    public static final boolean TIPPABLEAMOUNT_IS_REQUIRED = false;
    public static final boolean DISABLERECEIPTSELECTION_IS_REQUIRED = false;
    public static final boolean DISABLEDUPLICATECHECK_IS_REQUIRED = false;
    public static final boolean AUTOACCEPTPAYMENTCONFIRMATIONS_IS_REQUIRED = false;
    public static final boolean AUTOACCEPTSIGNATURE_IS_REQUIRED = false;
    public static final boolean RETURNRESULTONTRANSACTIONCOMPLETE_IS_REQUIRED = false;
    public static final boolean TIPSUGGESTIONS_IS_REQUIRED = false;
    public static final boolean REGIONALEXTRAS_IS_REQUIRED = false;
  }

}
