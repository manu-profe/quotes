package com.acs.quotes.quotes.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Reader {
    private String name;
    private String lastName;
    private String gender;
    private String birth;
    private String documentId;

    //Constructor vacio (Sobre carga de constructores)
    public Reader(){}

    //Constructor con parametros
    public Reader(String name, String lastName, String gender, String birth, String documentId) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birth = birth;
        this.documentId = documentId;
    }

    //Construcción de Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
