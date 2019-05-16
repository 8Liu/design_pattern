package com.liudehuang.proxy.static_proxy;

import com.liudehuang.proxy.OrderService;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/16
 **/
public class OrderServiceProxy implements OrderService {

    private OrderService proxyOrderService;

    public OrderServiceProxy(OrderService orderService){
        this.proxyOrderService = orderService;
    }

    @Override
    public void order() {
        System.out.println("日志收集开始....");
        proxyOrderService.order();
        System.out.println("日志收集结束....");
    }
}
