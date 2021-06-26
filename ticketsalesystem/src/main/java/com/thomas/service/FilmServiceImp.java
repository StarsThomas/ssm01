package com.thomas.service;

import com.thomas.dao.FilmDao;
import com.thomas.domain.Film;
import com.thomas.vo.FilmDetailVo;
import com.thomas.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImp implements FilmService{

    @Autowired
    private FilmDao filmDao;

    @Override
    public List<FilmVo> selectAll() {
        List<Film> filmList = filmDao.selectAll();
        System.out.println("电影数量:"+filmList.size());
        List<FilmVo> filmVos =  new ArrayList<>();
        for (Film film : filmList) {
            FilmVo filmVo = new FilmVo();
            filmVo.setFilm_id(film.getFilm_id());
            filmVo.setFilm_name(film.getFilm_name());
            filmVo.setFilm_type(film.getFilm_type());
            filmVo.setFilm_path(film.getImgs_path());
            filmVo.setDirector(film.getDirector());
            filmVo.setIntroduction(film.getFilm_introduction());
            filmVo.setPlayers(film.getPlayer());
            filmVos.add(filmVo);
        }


      return filmVos;
    }

    @Override
    public FilmDetailVo selectFilmById(String film_id) {
       FilmDetailVo detailVo = new FilmDetailVo();
       Film film = filmDao.selectFilmById(film_id);
       detailVo.setDirector(film.getDirector());
       detailVo.setFilmId(film_id);
       detailVo.setIntroduction(film.getFilm_introduction());
       detailVo.setCountry(film.getCountry());
       detailVo.setName(film.getFilm_name());
       detailVo.setType(film.getFilm_type());
       detailVo.setLan(film.getFilm_language());
       detailVo.setLength(film.getFilm_length());
       detailVo.setImgPath(film.getImgs_path());
       detailVo.setDisplayTime(film.getDisplay_time());
       return detailVo;
    }
}
