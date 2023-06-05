package com.airJournal.api.repository;

import com.airJournal.api.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepo extends JpaRepository<Activity, Long> {
    Activity findByName(String name);
}
