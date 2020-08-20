package com.liudehuang.dynamic.proxy;

import com.liudehuang.dynamic.proxy.impl.LdhExtJdkInvocationHandler;
import com.liudehuang.dynamic.service.OrderService;
import com.liudehuang.dynamic.service.impl.OrderServiceImpl;

public class MyProxyTest {

    public static void main(String[] args) throws Throwable {
        OrderService orderService = (OrderService)MyProxy.newProxyInstance(new JavaClassLoader(), OrderService.class,
                new LdhExtJdkInvocationHandler(new OrderServiceImpl()));
        orderService.order();
    }
}
