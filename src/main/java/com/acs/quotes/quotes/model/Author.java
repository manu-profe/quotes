package com.acs.quotes.quotes.model;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Author {
    private int AuthorId;
    private String AuthorFirstname;
    private String AuthorLastname;
    private String AuthorNationality;


    public Author() {

    }

    public static void updateAuthor(int authorId, String authorFirstname, String authorLastname, String authorNationality) {
    }

    public int getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(int AuthorId) {
        this.AuthorId = AuthorId;
    }

    public String getAuthorFirstname() {
        return AuthorFirstname;
    }

    public void setAuthorFirstname(String AuthorFirstname) {
        this.AuthorFirstname = AuthorFirstname;
    }

    public String getAuthorLastname() {
        return AuthorLastname;
    }

    public void setAuthorLastname(String AuthorLastname) {
        this.AuthorLastname = AuthorLastname;
    }

    public String getAuthorNationality() {
        return AuthorNationality;
    }

    public void setAuthorNationality(String AuthorNationality) {
        this.AuthorNationality = AuthorNationality;
    }

    public Author(int AuthorId, String AuthorFirstname, String AuthorLastname, String AuthorNationality) {
        this.AuthorId = AuthorId;
        this.AuthorFirstname = AuthorFirstname;
        this.AuthorLastname = AuthorLastname;
        this.AuthorNationality = AuthorNationality;
    }

    // update
    void updateName(@PathParam("AuthorId") int AuthorId,
                    @PathParam("AuthorFirstname") String AuthorFirstname,
                    @PathParam("AuthorLastname") String AuthorLastname,
                    @PathParam("AuthorNationality")String Nationality){

    }

}

