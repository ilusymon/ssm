package com.atguigu.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Symon
 * @version 1.0
 * @className BaseDao
 * @description TODO
 * @date 2020/10/30 20:37
 */
public interface BaseDao<T> {
    void save(T t);

}
