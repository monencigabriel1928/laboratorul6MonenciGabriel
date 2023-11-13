package com.company;

import java.util.ArrayList;

public class ListaStudenti {

    public static void main(String[] args) {
        ArrayList<String> listaStudenti = new ArrayList<>();
        listaStudenti.add("Student1");
        listaStudenti.add("Student2");
        listaStudenti.add("Student3");
        System.out.println("Elementul de la indexul 1: " + listaStudenti.get(1));
        listaStudenti.remove("Student2");
        System.out.println("Lista dupa stergere: " + listaStudenti);
        System.out.println("Numarul de studenti: " + listaStudenti.size());
        System.out.println("Lista contine Student1? " + listaStudenti.contains("Student1"));
    }
}

