package com.example.demo.Cadastrar;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Dadoscadastro(
    @NotNull
    Long id,
    @NotNull
    @NotBlank
    String nome,
    @NotBlank
    @Email
    String email, 
    @NotBlank
    @NotNull
    String cep,
    @NotNull
    int idade,
    @NotNull
    float cpf,
    @NotBlank 
    @NotNull
    String senha
    ) {

}
