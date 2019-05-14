package com.liudehuang.decorator.factory;

import com.liudehuang.decorator.GatewayComponent;
import com.liudehuang.decorator.impl.BaseComponentGateway;
import com.liudehuang.decorator.impl.LimitDecorator;
import com.liudehuang.decorator.impl.LogDecorator;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/14
 **/
public class GatewayFactory {

    /*public static GatewayComponent getGatewayComponent(){
        BaseComponentGateway baseComponentGateway = new BaseComponentGateway();
        LogDecorator logDecorator = new LogDecorator();
        logDecorator.setGatewayComponent(baseComponentGateway);
        LimitDecorator limitDecorator = new LimitDecorator();
        limitDecorator.setGatewayComponent(logDecorator);
        return limitDecorator;
    }*/

    public static void main(String[] args) {
        LimitDecorator limitDecorator = new LimitDecorator(new LogDecorator(new BaseComponentGateway()));
        limitDecorator.service();
    }
}
