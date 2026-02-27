package com.ifLogic.controllers.usuarios;

import com.ifLogic.services.usuarios.DeletarUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class DeletarUsuarioController {

    @Autowired
    private DeletarUsuarioService service;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> handle(@PathVariable Long id) {
        service.execute(id);
        return ResponseEntity.noContent().build();
    }
}
