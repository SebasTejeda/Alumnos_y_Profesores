package main.java.pe.edu.upc.entities;

import main.java.pe.edu.upc.entities.enums.Materias;

public class Profesor extends Persona{
    private Materias materia;

    public Profesor(String name, int edad, String sexo, Materias materia) {
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
}
