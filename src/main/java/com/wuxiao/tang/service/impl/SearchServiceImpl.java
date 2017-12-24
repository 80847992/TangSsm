package com.wuxiao.tang.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import com.wuxiao.tang.dao.IPoetriesDao;
import com.wuxiao.tang.entity.Poetry;
import com.wuxiao.tang.helper.CharsetHelper;
import com.wuxiao.tang.helper.StringHelper;
import com.wuxiao.tang.service.ISearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements ISearchService {

	private String poet_name;
	private String poetry_title;
	private String poetry_content;

	@Autowired
	private IPoetriesDao poetriesDao;

	/**
	 * 设置搜索参数
	 * @param poet_name
	 * @param poetry_title
	 * @param poetry_content
	 */
	public void setParams(String poet_name,String poetry_title,String poetry_content){
		this.poet_name = null;
		this.poetry_title = null;
		this.poetry_content = null;

		try {
			poet_name = URLDecoder.decode(poet_name,"UTF-8").trim();
			if (!StringHelper.isNullOrEmpty(poet_name) && !poet_name.equals("作者")){
				this.poet_name = poet_name;
			}

			poetry_title = URLDecoder.decode(poetry_title,"UTF-8").trim();
			if (!StringHelper.isNullOrEmpty(poetry_title) && !poetry_title.equals("标题")){
				this.poetry_title = poetry_title;
			}

			poetry_content = URLDecoder.decode(poetry_content,"UTF-8").trim();
			if (!StringHelper.isNullOrEmpty(poetry_content) && !poetry_content.equals("内容")){
				this.poetry_content = poetry_content;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数据总数
	 * @return
	 */
	public Integer countAll(){
		return poetriesDao.countAll(poet_name,poetry_title,poetry_content);
	}
	
	/**
	 * 获取分页数据
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Poetry> getList(Integer offset, Integer limit){
		return poetriesDao.searchList(poet_name,poetry_title,poetry_content,offset,limit);
	}
}
