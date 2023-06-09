package com.airJournal.api.controller;

import com.airJournal.api.model.City;
import com.airJournal.api.repository.CityRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
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

@WebMvcTest(CityController.class)
public class CityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    CityRepo cityRepo;

    City city1 = new City(1L, "Mombasa", "Mombasa is a coastal city in southeastern Kenya along the Indian Ocean. It was the first capital of British East Africa." );
    City city2 = new City(2L, "Masai Mara", "Maasai Mara National Reserve is an area of preserved savannah wilderness in southwestern Kenya, along the Tanzanian border.");
    City city3 = new City(3L, "Grand Baie", "Grand-Baie is a village in northern Mauritius. Its sandy beaches include secluded La Cuvette, and sailboat-dotted Grand-Baie Public Beach." );

    @Test
    public void getAllCities_success() throws Exception {
        List<City> cities = new ArrayList<>(Arrays.asList(city1, city2, city3));

        Mockito.when(cityRepo.findAll()).thenReturn(cities); // this is testing the repository
        mockMvc.perform(MockMvcRequestBuilders // this is testing the end point
                .get("/api/city")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",notNullValue()))
                .andDo(print());
    }
    @Test
    public void getCityById_success() throws Exception {
        when(cityRepo.findById(anyLong())).thenReturn(Optional.ofNullable(city1));
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/api/city/{cityId}", 1L)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andDo(print());
    }
}

