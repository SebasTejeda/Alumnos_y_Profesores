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

        Estudiante estudiante1 = new Estudiante("Sebastian Tejeda", 22, Sexo.M, 18);
        Estudiante estudiante2 = new Estudiante("Juan Torres", 25, Sexo.M,15);
        Estudiante estudiante3 = new Estudiante("Samantha Bazalar", 23, Sexo.F, 19);
        Estudiante estudiante4 = new Estudiante("Sofia Carranza", 22, Sexo.F,15);
        Estudiante estudiante5 = new Estudiante("Juan Pérez", 20, Sexo.M, 8);
        Estudiante estudiante6 = new Estudiante("María Rodríguez", 21, Sexo.F, 6);
        Estudiante estudiante7 = new Estudiante("Pedro Gómez", 19, Sexo.M, 4);
        Estudiante estudiante8 = new Estudiante("Laura Martínez", 23, Sexo.F, 7);
        Estudiante estudiante9 = new Estudiante("Ana López", 22, Sexo.F, 9);
        Estudiante estudiante10 = new Estudiante("Carlos García", 20, Sexo.M, 6);
        Estudiante estudiante11 = new Estudiante("Luisa Hernández", 21, Sexo.F, 8);
        Estudiante estudiante12 = new Estudiante("Miguel Sánchez", 19, Sexo.M, 7);
        Estudiante estudiante13 = new Estudiante("Sara Ramírez", 23, Sexo.F, 5);


        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);
        estudiantes.add(estudiante6);
        estudiantes.add(estudiante7);
        estudiantes.add(estudiante8);
        estudiantes.add(estudiante9);
        estudiantes.add(estudiante10);
        estudiantes.add(estudiante11);
        estudiantes.add(estudiante12);
        estudiantes.add(estudiante13);

        Aula aula = new Aula(1234, 8, Materias.MATEMATICAS,profesor,
                estudiantes);

        if(aula.seDaraClases()){
            System.out.println("---------- ALUMNOS APROBADOS ----------");
            System.out.println("En total hay " + aula.alumnosAprobados().size() + " alumnos aprobados");
            for(String alumnoAprobado: aula.alumnosAprobados()){
                System.out.println("- " + alumnoAprobado);
            }


            System.out.println("---------- ALUMNAS APROBADAS ----------");
            System.out.println("En total hay " + aula.alumnasAprobados().size() + " alumnas aprobadas");
            for(String alumnoAprobado: aula.alumnasAprobados()){
                System.out.println("- " + alumnoAprobado);
            }
        }
        else{
            System.out.println("No se darán clases hoy");
        }
    }
}
