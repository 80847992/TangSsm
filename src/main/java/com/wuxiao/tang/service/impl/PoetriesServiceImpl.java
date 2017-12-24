package com.wuxiao.tang.service.impl;

import java.util.List;

import com.wuxiao.tang.dao.IPoetriesDao;
import com.wuxiao.tang.entity.Poetry;
import com.wuxiao.tang.service.IPoetriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 诗词
 * @author Administrator
 *
 */
@Service
public class PoetriesServiceImpl implements IPoetriesService {

	@Autowired
	private IPoetriesDao poetriesDao;

	public PoetriesServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public Poetry get(Integer id){
		return poetriesDao.get(id);
	}
	
	/**
	 * 获取数据总数
	 * @return
	 */
	public Integer countAll(){
		return poetriesDao.countAll();
	}
	
	/**
	 * 获取分页数据
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Poetry> getList(Integer offset,Integer limit){
		return poetriesDao.getList(offset,limit);
	}

}
