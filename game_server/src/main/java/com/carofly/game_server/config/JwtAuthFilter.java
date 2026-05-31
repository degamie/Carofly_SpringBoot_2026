//WID(31/5/2026)(Sarthak Mittal)(DegamieSign#1),1.1.1
package com.carofly.game_server.config;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Configuration
public class JwtAuthFilter   extends OncePerRequestFilter{
    public final JwtUtil jwtUtil;public UserDetailsService userDetailsService;
    public void setUserDetailsService(UserDetailsService userDetailsService){this.userDetailsService=userDetailsService;}//Bidning UserDetialsServeice in App
    public JwtAuthFilter(JwtUtil jwtUtil, UserDetailsService userDetailsService) {
    this.jwtUtil = jwtUtil;
    this.userDetailsService = userDetailsService;
}
    public String extractClaim(String token,Function<Claims,T> claimsResolver) {
    }
    public String extrcactUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String authheader=request.getHeader("Authorization");
    }


}
