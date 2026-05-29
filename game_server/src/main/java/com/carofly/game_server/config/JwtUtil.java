package com.carofly.game_server.config;

public class JwtUtil {
    // Must be a Base64-encoded string representing at least 256 bits (32 bytes)
    private static final String SECRET_KEY = "YW5hbHl6ZW9idXN5c2VjdXJld29ya2NyZWF0ZWNhcmVmdWxseWNhcmVwcm92aWRlZA==";
    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour
}
