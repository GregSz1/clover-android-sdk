/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.payments;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum TxType implements Parcelable {
  AUTH, PREAUTH, PREAUTHCAPTURE, ADJUST, VOID, VOIDRETURN, RETURN, REFUND, NAKEDREFUND, GETBALANCE, BATCHCLOSE, ACTIVATE, BALANCE_LOCK, LOAD, CASHOUT, CASHOUT_ACTIVE_STATUS, REDEMPTION, REDEMPTION_UNLOCK, RELOAD;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<TxType> CREATOR = new Creator<TxType>() {
    @Override
    public TxType createFromParcel(final Parcel source) {
      return TxType.valueOf(source.readString());
    }

    @Override
    public TxType[] newArray(final int size) {
      return new TxType[size];
    }
  };
}