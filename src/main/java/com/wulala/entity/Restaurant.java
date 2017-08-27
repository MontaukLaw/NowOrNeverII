package com.wulala.entity;

public class Restaurant {
	protected String ID, NAME, DISTRICT, CITY;
	protected String CLIENT_MANAGER_NAME;

	protected Employee EMPLOYEE;

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

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public Employee getEMPLOYEE() {
		return EMPLOYEE;
	}

	public void setEMPLOYEE(Employee eMPLOYEE) {
		EMPLOYEE = eMPLOYEE;
	}

	public String getDISTRICT() {
		return DISTRICT;
	}

	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}

	public String getCLIENT_MANAGER_NAME() {
		return CLIENT_MANAGER_NAME;
	}

	public void setCLIENT_MANAGER_NAME(String cLIENT_MANAGER_NAME) {
		CLIENT_MANAGER_NAME = cLIENT_MANAGER_NAME;
	}

	@Override
	public String toString() {
		return "Restaurant [ID=" + ID + ", NAME=" + NAME + ", DISTRICT=" + DISTRICT + ", CITY=" + CITY + ", CLIENT_MANAGER_NAME="
				+ CLIENT_MANAGER_NAME + ", EMPLOYEE=" + EMPLOYEE + "]";
	}

	
	

}
