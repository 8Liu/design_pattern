package com.liudehuang.responsibility.controller;

import com.liudehuang.responsibility.factory.HandlerFactory;
import com.liudehuang.responsibility.handler.GatewayHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
@RestController
public class HandlerController {



    @GetMapping("/handler")
    public String client(){
        GatewayHandler gatewayHandler = HandlerFactory.getGatewayHandler();
        gatewayHandler.service();
        return "success";
    }
}
