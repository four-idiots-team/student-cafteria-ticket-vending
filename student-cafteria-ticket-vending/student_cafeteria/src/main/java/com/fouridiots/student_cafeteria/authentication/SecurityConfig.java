package com.fouridiots.student_cafeteria.authentication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests.anyRequest().permitAll()
                        //.requestMatchers("/resources/templates/food").permitAll() // ./resources/templates/admin 경로는 인증 없이 접근 허용
                );

        return http.build();
    }
}
