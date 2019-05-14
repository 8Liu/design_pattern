package com.liudehuang.strategy.factory;

import com.liudehuang.strategy.PayStrategy;
import com.liudehuang.strategy.StrategyEnum;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/8
 **/
public class PayStrategyFactory {

    public static PayStrategy getPayStrategy(String strategyType){
       try{
           String className = StrategyEnum.valueOf(strategyType).getClazz();
           return (PayStrategy) Class.forName(className).newInstance();
       }catch (Exception e){
           return null;
       }
    }
}
