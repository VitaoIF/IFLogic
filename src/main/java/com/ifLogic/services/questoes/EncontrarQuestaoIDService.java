package com.ifLogic.services.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.entidades.Questoes;
import com.ifLogic.repositories.QuestoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EncontrarQuestaoIDService {

    @Autowired
    private QuestoesRepository repository;

    @Transactional(readOnly = true)
    public QuestoesDTO findById(Long id) {
        Questoes questoes = repository.findById(id).get();
        return new QuestoesDTO(questoes);
    }
}
