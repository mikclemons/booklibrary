package com.detroitlabs.booklibrary.Model;

public class Genre {

    private String genre;
    private int genreId;

    public Genre(String genre, int genreId) {
        this.genre = genre;
        this.genreId = genreId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }
}
