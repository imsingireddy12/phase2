package com.test.allergy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Medication {
	
	private long medicineId;
	private String medicationName;
	private Calendar startDate;
	private Calendar endDate;
	private String dosage;
	private Frequency frequency;
	
	public Medication(long medicineId, String medicationName, Calendar date1, Calendar date2, String dosage,
			Frequency frequency) {
		super();
		this.medicineId = medicineId;
		this.medicationName = medicationName;
		this.startDate = date1;
		this.endDate = date2;
		this.dosage = dosage;
		this.frequency = frequency;
	}
	public long getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(long medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicationName() {
		return medicationName;
	}
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	
	

	
	
	
	
	

}
