package com.liudehuang.strategy.context;

import com.liudehuang.strategy.PayStrategy;
import com.liudehuang.strategy.factory.PayStrategyFactory;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/8
 **/
@Component
public class PayContext {
    /**
     * 根据payCode获取支付对象
     * @param payCode
     * @return
     */
    public String toPayHtml(String payCode){
        if(StringUtils.isEmpty(payCode)){
            return "payCode 不能为空！！！";
        }
        PayStrategy payStrategy = PayStrategyFactory.getPayStrategy(payCode);
        if(payStrategy == null){
            return "没有找到具体的实现....";
        }
        return payStrategy.toPayHtml();
    }
}
