package com.example.BookManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String addBook(Book book){
        return bookRepository.addBook(book);
    }

    public String addAuthor(Author author){
        return bookRepository.addAuthor(author);
    }

    public String bookWithHighestPage(){
        return bookRepository.bookWithHighestPage();
    }

    public String updateBook(String bookName,int pages){
        return bookRepository.updateBook(bookName,pages);
    }

    public Author authorWithHighestPage(){
        return bookRepository.authorWithHighestPage();
    }
}
