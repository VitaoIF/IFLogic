package com.ifLogic.dto;

import com.ifLogic.entidades.Questoes;
import lombok.Getter;

import java.util.List;

@Getter
public class QuestoesDTO {
    private Long id;
    private String enunciado;
    private String explicacao;
    private String dificuldade;
    private List<AlternativaDTO> alternativas;

    public QuestoesDTO(){}

    public QuestoesDTO(Long id, String enunciado, String explicacao, String dificuldade) {
        this.id = id;
        this.enunciado = enunciado;
        this.explicacao = explicacao;
        this.dificuldade = dificuldade;
    }

    public QuestoesDTO(Long id, String enunciado, String explicacao, String dificuldade, List<AlternativaDTO> alternativas) {
        this.id = id;
        this.enunciado = enunciado;
        this.explicacao = explicacao;
        this.dificuldade = dificuldade;
        this.alternativas = alternativas;
    }

    public QuestoesDTO(Questoes entity) {
        id = entity.getId();
        enunciado = entity.getEnunciado();
        explicacao = entity.getExplicacao();
        dificuldade = entity.getDificuldade();

        alternativas = entity.getAlternativa()
                .stream()
                .map(AlternativaDTO::new)
                .toList();
    }

}
