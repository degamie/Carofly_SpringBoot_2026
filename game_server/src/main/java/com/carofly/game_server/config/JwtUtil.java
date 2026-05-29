    package com.carofly.game_server.config;

    import org.springframework.stereotype.Component;

    @Component
public class JwtUtil {
    // Must be a Base64-encoded string representing at least 256 bits (32 bytes)
    private static final String SECRET_KEY = "secret_key";


    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour
}
