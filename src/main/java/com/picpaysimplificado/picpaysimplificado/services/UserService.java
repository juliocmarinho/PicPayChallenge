package com.picpaysimplificado.picpaysimplificado.services;

import com.picpaysimplificado.picpaysimplificado.entities.User;
import com.picpaysimplificado.picpaysimplificado.entities.UserType;
import com.picpaysimplificado.picpaysimplificado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType().equals(UserType.MERCHANT)) {
            throw new Exception("Usuário do tipo Logista não está autorizado a realizar transação.");
        }

        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo insuficiente");
        }
    }

    public User findUserById(Long id) throws Exception {
            return userRepository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
        }

    public void saveUser(User user){
        this.userRepository.save(user);
    }
    }

