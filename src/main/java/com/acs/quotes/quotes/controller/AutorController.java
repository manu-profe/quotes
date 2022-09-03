package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Author;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

@RestController
public class AutorController {
    private final static List<Author> lista = new ArrayList<>();

    private Author autorService;
    // Equipo 7
    //Create and Update
    @GetMapping("/Author")
    public List<Author> getAuthor(){
        lista.add(new Author(1,"camilo", "villa", "col"));
        lista.add(new Author(2,"maria paulina", "valencia", "italy"));
        lista.add(new Author(3,"juan esteban", "yepes", "esp"));

        return lista;

    }

    @PostMapping("Author")
    public String create( @RequestBody Author author) {
        return String.format("POST Recibido: \nAuthorId: %s \nAuthorFirstname: %s \nAuthorLastname: %s \nAuthorNationality: %s ",
                author.getAuthorId(),
                author.getAuthorFirstname(),
                author.getAuthorLastname(),
                author.getAuthorNationality());
    }

    // Equipo 7
    //Update
    @PutMapping("/Author")
        public void updateAuthor(@PathVariable("AuthorId") int AuthorId,
        @PathVariable("AuthorFirstname") String AuthorFirstname,
        @PathVariable("AuthorLastname") String AuthorLastname,
        @PathVariable("AuthorNationality") String AuthorNationality,
                                 @RequestBody Author author)
    {
        Author.updateAuthor(AuthorId,AuthorFirstname,AuthorLastname,AuthorNationality);
    }



}


