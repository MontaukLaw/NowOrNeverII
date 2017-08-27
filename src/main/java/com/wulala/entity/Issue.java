package com.wulala.entity;

import java.util.Date;

public class Issue {
	private String ID, ISSUE_CODE, VEHICLE_ID;
	private Date CREATE_TIME, SHOWUP_TIME;

	public Date getSHOWUP_TIME() {
		return SHOWUP_TIME;
	}

	public void setSHOWUP_TIME(Date sHOWUP_TIME) {
		SHOWUP_TIME = sHOWUP_TIME;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getISSUE_CODE() {
		return ISSUE_CODE;
	}

	public void setISSUE_CODE(String iSSUE_CODE) {
		ISSUE_CODE = iSSUE_CODE;
	}

	public String getVEHICLE_ID() {
		return VEHICLE_ID;
	}

	public void setVEHICLE_ID(String vEHICLE_ID) {
		VEHICLE_ID = vEHICLE_ID;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	@Override
	public String toString() {
		return "Issue [ID=" + ID + ", ISSUE_CODE=" + ISSUE_CODE + ", VEHICLE_ID=" + VEHICLE_ID + ", CREATE_TIME=" + CREATE_TIME + ", SHOWUP_TIME="
				+ SHOWUP_TIME + "]";
	}

}
