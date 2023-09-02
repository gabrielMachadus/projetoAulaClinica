package br.com.diferpan.clinica.spring.controllers;

import br.com.diferpan.clinica.spring.entities.Autoridade;
import br.com.diferpan.clinica.spring.repository.AutoridadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/autoridades")
public class AutoridadeController {
    @Autowired
    AutoridadeRepository repository;

    //buscar todas autoridades
    @GetMapping
    public List<Autoridade> buscarTodos(){
        return repository.findAll();
    }

    //busca por id

    //inserir

    //excluir

    //atualizar

    //buscar por nome

}
