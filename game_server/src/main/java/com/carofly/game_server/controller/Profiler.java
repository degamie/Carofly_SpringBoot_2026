//WID(23/6/2026)(Sarthak Mittal(DegamieSign#`1))

package com.carofly.game_server.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component
public class Profiler {
    DataSource dataSource;
    @Profile("dev")
    @Bean
    public DataSource h2DataSource(){
        return dataSource;
    }
}
