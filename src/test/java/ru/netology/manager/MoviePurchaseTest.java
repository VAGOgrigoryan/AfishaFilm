package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePurchase;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MoviePurchaseTest {
    private MoviePurchase manager = new MoviePurchase();
    private MoviePurchase movie1 = new MoviePurchase(1, 11, "Бладшот", "Боевик", "URL");
    private MoviePurchase movie2 = new MoviePurchase(2, 22, "Вперед", "Мультфильм", "URL");
    private MoviePurchase movie3 = new MoviePurchase(3, 33, "Отель Белград", "Комедия", "URL");
    private MoviePurchase movie4 = new MoviePurchase(4, 44, "Джентльмены", "Боевик", "URL");
    private MoviePurchase movie5 = new MoviePurchase(5, 55, "Человек-невидимка", "Ужасы", "URL");
    private MoviePurchase movie6 = new MoviePurchase(6, 66, "Тролли. Мировой тур", "Мультфильм", "URL");
    private MoviePurchase movie7 = new MoviePurchase(7, 77, "Номер один", "Комедия", "URL");
    private MoviePurchase movie8 = new MoviePurchase(8, 88, "Мстители", "Фантастика", "URL");
    private MoviePurchase movie9 = new MoviePurchase(9, 99, "Форсаж 100", "Фантастика", "URL");
    private MoviePurchase movie10 = new MoviePurchase(10, 100, "50 оттенков серого", "Мелодрама", "URL");


    @Test
    public void showingTheLast5FilmsInReverseOrder() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        MoviePurchase[] actual = manager.getAll();
        MoviePurchase[] expected = new MoviePurchase[]{movie10, movie9, movie8, movie7, movie6};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addAllMoviesToTheFeed() {
        PosterManager manager = new PosterManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        MoviePurchase[] actual = manager.getAll();
        MoviePurchase[] expected = new MoviePurchase[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxAmount() {
        PosterManager manager = new PosterManager(5);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        MoviePurchase[] actual = manager.getAll();
        MoviePurchase[] expected = new MoviePurchase[]{movie10, movie9, movie8, movie7, movie6,};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowMinusMovie() {
        PosterManager manager = new PosterManager(-1);

        MoviePurchase[] actual = manager.getAll();
        MoviePurchase[] expected = new MoviePurchase[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void mustAdd9Films() {
        PosterManager manager = new PosterManager(9);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        MoviePurchase[] actual = manager.getAll();
        MoviePurchase[] expected = new MoviePurchase[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addAMovieToTheFeed() {
        PosterManager manager = new PosterManager(1);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        MoviePurchase[] actual = manager.getAll();
        MoviePurchase[] expected = new MoviePurchase[]{movie10};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void tapeWithTheNumberOfFilms0() {
        PosterManager manager = new PosterManager(0);

        MoviePurchase[] actual = manager.getAll();
        MoviePurchase[] expected = new MoviePurchase[]{};

        assertArrayEquals(expected, actual);
    }
}
