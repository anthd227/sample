package com.sonax.api.code.model;

import com.sonax.common.model.VersionBaseModel;

public class GroupCodeModel extends VersionBaseModel {

	private String groupCode;
	private String groupCodeName;
	private String groupCodeDesc;
	private String useYn;

	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getGroupCodeName() {
		return groupCodeName;
	}
	public void setGroupCodeName(String groupCodeName) {
		this.groupCodeName = groupCodeName;
	}
	public String getGroupCodeDesc() {
		return groupCodeDesc;
	}
	public void setGroupCodeDesc(String groupCodeDesc) {
		this.groupCodeDesc = groupCodeDesc;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	
	@Override
	public String toString() {
		return "GroupCodeModel [groupCode=" + groupCode + ", groupCodeName=" + groupCodeName + ", groupCodeDesc="
				+ groupCodeDesc + ", useYn=" + useYn + "]";
	}
	
}
