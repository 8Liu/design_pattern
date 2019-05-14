package com.liudehuang.responsibility.controller;

import com.liudehuang.responsibility.handler.GatewayHandler;
import com.liudehuang.responsibility.service.GatewayHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
@RestController
public class GatewayHandlerController {
    @Autowired
    private GatewayHandlerService gatewayHandlerService;

    @GetMapping("/gateway")
    public String gateway(){
        GatewayHandler firstGatewayHandler = gatewayHandlerService.getFirstGatewayHandler();
        firstGatewayHandler.service();
        return "success";
    }
}
