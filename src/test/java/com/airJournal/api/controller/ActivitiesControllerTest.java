package com.airJournal.api.controller;

import com.airJournal.api.model.Activity;
import com.airJournal.api.repository.ActivityRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ActivitiesController.class)
public class ActivitiesControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ActivityRepo activityRepo;

    Activity activity1 = new Activity(1L,"Camel Riding", "Riding camels on the beach, beautiful views");
    Activity activity2 = new Activity(2L,"Hot Air Balloon", "The pilot will apply heat to make the balloon slowly rise off the ground.");
    Activity activity3 = new Activity(3L,"Parasailing","the recreational activity of gliding through the air wearing an open parachute while being towed by a motorboat.");

    @Test
    public void getAllActivities_success() throws Exception {
        List<Activity> activities = new ArrayList<>(Arrays.asList(activity1,activity2,activity3));

        when(activityRepo.findAll()).thenReturn(activities); // testing activity repo
        mockMvc.perform(MockMvcRequestBuilders // this is testing the end point
                .get("/api/activities/cityId")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",notNullValue()))
                .andDo(print());
    }

    @Test
    public void getActivityById_success() throws Exception {
        when(activityRepo.findById(anyLong())).thenReturn(Optional.ofNullable(activity1));
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/activities/{activitiesId}", 1L)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andDo(print());
    }

}