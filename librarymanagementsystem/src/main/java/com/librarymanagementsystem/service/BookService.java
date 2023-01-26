package com.librarymanagementsystem.service;

import com.librarymanagementsystem.Entity.Book;
import com.librarymanagementsystem.dto.BookDTO;

public interface BookService {
  Book saveBook(BookDTO bookDTO);
//  String updateBook(BookDTO bookDTO);
  //String deleteBook(int id);
  //Book getBookById(int id);
}
