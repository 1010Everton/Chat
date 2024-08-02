package com.example.demo.controler;

import com.example.demo.domain.objeto.Cadastro;

public record DadosListagem(String nome, String senha) {
    public DadosListagem(Cadastro cadastro){
        this(cadastro.getNome(),cadastro.getSenha());
    }

}
