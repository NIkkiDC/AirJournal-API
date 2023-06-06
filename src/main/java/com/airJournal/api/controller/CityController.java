package com.airJournal.api.controller;
import com.airJournal.api.model.City;
import com.airJournal.api.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//city list //author
@RestController
@RequestMapping(path = "/api")
public class CityController {

    @Autowired
    private CityRepo cityRepo;

    /**
     * retrieves a list of cities when a GET request is made to the "/city" path.
     * @return a list of cities
     */

    @GetMapping(path = "/city") // one city
    public List<City> getAllCities() {return cityRepo.findAll();}

    /**
     * Returning the city by the cities Id.
     * findById() method takes the cityId as an argument and returns an Optional<City> object.
     *  the .get() method is called on the Optional object to retrieve the actual City object if it exists.
     * @param cityId
     * @return
     */

    @GetMapping(path = "/city/{cityId}")
    public City getCityById(@PathVariable Long cityId) {return cityRepo.findById(cityId).get();}




}
