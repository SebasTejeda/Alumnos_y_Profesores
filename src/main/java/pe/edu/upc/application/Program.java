package main.java.pe.edu.upc.application;

import main.java.pe.edu.upc.entities.Aula;
import main.java.pe.edu.upc.entities.Estudiante;
import main.java.pe.edu.upc.entities.Profesor;
import main.java.pe.edu.upc.entities.enums.Materias;
import main.java.pe.edu.upc.entities.enums.Sexo;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Jorge Donayre", 45, Sexo.M,
                Materias.MATEMATICAS);
        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante estudiante1 = new Estudiante("Sebastian Tejeda", 22,
                Sexo.M, 18);
        Estudiante estudiante2 = new Estudiante("Juan Torres", 25, Sexo.M,
                15);
        Estudiante estudiante3 = new Estudiante("Samantha Bazalar", 23,
                Sexo.F, 19);
        Estudiante estudiante4 = new Estudiante("Sofia Carranza", 22, Sexo.F,
                15);

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);

        Aula aula = new Aula(1234, 8, Materias.MATEMATICAS,profesor,
                estudiantes);

        if(aula.seDaraClases()){
            System.out.println("Sí se dará clases");
        }
        else{
            System.out.println("No se darán clases hoy");
        }
    }
}
