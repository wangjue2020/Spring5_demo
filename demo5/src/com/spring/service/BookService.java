package com.spring.service;

import com.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="bookService")
public class BookService {
    @Autowired
    private BookDao bookDao;
}
