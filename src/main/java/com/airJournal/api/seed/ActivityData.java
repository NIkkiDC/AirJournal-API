package com.airJournal.api.seed;

import org.springframework.boot.CommandLineRunner;

public class ActivityData implements CommandLineRunner {

    /**
     *
     * @param args the method will accept a variable number of arguments
     * @throws Exception
     */

    @Override // annotation is used to indicate that the method is meant to override a method in a superclass or implement an interface method.
    public void run(String... args) throws Exception {
        dataForActivity();
    }

}
