package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Equipo equipo = new Equipo("Barça", 1899);
        
        equipo.addMiembro(new Jugador("Ter", "Stegen", 1, 28));
        equipo.addMiembro(new Jugador("Dani", "Olmo", 20, 25));

        List<Miembro> miembros = equipo.getMiembros();

        for(Miembro m : miembros) {
            System.out.println(m.getSurname() + " " + m.getName());
        }
    
    }
}