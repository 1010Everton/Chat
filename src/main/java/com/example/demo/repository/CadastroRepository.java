package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.objeto.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
    

}
