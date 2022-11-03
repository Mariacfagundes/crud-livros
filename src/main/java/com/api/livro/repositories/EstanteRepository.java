package com.api.livro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.livro.entities.Estante;

public interface EstanteRepository extends JpaRepository<Estante, Long>{

    Estante findById(long id);
}
