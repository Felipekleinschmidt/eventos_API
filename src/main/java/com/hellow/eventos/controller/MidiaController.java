package com.hellow.eventos.controller;


import com.hellow.eventos.classes.Midia.Midia;
import com.hellow.eventos.classes.Midia.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("midia")
public class MidiaController {

    @Autowired
    private MidiaRepository midiaRepository;

    @GetMapping("todos")
    public List<Midia> getTodosMidia() {return midiaRepository.findAll(); }

    @PostMapping("add")
    public Midia addMidia(@RequestBody Midia midia){
        midiaRepository.save(midia);
        return midia;

    }




}
