package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Autor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AutorController {


    ArrayList<Autor> autores = new ArrayList<Autor>();
    //Create and Update
    @GetMapping("/Create{id2}")
    public String crearAutor(@RequestBody Autor autor){


        return "";
    }

    //Update
    @PutMapping("/update/{id}")
    public String updateAutor(@RequestBody Autor autor, @PathVariable("idAutor") int idAutor) {
        return "";
    }

    @GetMapping("/Author")
    public List<Author> getAuthor() {

        ArrayList<Author> list = new ArrayList<Author>();
        Author first = new Author();
        first.setAuthorId("1");
        first.setFirstName("Gabriel");
        first.setLastName("marquez");
        first.setNationality("colombia");

        list.add(first);
        return list;
    }

    @DeleteMapping("/Author/{authorId}")
    public String DeleteAuthor(@PathVariable("authorId") String AuthorId) {
        return "Delete by author id called";
    }
}
