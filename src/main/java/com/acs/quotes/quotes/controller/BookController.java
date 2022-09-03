package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Book;
import com.acs.quotes.quotes.model.genericModel.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
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

    //Eliminar libro
    @DeleteMapping("/delete{title}")
    public String deleteBook(String title) {
        for (Book book : books) {
            if (book.getTittle().equals(title)) {
                books.remove(book);
                return "Book deleted";
            }
        }
        return "Book not founded";
    }

    @PostMapping("/book")
    public ResponseEntity<Response<Book>> saveBook(@RequestBody Book book) {
        var responseEntity = new Response<Book>();
        for (Book bookEntity : books) {
            if (bookEntity.getTittle().equals(book.getTittle())) {
                responseEntity.setMessage("El libro ya existe.");
                responseEntity.setStatus(false);
                return new ResponseEntity<>(responseEntity, null, HttpStatus.BAD_REQUEST);
            }
        }
        String id = Integer.toString(books.size() + 1);
        book.setId(id);
        books.add(book);

        responseEntity.setMessage("Creado exitosamente");
        responseEntity.setStatus(true);
        responseEntity.setData(book);

        return new ResponseEntity<>(responseEntity, null, HttpStatus.CREATED);
    }

    @PutMapping("/book")
    public ResponseEntity<Response<Book>> updateBook(@RequestBody Book book) {
        var responseEntity = new Response<Book>();

        for (Book bookEntity : books) {
            if (bookEntity.getTittle().equals(book.getTittle())) {
                bookEntity.setId(bookEntity.getId());
                bookEntity.setAutorId(book.getAutorId());
                bookEntity.setTittle(book.getTittle());
                bookEntity.setDatePublished(book.getPublishing());
                bookEntity.setDatePublished(book.getDatePublished());

                responseEntity.setMessage("Actualizado exitosamente");
                responseEntity.setStatus(true);
                responseEntity.setData(bookEntity);

                return new ResponseEntity<>(responseEntity, null, HttpStatus.OK);
            }
        }

        responseEntity.setMessage("Libro no encontrado.");
        responseEntity.setStatus(false);
        return new ResponseEntity<>(responseEntity, null, HttpStatus.BAD_REQUEST);
    }

}
