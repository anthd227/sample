package com.sonax.api.loginLog.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sonax.api.loginLog.model.LoginLogModel;
import com.sonax.api.loginLog.service.LoginLogService;

@Service("loginLogService")
public class LoginLogServiceImpl implements LoginLogService {

	@Override
	public List<LoginLogModel> getLoginLogList() throws Exception {
		
		return null;
	}

	@Override
	public List<LoginLogModel> getLoginLogById(LoginLogModel loginLogModel) throws Exception {

		return null;
	}

	@Override
	public List<LoginLogModel> getLoginLogByLogDate(LoginLogModel loginLogModel) throws Exception {

		return null;
	}

	@Override
	public List<LoginLogModel> getLoginLogByIdAndLogDate(LoginLogModel loginLogModel) throws Exception {

		return null;
	}

	@Override
	public int insertLoginLog(LoginLogModel loginLogModel) throws Exception {

		return 0;
	}

}
