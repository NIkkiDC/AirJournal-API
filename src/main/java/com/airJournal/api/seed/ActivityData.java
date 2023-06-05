package com.airJournal.api.seed;

import com.airJournal.api.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

    /**
     * @param args the method will accept a variable number of arguments
     * @throws Exception
     */

    @Override // annotation is used to indicate that the method is meant to override a method in a superclass or implement an interface method.
    public void run(String... args) throws Exception {
        dataForActivity();
    }
    private void dataForActivity () {
        if (activityRepo.count() == 0) {
            Activity activity1 = new Activity(" Clear Kayaking", "paddling a small craft through water, the boat is clear so that you can see down below you.");
            Activity activity2 = new Activity("Hot AirBallon", "The pilot will apply heat to make the balloon slowly rise off the ground.");
            Activity activity3 = new Activity("Camel Riding", "Riding camels on the beach, beautiful views");
            Activity activity4 = new Activity("Parasailing","the recreational activity of gliding through the air wearing an open parachute while being towed by a motorboat.");
            Activity activity5 = new Activity


        }
    }

}
