package com.airJournal.api.controller;

import com.airJournal.api.model.Activity;
import com.airJournal.api.repository.ActivityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(ActivitiesController.class)
public class ActivitiesControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ActivityRepo activityRepo;

    Activity activity1 = new Activity(1L," Clear Kayaking", "paddling a small craft through water, the boat is clear so that you can see down below you.");
    Activity activity2 = new Activity(2L,"Hot Air Balloon", "The pilot will apply heat to make the balloon slowly rise off the ground.");
    Activity activity3 = new Activity(3L,"Camel Riding", "Riding camels on the beach, beautiful views");


}