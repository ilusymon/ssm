package com.atguigu.dao;

import com.atguigu.bean.Book;
import org.springframework.stereotype.Repository;

/**
 * @author Symon
 * @version 1.0
 * @className BookDao
 * @description TODO
 * @date 2020/10/30 20:40
 */
@Repository
public class BookDao implements BaseDao<Book> {

    public BookDao() {
        System.out.println("BookDao构造器。。。");
    }

    @Override
    public void save(Book book) {
        System.out.println("BookDao-->>save()方法。。。");
        System.out.println(book);
    }
}
