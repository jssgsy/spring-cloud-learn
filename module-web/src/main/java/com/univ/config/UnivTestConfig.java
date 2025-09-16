package com.univ.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author univ
 * date 2025/9/15
 */
@ConfigurationProperties(prefix = "univ")
@Data
@Component
public class UnivTestConfig {

    private String name;

    private Integer age;
}
