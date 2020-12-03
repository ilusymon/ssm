package com.atguigu.factory;

import com.atguigu.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Symon
 * @version 1.0
 * @className PersonFactoryBean
 * @description TODO
 * @date 2020/10/28 18:35
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person(11, "PersonFactoryBean", "PersonFactoryBean@mail.com", 24);
    }

    @Override
    public Class<?> getObjectType() {
        return PersonFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
