package com.graphql.learn.graphqlproject.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.graphql.learn.graphqlproject.entities.Book;

public interface BookService {
    //Create
    Book create(Book book);

    // get all
    List<Book> getAll();

    // get single book
    Book get(int bookId);
}
