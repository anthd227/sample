package com.sonax.api.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sonax.api.user.model.UserModel;
import com.sonax.api.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public List<UserModel> getUserList() throws Exception {

		return null;
	}

	@Override
	public UserModel getUserByUserId(UserModel userModel) throws Exception {

		return null;
	}

	@Override
	public int insertUser(UserModel userModel) throws Exception {
		
		return 0;
	}

	@Override
	public int updateUserById(UserModel userModel) throws Exception {

		return 0;
	}

	@Override
	public int updatePwdById(UserModel userModel) throws Exception {

		return 0;
	}

	@Override
	public int deleteUserById(UserModel userModel) throws Exception {

		return 0;
	}

}
