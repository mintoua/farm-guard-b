package tn.esprit.pfe.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User implements Serializable {

    private static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user-name")
    private String username;

    @Column(name = "user-email")
    private String email;

    @Column(name = "user-password")
    private String password;

    @Column(name = "active")
    private boolean active;

}
