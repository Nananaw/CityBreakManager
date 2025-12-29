package com.example.city.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.city.domain.City;
import com.example.city.domain.Trip;

@Repository
public class CityRepository {
    private final Map<Integer, City> cities;
    private final Map<Integer, Trip> trips;

    public CityRepository() {
        cities = new HashMap<>();
        trips = new HashMap<>();
    }

    public City saveCity(City city) {
        cities.put(city.getId(), city);
        return city;
    }

    public Trip saveTrip(Trip trip) {
        trips.put(trip.getId(), trip);
        return trip;
    }

    public City updateCity(int id, City updatedCity) {
        if (cities.containsKey(id)) {
            updatedCity.setId(id);
            cities.put(id, updatedCity);
            return updatedCity;
        }
        return null;
    }

    public Trip updateTrip(int id, Trip updatedTrip) {
        if (trips.containsKey(id)) {
            updatedTrip.setId(id);
            trips.put(id, updatedTrip);
            return updatedTrip;
        }
        return null;
    }

    public void deleteCityById(int id) {
        cities.remove(id);
    }

    public void deleteTripById(int id) {
        trips.remove(id);
    }

    public City findCityById(int id) {
        return cities.get(id);
    }

    public Trip findTripById(int id) {
        return trips.get(id);
    }

    public List<City> findAllCities() {
        return new ArrayList<>(cities.values());
    }

    public List<Trip> findAllTrips() {
        return new ArrayList<>(trips.values());
    }
}
