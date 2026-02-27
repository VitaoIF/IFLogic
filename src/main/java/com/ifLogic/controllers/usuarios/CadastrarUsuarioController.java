package com.ifLogic.controllers.usuarios;

import com.ifLogic.dto.UsuarioRequestDTO;
import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.services.usuarios.CadastrarUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class CadastrarUsuarioController {

    @Autowired
    private CadastrarUsuarioService service;

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> handle(@RequestBody UsuarioRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.execute(dto));
    }
}
