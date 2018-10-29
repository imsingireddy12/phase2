package com.test.allergy;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

	
	

	public static void main(String[] args) {
		final Set<String> symptoms = new HashSet<>();
		symptoms.add("Fever");
		symptoms.add("Cold");
		
		final Allergy allergy1 = new Allergy(1, "Pollen", symptoms, Severity.HIGH);
		
		final Allergy allergy2 = new Allergy(2, "Food", symptoms, Severity.HIGH);
		final Allergy allergy3 = new Allergy(2, "WATER", symptoms, Severity.HIGH);

		//final Date date1 = new Date(111111);
		Calendar date1 = Calendar.getInstance();
		//date1.set(Calendar.YEAR,2017);
		//date1.set(Calendar.MONTH,01);
		//date1.set(Calendar.DAY_OF_MONTH,28);
		
		final Calendar date2 = Calendar.getInstance();
		//date2.set(Calendar.YEAR,2017);
		//date2.set(Calendar.MONTH,01);
		//date2.set(Calendar.DAY_OF_MONTH,28);
		
		 
		final Address address = new Address(null, null, null, null, null, null);
		final ReportedBy reportedBy =  new ReportedBy(0, null, null);
		
		final Set<Allergy> allergies = new HashSet<>();
		allergies.add(allergy1);
		//allergies.add(allergy2);
		
		//final Patient patient1 = new Patient(1L, "asdka", "asdkad", "", address, 10, date1, 900, 519, allergies, null, reportedBy);
		
		
		//patient1.displayAllergy();
		
		//patient1.addAllergy(allergy3);
		
		//patient1.displayAllergy();
		
		
		Frequency freq = new Frequency(PartofDay.Night, date1, date2, "100oz", "24hours once");
		//Frequency freq = new Frequency(PartofDay.Afternoon, date1, date2, "5Oz", "$ hours once");
		Frequency freq2 = new Frequency(PartofDay.Evening, date1, date1, "111oz", "3hours");
		
		Medication med = new Medication(1, "Advil", date1, date2, "5oz", freq);
		
		Set<Medication> medList = new HashSet<>();
		medList.add(med);
		
		Set<Frequency> fre = new HashSet<>();
		fre.add(freq);
		fre.add(freq2);
		
		
		//Patient patient3 = new Patient(patientId, patientFirstName, patientLastName, patientMiddleName, patientAddress, age, dob, weight, height, allergies, reportedBy)

		//Patient pat = new Patient(1, "SAN", "Reddy", "Reddy", address, 12, date2, 900, 150, allergies, medList, reportedBy);
		
		
		Patient pat = new Patient(1, "SAN", "REDDY", "REDDYY", address, 10, date2, 900, 999, allergies, medList, fre, reportedBy);
		pat.displayAllergy();
		pat.displayMedication();
		pat.displayFrequency();
		
		
		



		
		
		
		
		
	}
}
