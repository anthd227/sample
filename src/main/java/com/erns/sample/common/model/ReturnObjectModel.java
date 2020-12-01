package com.erns.sample.common.model;

import com.erns.sample.common.config.Const;

public class ReturnObjectModel {
	 private Boolean isSuccess = false;
	    private Object returnObject = null;
	    private String errorMessage = "";
	    private int errorCode = 0;

	    public ReturnObjectModel() {}
	    public ReturnObjectModel(Exception ex) {
	        this.SetException(ex);
	    }
	    public ReturnObjectModel(Boolean isSuccess, Object retObj, String errMsg, int errCode) {
	    	this.isSuccess = isSuccess;
	    	this.returnObject = retObj;
	    	this.errorMessage = errMsg;
	    	this.errorCode = errCode;
	    }
	    
	    public ReturnObjectModel(int initCode) {
	        SetCommonInit(initCode);
	    }

	    private void SetCommonInit(int initCode) {
	        isSuccess = false;
	        returnObject = null;
	        errorCode = initCode;

	        switch(initCode) {
	            case Const.RO_INVALID_VERSION:
	                errorMessage = Const.INVALID_VERSION;
	                break;
	            case Const.RO_INIT_OBJECT:
	                errorMessage = "INIT_OBJECT";
	                break;
	            case Const.RO_NOT_VALID_DATA:
	                errorMessage = "FAIL_TO_VALIDATION";
	                break;
	            case Const.RO_FAIL_ACTION:
	                errorMessage = "FAIL_ACTION";
	                break;
	            case Const.RO_NO_AUTH:
	                errorMessage = "NO_AUTH";
	                break;
	            case Const.RO_RELOAD_PAGE:
	                errorMessage = "RELOAD_PAGE";
	                break;
	            case Const.RO_NO_DATA:
	                errorMessage = "RELOAD_PAGE";
	                break;
	            case Const.RO_INVALID_STATUS:
	                errorMessage = "RELOAD_PAGE";
	                break;
	        }
	    }

	    public void SetException(Exception ex) {
	        this.isSuccess = false;
	        this.returnObject = ex;
	        this.errorMessage = ex.getMessage();
	        this.errorCode = Const.RO_CATCHED_EXCEPTOIN;

	        System.out.println("!!!!EXCEPTION!!!! : " + ex.getMessage());

	        //send mail to developer
	        //insert mail queue table
	        //StaticComponent.SaveExceptionAlarm(ex);
	    }

	    public Boolean getIsSuccess() {
	        return this.isSuccess;
	    }

	    public void isIsSuccess(Boolean isSuccess) {
	        this.isSuccess = isSuccess;
	    }

	    public Object getReturnObject() {
	        return this.returnObject;
	    }

	    public void setReturnObject(Object returnObject) {
	        this.isSuccess = true;
	        this.returnObject = returnObject;
	        this.errorMessage = "";
	        this.errorCode = Const.RO_SUCCESS_ACTION;
	    }

	    public String getErrorMessage() {
	        return this.errorMessage;
	    }

	    public void setErrorMessage(String errorMessage) {
	    	this.isSuccess = false;
	        this.returnObject = null;
	        this.errorMessage = errorMessage;
	    }

	    public int getErrorCode() {
	        return this.errorCode;
	    }

	    public void setErrorCode(int errorCode) {
	        this.errorCode = errorCode;
	    }
}
