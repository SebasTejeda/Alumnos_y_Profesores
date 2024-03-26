package main.java.pe.edu.upc.entities;

import java.util.Random;

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

    @Override
    public boolean Falto() {
        Random r = new Random();
        int aleatorio = 1 + r.nextInt(10);
        return aleatorio <= 5;
    }
}
