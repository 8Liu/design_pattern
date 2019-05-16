package com.liudehuang.proxy.factory;

import com.liudehuang.proxy.impl.OrderServiceImpl;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/16
 **/
public class OrderServiceProxy extends OrderServiceImpl {
    @Override
    public void order() {
        System.out.println("日志收集开始");
        super.order();
        System.out.println("日志收集结束");
    }
}
