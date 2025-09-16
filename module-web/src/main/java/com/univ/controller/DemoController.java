package com.univ.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author univ
 * date 2025/9/12
 */
@RestController
@RequestMapping("/demo") // 注意这里使用 @RequestMapping
@Slf4j
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "hello ok";
    }
}
