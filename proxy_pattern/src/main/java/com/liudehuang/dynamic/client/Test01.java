package com.liudehuang.dynamic.client;

import com.liudehuang.dynamic.proxy.$Proxy0;
import com.liudehuang.dynamic.proxy.JavaClassLoader;
import com.liudehuang.dynamic.proxy.MyProxy;
import com.liudehuang.dynamic.proxy.impl.LdhExtJdkInvocationHandler;
import com.liudehuang.dynamic.service.OrderService;
import com.liudehuang.dynamic.service.impl.OrderServiceImpl;

/**
 * @BelongProject: design_pattern
 * @BelongPackage: com.liudehuang.dynamic.client
 * @Author: liudehuang
 * @CreateTime: 2019-07-18 16:01:10
 * @Description: todo
 **/
public class Test01 {
    public static void main(String[] args) throws Throwable {
       /* OrderService orderService = new $Proxy0(new LdhExtJdkInvocationHandler(new OrderServiceImpl()));
        orderService.order();*/
        LdhExtJdkInvocationHandler handler = new LdhExtJdkInvocationHandler(new OrderServiceImpl());
        OrderService orderService = (OrderService) MyProxy.newProxyInstance(new JavaClassLoader(),OrderService.class,handler);
        orderService.order();
    }
}
