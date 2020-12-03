package com.atguigu.mapper;

import com.atguigu.bean.Key;


public interface KeyMapper {

    Key getKeyById(Integer id);

    Key queryKeyById(Integer id);

}
