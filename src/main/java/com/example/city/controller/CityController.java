package com.example.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.city.domain.City;
import com.example.city.domain.Trip;
import com.example.city.service.CityService;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> getAllCities() {
        return cityService.findAllCities();
    }

    @GetMapping("/trips")
    public List<Trip> getAllTrips() {
        return cityService.findAllTrips();
    }

    @GetMapping("/cities/{id}")
    public ResponseEntity<City> getCityById(@PathVariable int id) {
        return cityService.findCityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/trips/{id}")
    public ResponseEntity<Trip> getTripById(@PathVariable int id) {
        return cityService.findTripById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/cities")
    public City createCity(@RequestBody City city) {
        return cityService.createCity(city);
    }

    @PostMapping("/trips")
    public ResponseEntity<Trip> createTrip(@RequestBody Trip trip) {
        return cityService.createTrip(trip)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/cities/{id}")
    public ResponseEntity<City> updateCity(@PathVariable int id, @RequestBody City updatedCity) {
        City city = cityService.updateCity(id, updatedCity);
        if (city == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(city);
    }

    @PutMapping("/trips/{id}")
    public ResponseEntity<Trip> updateTrip(@PathVariable int id, @RequestBody Trip updatedTrip) {
        Trip trip = cityService.updateTrip(id, updatedTrip);
        if (trip == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(trip);
    }

    @DeleteMapping("/cities/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable int id) {
        cityService.deleteCityById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/trips/{id}")
    public ResponseEntity<Void> deleteTrip(@PathVariable int id) {
        cityService.deleteTripById(id);
        return ResponseEntity.noContent().build();
    }
}
