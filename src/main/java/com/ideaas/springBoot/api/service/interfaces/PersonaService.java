package com.ideaas.springBoot.api.service.interfaces;

import com.ideaas.springBoot.api.domain.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();

    Persona save(Persona persona);

    void delete(Long id);

    Persona getById(Long id);
}
