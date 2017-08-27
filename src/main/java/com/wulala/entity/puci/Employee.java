package com.wulala.entity.puci;

import java.util.Date;

public class Employee {
	private String ID, NAME, DEPARTMENT, CONTACT_TEL;
	private Date ONBOARD_DATE;

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

	public String getDEPARTMENT() {
		return DEPARTMENT;
	}

	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}

	public String getCONTACT_TEL() {
		return CONTACT_TEL;
	}

	public void setCONTACT_TEL(String cONTACT_TEL) {
		CONTACT_TEL = cONTACT_TEL;
	}

	public Date getONBOARD_DATE() {
		return ONBOARD_DATE;
	}

	public void setONBOARD_DATE(Date oNBOARD_DATE) {
		ONBOARD_DATE = oNBOARD_DATE;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", NAME=" + NAME + ", DEPARTMENT=" + DEPARTMENT + ", CONTACT_TEL=" + CONTACT_TEL + ", ONBOARD_DATE="
				+ ONBOARD_DATE + "]";
	}

}
