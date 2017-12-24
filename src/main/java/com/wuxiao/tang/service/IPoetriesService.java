package com.wuxiao.tang.service;

import com.wuxiao.tang.entity.Poetry;

import java.util.List;

/**
 * Created by ownfi on 2017-03-08.
 */
public interface IPoetriesService {

    public Poetry get(Integer id);

    public Integer countAll();

    public List<Poetry> getList(Integer offset, Integer limit);
}
