package ru.netology.manager;

import ru.netology.domain.PosterMovies;

public class PosterManager {
    public PosterMovies[] movies = new PosterMovies[0];
    private int numberFilms = 10;

//    public PosterManager(PosterMovies[] movies) {
//    }

    public PosterManager() {
    }

    public PosterManager(int numberFilms) {
        this.numberFilms = numberFilms;
    }

    public void addMovie(PosterMovies movie) {
        int length = movies.length + 1;
        PosterMovies[] tmp = new PosterMovies[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public PosterMovies[] getAllMovies() {
        PosterMovies[] result = new PosterMovies[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public PosterMovies[] getMovies() {
        PosterMovies[] result = new PosterMovies[numberFilms];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}