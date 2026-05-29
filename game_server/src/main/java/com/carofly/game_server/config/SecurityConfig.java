//WID(29/5/2026)(Sarthak Mittal)(DegamieSign)#1.1/1s.1.1.1.1,1.1.1.1.1.1.1
package com.carofly.game_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Component;
//import shaded_package.io.netty.util.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    public final JwtAuthFilter jwtAuthFilter;

    public SecurityConfig(JwtAuthFilter jwtAuthFilter) {
        this.jwtAuthFilter = jwtAuthFilter;
    }
}