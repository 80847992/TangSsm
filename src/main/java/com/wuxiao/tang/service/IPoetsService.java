package com.wuxiao.tang.service;

import com.wuxiao.tang.entity.Poet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 诗人
 * @author Administrator
 *
 */
public interface IPoetsService {
	
	public List<Poet> getList(Integer offset, Integer limit);
	
	/**
	 * 获取数据总数
	 * @return
	 */
	public Integer countAll();

}
