package com.ifLogic.repositories;

import com.ifLogic.entidades.Questoes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestoesRepository extends JpaRepository<Questoes, Long> {

    Page<Questoes> findByDificuldade(String dificuldade, Pageable pageable);
}
