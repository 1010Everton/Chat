package com.example.demo.dados;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosLongin (
    @NotNull
    @NotBlank
    String nome, 
    @NotNull
    @NotBlank
    String senha
    ) {
    
}
