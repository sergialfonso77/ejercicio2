package com.example;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    
    private static int numEquipos = 0;

    private String name;
    private String foundationYear; 
    private List<Miembro> miembros;


    public Equipo(String name, String foundationYear) {
        this.name = name; 
        this.foundationYear = foundationYear; 
        this.miembros = new ArrayList<>();
        numEquipos++;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFoundationYear(String foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getFoundationYear() {
        return foundationYear;
    }

    public void setMiembros(ArrayList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public void addMiembro(Miembro newMiembro) throws MiembroDuplicadoException {
        for(Miembro m : miembros) {
            if (m.getName().equalsIgnoreCase(newMiembro.getName()) && m.getSurname().equalsIgnoreCase(m.getSurname())) {
                throw new MiembroDuplicadoException("El miembro" + m.getName() + " " + m.getSurname() + "ya forma parte del equipo");
            }
        }
        miembros.add(newMiembro);
    }


    public int getNumEquipos() {
        return numEquipos;
    }
    
}