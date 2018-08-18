package com.example.android.tourguideapp;

public class Place {

    private String name;
    private String location;
    private int imageResourceId;

    public Place(String name, String location, int imageResourceId) {
        this.name = name;
        this.location = "Nearest Metro: " + location;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
