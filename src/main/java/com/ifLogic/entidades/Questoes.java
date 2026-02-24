package com.ifLogic.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_questoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Questoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enunciado;
    private String explicacao;
    private String dificuldade;

    @OneToMany(mappedBy = "questao")
    private List<Alternativas> alternativa = new ArrayList<>();
}
