package com.liudehuang.dynamic.proxy;

import com.liudehuang.dynamic.service.OrderService;

import java.lang.reflect.Method;

/**
 * @BelongProject: design_pattern
 * @BelongPackage: com.liudehuang.dynamic.proxy
 * @Author: liudehuang
 * @CreateTime: 2019-07-18 15:59:12
 * @Description: todo
 **/
public class $Proxy0 implements OrderService {

    private MyExtJdkInvocationHandler h;

    public $Proxy0(MyExtJdkInvocationHandler h){
        this.h = h;
    }

    @Override
    public void order() throws Throwable {
        // 如何获取真实目标方法呢
        Method orderMethod = OrderService.class.getMethod("order", new Class[]{});
        this.h.invoke(this, orderMethod, null);
    }
}
