package com.ifLogic.services.respostas;

import com.ifLogic.dto.RespostaRequestDTO;
import com.ifLogic.dto.RespostaResponseDTO;
import com.ifLogic.entidades.Alternativas;
import com.ifLogic.entidades.Questoes;
import com.ifLogic.repositories.AlternativasRepository;
import com.ifLogic.repositories.QuestoesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RespostasService {

    @Autowired
    private AlternativasRepository alternativasRepository;

    @Autowired
    private QuestoesRepository questoesRepository;

    @Transactional(readOnly = true)
    public RespostaResponseDTO checarResposta(RespostaRequestDTO dto) {
        Alternativas alternativa = alternativasRepository.findById(dto.getAlternativeId())
                .orElseThrow(() -> new EntityNotFoundException("Alternativa não encontrada"));

        Questoes questao = questoesRepository.findById(dto.getQuestionId())
                .orElseThrow(() -> new EntityNotFoundException("Questão não encontrada"));

        boolean correta = alternativa.isCorreta();
        String explicacao = questao.getExplicacao();

        return new RespostaResponseDTO(correta, explicacao);
    }
}
