package main.java.pe.edu.upc.application;

import main.java.pe.edu.upc.entities.Estudiante;
import main.java.pe.edu.upc.entities.Profesor;
import main.java.pe.edu.upc.entities.enums.Materias;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Jorge Donayre", 45, "M",
                Materias.MATEMATICAS);
        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante estudiante1 = new Estudiante("Sebastian Tejeda", 22,
                "M", 18);
        Estudiante estudiante2 = new Estudiante("Juan Torres", 25, "M",
                15);
        Estudiante estudiante3 = new Estudiante("Samantha Bazalar", 23,
                "F", 19);
    }
}
