package com.test.allergy;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Patient {

	private long patientId;
	private String patientFirstName;
	private String patientLastName;
	private String patientMiddleName;
	private Address patientAddress;
	private int age;
	private Calendar dob; 
	private float weight;
	private float height;
	private Set<Allergy> allergies;
	private Set<Medication> medications;
	private Set<Frequency> frequencies;
	private Temperature temperature;
	
	//private Medication medication;
	private ReportedBy reportedBy;
	public Patient(long patientId, String patientFirstName, String patientLastName, String patientMiddleName,
			Address patientAddress, int age, Calendar dob, float weight, float height, Set<Allergy> allergies,
			Set<Medication> medications, Set<Frequency> frequencies, ReportedBy reportedBy) {
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
		this.medications = medications;
		this.frequencies = frequencies;
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

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
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

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
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

	public Set<Medication> getMedications() {
		return medications;
	}

	public void setMedications(Set<Medication> medications) {
		this.medications = medications;
	}

	public Set<Frequency> getFrequencies() {
		return frequencies;
	}

	public void setFrequencies(Set<Frequency> frequencies) {
		this.frequencies = frequencies;
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
			System.out.println("Allergy Name :"+allergy.getAllergyName()+"\n" +allergy.getSeverity()+"\n");
			

		}
	}
	
	public void addMedication(Medication medication) {
		this.medications.add(medication);
	}
	public void displayMedication() {
		for(Medication medList:this.medications) {
			System.out.println("Medication ID:" +medList.getMedicineId()+"\n");
			System.out.println("Medication Name: "+medList.getMedicationName()+"\n");
			
			
		}
	}
	public void addFrequency(Frequency frequency) {
		this.frequencies.add(frequency);
	}
	public void displayFrequency() {
		for(Frequency freqList:this.frequencies) {
			System.out.println("Part of the day: "+freqList.getPartOfTheDay()+"\n");
			System.out.println("Dosage: "+freqList.getDosage()+"\n"+"\n" + freqList.getBeforeFood() +"\n");
			System.out.println("Frequency Timeline: "+freqList.getFrequencyTimeline()+"\n");
			System.out.println("Frequency Cal: "+freqList.getAfterFood().getTime()+"\n");
			//System.out.println("Frequency Calander::" +set(2018, 12, 1, 05, 30));
			
			//System.out.println("Date is :"+freqList.getAfterFood().getTime());
			//System.out.println(df.format(dates.get(i).getTime()));
			
			
		}
	
}
	
	
	
	
	
	
	
}
