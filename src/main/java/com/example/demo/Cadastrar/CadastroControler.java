package com.example.demo.Cadastrar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/user")
public class CadastroControler {
    @Autowired
    private CadastroRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody Dadoscadastro dados){
    repository.save(new Cadastro(dados));

    }
}
