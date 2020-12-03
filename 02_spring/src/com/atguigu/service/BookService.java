package com.atguigu.service;

import com.atguigu.bean.Book;
import org.springframework.stereotype.Service;

/**
 * @author Symon
 * @version 1.0
 * @className BookService
 * @description TODO
 * @date 2020/10/30 20:48
 */
@Service
public class BookService extends BaseService<Book> {
    public BookService() {
        System.out.println("BookService构造器");
    }
}
