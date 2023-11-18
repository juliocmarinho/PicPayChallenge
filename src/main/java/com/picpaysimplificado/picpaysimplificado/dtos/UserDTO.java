package com.picpaysimplificado.picpaysimplificado.dtos;

import com.picpaysimplificado.picpaysimplificado.entities.UserType;

import java.math.BigDecimal;

public record UserDTO(String name, String document, BigDecimal balance, String email, String password, UserType type) {
}
