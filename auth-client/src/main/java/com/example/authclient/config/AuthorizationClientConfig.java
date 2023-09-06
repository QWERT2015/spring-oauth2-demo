package com.example.authclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AuthorizationClientConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authenticationProvider(authenticationProvider())
                .authorizeHttpRequests(authRequest ->
                        authRequest.requestMatchers("/testAuth")
                                .hasRole("USER").anyRequest().permitAll())
                .oauth2Client(oauth2 -> oauth2
                        .clientRegistrationRepository(this.clientRegistrationRepository())
                );
        return http.build();
    }

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new CustomClientRegistrationRepository();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        // 配置你的认证提供者
        return new ClientAuthenticationProvider();
    }
}