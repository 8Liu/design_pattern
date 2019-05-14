package com.liudehuang.decorator.impl;

import com.liudehuang.decorator.GatewayComponent;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/14
 **/
public class BaseComponentGateway extends GatewayComponent {
    @Override
    public void service() {
        System.out.println("第一步>>>网关获取基本参数的操作");
    }
}
