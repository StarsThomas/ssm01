package com.thomas.vo;

public class FilmVo {

    private String film_id;
    private String director;
    private String film_name;
    private String players;
    private String introduction;
    private String film_path;
    private String film_type;



    public FilmVo() {
    }

    public FilmVo(String film_id, String director, String film_name, String players, String introduction, String film_path, String film_type) {
        this.film_id = film_id;
        this.director = director;
        this.film_name = film_name;
        this.players = players;
        this.introduction = introduction;
        this.film_path = film_path;
        this.film_type = film_type;
    }

    public String getFilm_type() {
        return film_type;
    }

    public void setFilm_type(String film_type) {
        this.film_type = film_type;
    }

    public String getFilm_path() {
        return film_path;
    }

    public void setFilm_path(String film_path) {
        this.film_path = film_path;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
