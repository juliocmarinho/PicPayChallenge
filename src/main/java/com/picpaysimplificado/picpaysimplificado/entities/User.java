package com.picpaysimplificado.picpaysimplificado.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.usertype.UserType;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String document;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;
}
