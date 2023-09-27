package com.graphql.learn.graphqlproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphql.learn.graphqlproject.entities.Book;
import com.graphql.learn.graphqlproject.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController_Old {
    @Autowired
    private BookService bookService;
    // create

    @PostMapping()
    public Book create( @RequestBody Book book){
        return this.bookService.create(book);
    }

    @GetMapping
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    @GetMapping("/{bookId}")
    public Book get( @PathVariable int bookId){
        return this.bookService.get(bookId);
    }
}
