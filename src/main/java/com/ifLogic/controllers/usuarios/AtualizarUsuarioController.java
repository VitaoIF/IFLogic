package com.ifLogic.controllers.usuarios;

import com.ifLogic.dto.UsuarioRequestDTO;
import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.services.usuarios.AtualizarUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class AtualizarUsuarioController {

    @Autowired
    private AtualizarUsuarioService service;

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> handle(@PathVariable Long id, @RequestBody UsuarioRequestDTO dto) {
        return ResponseEntity.ok(service.execute(id, dto));
    }
}
