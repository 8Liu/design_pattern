package com.liudehuang.dynamic.service.impl;

import com.liudehuang.dynamic.service.OrderService;

/**
 * @BelongProject: design_pattern
 * @BelongPackage: com.liudehuang.dynamic.service.impl
 * @Author: liudehuang
 * @CreateTime: 2019-07-18 15:54:14
 * @Description: todo
 **/
public class OrderServiceImpl implements OrderService {
    @Override
    public void order() throws Throwable {
        System.out.println("数据库订单执行操作");
    }
}
