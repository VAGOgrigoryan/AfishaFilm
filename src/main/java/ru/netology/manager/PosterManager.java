package ru.netology.manager;

import ru.netology.domain.MoviePurchase;

public class PosterManager {
    private MoviePurchase[] tapes = new MoviePurchase[0];
    private int filmLimit = 10;

    public PosterManager() {
    }

    public PosterManager(int filmLimit) {
        if (filmLimit <= 0) {
            return;
        }
        this.filmLimit = filmLimit;
    }

    public void addMovie(MoviePurchase tape) {
        int length = tapes.length + 1;
        MoviePurchase[] tmp = new MoviePurchase[length];
        System.arraycopy(tapes, 0, tmp, 0, tapes.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = tape;
        tapes = tmp;
    }

    public MoviePurchase[] getAll() {
        int resultLength;
        if (tapes.length > filmLimit) {
            resultLength = filmLimit;
        } else {
            resultLength = tapes.length;
        }
        MoviePurchase[] result = new MoviePurchase[resultLength];
        for (int i = 0; i < result.length; i++) {
            if (tapes.length > filmLimit) {
                int index = resultLength - i - 1 + (tapes.length - filmLimit);
                result[i] = tapes[index];
            } else {
                int index = resultLength - i - 1;
                result[i] = tapes[index];
            }
        }
        return result;
    }
}