package com.univ.controller;

import com.univ.config.UnivTestConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author univ
 * date 2025/9/15
 */
@RestController
@RequestMapping("/nacos") // 注意这里使用 @RequestMapping
@Slf4j
public class NacosConfigController {

    @Resource
    private UnivTestConfig univTestConfig;

    @GetMapping("config/get")
    private UnivTestConfig getUnivTestConfig() {
        return univTestConfig;
    }
}
