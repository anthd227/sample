package com.sonax.api.user.dao;

import java.util.List;

import com.sonax.api.user.model.UserModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("userDao")
public interface UserDao {
	public List<UserModel> getUserList() throws Exception;
	public UserModel getUserByUserId(UserModel userModel) throws Exception;
	public int insertUser(UserModel userModel) throws Exception;
	public int updateUserById(UserModel userModel) throws Exception;
	public int updatePwdById(UserModel userModel) throws Exception;
	public int deleteUserById(UserModel userModel) throws Exception;
}
