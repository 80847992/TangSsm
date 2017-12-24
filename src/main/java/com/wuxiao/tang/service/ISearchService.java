package com.wuxiao.tang.service;

import com.wuxiao.tang.entity.Poetry;

import java.util.List;

public interface ISearchService {

	/**
	 * 设置搜索参数
	 * @param poet_name
	 * @param poetry_title
	 * @param poetry_content
	 */
	public void setParams(String poet_name,String poetry_title,String poetry_content);
	
	/**
	 * 获取数据总数
	 * @return
	 */
	public Integer countAll();
	
	/**
	 * 获取分页数据
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Poetry> getList(Integer offset, Integer limit);
}
