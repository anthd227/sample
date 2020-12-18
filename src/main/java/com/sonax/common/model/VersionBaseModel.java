package com.sonax.common.model;

public class VersionBaseModel {
    protected String mCurrVer = "1.0.0.0";
    protected String mErVer = "";
    protected String errorMessage = "";

    protected String regId;
    protected String regDate;
    protected String udtId;
    protected String udtDate;
	public String getmCurrVer() {
		return mCurrVer;
	}
	public void setmCurrVer(String mCurrVer) {
		this.mCurrVer = mCurrVer;
	}
	public String getmErVer() {
		return mErVer;
	}
	public void setmErVer(String mErVer) {
		this.mErVer = mErVer;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUdtId() {
		return udtId;
	}
	public void setUdtId(String udtId) {
		this.udtId = udtId;
	}
	public String getUdtDate() {
		return udtDate;
	}
	public void setUdtDate(String udtDate) {
		this.udtDate = udtDate;
	}
    
    
}
