package com.wuxiao.tang.dao;

import com.wuxiao.tang.entity.Poetry;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ownfi on 2017-03-08.
 */
@Repository
public interface IPoetriesDao {

    /**
     * 获取单个
     * @param id
     * @return
     */
    public Poetry get(Integer id);

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

    /**
     * 搜索
     * @param offset
     * @param limit
     * @return
     */
    public List<Poetry> searchList(String poet_name,String poetry_title,String poetry_content,Integer offset, Integer limit);

    /**
     * 搜索结果总数
     * @return
     */
    public Integer countAll(String poet_name,String poetry_title,String poetry_content);
}
