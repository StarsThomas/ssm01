package com.thomas.vo;

import java.util.Date;

public class FilmDetailVo {
    private String filmId;
    private String name;
    private String director;
    private Integer length;
    private String type;
    private String introduction;
    private String country;
    private String lan;
    private String imgPath;
    private Date displayTime;

    public FilmDetailVo() {
    }

    public FilmDetailVo(String filmId, String name, String director, Integer length, String type, String introduction, String country, String lan) {
        this.filmId = filmId;
        this.name = name;
        this.director = director;
        this.length = length;
        this.type = type;
        this.introduction = introduction;
        this.country = country;
        this.lan = lan;
    }

    public Date getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(Date displayTime) {
        this.displayTime = displayTime;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }
}
