package com.liudehuang.proxy.impl;

import com.liudehuang.proxy.OrderService;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/16
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public void order() {
        System.out.println(">>>执行业务请求");
    }
}
