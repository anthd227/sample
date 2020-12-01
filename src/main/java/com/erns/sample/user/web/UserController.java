package com.erns.sample.user.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.erns.sample.common.model.AjaxResult;
import com.erns.sample.common.model.ReturnObjectModel;
import com.erns.sample.user.service.UserService;

@Controller
@RequestMapping("/api/user")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping("/test.do")
	@ResponseBody
    public AjaxResult test(HttpServletRequest request) {
		ReturnObjectModel retObj = userService.userList();		
    	return new AjaxResult(retObj);
    }
}
