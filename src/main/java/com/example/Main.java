package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.of(1899, 11, 11);

        Equipo equipo = new Equipo("Barça", date);
        Equipo equipo2 = new Equipo("Madrid", date);

        equipo.addMiembro(new Jugador("Ter", "Stegen", 1, 28));
        equipo.addMiembro(new Jugador("Dani", "Olmo", 20, 25));

        equipo2.addMiembro(new Jugador("Luka", "Modric", 1, 28));
        equipo2.addMiembro(new Jugador("Dani", "Carvajal", 20, 25));

        List<Miembro> miembros = equipo.getMiembros();

        for(Miembro m : miembros) {
            System.out.println(m.getSurname() + " " + m.getName());
        }

        Partido partido = new Partido(equipo, equipo2);

        partido.setFecha(LocalDateTime.of(2025, 3, 15, 21, 00));
    }
}