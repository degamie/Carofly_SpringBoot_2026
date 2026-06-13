//WID(13/6/2026)(Sarthak Mittal(degamieSign(PlayerConfig))
package com.carofly.game_server.config;

import com.carofly.game_server.entity.Player;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
@EnableWebSecurity
@Configuration
public class PlayerConfig {
    @Bean
    public void doPlayerFilterChain(Player player, HttpServletRequest request, HttpServletResponse response){

    }
}
