package com.sonax.api.code.model;

import com.sonax.common.model.VersionBaseModel;

public class CodeModel extends VersionBaseModel {
	private String groupCode;
	private String code;
	private String codeName;
	private String codeDesc;
	private String systemCodeYn;
	private int codeOrder;
	private String useYn;

	public CodeModel() {
		super();
	}
	
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
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
