package com.example.demo.Entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Weather {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	
	String cityID;
	@Column
	String condition;
	@Column
	int temp;
	@Column
	int windSpeed;
	public String getCityID() {
		return cityID;
	}
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	@Override
	public String toString() {
		return "Weather [cityID=" + cityID + ", condition=" + condition + ", temp=" + temp + ", windSpeed=" + windSpeed
				+ "]";
	}
	public Weather(String cityID, String condition, int temp, int windSpeed) {
		super();
		this.cityID = cityID;
		this.condition = condition;
		this.temp = temp;
		this.windSpeed = windSpeed;
	}
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
