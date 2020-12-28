package com.sonax.api.code.model;

import com.sonax.common.model.VersionBaseModel;

public class CodeMasterModel extends VersionBaseModel {

	private String codeMst;
	private String codeMstNm;
	private String codeMstDesc;
	private String useYn;
	
	public CodeMasterModel() {
		super();
	}
	public String getCodeMst() {
		return codeMst;
	}
	public void setCodeMst(String codeMst) {
		this.codeMst = codeMst;
	}
	public String getCodeMstNm() {
		return codeMstNm;
	}
	public void setCodeMstNm(String codeMstNm) {
		this.codeMstNm = codeMstNm;
	}
	public String getCodeMstDesc() {
		return codeMstDesc;
	}
	public void setCodeMstDesc(String codeMstDesc) {
		this.codeMstDesc = codeMstDesc;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

}
