package com.detroitlabs.booklibrary.Controller;


import com.detroitlabs.booklibrary.Model.Book;
import com.detroitlabs.booklibrary.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/")
    public String showHomePage(ModelMap modelMap){
        List<Book> allBooks = bookRepository.getAllBooks();
        modelMap.put("books", allBooks);


        return "home";
    }

    @RequestMapping("/book/{title}")
    public String bookDetailsPage(ModelMap modelMap,@PathVariable String title){
        Book book = bookRepository.findByTitle(title);
        modelMap.put("book", book);
        return "bookdetails";
    }

    @RequestMapping("/available/")
    public String showAvailableBooks(ModelMap modelMap){
        List<Book> availableBooks = bookRepository.findAvailableBooks();
        modelMap.put("books", availableBooks);
        return "availablebooks";
    }

}
