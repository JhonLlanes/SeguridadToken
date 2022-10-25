package com.token.token.controller;

import com.token.token.data.Login;
import com.token.token.repository.LoginRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    private LoginRepository repository;

    public LoginController(LoginRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Login> obtener(){
        return repository.findAll();
    }
}
