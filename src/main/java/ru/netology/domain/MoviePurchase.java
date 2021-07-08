package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoviePurchase {
    private int id;
    private int filmId;
    private String name;
    private String genre;
    private String moviePicture;
}
