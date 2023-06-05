package com.airJournal.api.controller;

import com.airJournal.api.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//book controller
@RestController
@RequestMapping("/api")
public class ActivitiesController {

    @GetMapping("activities")
    public List<Activity> getAllActivities() {return acti }
}
