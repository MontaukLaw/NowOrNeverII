package com.wulala.entity;

import java.util.Date;

public class Label {

	private String ID, CUSTOMER_ID, CODE, SHORT_CODE;
	private Date CREATE_TIME;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getCODE() {
		return CODE;
	}

	public void setCODE(String cODE) {
		CODE = cODE;
	}

	public String getSHORT_CODE() {
		return SHORT_CODE;
	}

	public void setSHORT_CODE(String sHORT_CODE) {
		SHORT_CODE = sHORT_CODE;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	@Override
	public String toString() {
		return "Label [ID=" + ID + ", CUSTOMER_ID=" + CUSTOMER_ID + ", CODE=" + CODE + ", SHORT_CODE=" + SHORT_CODE + "]";
	}

}
