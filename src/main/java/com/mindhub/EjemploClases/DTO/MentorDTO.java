package com.mindhub.EjemploClases.DTO;

import com.mindhub.EjemploClases.models.Frase;
import com.mindhub.EjemploClases.models.Mentor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MentorDTO {

    private long id;

    private String nombre;

    private String modulo;

    private byte edad;

    private float altura;

    private Set<FraseDTO> frases;

    public MentorDTO(Mentor mentor) {
        this.id = mentor.getId();
        this.nombre = mentor.getNombre();
        this.modulo = mentor.getModulo();
        this.edad = mentor.getEdad();
        this.altura = mentor.getAltura();
        this.frases = mentor.getFrases()
                .stream()
                .map(frase -> new FraseDTO(frase))
                .collect(Collectors.toSet());
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModulo() {
        return modulo;
    }

    public byte getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public Set<FraseDTO> getFrases() {
        return frases;
    }
}
