package com.example;

import java.util.logging.Logger;

public final class Jugador extends Miembro {
    
    private static final Logger logger = Logger.getLogger(Jugador.class.getName());
    private int dorsal;

    public Jugador (String name, String surname, int dorsal, int age) {
        super(name, surname, age);
        this.dorsal = dorsal;
        logger.info("jugador creado");
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override
    public void mostrarDetalles() {
        String message = String.format("Jugador %s %s de %d años, con dorsal %d", getName(), getSurname(), getAge(), dorsal);
        logger.info(message);
    }
}
