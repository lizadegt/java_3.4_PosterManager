package ru.netology.domain;

public class PosterMovies {
    private int id;
    private String movieName;
    private String movieGenre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public PosterMovies() {};

    public PosterMovies(int id, String movieName, String movieGenre) {
        this.id = id;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
    }
}