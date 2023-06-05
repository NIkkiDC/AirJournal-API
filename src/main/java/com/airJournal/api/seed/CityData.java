package com.airJournal.api.seed;

import com.airJournal.api.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CityData implements CommandLineRunner {

    @Autowired
    CityRepo cityRepo;

    @Override
    public void run(String... args) throws Exception {
        dataForCity();
    }

    private void dataForCity() {
        if(cityRepo.count() == 0) {

        }
    }
}
