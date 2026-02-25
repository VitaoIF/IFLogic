package com.ifLogic.controllers.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.services.questoes.EncontrarQuestaoIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/questoes")
public class QuestoesController {

    @Autowired
    private EncontrarQuestaoIDService service;

    @GetMapping(value = "/{id}")
    public QuestoesDTO encontrarPorID(@PathVariable Long id){
        return service.findById(id);
    }
}
