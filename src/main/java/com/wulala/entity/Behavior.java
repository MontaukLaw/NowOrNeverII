package com.wulala.entity;

import java.util.Date;

public class Behavior {
	private String ID, BEHAVIOR_CODE, USER_ID, DETAIL, VEHICLE_ID;
	private Date CREATE_TIME, SHOWUP_TIME;

	// 1: low VOL, 2: Over spped, 3: RPM high, 4: Low ECT, 5: High ECT, 6: SPD
	// up fast, 7: deep break, 8: RPM 800

	public String getID() {
		return ID;
	}

	public String getVEHICLE_ID() {
		return VEHICLE_ID;
	}

	public void setVEHICLE_ID(String vEHICLE_ID) {
		VEHICLE_ID = vEHICLE_ID;
	}

	public Date getSHOWUP_TIME() {
		return SHOWUP_TIME;
	}

	public void setSHOWUP_TIME(Date sHOWUP_TIME) {
		SHOWUP_TIME = sHOWUP_TIME;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getBEHAVIOR_CODE() {
		return BEHAVIOR_CODE;
	}

	public void setBEHAVIOR_CODE(String bEHAVIOR_CODE) {
		BEHAVIOR_CODE = bEHAVIOR_CODE;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getDETAIL() {
		return DETAIL;
	}

	public void setDETAIL(String dETAIL) {
		DETAIL = dETAIL;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	@Override
	public String toString() {
		return "Behavior [ID=" + ID + ", BEHAVIOR_CODE=" + BEHAVIOR_CODE + ", USER_ID=" + USER_ID + ", DETAIL=" + DETAIL + ", VEHICLE_ID="
				+ VEHICLE_ID + ", CREATE_TIME=" + CREATE_TIME + ", SHOWUP_TIME=" + SHOWUP_TIME + "]";
	}

}
