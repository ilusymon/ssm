package com.atguigu.xml.service;

import com.atguigu.xml.bean.Book;
import com.atguigu.xml.bean.User;
import com.atguigu.xml.dao.BookDao;
import com.atguigu.xml.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Symon
 * @version 1.0
 * @className BookUserService
 * @description TODO
 * @date 2020/11/2 11:09
 */
@Service
public class BookUserService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private UserDao userDao;

    public void buyBook() {
        userDao.updateUser(new User(1, null, 200));

        int i = 1 / 1;

        bookDao.updateBook(new Book(1, null, 95));
    }

}
