package com.atguigu.calculate;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className LogUtil
 * @description TODO
 * @date 2020/10/31 8:33
 */
@Component
@Aspect
public class LogUtil {

    @Before(value = "execution(public double com.atguigu.calculate.Calculater.add(double, double))")
    public static void logBefore() {
        System.out.println("当前运算：" + ",参数：");
    }
    @After(value = "execution(public double com.atguigu.calculate.Calculater.add(double, double))")
    public static void logAfterRunning() {
        System.out.println("当前运算：" + ",结果：");
    }
}
