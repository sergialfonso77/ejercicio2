package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Equipo {
    
    private static int numEquipos = 0;

    private String name;
    private LocalDate foundationYear; 
    private List<Miembro> miembros;


    public Equipo(String name, LocalDate foundationYear) {
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

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setMiembros(ArrayList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public List<Miembro> getMiembros() {
        return miembros.stream()
            .sorted(Comparator.comparing(Miembro::getSurname)
            .thenComparing(Miembro::getName))
            .collect(Collectors.toList());
    }

    public void addMiembro(Miembro newMiembro) throws MiembroDuplicadoException {
        
        if (miembros.stream().anyMatch(m -> m.getCompleteName().equalsIgnoreCase(newMiembro.getCompleteName()))) {
            throw new MiembroDuplicadoException("El miembro" + newMiembro.getName() + " " + newMiembro.getSurname() + "ya forma parte del equipo");
        }

        miembros.add(newMiembro);
    }

    public Miembro findMiembro(String name, String surname) {
        return miembros.stream()
            .filter(m -> m.getName().equalsIgnoreCase(name) && m.getSurname().equalsIgnoreCase(surname))
            .findFirst()
            .orElse(null);
        
    }


    public int getNumEquipos() {
        return numEquipos;
    }
    
}