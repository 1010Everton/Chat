package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

import com.example.demo.dados.DadosAtualiza;
import com.example.demo.dados.DadosListagem;
import com.example.demo.dados.Dadoscadastro;
import com.example.demo.dados.Dadosdetalhamento;
import com.example.demo.domain.objeto.Cadastro;
import com.example.demo.repository.CadastroRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;


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
    public ResponseEntity <List<DadosListagem>> listar(@PageableDefault(size=10,sort={"nome"})Pageable paginacao){
        var page = repository.findAllByAtivoTrue(paginacao).stream().map(DadosListagem::new).toList();

        return ResponseEntity.ok(page);
    }
    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualiza dados){
        var cadastro = repository.getReferenceById(dados.id());
        cadastro.atualizadados(dados);
        var dadosDetalhamento = new Dadosdetalhamento(cadastro);

        return ResponseEntity.ok(dadosDetalhamento);

    }
    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id){
        var cadastro = repository.getReferenceById(id);
        cadastro.excluir();

        return ResponseEntity.noContent().build();

    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity detalhar(@PathVariable Long id){
        var cadastro = repository.getReferenceById(id);

        return ResponseEntity.ok(new Dadosdetalhamento(cadastro));

    }
    
}
