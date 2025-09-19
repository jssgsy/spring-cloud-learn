package com.univ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author univ
 * date 2025-09-18
 */
@Configuration
@EnableWebSecurity // 启用Spring Security,不用也可以，SecurityAutoConfiguration会启动处理
public class SecurityConfig {

    // 配置安全过滤器链
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/", "/demo/", "/test").permitAll()
                .antMatchers("/admin/").hasRole("ADMIN")
                .anyRequest().authenticated()   // 配置其它路径均需要有登录态
                .and()
                .formLogin(form -> form
                        .loginPage("/login") // 自定义登录页（如果不指定，会用默认的）
                        .permitAll() // 允许所有人访问登录页
                )
                .logout(LogoutConfigurer::permitAll); // 允许所有人退出登录;
        return http.build();
    }
}
