package com.atguigu.service;

import com.atguigu.dao.BaseDao;

public abstract class BaseService<T> {


    BaseDao<T> baseDao;

    public void save(T t){
        baseDao.save(t);
    }


}
