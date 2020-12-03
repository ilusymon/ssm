package com.atguigu.mapper;

import com.atguigu.bean.User;

import java.util.List;

public interface UserMapper {

    User getUserById(Integer id);

    void insertUser(User user);

    List<User> findAllUsers();

}
