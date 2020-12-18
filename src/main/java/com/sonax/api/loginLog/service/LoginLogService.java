package com.sonax.api.loginLog.service;

import java.util.List;

import com.sonax.api.loginLog.model.LoginLogModel;

public interface LoginLogService {
	public List<LoginLogModel> getLoginLogList() throws Exception;
	public List<LoginLogModel> getLoginLogById(LoginLogModel loginLogModel) throws Exception;
	public List<LoginLogModel> getLoginLogByLogDate(LoginLogModel loginLogModel) throws Exception;
	public List<LoginLogModel> getLoginLogByIdAndLogDate(LoginLogModel loginLogModel) throws Exception;
	public int insertLoginLog(LoginLogModel loginLogModel) throws Exception;
}
