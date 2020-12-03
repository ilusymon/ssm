package com.atguigu.process;

import com.atguigu.bean.Car;
import com.atguigu.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Symon
 * @version 1.0
 * @className MyBeanPostProcessor
 * @description TODO
 * @date 2020/10/28 19:16
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println( " 初始化之前 obj => " + bean + " , id =>" + beanName );
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("person5".equals(beanName)) {
            Person p = (Person) bean;
            p.setEmail("89@qq.com");
            p.setCar(new Car(1, "BWM"));
        }
        System.out.println(" 初始化之后 obj => " + bean + " , id =>" + beanName);
        return bean;
    }
}
