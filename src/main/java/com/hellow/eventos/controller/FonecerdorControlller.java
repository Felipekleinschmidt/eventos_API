package com.hellow.eventos.controller;


import com.hellow.eventos.classes.Fonecerdor.Fonecerdor;
import com.hellow.eventos.classes.Fonecerdor.FonecerdorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fonecerdor")
public class FonecerdorControlller {


    @Autowired
    private FonecerdorRepository fonecerdorRepository;

    @GetMapping("todos")
    public List<Fonecerdor> getTodosFonecerdor() {return fonecerdorRepository.findAll();}
    @PostMapping(name = "add")
    public Fonecerdor addFonecerdor(@RequestBody Fonecerdor fonecerdor) {
        fonecerdorRepository.save(fonecerdor);
        return fonecerdor;

    }
}
