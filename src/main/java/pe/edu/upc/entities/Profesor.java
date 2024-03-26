package main.java.pe.edu.upc.entities;

public class Profesor extends Persona{
    private String materia;

    public Profesor(String name, int edad, String sexo, String materia) {
        super(name, edad, sexo);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "materia='" + materia + '\'' +
                '}';
    }
}
