package com.test.allergy;

import java.util.Calendar;
import java.util.Date;

public class Frequency {

	private PartofDay partOfTheDay;
	private Calendar beforeFood;
	private Calendar afterFood;
	private String dosage;
	private String frequencyTimeline; //for how many days-- is it for few days, or rest of the life
	public Frequency(PartofDay partOfTheDay, Calendar beforeFood, Calendar date2, String dosage, String frequencyTimeline) {
		super();
		this.partOfTheDay = partOfTheDay;
		this.beforeFood = beforeFood;
		this.afterFood = date2;
		this.dosage = dosage;
		this.frequencyTimeline = frequencyTimeline;
	}
	
	
	public Frequency() {
		super();
	}


	public PartofDay getPartOfTheDay() {
		return partOfTheDay;
	}
	public void setPartOfTheDay(PartofDay partOfTheDay) {
		this.partOfTheDay = partOfTheDay;
	}
	public Calendar getBeforeFood() {
		return beforeFood;
	}
	public void setBeforeFood(Calendar beforeFood) {
		this.beforeFood = beforeFood;
	}
	public Calendar getAfterFood() {
		return afterFood;
	}
	public void setAfterFood(Calendar afterFood) {
		this.afterFood = afterFood;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getFrequencyTimeline() {
		return frequencyTimeline;
	}
	public void setFrequencyTimeline(String frequencyTimeline) {
		this.frequencyTimeline = frequencyTimeline;
	}
	
	public void setFrequency(PartofDay partofDay, String frequencyTimeline) {
		this.setFrequency(partofDay, frequencyTimeline);
		
	}
	
	
	
	
}
