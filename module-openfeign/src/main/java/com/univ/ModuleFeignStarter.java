package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author univ
 * @datetime 2018/12/3 6:49 PM
 * @description 启动入口类
 */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ModuleFeignStarter {

    public static void main(String[] args) {
        SpringApplication.run(ModuleFeignStarter.class);
        System.out.println("===ModuleOpenFeignStarter 启动成功===");
    }
}
