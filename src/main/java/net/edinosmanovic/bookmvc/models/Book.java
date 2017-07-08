package net.edinosmanovic.bookmvc.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by eo on 7/4/17.
 */
public class Book {

    @NotNull
    @Size(min=2, max=30, message = "Title may not be empty")
    private String title;
    @NotNull
    @Size(min=5, max=25, message = "Author may not be empty")
    private String author;
    @NotNull
    @Size(min=3, max=25)
    private String genre;
    @NotNull
    @Size(min=3, max=25)
    private String bookFormat;
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date publishingDate;
    @NotNull
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private Double price;

    private int bookId;
    private static int nextId = 1;

    public Book(){
        bookId = nextId;
        nextId++;
    }

    public Book(String title, String author, String genre, String bookFormat, Date publishingDate, Double price) {
        this();
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookFormat = bookFormat;
        this.publishingDate = publishingDate;
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

    public Date getPublishingDate() {
        return publishingDate;
    }

    public Double getPrice() {
        return price;
    }

    public int getBookId() {
        return bookId;
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

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
