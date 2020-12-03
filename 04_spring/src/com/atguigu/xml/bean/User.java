package com.atguigu.xml.bean;

import org.springframework.stereotype.Component;

/**
 * @author Symon
 * @version 1.0
 * @className User
 * @description TODO
 * @date 2020/11/2 10:59
 */
public class User {
    private Integer id;
    private String name;
    private Integer money;

    public User(Integer id, String name, Integer money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
