package com.wang.mapper;

import com.wang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加书籍
    int addBook(Books books);
    //删除书籍
    int deleteBook(@Param("bookId") int id);
    //更新书籍
    int updateBook(Books books);
    //查询书籍
    Books queryBooksById(@Param("bookId") int id);
    List<Books> queryAllBooks();
}
