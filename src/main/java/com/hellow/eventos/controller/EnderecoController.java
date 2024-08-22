package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
   @Autowired
    private  EnderecoRepository enderecoRepository;

    @GetMapping("todos")
    public List<Endereco> getTodosEndereco(){
        return enderecoRepository.findAll();
    }

    @PostMapping("add")
    public Endereco addEndereco(@RequestBody Endereco endereco){
        enderecoRepository.save(endereco);
        return endereco;
    }

}
