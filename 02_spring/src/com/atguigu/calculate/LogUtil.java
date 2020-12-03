package com.atguigu.calculate;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className LogUtil
 * @description TODO
 * @date 2020/10/31 8:33
 */
public class LogUtil {

    public static void logBefore(String method, Object... args) {
        System.out.println("当前运算：" + method + ",参数：" + Arrays.asList(args));
    }

    public static void logAfterRunning(String method, double result) {
        System.out.println("当前运算：" + method + ",结果：" + result);
    }
}
