package com.detroitlabs.booklibrary.Repository;

import com.detroitlabs.booklibrary.Model.Book;
import com.detroitlabs.booklibrary.Model.Genre;
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
           new Book("The Sandman", "Neil Gaiman", 3,false),
           new Book("Educated A Memoir", "Tara Westover", 2, false),
           new Book("Joe the Barbarian", "Grant Morrison", 3, false),
           new Book("The Very Hungry Caterpillar", "Eric Carle", LocalDate.of(2019,2,11),
                   1,true),
           new Book("Alices Adventures in Wonderland", "Lewis Carrol",
                   LocalDate.of(2019,2,01),4,true)
   );


    public Book updateCheckoutStatus(String title){

        for(int i = 0; i <allBooks.size(); i++){
            if(allBooks.get(i).getTitle().equalsIgnoreCase(title)){
               allBooks.get(i).setCheckedOut(true);
                return allBooks.get(i);
            }
        }
        return null;
    }

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

    public List<Book> findByGenreId(int id){
        List<Book> booksInGenre = new ArrayList<>();
        for (Book book: allBooks) {
            if(book.getGenre() == id){
                booksInGenre.add(book);
            }
        }
        return booksInGenre;
    }

    public List<Book> findAvailableBooks(){
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : allBooks) {
            if(!book.isCheckedOut()){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}

