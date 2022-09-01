package com.acs.quotes.quotes.model;

public class Book {
    private String id;
    private String autorId;
    private String tittle;
    private String publishing;
    private String datePublished;

    public Book() {
    }

    public Book(String id, String autorId, String tittle, String publishing, String datePublished) {
        this.id = id;
        this.autorId = autorId;
        this.tittle = tittle;
        this.publishing = publishing;
        this.datePublished = datePublished;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutorId() {
        return autorId;
    }

    public void setAutorId(String autorId) {
        this.autorId = autorId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }
}
