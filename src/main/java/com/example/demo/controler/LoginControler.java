package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.loginRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
@RestController
@RequestMapping("/login")
public class LoginControler {
    @Autowired
    private loginRepository repository;
    @GetMapping("/login")
    public void login (@RequestParam String dados){
        repository.findByUsername(dados)

    }

}
