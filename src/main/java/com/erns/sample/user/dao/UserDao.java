package com.erns.sample.user.dao;

import java.util.List;

import com.erns.sample.user.model.UserModel;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("userDao")
public interface UserDao {
	public List<UserModel> userList() throws Exception;
}
