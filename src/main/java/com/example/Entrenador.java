package com.example;

import java.util.logging.Logger;

public final class Entrenador extends Miembro {
    
    private static final Logger logger = Logger.getLogger(Entrenador.class.getName());

    private String tactica;

    public Entrenador (String name, String tactica, int age, String surname) {
        super(name, surname, age);
        this.tactica = tactica;
    }

    public void setTactica(String tactica) {
        this.tactica = tactica;
    }

    public String getTactica() {
        return tactica;
    }

    @Override
    public void mostrarDetalles() {
        String message = String.format("Jugador %s %s de %d años, con tactica %s", getName(), getSurname(), getAge(), tactica);
        logger.info(message);
    }
}
