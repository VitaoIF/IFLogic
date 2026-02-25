package com.ifLogic.services.questoes;

import com.ifLogic.dto.QuestoesDTO;
import com.ifLogic.entidades.Questoes;
import com.ifLogic.repositories.QuestoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BuscarTodasQuestoesService {

    @Autowired
    private QuestoesRepository repository;

    @Transactional(readOnly = true)
    public List<QuestoesDTO> findAll(){
        List<Questoes> resultado = repository.findAll();
        return resultado.stream()
                .map(QuestoesDTO::new)
                .toList();
    }
}
