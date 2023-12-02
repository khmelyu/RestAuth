package site.khmelinin.RestAuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import site.khmelinin.RestAuth.service.JwtCore;


@SpringBootApplication
public class RestAuthApplication {

    private JwtCore jwtCore;

    public static void main(String[] args) {
        SpringApplication.run(RestAuthApplication.class, args);
    }

    @Autowired
    public void setJwtCore(JwtCore jwtCore) {
        this.jwtCore = jwtCore;
    }

}
