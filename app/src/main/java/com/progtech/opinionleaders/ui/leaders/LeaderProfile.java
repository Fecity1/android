package com.progtech.opinionleaders.ui.leaders;

public class LeaderProfile {
    private String name;
    private String surname;
    private String second_name;
    private int image;
    private String city;
    private String about;
    private Integer rating;

    public LeaderProfile(String name, String surname, String second_name, int image, String city,
                         String about, Integer rating) {

        this.name = name;
        this.surname = surname;
        this.second_name = second_name;
        this.image = image;
        this.city = city;
        this.about = about;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getSecondName() {
        return second_name;
    }

    public void setSecondName(String second_name) {
        this.second_name = second_name;
    }
}
