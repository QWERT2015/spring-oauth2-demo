package com.example.resourceserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity(debug = true)
@EnableMethodSecurity(prePostEnabled = true) //开启鉴权服务
public class ResourceConfig {
    @Bean
    public SecurityFilterChain httpSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        // 所有请求都进行拦截
        httpSecurity.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
                // 关闭session
                .sessionManagement(sessionManagement -> sessionManagement.disable())
                // 配置资源服务器的无权限，无认证拦截器等 以及JWT验证
                .oauth2ResourceServer(oauth2ResourceServer -> oauth2ResourceServer.accessDeniedHandler(new SimpleAccessDeniedHandler())
                        .authenticationEntryPoint(new SimpleAuthenticationEntryPoint())
                        .jwt())
        ;
        return httpSecurity.build();
    }
}
