package com.example.city.domain;

import java.time.LocalDate;

public class Trip {
    private int id;
    private int cityId;
    private LocalDate startDate;
    private LocalDate endDate;
    private int rating;
    private String personalNotes;

    public Trip(int id, int cityId, LocalDate startDate, LocalDate endDate, int rating, String personalNotes) {
        this.id = id;
        this.cityId = cityId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rating = rating;
        this.personalNotes = personalNotes;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
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

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPersonalNotes(String personalNotes) {
        this.personalNotes = personalNotes;
    }
}
