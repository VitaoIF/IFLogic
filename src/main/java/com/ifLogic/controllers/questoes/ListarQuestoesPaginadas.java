package com.ifLogic.controllers.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.services.questoes.PaginarQuestoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questoes")
public class ListarQuestoesPaginadas {

    @Autowired
    private PaginarQuestoesService service;

    @GetMapping
    public ResponseEntity<Page<QuestoesDTO>> findAllPage(Pageable pageable){
        Page<QuestoesDTO> dto = service.findAllPage(pageable);
        return ResponseEntity.ok(dto);
    }
}
