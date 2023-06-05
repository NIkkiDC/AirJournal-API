package com.airJournal.api.seed;

import com.airJournal.api.model.City;
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
            City city1 = new City(1L, "Nairobi", "Nairobi is the capital and largest city of Kenya. The name is derived from the Maasai phrase Enkare Nairobi.");
            City city2 = new City(2L, "Mombasa", "Mombasa is a coastal city in southeastern Kenya along the Indian Ocean. It was the first capital of British East Africa." );
            City city3 = new City(3L, "Masai Mara", "Maasai Mara National Reserve is an area of preserved savannah wilderness in southwestern Kenya, along the Tanzanian border.");
            City city4 = new City(4L, "Grand Baie", "Grand-Baie is a village in northern Mauritius. Its sandy beaches include secluded La Cuvette, and sailboat-dotted Grand-Baie Public Beach." );




        }
    }
}
