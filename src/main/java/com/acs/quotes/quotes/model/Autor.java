package com.acs.quotes.quotes.model;

public class Autor {
    private int idAutor;
    private String firstName;
    private String lastName;
    private String nationality;


    public Autor() {

    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Autor(int idAutor, String firstName, String lastName, String nationality) {
        this.idAutor = idAutor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }
}

