package com.ifLogic.services.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.entidades.Questoes;
import com.ifLogic.repositories.QuestoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdicionarQuestaoService {

    @Autowired
    private QuestoesRepository repository;

    @Transactional
    public QuestoesDTO insert(QuestoesDTO dto){
        Questoes entity = new Questoes();

        entity.setEnunciado(dto.getEnunciado());
        entity.setDificuldade(dto.getDificuldade());
        entity.setId(dto.getId());
        entity.setExplicacao(dto.getExplicacao());

        entity = repository.save(entity);
        return new QuestoesDTO(entity);
    }

}
