package com.liudehuang.strategy;

/**
 * @Author liudehuang
 * @Description //策略枚举类，存放所有策略的实现
 * @Date 2019/5/8
 **/
public enum StrategyEnum {
    /**
     * 支付宝支付
     */
    ALI_PAY("com.liudehuang.strategy.impl.AliPayStrategy"),
    /**
     * 银联支付
     */
    UNION_PAY("com.liudehuang.strategy.impl.UnionPayPayStrategy"),
    /**
     * 小米支付
     */
    XIAOMI_PAY("com.liudehuang.strategy.impl.XiaoMiPayStrategy");

    private String clazz;

    StrategyEnum(String clazz){
        this.clazz = clazz;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
