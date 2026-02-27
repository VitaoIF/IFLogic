package com.ifLogic.controllers.respostas;

import com.ifLogic.dto.RespostaRequestDTO;
import com.ifLogic.dto.RespostaResponseDTO;
import com.ifLogic.services.respostas.RespostasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respostas")
public class RespostasController {

    @Autowired
    private RespostasService service;

    @PostMapping
    public ResponseEntity<RespostaResponseDTO> responder(@RequestBody RespostaRequestDTO dto) {
        RespostaResponseDTO response = service.checarResposta(dto);
        return ResponseEntity.ok(response);
    }
}
