package com.ifLogic.dto;

import com.ifLogic.entidades.Questoes;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QuestoesDTO {
    private Long id;
    private String enunciado;
    private String explicacao;
    private String dificuldade;
    private String disciplina;
    private String assunto;
    private String origem;
    private Integer tempoEstimado;
    private List<AlternativaDTO> alternativas;

    public QuestoesDTO() {
    }

    public QuestoesDTO(Questoes entity) {
        id = entity.getId();
        enunciado = entity.getEnunciado();
        explicacao = entity.getExplicacao();
        dificuldade = entity.getDificuldade();
        disciplina = entity.getDisciplina();
        assunto = entity.getAssunto();
        origem = entity.getOrigem();
        tempoEstimado = entity.getTempoEstimado();

        alternativas = entity.getAlternativa()
                .stream()
                .map(AlternativaDTO::new)
                .toList();
    }
}
