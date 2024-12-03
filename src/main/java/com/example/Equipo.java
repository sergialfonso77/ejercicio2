package com.example;

import java.util.ArrayList;

public class Equipo {
    
    private static int numEquipos = 0;

    private String name;
    private String foundationYear; 
    private ArrayList<Miembro> miembros;


    public Equipo(String name, String foundationYear) {
        this.name = name; 
        this.foundationYear = foundationYear; 
        numEquipos++;
    }
    
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setFoundationYear(String foundationYear) {
        this.foundationYear = foundationYear;
    }

    String getFoundationYear() {
        return foundationYear;
    }

    void setMiembros(ArrayList<Miembro> miembros) {
        this.miembros = miembros;
    }

    ArrayList<Miembro> getMiembros() {
        return miembros;
    }

    int getNumEquipos() {
        return numEquipos;
    }
    
}