package com.picpaysimplificado.picpaysimplificado.entities;


import com.picpaysimplificado.picpaysimplificado.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
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


    public User(UserDTO data){
        this.name = data.name();
        this.document = data.document();
        this.balance = data.balance();
        this.email = data.email();
        this.password = data.password();
        this.userType = data.userType();
    }
}
