package com.example.city.domain;

import java.util.Date;

public class Trip {
    private int id;
    private City city;
    private Date startDate;
    private Date endDate;
    private int rating;
    private String personalNotes;

    public Trip(int id, City city, Date startDate, Date endDate, int rating, String personalNotes) {
        this.id = id;
        this.city = city;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rating = rating;
        this.personalNotes = personalNotes;
    }

    public int getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getRating() {
        return rating;
    }

    public String getPersonalNotes() {
        return personalNotes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPersonalNotes(String personalNotes) {
        this.personalNotes = personalNotes;
    }
}
