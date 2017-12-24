package com.wuxiao.tang.controller;

import javax.servlet.http.HttpServletRequest;

import com.wuxiao.tang.helper.Pagination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
	
	private static final long serialVersionUID = 8268916806973818879L;

	/**
	 * 分页组件
	 */
	protected Pagination pagination;

	@Autowired
	protected HttpServletRequest request;

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
}
