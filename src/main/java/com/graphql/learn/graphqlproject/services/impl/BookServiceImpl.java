package com.graphql.learn.graphqlproject.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.graphql.learn.graphqlproject.entities.Book;
import com.graphql.learn.graphqlproject.repositories.BookRep;
import com.graphql.learn.graphqlproject.services.BookService;

@Service
@Component
public class BookServiceImpl implements BookService {

    private BookRep bookRep;

    @Autowired
    public BookServiceImpl(BookRep bookRep) {
        this.bookRep = bookRep;
    }

    @Override
    public Book create(Book book) {
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(()-> new RuntimeException("Book you are looking for not found on server!!!"));
    }
    
}
