package com.detroitlabs.booklibrary.Repository;

import com.detroitlabs.booklibrary.Model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {

   private static List<Book> allBooks = Arrays.asList(
           new Book("Green Eggs and Ham", "Dr.Seuss", 1,false),
           new Book("Hidden Figures", "Margot Lee Shetterly", 2,true),
           new Book("The Sandman", "Neil Gaiman", 3,false));


    public List<Book> getAllBooks(){
        return allBooks;
    }

}