package com.test.allergy;
import java.util.Date;
import java.util.Set;

public class Patient {

	private long patientId;
	private String patientFirstName;
	private String patientLastName;
	private String patientMiddleName;
	private Address patientAddress;
	private int age;
	private Date dob; 
	private float weight;
	private float height;
	private Set<Allergy> allergies;
	private ReportedBy reportedBy;
	public Patient(long patientId, String patientFirstName, String patientLastName, String patientMiddleName,
			Address patientAddress, int age, Date dob, float weight, float height, Set<Allergy> allergies,
			ReportedBy reportedBy) {
		super();
		this.patientId = patientId;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.patientMiddleName = patientMiddleName;
		this.patientAddress = patientAddress;
		this.age = age;
		this.dob = dob;
		this.weight = weight;
		this.height = height;
		this.allergies = allergies;
		this.reportedBy = reportedBy;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(final String patientFirstName) {
		
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(final String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getPatientMiddleName() {
		return patientMiddleName;
	}
	public void setPatientMiddleName(String patientMiddleName) {
		this.patientMiddleName = patientMiddleName;
	}
	public Address getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(Address patientAddress) {
		this.patientAddress = patientAddress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Set<Allergy> getAllergies() {
		return allergies;
	}
	public void setAllergies(Set<Allergy> allergies) {
		this.allergies = allergies;
	}
	public ReportedBy getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(ReportedBy reportedBy) {
		this.reportedBy = reportedBy;
	}
	
	
	
	public void addAllergy(Allergy allergy) {
		this.allergies.add(allergy);
	}
	public  void displayAllergy() {
		for(Allergy allergy:this.allergies) {
			System.out.println("Allergy ID :"+allergy.getAllergyId());
			System.out.println("Allergy Name :"+allergy.getAllergyName()+"\n");

		}
	}
	
	
	
}
