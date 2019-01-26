package com.draper.dynamic_proxy_1;

import com.draper.Human;
import com.draper.HumanImpl;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class App {

    public static void main(String[] args) {

        Human human = new HumanImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(human);
        human = (Human) Proxy.newProxyInstance(
                human.getClass().getClassLoader(),
                human.getClass().getInterfaces(),
                dynamicProxy
        );

        human.eat();
    }

}
