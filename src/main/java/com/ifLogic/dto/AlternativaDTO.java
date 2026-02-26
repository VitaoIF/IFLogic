package com.ifLogic.dto;

import com.ifLogic.entidades.Alternativas;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlternativaDTO {
    private Long id;
    private String texto;
    private Boolean correta;

    public AlternativaDTO(Alternativas entity) {
        this.id = entity.getId();
        this.texto = entity.getTexto();
        this.correta = entity.isCorreta();
    }
}
