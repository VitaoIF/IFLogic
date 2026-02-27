package com.ifLogic.services.respostas;

import com.ifLogic.dto.RespostaUsuarioResponseDTO;
import com.ifLogic.entidades.Alternativas;
import com.ifLogic.entidades.RespostasUsuarios;
import com.ifLogic.entidades.Usuarios;
import com.ifLogic.repositories.AlternativasRepository;
import com.ifLogic.repositories.RespostasUsuariosRepository;
import com.ifLogic.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RegistrarRespostaUsuarioService {

    @Autowired
    private RespostasUsuariosRepository respostasRepository;

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Autowired
    private AlternativasRepository alternativasRepository;

    public RespostaUsuarioResponseDTO execute(Long usuarioId, Long alternativaId) {
        Usuarios usuario = usuariosRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Alternativas alternativa = alternativasRepository.findById(alternativaId)
                .orElseThrow(() -> new RuntimeException("Alternativa não encontrada"));

        RespostasUsuarios resposta = new RespostasUsuarios();
        resposta.setUsuarios(usuario);
        resposta.setAlternativa(alternativa);
        resposta.setAcertou(alternativa.isCorreta()); // Automatically check logic
        resposta.setDataResposta(LocalDate.now());

        resposta = respostasRepository.save(resposta);

        return new RespostaUsuarioResponseDTO(resposta);
    }
}
