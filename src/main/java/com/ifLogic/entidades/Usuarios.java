package com.ifLogic.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha_hash;
    private String escola;
    private String serie;
    private LocalDate dataDeNascimento;
    private LocalDate dataCriacaoConta;

    @OneToMany(mappedBy = "usuarios")
    private List<RespostasUsuarios> respostasUsuarios = new ArrayList<>();
}
