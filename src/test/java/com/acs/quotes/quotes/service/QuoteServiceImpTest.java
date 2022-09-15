package com.acs.quotes.quotes.service;

import static org.junit.jupiter.api.Assertions.*;

import com.acs.quotes.quotes.model.Quote;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class QuoteServiceImpTest {
    private final List<Quote> quoteMockList = new ArrayList<>();
    private final QuoteService quoteService;

    public QuoteServiceImpTest() {
        this.quoteService = new QuoteServiceImp(quoteMockList);
    }

    @BeforeEach
    public void initializeQuoteList() {
        quoteMockList.clear();
    }

    @Test
    public void getEmptyQuotesTest() {
        List<Quote> quotesResult = quoteService.get();
        Assertions.assertTrue(quotesResult.isEmpty());
    }

    @Test
    public void createQuoteTest() {
        Quote quoteCreated = quoteService.create(getNewQuote());

        Assertions.assertAll(
            () -> Assertions.assertEquals("Gabriel Garcia Márquez", quoteCreated.getAuthor()),
            () -> Assertions.assertTrue(Objects.nonNull(quoteCreated.getId())),
            () -> Assertions.assertTrue(Objects.nonNull(quoteCreated.getDateCreated()))
        );
    }

    @Test
    public void updateQuoteSuccessfullyTest() {
        Quote quoteCreated = quoteService.create(getNewQuote());
        Quote quoteToUpdate = getNewQuote();
        quoteToUpdate.setAuthor("Piedad Bonnet");

        Quote quoteUpdated = quoteService.update(quoteCreated.getId(), quoteToUpdate);

        Assertions.assertEquals("Piedad Bonnet", quoteUpdated.getAuthor());
    }

    public void updateQuoteUnsuccessfullyTest() {

    }

    private Quote getNewQuote() {
        Quote quote = new Quote();
        quote.setAuthor("Gabriel Garcia Márquez");
        quote.setPhrase("A caballo regalado no se le mira el diente");
        quote.setBookName("Cien años de soledad");

        return quote;
    }
}