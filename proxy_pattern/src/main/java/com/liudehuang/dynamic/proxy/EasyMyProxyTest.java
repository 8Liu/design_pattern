package com.liudehuang.dynamic.proxy;

import com.liudehuang.dynamic.proxy.impl.LdhExtJdkInvocationHandler;
import com.liudehuang.dynamic.service.OrderService;
import com.liudehuang.dynamic.service.impl.OrderServiceImpl;

public class EasyMyProxyTest {
    public static void main(String[] args) throws Throwable {
        OrderService orderService = new $Proxy0(new LdhExtJdkInvocationHandler(new OrderServiceImpl()));
        orderService.order();
    }
}
