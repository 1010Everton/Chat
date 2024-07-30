package com.example.demo.controler;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.example.demo.dados.Dadoscadastro;
import com.example.demo.objeto.Cadastro;
import com.example.demo.repository.CadastroRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class CadastroControler {
    @Autowired
    private CadastroRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid Dadoscadastro dados){
    repository.save(new Cadastro(dados));
    return ResponseEntity.noContent().build();
    }
    @GetMapping
    public List<DadosListagem> listar(@PageableDefault(size=10,sort={"nome"})Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).stream().map(DadosListagem::new).toList();
    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualiza dados){
        var cadastro = repository.getReferenceById(dados.id());
        cadastro.atualizadados(dados);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        var cadastro = repository.getReferenceById(id);
        cadastro.excluir();

    }
    
}
