package com.acs.quotes.quotes.model;

public class Author {
    private int AuthorId;
    private String AuthorFirstname;
    private String AuthorLastname;
    private String AuthorNationality;

    public Author() {

    }

    public int getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(int authorId) {
        AuthorId = authorId;
    }

    public String getAuthorFirstname() {
        return AuthorFirstname;
    }

    public void setAuthorFirstname(String authorFirstname) {
        AuthorFirstname = authorFirstname;
    }

    public String getAuthorLastname() {
        return AuthorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        AuthorLastname = authorLastname;
    }

    public String getAuthorNationality() {
        return AuthorNationality;
    }

    public void setAuthorNationality(String authorNationality) {
        AuthorNationality = authorNationality;
    }

    public Author(int AuthorId, String AuthorFirstname, String AuthorLastname, String AuthorNationality) {
        this.AuthorId = AuthorId;
        this.AuthorFirstname = AuthorFirstname;
        this.AuthorLastname = AuthorLastname;
        this.AuthorNationality = AuthorNationality;
    }
}

