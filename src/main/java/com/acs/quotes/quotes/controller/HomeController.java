package com.acs.quotes.quotes.controller;

import model.Quote;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class HomeController {
    @PostMapping("/quote")
    public String createQuote(@RequestBody Quote quote){
        quote.setCreationDate(LocalDateTime.now());
        quote.setUpdatedDate(LocalDateTime.now());
        return "Quote created successfully";
    }

    @GetMapping("quote")
    public String getQuote(@RequestParam(name = "quote") String quoteToSearch){
        return "";
    }
}
