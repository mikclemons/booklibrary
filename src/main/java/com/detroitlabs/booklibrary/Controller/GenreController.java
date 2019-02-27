package com.detroitlabs.booklibrary.Controller;

import com.detroitlabs.booklibrary.Model.Book;
import com.detroitlabs.booklibrary.Model.Genre;
import com.detroitlabs.booklibrary.Repository.BookRepository;
import com.detroitlabs.booklibrary.Repository.GenreRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GenreController {

    @Autowired
    private GenreRespository genreRespository;

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/genres")
    public String displayAllGenres(ModelMap modelMap) {
        List<Genre> allGenres = genreRespository.getAllGenres();
        modelMap.put("genres", allGenres);
        return "genres";
    }

    @RequestMapping("/genre/{id}")
    public String showAllBooksInGenre(ModelMap modelMap, @PathVariable int id){
        Genre genre = genreRespository.findGenreById(id);
        modelMap.put("genre", genre);
        List<Book> booksInGenre = bookRepository.findByGenreId(id);
        modelMap.put("booksInGenre", booksInGenre);
        return "genre";
    }





}
