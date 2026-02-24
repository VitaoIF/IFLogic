package com.ifLogic.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_alternativas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alternativas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    private boolean correta;

    @ManyToOne
    @JoinColumn(name = "questao_id")
    private Questoes questao;

    @OneToMany(mappedBy = "alternativa")
    private List<RespostasUsuarios> respostasUsuarios = new ArrayList<>();
}
