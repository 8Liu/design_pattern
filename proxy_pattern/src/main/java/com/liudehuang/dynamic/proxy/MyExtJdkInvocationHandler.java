package com.liudehuang.dynamic.proxy;

import java.lang.reflect.Method;

/**
 * @BelongProject: design_pattern
 * @BelongPackage: com.liudehuang.dynamic.proxy
 * @Author: liudehuang
 * @CreateTime: 2019-07-18 15:52:31
 * @Description: 抽象代理
 **/
public interface MyExtJdkInvocationHandler {

    /**
     * @param proxy  代理类
     * @param method 目标方法
     * @param args   参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
