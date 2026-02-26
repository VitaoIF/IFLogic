package com.ifLogic.controllers.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.services.questoes.BuscarQuestaoPorDificuldadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/questoes")
public class BuscarQuestaoPorDificuldadeController {

    @Autowired
    private BuscarQuestaoPorDificuldadeService service;

    @GetMapping("/dificuldade/{dificuldade}")
    public ResponseEntity<Page<QuestoesDTO>> buscarPorDificuldade(@PathVariable String dificuldade, Pageable pageable){
        Page<QuestoesDTO> dto = service.findByDificuldade(dificuldade, pageable);
        return ResponseEntity.ok(dto);
    }
}
