package site.khmelinin.RestAuth;

import lombok.Data;

@Data
public class SigninRequest {
    private String username;
    private String password;
}
