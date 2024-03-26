package main.java.pe.edu.upc.entities;

import main.java.pe.edu.upc.entities.enums.Materias;
import main.java.pe.edu.upc.entities.enums.Sexo;

import java.util.Random;

public class Profesor extends Persona{
    private Materias materia;

    public Profesor(String name, int edad, Sexo sexo, Materias materia) {
        super(name, edad, sexo);
        this.materia = materia;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                '}';
    }

    @Override
    public boolean Falto() {
        Random r = new Random();
        int probabilidad = 1 + r.nextInt(10);
        return probabilidad <= 2;
    }
}
