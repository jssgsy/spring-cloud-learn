package com.univ.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author univ
 * date 2025/9/16
 */
// @FeignClient中的name(value)必不可少
@FeignClient(name = "univLocalFeign", url = "127.0.0.1:8910")
public interface UnivLocalFeign {

    @GetMapping("/web/demo/hello")
    String hello();

}
