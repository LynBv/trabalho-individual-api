package br.org.serratec.trabalho_individual_Elyn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.trabalho_individual_Elyn.repository.LivroRepository;



@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public String listar() {
        return new String();
    }
    
    @GetMapping("/{id}")
    public String buscar(@PathVariable String param) {
        return new String();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String Inserir(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
}
