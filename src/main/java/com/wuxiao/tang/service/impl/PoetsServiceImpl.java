package com.wuxiao.tang.service.impl;

import java.util.List;

import com.wuxiao.tang.dao.IPoetsDao;
import com.wuxiao.tang.entity.Poet;
import com.wuxiao.tang.service.IPoetsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 诗人
 * @author Administrator
 *
 */
@Service
public class PoetsServiceImpl implements IPoetsService {

	@Autowired
	private IPoetsDao poetsDao;

	public PoetsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Poet> getList(Integer offset, Integer limit){
		return poetsDao.getList(offset,limit);
	}
	
	/**
	 * 获取数据总数
	 * @return
	 */
	public Integer countAll(){
		return poetsDao.countAll();
	}

}
