package com.univ.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 通过服务中心调用
 * @author univ
 * date 2025/9/16
 */
// @FeignClient中的name(value)必不可少，此时 name就是服务中心中要被调用的服务的服务名
@FeignClient(name = "module-web")
public interface UnivNacosFeign {

    @GetMapping("/web/demo/hello")
    String hello();

}
