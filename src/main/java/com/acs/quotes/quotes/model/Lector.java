package com.acs.quotes.quotes.model;

import java.util.ArrayList;

public class Lector {
    /*
    * Nombre
    * Genero
    * Fecha de nacimiento
    * cedula
    */

    private String name;
    private String gender;
    private String dateBirth;
    private String idLector;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getIdLector() {
        return idLector;
    }

    public void setIdLector(String idLector) {
        this.idLector = idLector;
    }

}
