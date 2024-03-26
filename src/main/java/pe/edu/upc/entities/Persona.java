package main.java.pe.edu.upc.entities;

import main.java.pe.edu.upc.entities.enums.Sexo;

import java.util.Random;

public class Persona {
    private String name;
    private int edad;
    private Sexo sexo;

    public Persona(String name, int edad, Sexo sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public boolean Falto(){
        return true;
    }
}
