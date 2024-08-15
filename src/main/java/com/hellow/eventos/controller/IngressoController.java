package com.hellow.eventos.controller;


import com.hellow.eventos.classes.Ingresso.Ingresso;
import com.hellow.eventos.classes.Ingresso.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ingresso")
public class IngressoController {
    @Autowired
    private IngressoRepository ingresssoRepository;

    @GetMapping(name = "/todos")
    public List<Ingresso> getTodosIngresso() {return ingresssoRepository.findAll();}
    @PostMapping(name = "/add")
    public Ingresso addIngresso(@RequestBody Ingresso ingresso) {
    ingresssoRepository.save(ingresso);
        return ingresso;

    }
}
