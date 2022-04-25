package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Weather;

public interface WeatherDao extends JpaRepository<Weather, Long> {

}
