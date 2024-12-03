package com.example;

import java.util.logging.Logger;

public final class Jugador extends Miembro {
    
    private static final Logger logger = Logger.getLogger(Jugador.class.getName());
    private int dorsal;

    public Jugador (String name, int dorsal, int age, String surname) {
        super(name, surname, age);
        this.dorsal = dorsal;
        logger.info("jugador creado");
    }

    void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    int getDorsal() {
        return dorsal;
    }

    @Override
    void mostrarDetalles() {
        String message = String.format("Jugador %s %s de %d años, con dorsal %d", getName(), getSurname(), getAge(), dorsal);
        logger.info(message);
    }
}
