package com.sonax.api.code.service;

import java.util.List;

import com.sonax.api.code.model.CodeModel;
import com.sonax.api.code.model.GroupCodeModel;

public interface CodeService {
	// GROUP CODE
	public List<GroupCodeModel> getGroupCodeList() throws Exception;
	public GroupCodeModel getGroupCodeByGroupCode(GroupCodeModel groupCodeModel) throws Exception;
	public int insertGroupCode(GroupCodeModel groupCodeModel) throws Exception;
	public int updateGroupCode(GroupCodeModel groupCodeModel) throws Exception;
	public int deleteGroupCode(GroupCodeModel groupCodeModel) throws Exception;
	
	// CODE
	public List<CodeModel> getCodeList() throws Exception;
	public CodeModel getCode(CodeModel codeModel) throws Exception;
	public int insertCode(CodeModel codeModel) throws Exception;
	public int updateCode(CodeModel codeModel) throws Exception;
	public int deleteCodeByCode(CodeModel codeModel) throws Exception;
	
	public int insertTest(GroupCodeModel groupCodeModel) throws Exception;
}
