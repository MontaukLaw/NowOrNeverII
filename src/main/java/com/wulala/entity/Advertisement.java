package com.wulala.entity;

import java.util.Date;

public class Advertisement {
	private String ID, CLIENT_NAME, PRODUCT_NAME, URL, TITLE, PIC;
	private Date CREATE_TIME, START_DATE, END_DATE;

	public String getPIC() {
		return PIC;
	}

	public void setPIC(String pIC) {
		PIC = pIC;
	}

	public Date getSTART_DATE() {
		return START_DATE;
	}

	public void setSTART_DATE(Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	public Date getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(Date eND_DATE) {
		END_DATE = eND_DATE;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCLIENT_NAME() {
		return CLIENT_NAME;
	}

	public void setCLIENT_NAME(String cLIENT_NAME) {
		CLIENT_NAME = cLIENT_NAME;
	}

	public String getPRODUCT_NAME() {
		return PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String pRODUCT_NAME) {
		PRODUCT_NAME = pRODUCT_NAME;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	@Override
	public String toString() {
		return "Advertisement [ID=" + ID + ", CLIENT_NAME=" + CLIENT_NAME + ", PRODUCT_NAME=" + PRODUCT_NAME + ", URL=" + URL + ", TITLE=" + TITLE
				+ ", PIC=" + PIC + ", CREATE_TIME=" + CREATE_TIME + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + "]";
	}

}
