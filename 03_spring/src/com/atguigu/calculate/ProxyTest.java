package com.atguigu.calculate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Symon
 * @version 1.0
 * @className ProxyTest
 * @description TODO
 * @date 2020/10/31 11:21
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ProxyTest {
    @Autowired
    private Calculate calculate;

    @Test
    public void t1() {
        /*ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculater calculater = applicationContext.getBean(Calculater.class);*/
        calculate.add(1, 2);
    }
}
