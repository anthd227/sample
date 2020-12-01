package com.erns.sample.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.erns.sample.common.config.Const;
import com.erns.sample.common.model.ReturnObjectModel;
import com.erns.sample.user.model.UserModel;
import com.erns.sample.user.repository.UserRepository;

@Service("userService")
public class UserService {
	@Resource(name="userRepository")
	private UserRepository userRepository;
	
	public ReturnObjectModel userList() {
		try {
			List<UserModel> listUser = userRepository.userList();
	        ReturnObjectModel retObj = new ReturnObjectModel(Const.RO_INIT_OBJECT);
	        retObj.setReturnObject(listUser);
	        return retObj;
		} catch (Exception e) {
			return new ReturnObjectModel(e);
		}
	}
}
