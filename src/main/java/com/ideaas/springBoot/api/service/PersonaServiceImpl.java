package com.ideaas.springBoot.api.service;

import com.ideaas.springBoot.api.dao.PersonaDao;
import com.ideaas.springBoot.api.domain.Persona;
import com.ideaas.springBoot.api.service.interfaces.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    private PersonaDao dao;

    @Autowired
    public PersonaServiceImpl(PersonaDao dao) {
        this.dao = dao;
    }

    //Este metodo retorna una lista de personas
    @Override
    public List<Persona> findAll(){
        return dao.findAll();
    }

    //Este metodo guarda una persona
    @Override
    public Persona save(Persona persona){
        return dao.save(persona);
    }

    //Este metodo borra una persona
    @Override
    public void delete(Long id){
        dao.delete(id);
    }

    //Este metodo devuelve una persona por id
    @Override
    public Persona getById(Long id) {
        return dao.findOne(id);
    }
}
