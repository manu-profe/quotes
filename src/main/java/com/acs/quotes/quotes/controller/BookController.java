package com.acs.quotes.quotes.controller;


import com.acs.quotes.quotes.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private final List<Book> books = new ArrayList<>();

    @GetMapping("/book{title}")
    public String searchBook(String title) {
        for (Book book : books) {
            if (book.getTittle().equals(title)) {
                return "Libro encontrado: " + book.getTittle() + " - Autor: " + book.getAutorId() + " -Published at: " + book.getDatePublished();
            }
        }
        return "Libro no encontrado";
    }

    @PostMapping("/book")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        for (Book bookEntity : books) {
            if(bookEntity.getTittle().equals(book.getTittle())){
                return new ResponseEntity<>(book,null, HttpStatus.BAD_REQUEST);        
            }
        }
        books.add(book);
        return new ResponseEntity<>(book,null, HttpStatus.CREATED);
    }

}
