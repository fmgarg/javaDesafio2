package com.coderhouse.test;
import com.coderhouse.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Persona unoPersona = new Persona();
        unoPersona.setNombre("Juan");
        unoPersona.setApellido("Perez");
        System.out.println(unoPersona);
        Persona dosPersona = new Persona();
        dosPersona.setNombre("Maria");
        dosPersona.setApellido("Gomez");
        System.out.println(dosPersona);
        Persona tresPersona = new Persona();
        tresPersona.setNombre("Pedro");
        tresPersona.setApellido("Mendez");
        System.out.println(tresPersona);
        Persona cuatroPersona = new Persona();
        cuatroPersona.setNombre("Teresa");
        cuatroPersona.setApellido("Parodi");
        System.out.println(cuatroPersona);
        Persona cincoPersona = new Persona();
        cincoPersona.setNombre("Esteban");
        cincoPersona.setApellido("Quito");
        System.out.println(cincoPersona);

        // crear la lista de personas y agregar cada persona
        List<Persona> personas = new ArrayList<>();
        personas.add(unoPersona);
        personas.add(dosPersona);
        personas.add(tresPersona);
        personas.add(cuatroPersona);
        personas.add(cincoPersona);
        System.out.println(personas);

        // Ordenar por nombre
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenadas por nombre:");
        personas.forEach(System.out::println);

        // Ordenar por apellido (ascendente)
        Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenadas por apellido (ascendente):");
        personas.forEach(System.out::println);

        // Ordenar por apellido (descendente)
        Collections.sort(personas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenadas por apellido (descendente):");
        personas.forEach(System.out::println);
    }


}
