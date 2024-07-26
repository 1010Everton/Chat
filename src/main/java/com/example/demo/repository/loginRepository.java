package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.objeto.Login;

public interface loginRepository extends JpaRepository<Login, Long> {
    
}
