package com.liudehuang.responsibility.handler.impl;

import com.liudehuang.responsibility.handler.GatewayHandler;
import org.springframework.stereotype.Component;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
@Component
public class ConversationHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第三关:用户会话信息拦截");
    }
}
