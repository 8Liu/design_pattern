package com.liudehuang.responsibility;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/9
 **/
@MapperScan(basePackages = "com.liudehuang.responsibility.mapper")
@SpringBootApplication
public class HandlerApp {
    public static void main(String[] args) {
        SpringApplication.run(HandlerApp.class,args);
    }
}
