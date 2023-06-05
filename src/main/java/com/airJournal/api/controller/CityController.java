package com.airJournal.api.controller;

import com.airJournal.api.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//city list //author
@RestController
@RequestMapping
public class CityController {

    private CityRepo cityRepo;

    @Autowired
    public void setCityRepo(CityRepo cityRepo) {this.cityRepo = cityRepo; }

    @GetMapping(path = "/hello-world")
    public String helloWorld() {return "helloWorld";}
}
