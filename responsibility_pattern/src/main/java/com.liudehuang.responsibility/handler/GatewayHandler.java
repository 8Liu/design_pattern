package com.liudehuang.responsibility.handler;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
public abstract class GatewayHandler {

    protected GatewayHandler nextGatewayHandler;
    /**
     * 处理业务逻辑
     */
    public abstract void service();

    public void setNextGatewayHandler(GatewayHandler handler){
        this.nextGatewayHandler = handler;
    }

    protected void nextService(){
        if(nextGatewayHandler!=null){
            nextGatewayHandler.service();
        }
    }
}
