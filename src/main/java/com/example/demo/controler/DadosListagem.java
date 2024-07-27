package com.example.demo.controler;

import com.example.demo.objeto.Cadastro;

public record DadosListagem(String nome, String senha) {
    public DadosListagem(Cadastro cadastro){
        this(cadastro.getNome(),cadastro.getSenha());
    }

}
