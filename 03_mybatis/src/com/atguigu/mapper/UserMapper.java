package com.atguigu.mapper;

import com.atguigu.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUsersByNameAndSex(User user);

    void insertUsersBatch(@Param("users") List<User> users);

}
