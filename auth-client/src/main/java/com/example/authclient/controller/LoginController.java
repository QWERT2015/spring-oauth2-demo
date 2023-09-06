package com.example.authclient.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RolesAllowed({"ROLE_USER"})
    @RequestMapping("/testAuth")
    public String testAuth(){
        System.out.println("1111111111");
        return "";
    }


}
