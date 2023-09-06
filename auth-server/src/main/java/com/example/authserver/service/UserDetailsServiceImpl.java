package com.example.authserver.service;

import com.example.authserver.mapper.SysUserMapper;
import com.example.authserver.model.SysUser;
import com.example.authserver.model.SysUserExample;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<SysUser> sysUsers = sysUserMapper.selectByExample(new SysUserExample());
        UserDetails userDetails = null;
        if (sysUsers.size() > 0) {
            userDetails = User.builder().username
                    (sysUsers.get(0).getUsername()).password(sysUsers.get(0).getPassword()).roles("USER").build();
        }
        return userDetails;
    }
}
