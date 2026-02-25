package com.ifLogic.controllers.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.services.questoes.AdicionarQuestaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "questoes")
public class InserirQuestaoController {

    @Autowired
    private AdicionarQuestaoService service;

    @PostMapping
    public QuestoesDTO insert(@RequestBody QuestoesDTO dto){
        return service.insert(dto);
    }
}
