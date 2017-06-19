package com.jin.pattern.dynamicproxy;

/**
 * @author wu.jinqing
 * @date 2017年06月19日
 */
public class MySubject implements Subject {
    @Override
    public String doSomething(String name) {
        return "Hello " + name;
    }
}
