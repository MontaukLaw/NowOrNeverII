package com.wulala.entity;

import java.util.Date;

public class AdvUpdate {

	private String ID, VERSION_CHANGE, MACHINE_ID, RESTAURANT_ID;

	public String getRESTAURANT_ID() {
		return RESTAURANT_ID;
	}

	public void setRESTAURANT_ID(String rESTAURANT_ID) {
		RESTAURANT_ID = rESTAURANT_ID;
	}

	private long VERSION;
	private Date UPDATE_TIME;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMACHINE_ID() {
		return MACHINE_ID;
	}

	public void setMACHINE_ID(String mACHINE_ID) {
		MACHINE_ID = mACHINE_ID;
	}

	public long getVERSION() {
		return VERSION;
	}

	public void setVERSION(long vERSION) {
		VERSION = vERSION;
	}

	public Date getUPDATE_TIME() {
		return UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}

	public String getVERSION_CHANGE() {
		return VERSION_CHANGE;
	}

	public void setVERSION_CHANGE(String vERSION_CHANGE) {
		VERSION_CHANGE = vERSION_CHANGE;
	}

	@Override
	public String toString() {
		return "AdvUpdate [ID=" + ID + ", VERSION_CHANGE=" + VERSION_CHANGE + ", MACHINE_ID=" + MACHINE_ID + ", RESTAURANT_ID=" + RESTAURANT_ID
				+ ", VERSION=" + VERSION + ", UPDATE_TIME=" + UPDATE_TIME + "]";
	}

}
