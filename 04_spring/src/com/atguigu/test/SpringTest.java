package com.atguigu.test;

import com.atguigu.service.BookUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Symon
 * @version 1.0
 * @className SpringTest
 * @description TODO
 * @date 2020/11/2 11:03
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest {

    @Autowired
    private BookUserService service;

    @Test
    public void t1() {
        service.buyBook();
    }

}
