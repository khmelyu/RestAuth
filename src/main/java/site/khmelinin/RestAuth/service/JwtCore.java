package site.khmelinin.RestAuth.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import site.khmelinin.RestAuth.model.UserDetailsImpl;

import java.util.Date;

@Component
public class JwtCore {
    @Value("${testing.app.secret}")
    private String secret;
    @Value("${testing.app.lifetime}")
    private int lifetime;

    public String generateToken(Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        return Jwts.builder().setSubject((userDetails.getUsername())).setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime()+lifetime))
                .signWith(SignatureAlgorithm.ES256, secret)
                .compact();
    }
}
