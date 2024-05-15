package com.example.demo.service;

import com.example.demo.pojo.BookProj;
import com.example.firstspring.entity.Book;
import com.example.firstspring.pojo.BookPojo;

import java.util.List;

public interface BookService {
    Integer saveBook(BookPojo bookPojo);

    List<BookProj> findAll();
    List<Book> findAll2();

    Book findById(Integer id);

    void deleteById(Integer id);

}
