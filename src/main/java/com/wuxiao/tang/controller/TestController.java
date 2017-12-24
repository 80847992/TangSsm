package com.wuxiao.tang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class TestController {

	@Autowired
	protected HttpServletRequest request;
	
	@RequestMapping("test.do")
	public String login() {
		return "test";
	}

}
