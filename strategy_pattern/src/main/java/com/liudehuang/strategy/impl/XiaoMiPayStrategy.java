package com.liudehuang.strategy.impl;

import com.liudehuang.strategy.PayStrategy;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/8
 **/
public class XiaoMiPayStrategy implements PayStrategy {
    @Override
    public String toPayHtml() {
        return "小米支付";
    }
}
