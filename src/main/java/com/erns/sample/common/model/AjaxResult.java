package com.erns.sample.common.model;

import com.erns.sample.common.config.Const;

public class AjaxResult {
	private String result;
    private String returnMessage;
    private Object objReturnData;

    public AjaxResult(ReturnObjectModel ret) {
        if(ret.getIsSuccess()) {
            this.result = Const.AX_SUCCESS;
            this.returnMessage = "";
            this.objReturnData = ret.getReturnObject();
        } else {
            this.result = Const.AX_FAIL;
            this.returnMessage = ret.getErrorMessage();
            this.objReturnData = null;
        }
    }

    public String getResult() {
        return this.result;
    }

    public String getReturnMessage() {
        return this.returnMessage;
    }

    public Object getObjReturnData() {
        return this.objReturnData;
    }
}
