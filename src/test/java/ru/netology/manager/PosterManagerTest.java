package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterMovies;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {

    @Test
    public void addFirstMovies() {
        PosterManager manager = new PosterManager();
        PosterMovies first = new PosterMovies(1, "first", "drama");
        PosterMovies second = new PosterMovies(2, "second", "thriller");
        manager.addMovie(first);
        manager.addMovie(second);

        PosterMovies[] actual = manager.getAllMovies();
        PosterMovies[] expected = new PosterMovies[]{second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFourMovies() {
        PosterManager manager = new PosterManager(4);
        PosterMovies first = new PosterMovies(1, "first", "drama");
        PosterMovies second = new PosterMovies(2, "second", "thriller");
        PosterMovies third = new PosterMovies(3, "third", "horrors");
        PosterMovies four = new PosterMovies(4, "four ", "horrors");
        PosterMovies five = new PosterMovies(5, "five", "horrors");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(four);
        manager.addMovie(five);

        PosterMovies[] actual = manager.getMovies();
        PosterMovies[] expected = new PosterMovies[]{five, four, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllMovie() {
        PosterManager manager = new PosterManager(2);
        PosterMovies first = new PosterMovies(1, "first", "drama");
        PosterMovies second = new PosterMovies(2, "second", "thriller");
        manager.addMovie(first);
        manager.addMovie(second);
        PosterMovies[] actual = manager.getMovies();
        PosterMovies[] expected = new PosterMovies[]{second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void limitMoreThanMovies() {
        PosterManager manager = new PosterManager(6);
        PosterMovies first = new PosterMovies(1, "first", "drama");
        PosterMovies second = new PosterMovies(2, "second", "thriller");
        PosterMovies third = new PosterMovies(3, "third", "horrors");
        PosterMovies four = new PosterMovies(4, "four ", "horrors");
        PosterMovies five = new PosterMovies(5, "five", "horrors");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(four);
        manager.addMovie(five);

        PosterMovies[] actual = manager.getMovies();
        PosterMovies[] expected = new PosterMovies[]{five, four, third, second, first};

        assertArrayEquals(expected, actual);
    }
}
