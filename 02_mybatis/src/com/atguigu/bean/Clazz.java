package com.atguigu.bean;

import java.util.List;

/**
 * @author Symon
 * @version 1.0
 * @className Clazz
 * @description TODO
 * @date 2020/10/26 17:59
 */
public class Clazz {
    private Integer id;
    private String name;
    private List<Student> stus;

    public Clazz(Integer id, String name, List<Student> stus) {
        this.id = id;
        this.name = name;
        this.stus = stus;
    }

    public Clazz() {
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

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stus=" + stus +
                '}';
    }
}
