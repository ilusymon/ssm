package com.atguigu.calculate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Symon
 * @version 1.0
 * @className LogProxy
 * @description TODO
 * @date 2020/10/31 8:38
 */
public class JdkProxyFactory {

    public static Object createJdkProxyInstance(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (proxy, method, args) -> {
                    LogUtil.logBefore(method.getName(), args);
                    Object result = method.invoke(target, args);
                    LogUtil.logAfterRunning(method.getName(), (Double) result);
                    return result;
                });
    }

    public static void main(String[] args) {
        Calculate target = new Calculater();
        Calculate instance = (Calculate) createJdkProxyInstance(target);
        instance.add(23.4, 56.7);
    }
}
