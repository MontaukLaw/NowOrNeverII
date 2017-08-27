package com.wulala.entity.puci;

public class Client {

	private String ID, NAME, ADDRESS, CONTACT_NAME, CONTACT_TEL;
	private Employee employee;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getCONTACT_NAME() {
		return CONTACT_NAME;
	}

	public void setCONTACT_NAME(String cONTACT_NAME) {
		CONTACT_NAME = cONTACT_NAME;
	}

	public String getCONTACT_TEL() {
		return CONTACT_TEL;
	}

	public void setCONTACT_TEL(String cONTACT_TEL) {
		CONTACT_TEL = cONTACT_TEL;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Client [ID=" + ID + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", CONTACT_NAME=" + CONTACT_NAME + ", CONTACT_TEL=" + CONTACT_TEL
				+ ", employee=" + employee + "]";
	}

}
