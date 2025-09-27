package com.topicos.aula.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import com.topicos.aula.model.Pessoa;
import com.topicos.aula.repository.PessoaRepository;

@AllArgsConstructor
@Service
public class PessoaService {
    
    private final PessoaRepository pessoaRepository;

    public List<Pessoa> listAllPessoas() {
        return this.pessoaRepository.findAll();
    }

    public Optional<Pessoa> findById(Long id) {
        return this.pessoaRepository.findById(id);
    }

    public Pessoa savePessoa(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

    public void deletePessoa(Long id) {
        this.pessoaRepository.deleteById(id);
    }
}
