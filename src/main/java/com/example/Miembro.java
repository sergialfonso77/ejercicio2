package com.example;

abstract sealed class Miembro permits Jugador, Entrenador {

    private String name;
    private String surname; 
    private int age;

    protected Miembro(String name, String surname, int age) {
        this.name = name; 
        this.surname = surname; 
        this.age = age; 
    }

    //Metodos comunes
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public String getCompleteName() {
        String fullName = getName() + " " + getSurname();
        return fullName;
    }
    
    //Metodos abstractos
    abstract void mostrarDetalles();
}
