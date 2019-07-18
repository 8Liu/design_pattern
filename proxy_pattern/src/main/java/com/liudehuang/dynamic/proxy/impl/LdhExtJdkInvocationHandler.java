package com.liudehuang.dynamic.proxy.impl;

import com.liudehuang.dynamic.proxy.JavaClassLoader;
import com.liudehuang.dynamic.proxy.MyExtJdkInvocationHandler;
import com.liudehuang.dynamic.proxy.MyProxy;

import java.lang.reflect.Method;

/**
 * @BelongProject: design_pattern
 * @BelongPackage: com.liudehuang.dynamic.proxy.impl
 * @Author: liudehuang
 * @CreateTime: 2019-07-18 15:55:45
 * @Description: todo
 **/
public class LdhExtJdkInvocationHandler implements MyExtJdkInvocationHandler {
    /**
     * 目标对象，被代理对象，真是访问的类的对象
     */
    private Object target;

    public LdhExtJdkInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("<<<<<<<<<纯手写jdk动态代理日志开始>>>>>>>>>>");
        Object result = method.invoke(target, args);// 使用java的反射执行
        System.out.println("<<<<<<<<纯手写jdk动态代理结束>>>>>>>>>>");
        return result;
    }


}
