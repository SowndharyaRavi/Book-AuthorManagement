package com.example.BookManagement;

public class Book {

    private String bookName;

    private String AuthorName;

    private int pages;

    private double rating;

    public Book() {
    }

    public Book(String bookName, String authorName, int pages, double rating) {
        this.bookName = bookName;
        AuthorName = authorName;
        this.pages = pages;
        this.rating = rating;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
