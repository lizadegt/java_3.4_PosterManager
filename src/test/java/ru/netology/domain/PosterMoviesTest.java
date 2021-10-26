package ru.netology.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterMoviesTest {
    @Test
    public void setID() {
        PosterMovies movies = new PosterMovies();
        movies.setId(1);
        assertEquals(1, movies.getId());
    }

    @Test
    public void giveMovieName() {
        PosterMovies movies = new PosterMovies();
        String expected = "Avatar";
        assertNull(movies.getMovieName());
        movies.setMovieName(expected);
        assertEquals(expected, movies.getMovieName());
    }

    @Test
    public void giveMovieGenre() {
        PosterMovies movies = new PosterMovies();
        String expected = "comedy";
        assertNull(movies.getMovieGenre());
        movies.setMovieGenre(expected);
        assertEquals(expected, movies.getMovieGenre());
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
    }

    @Test
    void getMovieName() {
    }

    @Test
    void getMovieGenre() {
    }

    @Test
    void setId() {
    }

    @Test
    void setMovieName() {
    }

    @Test
    void setMovieGenre() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void canEqual() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}