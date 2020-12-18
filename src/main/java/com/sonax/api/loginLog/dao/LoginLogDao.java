package com.sonax.api.loginLog.dao;

import java.util.List;

import com.sonax.api.loginLog.model.LoginLogModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("loginLogDao")
public interface LoginLogDao {
	public List<LoginLogModel> getLoginLogList() throws Exception;
	public List<LoginLogModel> getLoginLogById(LoginLogModel loginLogModel) throws Exception;
	public List<LoginLogModel> getLoginLogByLogDate(LoginLogModel loginLogModel) throws Exception;
	public List<LoginLogModel> getLoginLogByIdAndLogDate(LoginLogModel loginLogModel) throws Exception;
	public int insertLoginLog(LoginLogModel loginLogModel) throws Exception;
}
