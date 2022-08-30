package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Autor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
}
