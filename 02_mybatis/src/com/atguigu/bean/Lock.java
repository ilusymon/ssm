package com.atguigu.bean;

/**
 * @author Symon
 * @version 1.0
 * @className Lock
 * @description TODO
 * @date 2020/10/26 15:02
 */
public class Lock {
    private Integer id;
    private String name;

    public Lock() {
    }

    public Lock(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Lock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
