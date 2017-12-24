package com.wuxiao.tang.dao;

import com.wuxiao.tang.entity.Poet;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ownfi on 2017-03-08.
 */
@Repository
public interface IPoetsDao{

    /**
     * 获取分页数据
     * @param offset
     * @param limit
     * @return
     */
    public List<Poet> getList(Integer offset, Integer limit);

    /**
     * 获取数据总数
     * @return
     */
    public Integer countAll();

    /**
     * 获取全部数据
     * @return
     */
    public List<Poet> getAll();
}
