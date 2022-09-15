package com.acs.quotes.quotes.service;

import com.acs.quotes.quotes.model.Quote;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImp implements QuoteService {
    private static List<Quote> quotes = new ArrayList<>();

    public QuoteServiceImp(List<Quote> quotesInjected) {
        quotes = quotesInjected;
    }

    public List<Quote> get() {
        return quotes;
    }

    public Quote getById(String idQuote) {
        Optional<Quote> optionalQuote = quotes.stream()
            .filter(quote -> quote.getId().equals(idQuote))
            .findFirst();

        return optionalQuote.orElse(null);
    }

    public Quote create(Quote quote) {
        quote.setId(UUID.randomUUID().toString());
        quote.setDateCreated(new Date(System.currentTimeMillis()));
        quotes.add(quote);

        return quote;
    }

    public Quote update(String idQuote, Quote quote) {
        Quote oldQuote = getById(idQuote);

        if (Objects.isNull(oldQuote)) {
            return null;
        }

        oldQuote.setAuthor(quote.getAuthor());
        oldQuote.setBookName(quote.getBookName());
        oldQuote.setPhrase(quote.getPhrase());
        oldQuote.setLastUpdated(new Date(System.currentTimeMillis()));

        return oldQuote;
    }

    public boolean delete(String idQuote) {
        Quote quote = getById(idQuote);

        if (Objects.isNull(quote)) {
            return false;
        }

        return quotes.removeIf(q -> q.getId().equals(idQuote));
    }
}
