package main.java.pe.edu.upc.entities;

import main.java.pe.edu.upc.entities.enums.Materias;
import main.java.pe.edu.upc.entities.enums.Sexo;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private int id;
    private int maxEstudiantes;
    private Materias materia;

    private Profesor profesor;
    private List<Estudiante> estudiantes;

    private List<Estudiante> estudiantesPresentes;


    public Aula(int id, int maxEstudiantes, Materias materia, Profesor profesor,
                List<Estudiante> estudiantes) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
        this.estudiantesPresentes = new ArrayList<>();
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

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", maxEstudiantes=" + maxEstudiantes +
                ", materia=" + materia +
                ", profesor=" + profesor +
                ", estudiantes=" + estudiantes +
                '}';
    }

    public boolean seDaraClases(){
        if(!this.profesor.Falto()){
            if(this.profesor.getMateria() == this.materia){
                for(Estudiante estudiante:this.estudiantes){
                    if(!estudiante.Falto()){
                        this.estudiantesPresentes.add(estudiante);
                    }
                }
                return estudiantesPresentes.size() >= (this.maxEstudiantes / 2);
            }
        }
        return false;
    }

    public List<String> alumnosAprobados(){
        List<String> cadaAlumnoAprobado = new ArrayList<>();
        for(Estudiante estudiante: this.estudiantesPresentes){
            if(estudiante.getNota() > 5){
                if(estudiante.getSexo() == Sexo.M) {
                    cadaAlumnoAprobado.add(estudiante.getName());
                }
            }
        }
        return cadaAlumnoAprobado;
    }

    public List<String> alumnasAprobados(){
        List<String> cadaAlumnaAprobada = new ArrayList<>();
        for(Estudiante estudiante: this.estudiantesPresentes){
            if(estudiante.getNota() > 5){
                if(estudiante.getSexo() == Sexo.F) {
                    cadaAlumnaAprobada.add(estudiante.getName());
                }
            }
        }
        return cadaAlumnaAprobada;
    }

    public List<Estudiante> getEstudiantesPresentes() {
        return estudiantesPresentes;
    }

    public void setEstudiantesPresentes(List<Estudiante> estudiantesPresentes) {
        this.estudiantesPresentes = estudiantesPresentes;
    }
}
