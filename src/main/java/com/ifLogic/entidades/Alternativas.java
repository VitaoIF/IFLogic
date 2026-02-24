package com.ifLogic.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_alternativas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alternativas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;
    private boolean correta;

    @ManyToOne
    @JoinColumn(name = "questao_id")
    private Questoes questao;
}
