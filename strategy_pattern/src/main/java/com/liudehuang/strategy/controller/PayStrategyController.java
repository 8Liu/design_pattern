package com.liudehuang.strategy.controller;

import com.liudehuang.strategy.context.PayContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/8
 **/
@RestController
public class PayStrategyController {
    @Autowired
    private PayContext payContext;

    @GetMapping("/pay")
    public String pay(@RequestParam("payCode")String payCode){
        String payHtml = payContext.toPayHtml(payCode);
        return payHtml;
    }
}
