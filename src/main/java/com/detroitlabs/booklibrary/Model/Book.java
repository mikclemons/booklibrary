package com.detroitlabs.booklibrary.Model;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private LocalDate checkOutDate;
    private int genre;
    private boolean isCheckedOut;

    public Book(String title, String author, LocalDate checkOutDate, int genre, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.checkOutDate = checkOutDate;
        this.genre = genre;
        this.isCheckedOut = isCheckedOut;
    }

    public Book(String title, String author, int genre, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.checkOutDate = LocalDate.now();
        this.genre = genre;
        this.isCheckedOut = isCheckedOut;
    }

    public String getFormattedTitleForImage(){
        return this.title.toLowerCase().replace(" ", "");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
}
