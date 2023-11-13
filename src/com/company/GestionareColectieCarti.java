package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GestionareColectieCarti {

    public static void main(String[] args) {
        Set<String> setCarti = new HashSet<>();
        setCarti.add("Carte1");
        setCarti.add("Carte2");
        setCarti.add("Carte3");
        if (!setCarti.contains("Carte1")) {
            setCarti.add("Carte1");
        }
        System.out.println("Cărți în set (HashSet):");
        for (String carte : setCarti) {
            System.out.println(carte);
        }
        Set<String> setCartiSortat = new TreeSet<>();
        setCartiSortat.add("CarteC");
        setCartiSortat.add("CarteA");
        setCartiSortat.add("CarteB");
        System.out.println("Cărți în set (TreeSet):");
        for (String carte : setCartiSortat) {
            System.out.println(carte);
        }
    }
}
