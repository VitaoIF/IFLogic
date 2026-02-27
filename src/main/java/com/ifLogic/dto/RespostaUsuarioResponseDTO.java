package com.ifLogic.dto;

import com.ifLogic.entidades.RespostasUsuarios;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RespostaUsuarioResponseDTO {
    private Long id;
    private boolean acertou;
    private LocalDate dataResposta;
    private Long alternativaId;
    private Long usuarioId;

    public RespostaUsuarioResponseDTO(RespostasUsuarios entity) {
        this.id = entity.getId();
        this.acertou = entity.isAcertou();
        this.dataResposta = entity.getDataResposta();

        if (entity.getAlternativa() != null) {
            this.alternativaId = entity.getAlternativa().getId();
        }

        if (entity.getUsuarios() != null) {
            this.usuarioId = entity.getUsuarios().getId();
        }
    }
}
