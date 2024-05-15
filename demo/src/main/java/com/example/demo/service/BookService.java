package com.example.demo.service;

import com.example.firstspring.entity.Book;
import com.example.firstspring.pojo.BookPojo;

import java.util.List;

public interface BookService {
    public void saveBook(BookPojo bookPojo);

    public List<Book> findAll();

    public void delete(Integer id);

    public void update(BookPojo bookPojo);

    public BookPojo findById(Integer id);
}
}
