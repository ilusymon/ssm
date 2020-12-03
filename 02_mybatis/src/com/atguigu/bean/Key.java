package com.atguigu.bean;

/**
 * @author Symon
 * @version 1.0
 * @className key
 * @description TODO
 * @date 2020/10/26 15:02
 */
public class Key {
    private Integer id;
    private String name;
    private Lock lock;

    public Key() {
    }

    public Key(Integer id, String name, Lock lock) {
        this.id = id;
        this.name = name;
        this.lock = lock;
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

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return "Key{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lock=" + lock +
                '}';
    }
}
