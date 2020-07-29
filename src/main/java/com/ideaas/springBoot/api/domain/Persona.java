package com.ideaas.springBoot.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PERSONAS")
public class Persona implements Serializable {

    @Id
    @Column(name = "PERSONA_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "PERSONA_NOMBRE")
    private String nombre;

    @Column(name = "PERSONA_EDAD")
    private String edad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
