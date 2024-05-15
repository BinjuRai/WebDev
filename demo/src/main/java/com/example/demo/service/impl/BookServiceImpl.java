package com.example.demo.service.impl;


import com.example.demo.entity.Book;
import com.example.demo.entity.Ground;
import com.example.demo.entity.User;
import com.example.demo.pojo.BookPojo;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.GroundRepository;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final UserRepository userRepository;
    private final GroundRepository groundRepository;
    private final BookRepository bookRepository;

    @Override
    public void saveBook(BookPojo bookPojo) {
        Book book = new Book();
        book.setId(bookPojo.getId());
        book.setBookDate(bookPojo.getBookDate());
        book.setBookStatus(bookPojo.getBookStatus());
        book.getBookTime();
        User user = userRepository.findById(bookPojo.getUser_id()).get();
        book.setUser(user);
        Ground ground = groundRepository.findById(bookPojo.getGround_id()).get();
        book.setGround(ground);
        bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return (bookRepository.findAll());
    }

    @Override
    public void delete(Integer id){
        bookRepository.deleteById(id);
    }

    @Override
    public void update(BookPojo bookPojo) {
        Book book = new Book();
        book.setId(bookPojo.getId());
        book.setBookDate(bookPojo.getBookDate());
        book.setBookStatus(bookPojo.getBookStatus());
        book.getBookTime();
        User user = userRepository.findById(bookPojo.getUser_id()).get();
        book.setUser(user);
        Ground ground = groundRepository.findById(bookPojo.getGround_id()).get();
        book.setGround(ground);
        bookRepository.save(book);
    }

    @Override
    public BookPojo findById(Integer id){
        Book book = bookRepository.findById(id).get();
        BookPojo bookPojo = new BookPojo();
        bookPojo.setId(book.getId());
        bookPojo.setBookDate(book.getBookDate());
        bookPojo.setBookStatus(book.getBookStatus());
        bookPojo.setBookTime(book.getBookTime());
        return bookPojo;
    }


}