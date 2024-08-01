package com.example.demo.repository;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.objeto.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

    Page<Cadastro> findAllByAtivoTrue(org.springframework.data.domain.Pageable paginacao);
    

}
