package com.thomas.dao;

import com.thomas.domain.Film;

import java.util.List;


public interface FilmDao {
    List<Film> selectAll();

    Film selectFilmById(String film_id);
}
