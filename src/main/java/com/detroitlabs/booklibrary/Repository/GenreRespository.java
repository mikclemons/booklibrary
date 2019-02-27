package com.detroitlabs.booklibrary.Repository;

import com.detroitlabs.booklibrary.Model.Genre;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GenreRespository {

    private static List<Genre> allGenres = Arrays.asList(
            new Genre("Childrens", 1),
            new Genre("Non Fiction", 2),
            new Genre("Graphic Novels", 3),
            new Genre("Fiction", 4));


    public List<Genre> getAllGenres(){
        return allGenres;
    }

    public Genre findGenreById(int id) {
        for (Genre genre: allGenres) {
            if(genre.getGenreId() == id){
                return genre;
            }
        }
        return null;
    }
}
