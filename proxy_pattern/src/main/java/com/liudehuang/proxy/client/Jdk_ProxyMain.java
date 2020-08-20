package com.liudehuang.proxy.client;

import com.liudehuang.proxy.OrderService;
import com.liudehuang.proxy.impl.OrderServiceImpl;
import com.liudehuang.proxy.jdk_proxy.impl.JdkInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @Author liudehuang
 * @Description //jdk动态代理测试
 * @Date 2019/5/16
 **/
public class Jdk_ProxyMain {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
      /*  JdkInvocationHandler handler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService orderServiceProxy = handler.getProxy();
        orderServiceProxy.order();*/
        //创建被代理对象
        OrderService orderService = new OrderServiceImpl();
        //被代理对象的InvacationHandler接口
        JdkInvocationHandler handler = new JdkInvocationHandler(orderService);
        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(),
                orderService.getClass().getInterfaces(), handler);
        orderServiceProxy.order();
    }
}
