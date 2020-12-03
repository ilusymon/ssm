package com.atguigu.xml.bean;

import org.springframework.stereotype.Component;

/**
 * @author Symon
 * @version 1.0
 * @className Book
 * @description TODO
 * @date 2020/11/2 10:58
 */
public class Book {
    private Integer id;
    private String name;
    private Integer stock;

    public Book() {
    }

    public Book(Integer id, String name, Integer stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
