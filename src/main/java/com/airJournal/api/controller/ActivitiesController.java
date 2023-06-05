package com.airJournal.api.controller;

import com.airJournal.api.model.Activity;
import com.airJournal.api.model.City;
import com.airJournal.api.repository.ActivityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//book controller
@RestController
@RequestMapping("/api")
public class ActivitiesController {

    @Autowired
   private ActivityRepo activityRepo;

    @GetMapping("/activities/cityId") // one activity
    public List<Activity> getAllActivities() {return activityRepo.findAll(); }


}
