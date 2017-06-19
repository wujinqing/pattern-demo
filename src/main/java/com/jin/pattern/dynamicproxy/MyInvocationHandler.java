package com.jin.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wu.jinqing
 * @date 2017年06月19日
 */
public class MyInvocationHandler implements InvocationHandler {
    private Subject subject;

    public MyInvocationHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before invoked!");

        Object o = method.invoke(subject, args);

        System.out.println(o);
        System.out.println("after invoked!");

        return o;
    }
}
