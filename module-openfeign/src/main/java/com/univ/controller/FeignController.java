package com.univ.controller;

import com.univ.feign.UnivLocalFeign;
import com.univ.feign.UnivNacosFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author univ
 * date 2025/9/16
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Resource
    private UnivLocalFeign univLocalFeign;

    @Resource
    UnivNacosFeign univNacosFeign;

    @GetMapping("/say-hello-local")
    public String sayHelloLocal() {
        return univLocalFeign.hello();
    }

    @GetMapping("/say-hello-nacos")
    public String sayHelloNacos() {
        return univNacosFeign.hello();
    }

}
