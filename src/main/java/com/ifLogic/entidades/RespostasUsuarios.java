package com.ifLogic.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_respostas_usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RespostasUsuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean acertou;
    private LocalDate dataResposta;

    @ManyToOne
    @JoinColumn(name = "alternativa_id")
    private Alternativas alternativa;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuarios;
}
