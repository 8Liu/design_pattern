package com.liudehuang.responsibility.factory;

import com.liudehuang.responsibility.handler.GatewayHandler;
import com.liudehuang.responsibility.handler.impl.BlackListHandler;
import com.liudehuang.responsibility.handler.impl.ConversationHandler;
import com.liudehuang.responsibility.handler.impl.CurrentLimitHandler;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
public class HandlerFactory {
    public static GatewayHandler getGatewayHandler(){
        //1.使用工厂模式封装GatewayHandler责任链
        GatewayHandler currentLimitHandler = new CurrentLimitHandler();
        GatewayHandler blackListHandler = new BlackListHandler();
        currentLimitHandler.setNextGatewayHandler(blackListHandler);
        GatewayHandler conversationHandler = new ConversationHandler();
        blackListHandler.setNextGatewayHandler(conversationHandler);
        return currentLimitHandler;
    }
}
