package com.wang.service;

import com.wang.pojo.Books;

import java.util.List;

public interface BookService {
    //增加书籍
    int addBook(Books books);
    //删除书籍
    int deleteBook(int id);
    //更新书籍
    int updateBook(Books books);
    //查询书籍
    Books queryBooksById(int id);
    List<Books> queryAllBooks();
}
