package com.sonax.api.code.service;

import java.util.List;

import com.sonax.api.code.model.CodeMasterModel;
import com.sonax.api.code.model.CodeModel;

public interface CodeService {
	// GROUP CODE
	public List<CodeMasterModel> getGroupCodeList() throws Exception;
	public CodeMasterModel getGroupCodeByGroupCode(CodeMasterModel codeMasterModel) throws Exception;
	public int insertGroupCode(CodeMasterModel codeMasterModel) throws Exception;
	public int updateGroupCode(CodeMasterModel codeMasterModel) throws Exception;
	public int deleteGroupCode(CodeMasterModel codeMasterModel) throws Exception;
	
	// CODE
	public List<CodeModel> getCodeList() throws Exception;
	public CodeModel getCode(CodeModel codeModel) throws Exception;
	public int insertCode(CodeModel codeModel) throws Exception;
	public int updateCode(CodeModel codeModel) throws Exception;
	public int deleteCodeByCode(CodeModel codeModel) throws Exception;
	
}
