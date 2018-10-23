package com.test.allergy;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {

	
	

	public static void main(String[] args) {
		final Set<String> symptoms = new HashSet<>();
		symptoms.add("Fever");
		symptoms.add("Cold");
		
		final Allergy allergy1 = new Allergy(1, "Pollen", symptoms, Severity.HIGH);
		
		final Allergy allergy2 = new Allergy(2, "Food", symptoms, Severity.HIGH);
		final Allergy allergy3 = new Allergy(2, "WATER", symptoms, Severity.HIGH);

		final Date date1 = new Date(111111);
		
		final Address address = new Address(null, null, null, null, null, null);
		final ReportedBy reportedBy =  new ReportedBy(0, null, null);
		
		final Set<Allergy> allergies = new HashSet<>();
		allergies.add(allergy1);
		allergies.add(allergy2);
		
		final Patient patient1 = new Patient(1L, "asdka", "asdkad", "", address, 10, date1, 900, 519, allergies, reportedBy);
		
		patient1.displayAllergy();
		
		patient1.addAllergy(allergy3);
		
		patient1.displayAllergy();
	}
}
