package com.example.BookManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        return bookService.addAuthor(author);
    }

    @GetMapping("/getBook")
    public String bookWithHighestPage(){
        return bookService.bookWithHighestPage();
    }

    @PutMapping("/updateBook")
    public String updateBook(@PathVariable("bookName") String bookName, @PathVariable("pages") int pages){
        return bookService.updateBook(bookName,pages);
    }

    @GetMapping("/getAuthor")
    public Author authorWithHighestPage(){
        return bookService.authorWithHighestPage();
    }
}
