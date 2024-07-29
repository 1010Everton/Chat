package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.example.demo.dados.Dadoscadastro;
import com.example.demo.objeto.Cadastro;
import com.example.demo.repository.CadastroRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class CadastroControler {
    @Autowired
    private CadastroRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid Dadoscadastro dados){
    repository.save(new Cadastro(dados));

    }
    @GetMapping
    public List<DadosListagem> listar(){
        return repository.findAll().stream().map(DadosListagem::new).toList();

    }
}
