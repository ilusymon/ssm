package com.atguigu.test;

import com.atguigu.bean.Book;
import com.atguigu.bean.User;
import com.atguigu.service.BookService;
import com.atguigu.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Symon
 * @version 1.0
 * @className SpringJunitTest
 * @description TODO
 * @date 2020/10/29 13:57
 */
@ContextConfiguration(locations = "classpath:annotation.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringJunitTest {
    public SpringJunitTest() {
        System.out.println("SpringJunitTest构造器");
    }

    @Autowired
    CarService carService;

    @Test
    public void test() {
        System.out.println(carService);
    }

    @Autowired
    private BookService bookService;

    @Autowired
    private Book book;

    @Test
    public void t2(){
        bookService.save(book);
    }

}
