package com.ifLogic.dto;

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

    public String getEnunciado() {
        return enunciado;
    }

    public Long getId() {
        return id;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public String getDificuldade() {
        return dificuldade;
    }
}
