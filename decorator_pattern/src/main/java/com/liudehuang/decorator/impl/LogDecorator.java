package com.liudehuang.decorator.impl;

import com.liudehuang.decorator.AbstractDecorator;
import com.liudehuang.decorator.GatewayComponent;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/14
 **/
public class LogDecorator extends AbstractDecorator {

    public LogDecorator(){

    }

    public LogDecorator(GatewayComponent gatewayComponent){
        super(gatewayComponent);
    }

    @Override
    public void service() {
        System.out.println(super.getClass().toString());
        super.service();
        System.out.println("第二关>>>网关中新增日志收集");
    }
}
