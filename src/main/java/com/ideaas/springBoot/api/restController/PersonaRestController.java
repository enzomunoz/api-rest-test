package com.ideaas.springBoot.api.restController;

import com.ideaas.springBoot.api.domain.Persona;
import com.ideaas.springBoot.api.service.interfaces.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/persona")
public class PersonaRestController {

    private PersonaService personaService;

    @Autowired
    public PersonaRestController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/listt")
    public ResponseEntity<List<Persona>> findAll(){
        List<Persona> personas= personaService.findAll();

        return new ResponseEntity(personas, HttpStatus.OK);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Persona> getById(@PathVariable Long id){
        Persona persona = personaService.getById(id);

        return new ResponseEntity(persona, HttpStatus.OK);
    }

    @PostMapping(value = "/new")
    public ResponseEntity<Persona> save(@RequestBody Persona nuevaPersona) {
        Persona persona = personaService.save(nuevaPersona);

        return new ResponseEntity(persona, HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Persona> update(@PathVariable Long id, @RequestBody Persona persona) {
        Persona existPersona = personaService.getById(id);
        personaService.save(persona);
        return new ResponseEntity(persona, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Persona> delete(@PathVariable Long id) {
        Persona persona = personaService.getById(id);
        personaService.delete(id);
        return new ResponseEntity(persona, HttpStatus.ACCEPTED);
    }
}
