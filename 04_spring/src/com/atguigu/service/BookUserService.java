package com.atguigu.service;

import com.atguigu.bean.Book;
import com.atguigu.bean.User;
import com.atguigu.dao.BookDao;
import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

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

    @Transactional
    public void buyBook() {
        userDao.updateUser(new User(1, null, 200));
        bookDao.updateBook(new Book(1, null, 95));
    }

}
