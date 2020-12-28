package com.sonax.api.code.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sonax.api.code.dao.CodeDao;
import com.sonax.api.code.model.CodeMasterModel;
import com.sonax.api.code.model.CodeModel;
import com.sonax.api.code.service.CodeService;

@Service("codeService")
public class CodeServiceImpl implements CodeService {
	
	@Resource(name = "codeDao")
	private CodeDao codeDao;

	@Override
	public List<CodeMasterModel> getGroupCodeList() throws Exception{
		
		return codeDao.getGroupCodeList();
	}

	@Override
	public CodeMasterModel getGroupCodeByGroupCode(CodeMasterModel codeMasterModel) throws Exception{
		
		return null;
	}

	@Override
	public int insertGroupCode(CodeMasterModel codeMasterModel) throws Exception{
		
		return 0;
	}

	@Override
	public int updateGroupCode(CodeMasterModel codeMasterModel) throws Exception{
		
		return 0;
	}

	@Override
	public int deleteGroupCode(CodeMasterModel codeMasterModel) throws Exception{

		return 0;
	}

	@Override
	public List<CodeModel> getCodeList() throws Exception{

		return null;
	}

	@Override
	public CodeModel getCode(CodeModel codeModel) throws Exception{

		return null;
	}

	@Override
	public int insertCode(CodeModel codeModel) throws Exception{

		return 0;
	}

	@Override
	public int updateCode(CodeModel codeModel) throws Exception{

		return 0;
	}

	@Override
	public int deleteCodeByCode(CodeModel codeModel) throws Exception{

		return 0;
	}


}
