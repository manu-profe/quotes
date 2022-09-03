package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Quote {
    private String phrase;
    private LocalDateTime creationDate;
    private LocalDateTime updatedDate;
    private String keyWord;
    private String author;
    private String book;
    private String reader;
    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }



    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }



    // Check
    //private String author;
    //private String book;
}
