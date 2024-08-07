package com.example.demo.domain.objeto;

import jakarta.persistence.Id; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name="Usuario")
@Entity(name="Usuario")
@Getter
@EqualsAndHashCode(of = "id")
public class Usuario {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;

}
