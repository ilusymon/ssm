package com.atguigu.bean;

/**
 * @author Symon
 * @version 1.0
 * @className Car
 * @description TODO
 * @date 2020/10/28 11:32
 */
public class Car {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Car(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Car() {
    }
}
