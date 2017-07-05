package net.edinosmanovic.bookmvc.models;

import java.util.Date;

/**
 * Created by eo on 7/4/17.
 */
public class Book {
    private String title;
    private String author;
    private String genre;
    private String bookFormat;
    //private Date publishingDate;
    private Double price;


    public Book(String title, String author, String genre, String bookFormat, Double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookFormat = bookFormat;
        //this.publishingDate = publishingDate;
        this.price = price;

    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getBookFormat() {
        return bookFormat;
    }

//    public Date getPublishingDate() {
//        return publishingDate;
//    }

    public Double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBookFormat(String bookFormat) {
        this.bookFormat = bookFormat;
    }

//    public void setPublishingDate(Date publishingDate) {
//        this.publishingDate = publishingDate;
//    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
