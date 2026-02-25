package com.ifLogic.controllers.questoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/questoes")
public class QuestoesController {

    @GetMapping
    public String test(){
        return "Olá Mundo";
    }
}
