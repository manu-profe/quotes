package com.acs.quotes.quotes.service;

import com.acs.quotes.quotes.model.Quote;
import java.util.List;

public interface QuoteService {
    List<Quote> get();
    Quote getById(String idQuote);
    Quote create(Quote quote);
    Quote update(String idQuote, Quote quote);
    boolean delete(String idQuote);
}
