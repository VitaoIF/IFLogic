package com.ifLogic.dto;

import com.ifLogic.entidades.Usuarios;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String escola;
    private String serie;
    private LocalDate dataDeNascimento;
    private LocalDate dataCriacaoConta;

    public UsuarioResponseDTO(Usuarios entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.email = entity.getEmail();
        this.escola = entity.getEscola();
        this.serie = entity.getSerie();
        this.dataDeNascimento = entity.getDataDeNascimento();
        this.dataCriacaoConta = entity.getDataCriacaoConta();
    }
}
