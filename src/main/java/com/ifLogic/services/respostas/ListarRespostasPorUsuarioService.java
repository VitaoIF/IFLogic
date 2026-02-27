package com.ifLogic.services.respostas;

import com.ifLogic.dto.RespostaUsuarioResponseDTO;
import com.ifLogic.repositories.RespostasUsuariosRepository;
import com.ifLogic.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarRespostasPorUsuarioService {

    @Autowired
    private RespostasUsuariosRepository respostasRepository;

    @Autowired
    private UsuariosRepository usuariosRepository;

    public List<RespostaUsuarioResponseDTO> execute(Long usuarioId) {
        if (!usuariosRepository.existsById(usuarioId)) {
            throw new RuntimeException("Usuário não encontrado");
        }

        return respostasRepository.findByUsuariosId(usuarioId)
                .stream()
                .map(RespostaUsuarioResponseDTO::new)
                .collect(Collectors.toList());
    }
}
