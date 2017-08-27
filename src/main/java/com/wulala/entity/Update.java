package com.wulala.entity;

import java.util.Date;

public class Update {
	private String ID, VERSION, RELEASE_NOTE,PRODUCT_NAME;
	private Date RELEASE_TIME;
	
	public String getPRODUCT_NAME() {
		return PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String pRODUCT_NAME) {
		PRODUCT_NAME = pRODUCT_NAME;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getVERSION() {
		return VERSION;
	}

	public void setVERSION(String vERSION) {
		VERSION = vERSION;
	}

	public String getRELEASE_NOTE() {
		return RELEASE_NOTE;
	}

	public void setRELEASE_NOTE(String rELEASE_NOTE) {
		RELEASE_NOTE = rELEASE_NOTE;
	}

	public Date getRELEASE_TIME() {
		return RELEASE_TIME;
	}

	public void setRELEASE_TIME(Date rELEASE_TIME) {
		RELEASE_TIME = rELEASE_TIME;
	}

	@Override
	public String toString() {
		return "Update [ID=" + ID + ", VERSION=" + VERSION + ", RELEASE_NOTE=" + RELEASE_NOTE + ", PRODUCT_NAME=" + PRODUCT_NAME + ", RELEASE_TIME="
				+ RELEASE_TIME + "]";
	}

	
}
