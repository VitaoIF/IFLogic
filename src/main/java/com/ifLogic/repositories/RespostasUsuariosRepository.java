package com.ifLogic.repositories;

import com.ifLogic.entidades.RespostasUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostasUsuariosRepository extends JpaRepository<RespostasUsuarios, Long> {

    List<RespostasUsuarios> findByUsuariosId(Long usuarioId);
}
