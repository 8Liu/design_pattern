package com.liudehuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author liudehuang
 * @Description //TODO
 * @Date 2019/5/8
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PayApp {

    public static void main(String[] args) {
        SpringApplication.run(PayApp.class,args);
    }
}
