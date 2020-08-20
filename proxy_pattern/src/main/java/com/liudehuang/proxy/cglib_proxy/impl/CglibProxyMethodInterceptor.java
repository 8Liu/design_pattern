package com.liudehuang.proxy.cglib_proxy.impl;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/16
 **/
public class CglibProxyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] orgs, MethodProxy methodProxy) throws Throwable {
        System.out.println("<<<<cglib日志收集开始>>>>");
        Object o = methodProxy.invokeSuper(obj, orgs);
        System.out.println("<<<<cglib日志收集结束>>>>");
        return o;
    }
}
