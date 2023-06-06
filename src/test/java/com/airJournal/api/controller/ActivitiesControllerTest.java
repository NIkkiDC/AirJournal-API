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



}