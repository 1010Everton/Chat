package com.example.demo.objeto;

import com.example.demo.dados.Dadoscadastro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity (name = "cadastro")
@Table (name = "cadastro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cadastro {

    @Id @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private String cep;
    private int idade;
    private float cpf;
   
    public Cadastro(Dadoscadastro dados){
        this.nome=dados.nome();
        this.email=dados.email();
        this.senha=dados.senha();
        this.cep=dados.cep();
        this.idade=dados.idade();
        this.cpf=dados.cpf();
    }
    
}

