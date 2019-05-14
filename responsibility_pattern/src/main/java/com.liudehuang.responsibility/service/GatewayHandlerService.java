package com.liudehuang.responsibility.service;

import com.liudehuang.responsibility.entity.GatewayHandlerEntity;
import com.liudehuang.responsibility.handler.GatewayHandler;
import com.liudehuang.responsibility.mapper.GatewayHandlerMapper;
import com.liudehuang.responsibility.util.SpringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
@Service
public class GatewayHandlerService {
    @Autowired
    private GatewayHandlerMapper gatewayHandlerMapper;

    private GatewayHandler firstGatewayHandler;
    @Autowired
    private SpringUtils springUtils;

    public GatewayHandler getFirstGatewayHandler(){
        if (this.firstGatewayHandler != null) {
            return this.firstGatewayHandler;
        }

        //1.获取第一个GatewayHandler
        GatewayHandlerEntity firstGatewayHandlerEntity = gatewayHandlerMapper.getFirstGatewayHandler();
        if(firstGatewayHandlerEntity==null){
            return null;
        }
        //2.获取第一个firstGatewayHandler在spring中注入的容器id
        String handlerId = firstGatewayHandlerEntity.getHandlerId();
        //3.从spring中获取对应的firstGatewayHandler
        GatewayHandler firstGatewayHandler = springUtils.getBean(handlerId,GatewayHandler.class);
        //4.使用while循环，设置下一个节点，同时定义循环遍历临时对象
        GatewayHandler tempGatewayHandler = firstGatewayHandler;
        //5.获取下一个节点
        String nextHanderId = firstGatewayHandlerEntity.getNextHandlerId();
        while (!StringUtils.isEmpty(nextHanderId)){
            //6.从spring中获取下一个handler
            GatewayHandlerEntity nextGatewayHandlerEntity = gatewayHandlerMapper.getByHandler(nextHanderId);
            if (nextGatewayHandlerEntity == null) {
                break;
            }
            String tempNextHandlerBeanId = nextGatewayHandlerEntity.getHandlerId();
            GatewayHandler nextGatewayHandler = springUtils.getBean(tempNextHandlerBeanId, GatewayHandler.class);
            //7.设置当前handler的下一个handler对象为nextGatewayHandler
            tempGatewayHandler.setNextGatewayHandler(nextGatewayHandler);
            tempGatewayHandler = nextGatewayHandler;
            //8.循环遍历下一个节点
            nextHanderId = nextGatewayHandlerEntity.getNextHandlerId();
        }
        this.firstGatewayHandler = firstGatewayHandler;
        return firstGatewayHandler;
    }
}
