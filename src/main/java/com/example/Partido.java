package com.example;

import java.time.LocalDateTime;

public class Partido {
    
    private Equipo local; 
    private Equipo visitante; 
    private LocalDateTime fecha; 


    public Partido(Equipo local, Equipo visitante) {
        this.local = local; 
        this.visitante = visitante;
    }

    public LocalDateTime getFecha() {
        return fecha; 
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha; 
    }
}
