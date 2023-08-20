package com.demo.gradle.first.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_location ")
public class User_location {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private String name;
	    
	    private String Latitude;
	    
	    private String Longitude;

		public User_location() {
			super();
		}

		public User_location(String name, String latitude, String longitude) {
			super();
			this.name = name;
			Latitude = latitude;
			Longitude = longitude;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLatitude() {
			return Latitude;
		}

		public void setLatitude(String latitude) {
			Latitude = latitude;
		}

		public String getLongitude() {
			return Longitude;
		}

		public void setLongitude(String longitude) {
			Longitude = longitude;
		}

		@Override
		public String toString() {
			return "User_location [name=" + name + ", Latitude=" + Latitude + ", Longitude=" + Longitude + "]";
		}
	    	

}
