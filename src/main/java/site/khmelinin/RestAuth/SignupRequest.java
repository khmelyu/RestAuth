package site.khmelinin.RestAuth;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String mail;
    private String password;
}
