package com.acs.quotes.quotes.controller;

import com.acs.quotes.quotes.model.Quote;
import com.acs.quotes.quotes.service.QuoteService;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class QuoteController {
    @Autowired
    QuoteService quoteService;

    @GetMapping("quotes")
    public ResponseEntity<List<Quote>> get() {
        List<Quote> quotes = quoteService.get();

        return quotes.isEmpty() ? ResponseEntity.badRequest().body(quotes) : ResponseEntity.ok(quotes);
    }

    @GetMapping("quotes/{idQuote}")
    public ResponseEntity<Quote> getById(@PathVariable String idQuote) {
        Quote quote = quoteService.getById(idQuote);

        return Objects.isNull(quote) ? ResponseEntity.notFound().build() : ResponseEntity.ok(quote);
    }

    @PostMapping("quotes")
    public ResponseEntity<Quote> create(@RequestBody Quote quote) {
        return ResponseEntity.ok(quoteService.create(quote));
    }

    @PutMapping("quotes/{idQuote}")
    public ResponseEntity<Quote> update(@PathVariable String idQuote, @RequestBody Quote quote) {
        Quote quoteUpdated = quoteService.update(idQuote, quote);

        return Objects.isNull(quoteUpdated) ? ResponseEntity.notFound().build() : ResponseEntity.ok(quoteUpdated);
    }

    @DeleteMapping("quotes/{idQuote}")
    public ResponseEntity delete(@PathVariable String idQuote) {
        boolean deleted = quoteService.delete(idQuote);

        return deleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
