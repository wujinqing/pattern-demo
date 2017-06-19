package com.jin.pattern.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author wu.jinqing
 * @date 2017年06月19日
 */
public class MyProxy {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();

        MyInvocationHandler handler = new MyInvocationHandler(mySubject);

        ClassLoader classLoader = Subject.class.getClassLoader();

        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, mySubject.getClass().getInterfaces(), handler);

        String res = subject.doSomething("zhang san");

        System.out.println(res);
    }
}
