package com.ifLogic.controllers.usuarios;

import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.services.usuarios.BuscarUsuarioPorIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class BuscarUsuarioPorIdController {

    @Autowired
    private BuscarUsuarioPorIdService service;

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> handle(@PathVariable Long id) {
        return ResponseEntity.ok(service.execute(id));
    }
}
