package com.company;

import java.util.HashMap;
import java.util.Map;

public class GestionareNote {
    public static void main(String[] args) {
        Map<String, Integer> noteStudenti = new HashMap<>();

        noteStudenti.put("Student1", 8);
        noteStudenti.put("Student2", 9);
        noteStudenti.put("Student3", 7);

        int notaStudent2 = noteStudenti.get("Student2");
        System.out.println("Nota pentru Student2: " + notaStudent2);

        double medie = calculMedie(noteStudenti);
        System.out.println("Media notelor: " + medie);
    }
    private static double calculMedie(Map<String, Integer> note) {
        if (note.isEmpty()) {
            return 0.0;
        }
        int suma = 0;
        for (int nota : note.values()) {
            suma += nota;
        }
        return (double) suma / note.size();
    }
}