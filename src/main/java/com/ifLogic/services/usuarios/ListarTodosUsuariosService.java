package com.ifLogic.services.usuarios;

import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarTodosUsuariosService {

    @Autowired
    private UsuariosRepository repository;

    public List<UsuarioResponseDTO> execute() {
        return repository.findAll()
                .stream()
                .map(UsuarioResponseDTO::new)
                .collect(Collectors.toList());
    }
}
