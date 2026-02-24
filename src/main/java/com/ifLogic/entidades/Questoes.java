package com.ifLogic.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_questoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Questoes {

    private Long id;
    private String enunciado;
    private String explicacao;
    private String dificuldade;

}
