package com.progtech.opinionleaders.ui.leaders;

public class LeaderProfile {
    private String name;
    private String surname;
    private int image;

    public LeaderProfile(String name, String surname, int image){

        this.name=name;
        this.surname = surname;
        this.image = image;
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

    public void setSurname(String company) {
        this.surname = company;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
