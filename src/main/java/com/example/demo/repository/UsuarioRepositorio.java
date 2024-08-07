package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.domain.objeto.Usuario;

public interface UsuarioRepositorio extends JpaRepository <Usuario , Long> {
    UserDetails findByLogin(String login);
}
