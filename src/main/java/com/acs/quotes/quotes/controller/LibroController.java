package com.acs.quotes.quotes.controller;


import com.acs.quotes.quotes.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibroController {
    private final List<Book> libros = new ArrayList<>();

    @GetMapping("/book{title}")
    public String searchBook(String title) {
        for (Book book : libros) {
            if (book.getTittle().equals(title)) {
                return "Libro encontrado: " + book.getTittle() + " - Autor: " + book.getAutorId() + " -Published at: " + book.getDatePublished();
            }
        }
        return "Libro no encontrado";
    }

    @PostMapping("/book{title}")
    public String deleteBook(String title) {
        for (Book book : libros) {
            if (book.getTittle().equals(title)) {
                return "Libro encontrado: " + book.getTittle() + " - Autor: " + book.getAutorId() + " -Published at: " + book.getDatePublished();
            }
        }
        return "Libro no encontrado";
    }
}
