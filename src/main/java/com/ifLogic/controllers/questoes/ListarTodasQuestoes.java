package com.ifLogic.controllers.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.services.questoes.BuscarTodasQuestoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/questoes")
public class ListarTodasQuestoes {

    @Autowired
    private BuscarTodasQuestoesService service;

    @GetMapping(value = "/todas")
    public List<QuestoesDTO> findAll(){
        return service.findAll();
    }
}
