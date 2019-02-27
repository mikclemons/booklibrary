package com.detroitlabs.booklibrary.Repository;

import com.detroitlabs.booklibrary.Model.Book;
import org.springframework.stereotype.Component;

import java.security.AllPermission;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {

   private static List<Book> allBooks = Arrays.asList(
           new Book("Green Eggs and Ham", "Dr.Seuss", 1,false),
           new Book("Hidden Figures", "Margot Lee Shetterly", LocalDate.of(2019,04,04), 2,true),
           new Book("The Sandman", "Neil Gaiman", 3,false));


    public List<Book> getAllBooks(){
        return allBooks;
    }

    public Book findByTitle(String title) {
        for (Book book: allBooks) {
            if(book.getTitle().contains(title)){
                return book;
            }
        }
        return null;
    }

}

