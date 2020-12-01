package com.erns.sample.user.repository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.erns.sample.user.dao.UserDao;
import com.erns.sample.user.model.UserModel;

@Repository("userRepository")
public class UserRepository {
	@Resource(name="userDao")
    private UserDao userDao;
	
	public List<UserModel> userList() throws Exception {
		return userDao.userList();
	}
}
