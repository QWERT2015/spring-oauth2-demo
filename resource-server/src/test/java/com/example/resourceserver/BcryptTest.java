package com.example.resourceserver;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTest {

    @Test
    public void bcryptEncode(){
        System.out.println(new BCryptPasswordEncoder().encode("password"));
    }
}
