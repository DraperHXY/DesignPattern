package com.draper.dynamic_proxy_2;

import com.draper.Human;
import com.draper.HumanImpl;

public class App {

    /**
     * 动态代理的架构小优化
     *
     * @param args
     */
    public static void main(String[] args) {
        Human human = (Human) new DynamicProxy(new HumanImpl()).getProxy();
        human.eat();
    }

}
