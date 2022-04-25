package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Weather;
import com.example.demo.dao.WeatherDao;

@Service
public class WeatherServiceImpl implements WeatherService {
	
	@Autowired
	WeatherDao weatherDao;

	@Override
	public Weather save(Weather weather) {
		return weatherDao.save(weather);
		
	}

}
