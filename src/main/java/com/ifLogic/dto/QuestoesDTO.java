package com.ifLogic.dto;

import com.ifLogic.entidades.Questoes;
import lombok.Getter;

@Getter
public class QuestoesDTO {
    private Long id;
    private String enunciado;
    private String explicacao;
    private String dificuldade;

    public QuestoesDTO(){}

    public QuestoesDTO(Long id, String enunciado, String explicacao, String dificuldade) {
        this.id = id;
        this.enunciado = enunciado;
        this.explicacao = explicacao;
        this.dificuldade = dificuldade;
    }

    public QuestoesDTO(Questoes entity) {
        id = entity.getId();
        enunciado = entity.getEnunciado();
        explicacao = entity.getExplicacao();
        dificuldade = entity.getDificuldade();
    }

}
