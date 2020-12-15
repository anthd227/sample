package com.sonax.api.code.model;

import java.sql.Date;

public class CodeModel {
	private int codeId; 
	private String groupCode;
	private String code;
	private String codeName;
	private String codeDesc;
	private String systemCodeYn;
	private int codeOrder;
	private String useYn;
	private String regId;
	private Date regDate;
	private String udtId;
	private Date udtDate;
	
	public CodeModel() {
		super();
	}
	public int getCodeId() {
		return codeId;
	}
	public void setCodeId(int codeId) {
		this.codeId = codeId;
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
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getUdtId() {
		return udtId;
	}
	public void setUdtId(String udtId) {
		this.udtId = udtId;
	}
	public Date getUdtDate() {
		return udtDate;
	}
	public void setUdtDate(Date udtDate) {
		this.udtDate = udtDate;
	}
	
	
}
