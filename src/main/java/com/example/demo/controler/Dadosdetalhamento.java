package com.example.demo.controler;

import com.example.demo.objeto.Cadastro;

public record Dadosdetalhamento(long id, String nome, float cpf, String senha, String email, String cep, int idade) {
    public Dadosdetalhamento(Cadastro cadastrar){
        this(cadastrar.getId(), cadastrar.getNome(), cadastrar.getCpf(), cadastrar.getSenha(), cadastrar.getEmail(), cadastrar.getCep(), cadastrar.getIdade());
    }
}
