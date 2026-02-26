package com.ifLogic.services.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.entidades.Questoes;
import com.ifLogic.repositories.QuestoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BuscarQuestaoPorDificuldadeService {

    @Autowired
    private QuestoesRepository repository;

    @Transactional(readOnly = true)
    public Page<QuestoesDTO> findByDificuldade(String dificuldade, Pageable pageable){
        Page<Questoes> resultado = repository.findByDificuldade(dificuldade, pageable);
        return resultado.map(QuestoesDTO::new);
    }
}
