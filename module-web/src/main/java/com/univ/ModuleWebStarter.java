package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author univ
 * @datetime 2018/12/3 6:49 PM
 * @description 启动入口类
 */

@SpringBootApplication
public class ModuleWebStarter {

    public static void main(String[] args) {
        SpringApplication.run(ModuleWebStarter.class);
        System.out.println("===ModuleWebStarter 启动成功===");
    }
}
