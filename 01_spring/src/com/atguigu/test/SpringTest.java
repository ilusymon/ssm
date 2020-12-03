package com.atguigu.test;

import com.atguigu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Symon
 * @version 1.0
 * @className SpringTest
 * @description TODO
 * @date 2020/10/28 11:30
 */
public class SpringTest {
    @Test
    public void t1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        /*Object p1 = context.getBean("p1");
        System.out.println(p1);*/

        Person person = context.getBean("p9", Person.class);
        System.out.println(person);
    }

    @Test
    public void t12() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Person person = (Person) context.getBean("person5");
        System.out.println(person);

        /*System.out.println(context.getBean("car"));
        System.out.println(context.getBean("car"));
        System.out.println(context.getBean("car"));
        System.out.println(context.getBean("car"));
        System.out.println(context.getBean("car"));*/

        context.close();
    }
}
