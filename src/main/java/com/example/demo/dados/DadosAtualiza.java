package com.example.demo.dados;

import jakarta.validation.constraints.NotNull;

public record DadosAtualiza(
    
    @NotNull
    long id,
    
    String senha, 
    String nome) {



}
