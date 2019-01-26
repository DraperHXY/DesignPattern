package com.draper.dynamic_proxy_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // doSomething
        Object object = method.invoke(target, args);
        // doSomething

        return object;
    }

}
