package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Weather;
import com.example.demo.service.WeatherService;


@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	
	
	@PostMapping("/weather")
	public ResponseEntity<Weather> save(Weather weather){
		
		Weather w = weatherService.save(weather);
		return new ResponseEntity<Weather>(w,HttpStatus.CREATED);
		
	}
}
