package com.example.authclient.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import java.util.ArrayList;

public class ClientAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 从传入的authentication对象中获取认证信息
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        // 在此处执行客户端认证逻辑
        if (isValidClient(username, password)) {
            // 如果客户端认证成功，创建一个认证成功的Token并返回
            return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());
        } else {
            // 如果客户端认证失败，抛出一个认证异常
            throw new BadCredentialsException("Invalid client credentials");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // 指定该认证提供者支持的认证类型为UsernamePasswordAuthenticationToken
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private boolean isValidClient(String username, String password) {
        // TODO: 执行客户端认证逻辑，验证客户端的用户名和密码是否有效
        // 这里可以根据实际情况，连接数据库或调用其他认证服务进行验证
        // 返回true表示认证通过，返回false表示认证失败
        // 你需要根据实际需求自行实现该方法
        return true;
    }
}
