package com.example.demo.infra.TratamentoDeErros;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.validation.FieldError;

import jakarta.persistence.EntityNotFoundException;

public class TratadorDeErros {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarerro404(){
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarerro400(MethodArgumentNotValidException ex){
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(Errovalidacao::new).toList());

    }
    public record  Errovalidacao(String campo, String mensagem){
        public Errovalidacao(FieldError erro) {
            this(erro.getField(), erro.getDefaultMessage());
        }
    }
}
