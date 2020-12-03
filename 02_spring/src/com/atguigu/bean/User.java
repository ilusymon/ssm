package com.atguigu.bean;

/**
 * @author Symon
 * @version 1.0
 * @className User
 * @description TODO
 * @date 2020/10/29 9:46
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private Book book;

    public User(Integer id, String name, String pwd, Book book) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.book = book;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", book=" + book +
                '}';
    }

    public double getPrice(double price) {
        return price;
    }
}
