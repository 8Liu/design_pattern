package com.liudehuang.proxy.client;

import com.liudehuang.proxy.cglib_proxy.impl.CglibProxyMethodInterceptor;
import com.liudehuang.proxy.impl.OrderServiceImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/16
 **/
public class Cglib_proxyMain {
    public static void main(String[] args) {
        CglibProxyMethodInterceptor cglibProxyMethodInterceptor = new CglibProxyMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        //设置回调对象
        enhancer.setCallback(cglibProxyMethodInterceptor);
        //设置代理类的父类
        enhancer.setSuperclass(OrderServiceImpl.class);
        //创建代理对象
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) enhancer.create();
        orderServiceImpl.order();

    }
}
