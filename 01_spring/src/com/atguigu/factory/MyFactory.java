package com.atguigu.factory;

import com.atguigu.bean.Person;

/**
 * @author Symon
 * @version 1.0
 * @className MyFactory
 * @description TODO
 * @date 2020/10/28 18:22
 */
public class MyFactory {

    public static Person creatPerson() {
        return new Person(1, "静态工厂方法", "s@gmail.com", 22);
    }

    public Person creatPerson2() {
        return new Person(2, "工厂实例方法", "gc@gmail.com", 23);
    }
}
