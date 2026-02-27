package com.ifLogic.services.usuarios;

import com.ifLogic.dto.UsuarioRequestDTO;
import com.ifLogic.dto.UsuarioResponseDTO;
import com.ifLogic.entidades.Usuarios;
import com.ifLogic.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CadastrarUsuarioService {

    @Autowired
    private UsuariosRepository repository;

    public UsuarioResponseDTO execute(UsuarioRequestDTO dto) {
        Usuarios usuario = new Usuarios();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha_hash(dto.getSenha()); // In a real app this should be hashed
        usuario.setEscola(dto.getEscola());
        usuario.setSerie(dto.getSerie());
        usuario.setDataDeNascimento(dto.getDataDeNascimento());
        usuario.setDataCriacaoConta(LocalDate.now());

        usuario = repository.save(usuario);

        return new UsuarioResponseDTO(usuario);
    }
}
