package com.sonax.api.user.service;

import java.util.List;

import com.sonax.api.user.model.UserModel;

public interface UserService {
	public List<UserModel> getUserList() throws Exception;
	public UserModel getUserByUserId(UserModel userModel) throws Exception;
	public int insertUser(UserModel userModel) throws Exception;
	public int updateUserById(UserModel userModel) throws Exception;
	public int updatePwdById(UserModel userModel) throws Exception;
	public int deleteUserById(UserModel userModel) throws Exception;
}
