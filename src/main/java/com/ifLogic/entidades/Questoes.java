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

    @OneToMany(
            mappedBy = "questao",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Alternativas> alternativa = new ArrayList<>();

    public void addAlternativa(Alternativas alternativa) {
        alternativa.setQuestao(this);
        this.alternativa.add(alternativa);
    }
}
