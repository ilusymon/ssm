package com.atguigu.xml.dao;

import com.atguigu.xml.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Symon
 * @version 1.0
 * @className BookDao
 * @description TODO
 * @date 2020/11/2 11:00
 */
@Repository
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Integer updateBook(Book book){
        return jdbcTemplate.update("update book set stock=? where id=?", book.getStock(), book.getId());
    }

}
