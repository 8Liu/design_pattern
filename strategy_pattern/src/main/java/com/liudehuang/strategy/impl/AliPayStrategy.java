package com.liudehuang.strategy.impl;

import com.liudehuang.strategy.PayStrategy;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/8
 **/
public class AliPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "支付宝支付";
    }
}
