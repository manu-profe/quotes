package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Autor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class AutorController {

    // Equipo 7
    //Create and Update
    @GetMapping("/Create")
    public List<Autor> getAutor(){
        List<Autor> lista = new ArrayList<Autor>();
        lista.add(new Autor(1,"camilo", "villa", "col"));
        lista.add(new Autor(2,"maria paulina", "valencia", "italy"));
        lista.add(new Autor(3,"juan esteban", "yepes", "esp"));

        return lista;

    }

    // Equipo 7
    //Update
    @PutMapping("/update/{id}")
    public String updateAutor(@RequestBody Autor autor, @PathVariable("idAutor") int idAutor) {
        return "";
    }
}


