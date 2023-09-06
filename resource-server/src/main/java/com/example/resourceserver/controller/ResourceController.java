package com.example.resourceserver.controller;

import com.example.resourceserver.util.SingleResultBundle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@Slf4j
@RestController
public class ResourceController {

    /**
     * 测试Spring Authorization Server，测试权限
     */
    @PreAuthorize("hasAuthority('SCOPE_message.read')")
    @GetMapping("/getTest")
    public String getTest(){
        return "getTest";
    }

    /**
     * 默认登录成功跳转页为 /  防止404状态
     *
     * @return the map
     */
    @GetMapping("/")
    public Map<String, String> index() {
        return Collections.singletonMap("msg", "login success!");
    }

    @GetMapping("/getResourceTest")
    public SingleResultBundle<String> getResourceTest(){
        return SingleResultBundle.success("这是resource的测试方法 getResourceTest()");
    }
}
