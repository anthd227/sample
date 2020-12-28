package com.sonax.api.code.model;

import com.sonax.common.model.VersionBaseModel;

public class CodeModel extends VersionBaseModel {
	private String codeMst;
	private String code;
	private String codeNm;
	private String codeDesc;
	private String systemCodeYn;
	private int codeOrder;
	private String useYn;

	public CodeModel() {
		super();
	}
	
	public String getCodeMst() {
		return codeMst;
	}
	public void setCodeMst(String codeMst) {
		this.codeMst = codeMst;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeNm() {
		return codeNm;
	}
	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
	}
	public String getCodeDesc() {
		return codeDesc;
	}
	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}
	public String getSystemCodeYn() {
		return systemCodeYn;
	}
	public void setSystemCodeYn(String systemCodeYn) {
		this.systemCodeYn = systemCodeYn;
	}
	public int getCodeOrder() {
		return codeOrder;
	}
	public void setCodeOrder(int codeOrder) {
		this.codeOrder = codeOrder;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

}
