package com.test.allergy;

import java.util.Date;
import java.util.Scanner;

public class Temperature {
		private double defaultTemparature;
		private Date timeStamp;
		
		private Location location;
		private Unit unit;
		
		
		public Temperature(double defaultTemparature, Date timeStamp, Location location, Unit unit) {
			super();
			this.defaultTemparature = defaultTemparature;
			this.timeStamp = timeStamp;
			this.location = location;
			this.unit = unit;
		}
		public double getTemparature() {
			return defaultTemparature;
		}
		public void setTemparature(double temparature) {
			this.defaultTemparature = temparature;
		}
		public Date getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(Date timeStamp) {
			this.timeStamp = timeStamp;
		}
		public Location getLocation() {
			return location;
		}
		public void setLocation(Location location) {
			this.location = location;
		}
		public Unit getUnit() {
			return unit;
		}
		public void setUnit(Unit unit) {
			this.unit = unit;
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
}
