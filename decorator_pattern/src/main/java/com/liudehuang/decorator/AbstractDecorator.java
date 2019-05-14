package com.liudehuang.decorator;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/14
 **/
public abstract class AbstractDecorator extends GatewayComponent {

    protected GatewayComponent gatewayComponent;

    public AbstractDecorator(){
    }

    public AbstractDecorator(GatewayComponent gatewayComponent){
        this.gatewayComponent = gatewayComponent;
    }

    public void setGatewayComponent(GatewayComponent gatewayComponent){
        if(gatewayComponent!=null){
            this.gatewayComponent = gatewayComponent;
        }
    }

    @Override
    public void service() {
        gatewayComponent.service();
    }

}
