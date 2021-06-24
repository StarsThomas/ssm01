package com.thomas.domain;

public class User {
    private String id;
    private String uName;
    private String sex;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", uName='" + uName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public User() {
    }

    public User(String id, String uName, String sex) {
        this.id = id;
        this.uName = uName;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
