package com.ideaas.springBoot.api.dao;

import com.ideaas.springBoot.api.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long> {
}
