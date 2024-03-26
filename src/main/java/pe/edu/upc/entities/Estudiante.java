package main.java.pe.edu.upc.entities;

public class Estudiante extends Persona{
    private int nota;

    public Estudiante(String name, int edad, String sexo, int nota) {
        super(name, edad, sexo);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nota=" + nota +
                '}';
    }
}
