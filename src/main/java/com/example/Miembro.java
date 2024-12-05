package com.example;

import java.time.LocalDate;

abstract sealed class Miembro permits Jugador, Entrenador {

    private String name;
    private String surname; 
    private int age;
    private LocalDate fechaIncorporacion;
    private LocalDate fechaFinDeContrato;

    protected Miembro(String name, String surname, int age) {
        this.name = name; 
        this.surname = surname; 
        this.age = age;
    }

    //Metodos comunes
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }
    
    public LocalDate getFechaFinDeContrato() {
        return fechaFinDeContrato;
    }

    public void setFechaFinDeContrato(LocalDate fechaFinDeContrato) {
        this.fechaFinDeContrato = fechaFinDeContrato;
    }

    public String getCompleteName() {
        String fullName = getName() + " " + getSurname();
        return fullName;
    }
    
    //Metodos abstractos
    public abstract void mostrarDetalles();
}
