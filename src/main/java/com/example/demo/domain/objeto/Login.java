package com.example.demo.domain.objeto;

import org.springframework.stereotype.Controller;

import com.example.demo.repository.LoginRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name ="login")
@Table(name="login")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Login {
    @Id @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String senha;
}
