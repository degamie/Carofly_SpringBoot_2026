//WID(26/05/2026)(Sarthak Mittal)(DegamieSign)#1
package com.carofly.game_server.config;

import org.springframework.boot.cache.autoconfigure.CacheProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@EnableCaching
@Configuration

public class CacheConfigLoader {CacheConfigLoader cacheLoader=new CacheConfigLoader();

    public void setCacheLoader(CacheConfigLoader cacheLoader){this.cacheLoader=cacheLoader;}
    @Bean
    public CacheManager  loadCache(){
        CaffeineCacheManager cacheManager=new CaffeineCacheManager();
        cacheManager.setCacheNames(Arrays.asList("Player","Notifications","SaveGame","LoadGame","Setting"));
        cacheManager.setCaffeine(caffeineCacheBuilder());
        return cacheManager;
    }


    com.github.benmanes.caffeine.cache.Caffeine<Object, Object> caffeineCacheBuilder() {
        return CacheProperties.Caffeine.newBuilder()
                .initialCapacity(100)
                .maximumSize(500) // Evict oldest items if total items exceed 500
                .expireAfterWrite(10, TimeUnit.MINUTES) // TTL: Expire 10 mins after creation
                .recordStats(); // Enables metrics gathering (great for Actuator monitoring)
    }

}
