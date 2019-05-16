package com.liudehuang.proxy.client;

import com.liudehuang.proxy.OrderService;
import com.liudehuang.proxy.impl.OrderServiceImpl;
import com.liudehuang.proxy.jdk_proxy.impl.JdkInvocationHandler;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/16
 **/
public class Jdk_ProxyMain {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        JdkInvocationHandler handler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService orderServiceProxy = handler.getProxy();
        orderServiceProxy.order();
    }
}
