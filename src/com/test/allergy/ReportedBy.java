package com.test.allergy;

public class ReportedBy {

	private long personId;
	private String personName;
	private String relationship;
	//phonenumber
	public ReportedBy(long personId, String personName, String relationship) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.relationship = relationship;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	
	
	
	
	
	
}
