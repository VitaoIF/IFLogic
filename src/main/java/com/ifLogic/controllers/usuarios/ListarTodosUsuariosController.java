package com.ifLogic.controllers.usuarios;

import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.services.usuarios.ListarTodosUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ListarTodosUsuariosController {

    @Autowired
    private ListarTodosUsuariosService service;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> handle() {
        return ResponseEntity.ok(service.execute());
    }
}
