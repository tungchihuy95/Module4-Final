package com.example.module4.service;

import com.example.module4.model.City;

import java.util.Optional;

public interface CityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    void save(City city);

    void remove(City city);
}
