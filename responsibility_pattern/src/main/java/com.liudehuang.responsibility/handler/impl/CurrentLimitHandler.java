package com.liudehuang.responsibility.handler.impl;

import com.liudehuang.responsibility.handler.GatewayHandler;
import org.springframework.stereotype.Component;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
@Component
public class CurrentLimitHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第一关:API接口限流");
        nextService();
    }
}
