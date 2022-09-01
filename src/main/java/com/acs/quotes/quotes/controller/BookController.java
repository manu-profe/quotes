package com.acs.quotes.quotes.controller;


import com.acs.quotes.quotes.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        String id = Integer.toString(books.size() + 1);
        book.setId(id);
        books.add(book);
        return new ResponseEntity<>(book,null, HttpStatus.CREATED);
    }

    @PutMapping("/book")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        for (Book bookEntity : books) {
            if (bookEntity.getTittle().equals(book.getTittle())) {
                bookEntity.setId(book.getId());
                bookEntity.setAutorId(book.getAutorId());
                bookEntity.setTittle(book.getTittle());
                bookEntity.setDatePublished(book.getPublishing());
                bookEntity.setDatePublished(book.getDatePublished());
            }
        }
        return new ResponseEntity<>(book,null, HttpStatus.OK);
    }

}
