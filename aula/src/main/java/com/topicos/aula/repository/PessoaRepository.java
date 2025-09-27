package com.topicos.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.topicos.aula.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
