package com.draper.static_proxy;

import com.draper.HumanImpl;

public class App {

    /**
     * 静态代理，方法固定，不易修改
     *
     * @param args
     */
    public static void main(String[] args) {
        HumanProxy humanProxy = new HumanProxy(new HumanImpl());
        humanProxy.eat();
    }

}
