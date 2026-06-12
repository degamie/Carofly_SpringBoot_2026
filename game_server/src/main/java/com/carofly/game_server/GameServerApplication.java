package com.carofly.game_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
@EnableCaching
@EnableAsync
@SpringBootApplication
public class GameServerApplication {
@Async("taskExecutor")
    public static void main(String[] args) {
        SpringApplication gameapp=new SpringApplication(GameServerApplication.class);
        gameapp.setWebApplicationType(WebApplicationType.NONE);
        gameapp.run(args);
    }

}

//        gameapp.run(GameServerApplication.class, args);


//@EnableAsync
//
//@EnableCaching
