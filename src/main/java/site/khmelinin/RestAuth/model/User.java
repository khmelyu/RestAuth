package site.khmelinin.RestAuth.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "\"user\"")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String mail;
    private String password;
}
