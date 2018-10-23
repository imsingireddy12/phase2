package com.test.allergy;
import java.util.Set;

public class Allergy {

	
	//private - within the class
	//protected - within the package
	
	private long allergyId;
	private String allergyName;
	
	private Set <String> allergySymptoms;
	
	private Severity severity;
	


public Allergy(long allergyId, String allergyName, Set<String> allergySymptoms, Severity severity) {
	super();
	this.allergyId = allergyId;
	this.allergyName = allergyName;
	
	this.allergySymptoms = allergySymptoms;
	this.severity = severity;
}

public long getAllergyId() {
	return allergyId;
}

public void setAllergyId(long allergyId) {
	this.allergyId = allergyId;
}

public String getAllergyName() {
	return allergyName;
}

public void setAllergyName(String allergyName) {
	this.allergyName = allergyName;
}


public Set<String> getAllergySymptoms() {
	return allergySymptoms;
}

public void setAllergySymptoms(Set<String> allergySymptoms) {
	this.allergySymptoms = allergySymptoms;
}

public Severity getSeverity() {
	return severity;
}

public void setSeverity(Severity severity) {
	this.severity = severity;
}

















}