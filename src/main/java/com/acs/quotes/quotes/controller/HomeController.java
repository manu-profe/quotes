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
    private int counter = 0;

    // Create quote
    @PostMapping("/quote")
    public String createQuote(@RequestBody Quote quote){
        // Reader exists?
        boolean lector = true;
        if (lector) {
            // Create author using endpoint
            // Create book using endpoint
            quote.setCreationDate(LocalDateTime.now());
            quote.setUpdatedDate(LocalDateTime.now());
            quote.setQuoteId(counter);
            counter++;
            quotesArray.add(quote);
        } else {
            return "Reader doesn't exist, please create it";
        }
        return "Quote created successfully";
    }

    // Get quote
    @GetMapping("/quote")
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

        String finalWordToSearch = wordToSearch;
        String finalAuthorToSearch = authorToSearch;
        String finalBookToSearch = bookToSearch;

        // Multiple conditions doesn't work
        List<Quote> result = quotesArray.stream()
                //.filter(x -> x.getPhrase().contains(finalWordToSearch) || x.getAuthor().contains(finalAuthorToSearch) || x.getBook().contains(finalBookToSearch)).collect(Collectors.toList());
                .filter(x -> x.getPhrase().contains(finalWordToSearch)).collect(Collectors.toList());
        return result;
    }

    // Delete quote
    @DeleteMapping("/quote")
    public String deleteQuote(@RequestParam(name = "quote") String quoteToDelete) {
        for (int i = 0; i<quotesArray.toArray().length; i++){
            if (quotesArray.get(i).getPhrase().equals(quoteToDelete)){
                quotesArray.remove(i);
                return "Quote removed successfully";
            }
        }
        return "Quote not founded";
    }

    // Update quote
    @PutMapping("/quote")
    public String updateQuote(@RequestBody Quote quoteToUpdate, @RequestParam(name = "quoteId") int id) {
        for (int i = 0; i<quotesArray.toArray().length; i++){
            if (quotesArray.get(i).getQuoteId() == id){
                quotesArray.get(i).setPhrase(quoteToUpdate.getPhrase());
                quotesArray.get(i).setUpdatedDate(LocalDateTime.now());
                quotesArray.get(i).setAuthor(quoteToUpdate.getAuthor());
                quotesArray.get(i).setBook(quoteToUpdate.getBook());
                quotesArray.get(i).setReader(quoteToUpdate.getReader());
                return "Quote updated successfully";
            }
        }
        return "Quote not founded";
    }
}
