package com.acs.quotes.quotes.controller;

import model.Quote;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    List<Quote> quotesArray = new ArrayList<>();
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
    public String getQuote(@RequestParam(name = "author", required = false) String quoteToSearch,
                           @RequestParam(name = "keyWord", required = false) String wordToSearch,
                           @RequestParam(name = "date", required = false) String dateToSearch){
        return "";
    }
}
