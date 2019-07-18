package com.liudehuang.proxy.client;

import com.liudehuang.proxy.OrderService;
import com.liudehuang.proxy.factory.OrderServiceProxy;
import com.liudehuang.proxy.impl.OrderServiceImpl;

/**
 * @Author liudehuang
 * @Description //静态代理
 * @Date 2019/5/16
 **/
public class ProxyMain {
    public static void main(String[] args) {
       /* OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
        orderService.order();*/
       OrderService orderService = new OrderServiceProxy();
       orderService.order();
    }
}
