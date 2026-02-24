package com.ifLogic.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_questoes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
