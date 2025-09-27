package com.topicos.aula.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.AllArgsConstructor;

import com.topicos.aula.model.Pessoa;
import com.topicos.aula.service.PessoaService;

@AllArgsConstructor
@Controller
public class PessoaControllers {
    
    private final PessoaService pessoaService;

    public List<Pessoa> listarPessoas() {
        return this.pessoaService.listAllPessoas();
    }

    @GetMapping("/:id")
    public ResponseEntity<Pessoa> buscarPessoa(@PathVariable Long id) {
        return this.pessoaService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    public Pessoa criarPessoa(@PathVariable Pessoa pessoa) {
        return this.pessoaService.savePessoa(pessoa);
    }

    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id) {
        this.pessoaService.deletePessoa(id);
        return ResponseEntity.noContent().build();
    }
}
