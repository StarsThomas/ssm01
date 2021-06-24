package com.thomas.domain;

import java.util.Date;

public class Film {
    private long id;
    private String film_id;
    private String director;
    private String film_name;
    private String player;
    private String country;
    private String film_language;
    private Integer film_length;
    private Date display_time;
    private String imgs_path;
    private String film_introduction;
    private String film_type;

    public Film() {
    }

    public Film(long id, String film_id, String director, String film_name, String player, String country, String film_language, Integer film_length, Date display_time, String imgs_path, String film_introduction, String film_type) {
        this.id = id;
        this.film_id = film_id;
        this.director = director;
        this.film_name = film_name;
        this.player = player;
        this.country = country;
        this.film_language = film_language;
        this.film_length = film_length;
        this.display_time = display_time;
        this.imgs_path = imgs_path;
        this.film_introduction = film_introduction;
        this.film_type = film_type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFilm_language() {
        return film_language;
    }

    public void setFilm_language(String film_language) {
        this.film_language = film_language;
    }

    public Integer getFilm_length() {
        return film_length;
    }

    public void setFilm_length(Integer film_length) {
        this.film_length = film_length;
    }

    public Date getDisplay_time() {
        return display_time;
    }

    public void setDisplay_time(Date display_time) {
        this.display_time = display_time;
    }

    public String getImgs_path() {
        return imgs_path;
    }

    public void setImgs_path(String imgs_path) {
        this.imgs_path = imgs_path;
    }

    public String getFilm_introduction() {
        return film_introduction;
    }

    public void setFilm_introduction(String film_introduction) {
        this.film_introduction = film_introduction;
    }

    public String getFilm_type() {
        return film_type;
    }

    public void setFilm_type(String film_type) {
        this.film_type = film_type;
    }
}
