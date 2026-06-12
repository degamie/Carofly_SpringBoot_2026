//WID(12/06/2026)(Sarthak Mittal)(DegamieSign#1)(Carofly Game(SpringBoot)(API))JwtAuthfilter)
package com.carofly.game_server.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.util.function.Function;
@EnableWebSecurity

@Configuration
public class JwtAuthFilter   extends OncePerRequestFilter{
    public final JwtUtil jwtUtil;public UserDetailsService userDetailsService;
    public void setUserDetailsService(UserDetailsService userDetailsService){this.userDetailsService=userDetailsService;}//Bidning UserDetialsServeice in App
    public JwtAuthFilter(JwtUtil jwtUtil, UserDetailsService userDetailsService) {
    this.jwtUtil = jwtUtil;
    this.userDetailsService = userDetailsService;
    }   
    private String getJwtFromRequest(HttpServeletRequest request){
        String bearertoken=request.getHeader("Authorization");
    }
    public <T> extractClaim(String token, Function<Claims,T> claimsResolver) {
        final Claims claims= Jwts.parser()
                                .verifyWith(getSigningKey())
                                 .parseSignedClaims(token)
                                .getPayload();
        return claimsResolver.apply(claims);
    }

    private SecretKey getSigningKey() {
        return SecretKey;
    }//TBI

    public String extrcactUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String authheader=request.getHeader("Authorization");
    }


}
