package com.example.BookManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {

    HashMap<String,Book>bookDB=new HashMap<>();

    HashMap<String,Author>authorDb=new HashMap<>();

    public String addBook(Book book){
        String name=book.getBookName();
        bookDB.put(name,book);
        return "Added Successfully";
    }

    public String addAuthor(Author author){
        String name=author.getAuthorName();
        authorDb.put(name,author);
        return "Added Successfully";
    }

    public String bookWithHighestPage(){
        int max=0;
        String bookName="";
        for(String name:bookDB.keySet()){
            if(bookDB.get(name).getPages()>max){
                max=bookDB.get(name).getPages();
                bookName=name;
            }
        }
        return bookName;
    }

    public String updateBook(String bookName,int pages){
        if(bookDB.containsKey(bookName)){
            int oldPages=bookDB.get(bookName).getPages();
            bookDB.get(bookName).setPages(oldPages+pages);
            return "Successfully updated";
        }
        else{
            return "Book is not present";
        }
    }

    public Author authorWithHighestPage(){
        int max=0;
        Author author=null;
        String authorName="";
        for(String name:bookDB.keySet()){
            if(bookDB.get(name).getPages() > max){
                max=bookDB.get(name).getPages();
                authorName=bookDB.get(name).getAuthorName();
            }
        }
        return authorDb.get(authorName);
    }
}
