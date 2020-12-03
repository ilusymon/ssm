package com.atguigu.xml;

import com.atguigu.xml.service.BookUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Symon
 * @version 1.0
 * @className TestTx
 * @description TODO
 * @date 2020/11/2 16:51
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTx {

    @Autowired
    private BookUserService service;

    @Test
    public void t() {
        service.buyBook();
    }

}
