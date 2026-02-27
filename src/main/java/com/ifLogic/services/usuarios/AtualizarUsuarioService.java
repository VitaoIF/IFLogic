package com.ifLogic.services.usuarios;

import com.ifLogic.dto.UsuarioRequestDTO;
import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.entidades.Usuarios;
import com.ifLogic.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtualizarUsuarioService {

    @Autowired
    private UsuariosRepository repository;

    public UsuarioResponseDTO execute(Long id, UsuarioRequestDTO dto) {
        Usuarios usuario = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado"));

        usuario.setNome(dto.getNome() != null ? dto.getNome() : usuario.getNome());
        usuario.setEmail(dto.getEmail() != null ? dto.getEmail() : usuario.getEmail());
        if (dto.getSenha() != null && !dto.getSenha().trim().isEmpty()) {
            usuario.setSenha_hash(dto.getSenha());
        }
        usuario.setEscola(dto.getEscola() != null ? dto.getEscola() : usuario.getEscola());
        usuario.setSerie(dto.getSerie() != null ? dto.getSerie() : usuario.getSerie());
        usuario.setDataDeNascimento(
                dto.getDataDeNascimento() != null ? dto.getDataDeNascimento() : usuario.getDataDeNascimento());

        usuario = repository.save(usuario);

        return new UsuarioResponseDTO(usuario);
    }
}
