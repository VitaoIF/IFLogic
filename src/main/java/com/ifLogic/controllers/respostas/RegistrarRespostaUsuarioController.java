package com.ifLogic.controllers.respostas;

import com.ifLogic.dto.RespostaRequestDTO;
import com.ifLogic.dto.RespostaUsuarioResponseDTO;
import com.ifLogic.services.respostas.RegistrarRespostaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios/{usuarioId}/respostas")
public class RegistrarRespostaUsuarioController {

    @Autowired
    private RegistrarRespostaUsuarioService service;

    @PostMapping
    public ResponseEntity<RespostaUsuarioResponseDTO> handle(
            @PathVariable Long usuarioId,
            @RequestBody RespostaRequestDTO dto) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.execute(usuarioId, dto.getAlternativeId()));
    }
}
