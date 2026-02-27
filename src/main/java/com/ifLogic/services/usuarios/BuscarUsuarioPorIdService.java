package com.ifLogic.services.usuarios;

import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.entidades.Usuarios;
import com.ifLogic.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarUsuarioPorIdService {

    @Autowired
    private UsuariosRepository repository;

    public UsuarioResponseDTO execute(Long id) {
        Usuarios usuario = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado"));
        return new UsuarioResponseDTO(usuario);
    }
}
