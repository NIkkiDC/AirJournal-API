package com.airJournal.api.seed;

import com.airJournal.api.model.Activity;
import com.airJournal.api.model.City;
import com.airJournal.api.repository.ActivityRepo;
import com.airJournal.api.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * CommandLineRunner interface provides a way to run specific code after the application context has been initialized.
 * This method is called automatically when the application starts, and it allows you to execute custom logic or tasks.
 */

@Component
public class ActivityData implements CommandLineRunner {

    /**
     * 21 The @Autowired automatic dependency injection
     * 22 retrieve activity data, save new activities, update existing activities, or delete activities.
     */

    @Autowired
    ActivityRepo activityRepo;

    @Autowired
    CityRepo cityRepo;

    /**
     * @param args the method will accept a variable number of arguments
     * @throws Exception
     */

    @Override // annotation is used to indicate that the method is meant to override a method in a superclass or implement an interface method.
    public void run(String... args) throws Exception {
        dataForActivity();
    }
    private void dataForActivity () {
        if (activityRepo.count() == 0 || cityRepo.count() == 0) {
            City city1 = new City(1L, "Nairobi", "Nairobi is the capital and largest city of Kenya. The name is derived from the Maasai phrase Enkare Nairobi.");
            City city2 = new City(2L, "Mombasa", "Mombasa is a coastal city in southeastern Kenya along the Indian Ocean. It was the first capital of British East Africa." );
            City city3 = new City(3L, "Masai Mara", "Maasai Mara National Reserve is an area of preserved savannah wilderness in southwestern Kenya, along the Tanzanian border.");
            City city4 = new City(4L, "Grand Baie", "Grand-Baie is a village in northern Mauritius. Its sandy beaches include secluded La Cuvette, and sailboat-dotted Grand-Baie Public Beach." );
            City city5 = new City(5L, "Mahé", "Mahé is the largest island in the Seychelles archipelago, in the Indian Ocean off East Africa.The island is also home to Victoria, Seychelles' capital." );

            Activity activity1 = new Activity(1L," Clear Kayaking", "paddling a small craft through water, the boat is clear so that you can see down below you.");
            Activity activity2 = new Activity(2L,"Hot Air Balloon", "The pilot will apply heat to make the balloon slowly rise off the ground.");
            Activity activity3 = new Activity(3L,"Camel Riding", "Riding camels on the beach, beautiful views");
            Activity activity4 = new Activity(4L,"Parasailing","the recreational activity of gliding through the air wearing an open parachute while being towed by a motorboat.");
            Activity activity5 = new Activity(5L,"Helicopter ride","Explore Seychelles Islands from above on a helicopter tour organized by Adventure Life." );
            activity1.setCity(city1);
            activity2.setCity(city2);
            activity3.setCity(city3);
            activity4.setCity(city4);
            cityRepo.save(city1);
            cityRepo.save(city2);
            cityRepo.save(city3);
            cityRepo.save(city4);
            cityRepo.save(city5);

            activityRepo.save(activity1);
            activityRepo.save(activity2);
            activityRepo.save(activity3);
            activityRepo.save(activity4);
            activityRepo.save(activity5);

        }
    }
}
