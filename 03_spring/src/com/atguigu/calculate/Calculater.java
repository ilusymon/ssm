package com.atguigu.calculate;

import org.springframework.stereotype.Component;

/**
 * @author Symon
 * @version 1.0
 * @className Calculater
 * @description TODO
 * @date 2020/10/31 8:37
 */
@Component
public class Calculater implements Calculate {
    //@Override
    public double add(double num1, double num2) {
        System.out.println("运算中...");
        return num1 + num2;
    }

}
