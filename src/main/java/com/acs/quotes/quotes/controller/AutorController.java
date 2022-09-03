package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Author;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AutorController {

    // Equipo 7
    //Create and Update
    @GetMapping("/Author")
    public List<Author> getAuthor() {

        ArrayList<Author> list = new ArrayList<Author>();
        Author first = new Author();
        first.setAuthorId(1);
        first.setAuthorFirstname("Gabriel");
        first.setAuthorLastname("marquez");
        first.setAuthorNationality("colombia");

        list.add(first);
        return list;
    }

    // Equipo 7
    //Update
    @PutMapping("/update/{id}")
    public String updateAutor(@RequestBody Author autor, @PathVariable("idAutor") int idAutor) {
        return "";
    }

    // Equuipo 6
    //complete
    @DeleteMapping("/Author/{AuthorId}")
    public String DeleteAuthor(@PathVariable("AuthorId") String AuthorId) {
        return "Delete by author id called";
    }
}


