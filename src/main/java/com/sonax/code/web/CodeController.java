package com.sonax.code.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sonax.api.code.service.CodeService;
import com.sonax.api.code.service.impl.CodeServiceImpl;

@Controller
@RequestMapping("/code")
public class CodeController {

	@Resource(name = "codeService")
	private CodeService codeService;
	
}
