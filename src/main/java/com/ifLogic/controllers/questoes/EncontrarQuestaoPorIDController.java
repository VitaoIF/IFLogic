package com.ifLogic.controllers.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.services.questoes.EncontrarQuestaoIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/questoes")
public class EncontrarQuestaoPorIDController {

    @Autowired
    private EncontrarQuestaoIDService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<QuestoesDTO>encontrarPorID(@PathVariable Long id){
        QuestoesDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }
}
