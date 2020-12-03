package com.atguigu.dao;

import com.atguigu.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Symon
 * @version 1.0
 * @className UserDao
 * @description TODO
 * @date 2020/11/2 11:00
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer updateUser(User user) {
        return jdbcTemplate.update("update `user` set money=? where id=?", user.getMoney(), user.getId());
    }

}
