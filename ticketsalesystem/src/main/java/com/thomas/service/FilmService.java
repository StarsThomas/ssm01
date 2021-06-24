package com.thomas.service;

import com.thomas.vo.FilmDetailVo;
import com.thomas.vo.FilmVo;
import org.springframework.stereotype.Service;

import java.util.List;



public interface FilmService {
    List<FilmVo> selectAll();

    FilmDetailVo selectFilmById(String film_id);

}
