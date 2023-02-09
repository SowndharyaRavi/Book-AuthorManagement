package com.example.BookManagement;

public class Author {

    private String authorName;

    private String bookName;

    private int age;

    private double ratings;

    public Author() {
    }

    public Author(String authorName, String bookName, int age, double ratings) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.age = age;
        this.ratings = ratings;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
