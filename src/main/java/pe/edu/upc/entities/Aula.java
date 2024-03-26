package main.java.pe.edu.upc.entities;

import main.java.pe.edu.upc.entities.enums.Materias;

import java.util.List;

public class Aula {
    private int id;
    private int maxEstudiantes;
    private Materias materia;

    private Profesor profesor;
    private List<Estudiante> estudiante;

    public Aula(int id, int maxEstudiantes, Materias materia, Profesor profesor,
                List<Estudiante> estudiante) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        this.profesor = profesor;
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public void setMaxEstudiantes(int maxEstudiantes) {
        this.maxEstudiantes = maxEstudiantes;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", maxEstudiantes=" + maxEstudiantes +
                ", materia=" + materia +
                ", profesor=" + profesor +
                ", estudiante=" + estudiante +
                '}';
    }
}
