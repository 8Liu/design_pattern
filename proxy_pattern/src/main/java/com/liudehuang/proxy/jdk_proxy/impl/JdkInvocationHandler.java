package com.liudehuang.proxy.jdk_proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/16
 **/
public class JdkInvocationHandler implements InvocationHandler {
    /**
     * 目标代理对象（被代理对象）
     */
    private Object target;

    public JdkInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>jdk日志收集开始>>>>" + proxy.getClass().getClassLoader() );
        // 执行代理对象方法
        Object reuslt = method.invoke(target, args);
        System.out.println(">>>jdk日志收集结束>>>>");
        return reuslt;
    }

    /**
     * 获取代理对象接口
     * @param <T>
     * @return
     */
    public <T> T getProxy(){
        //目标代理对象的类加载器、目标代理对象实现的抽象接口类型，事件处理器即this
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
