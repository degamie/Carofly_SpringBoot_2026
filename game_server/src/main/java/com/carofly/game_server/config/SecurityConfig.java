//WID(12/06/2026)(Sarthak Mittal)(DegamieSign)(secuirtyConfig)
package com.carofly.game_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
//import shaded_package.io.netty.util.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    public JwtAuthFilter getJwtAuthFilter(JwtAuthFilter jwtAuthFilter){return  jwtAuthFilter;}
    public JwtAuthFilter jwtAuthFilter;
    public final void setJwtAuthFilter(JwtAuthFilter jwtAuthFilter){this.jwtAuthFilter=jwtAuthFilter;}//binding jwtAuthFilter in GameApp


    public SecurityConfig(JwtAuthFilter jwtAuthFilter) {
        this.jwtAuthFilter = jwtAuthFilter;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}