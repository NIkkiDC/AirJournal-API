package com.airJournal.api.repository;

import com.airJournal.api.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City, Long> {
}
