package com.acs.quotes.quotes.controller;

import model.Quote;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HomeController {
    private final List<Quote> quotesArray = new ArrayList<>();
    @PostMapping("/quote")
    public String createQuote(@RequestBody Quote quote){
        // primero validacion de que lector exista
        boolean lector = true;
        if (lector) {
            // Creación de autor
            // Creación de libro
            quote.setCreationDate(LocalDateTime.now());
            quote.setUpdatedDate(LocalDateTime.now());
            quotesArray.add(quote);
        } else {
            return "Reader doesn't exist, please create it";
        }
        return "Quote created successfully";
        //return quotesArray.get(0).getAuthor() + " "+quotesArray.get(0).getPhrase() +" "+ quotesArray.get(0).getBook();
    }

    @GetMapping("quote")
    public List<Quote> getQuote(@RequestParam(name = "author", required = false) String authorToSearch,
                           @RequestParam(name = "keyWord", required = false) String wordToSearch,
                           @RequestParam(name = "book", required = false) String bookToSearch){

        if (authorToSearch == null){
            authorToSearch = "";
        }
        if (wordToSearch == null){
            wordToSearch = "";
        }
        if (bookToSearch == null){
            bookToSearch = "";
        }

        return quotesArray.stream()
                .filter(x -> x.getPhrase().contains(wordToSearch) || x.getAuthor().contains(authorToSearch) || x.getBook().contains(bookToSearch)).collect(Collectors.toList());
    }


}
