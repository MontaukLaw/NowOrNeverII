package com.wulala.entity;


public class Code {

	private String ID, CODE, DESCRIPTION, BRAND;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCODE() {
		return CODE;
	}

	public void setCODE(String cODE) {
		CODE = cODE;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public String getBRAND() {
		return BRAND;
	}

	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}

	@Override
	public String toString() {
		return "CODE [ID=" + ID + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", BRAND=" + BRAND + "]";
	}

}
