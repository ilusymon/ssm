package com.atguigu.bean;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Symon
 * @version 1.0
 * @className Person
 * @description TODO
 * @date 2020/10/28 11:26
 */
public class Person {

    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private Car car;
    private List<String> list;
    private Map<String, Object> map;
    private Properties prop;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", list=" + list +
                ", map=" + map +
                ", prop=" + prop +
                '}';
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Person(Integer id, String name, String email, Integer age, Car car, List<String> list) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.car = car;
        this.list = list;
    }

    public Person() {
        System.out.println("Person的无参构造器");
    }

    public Person(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(Integer id, String name, String email, Integer age, Car car) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.car = car;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void init() {
        System.out.println(" init() 这里可以做一些初始化操作 ");
    }

    public void destroy() {
        System.out.println(" destroy() 这里可以做一些销毁操作 ");
    }

}
