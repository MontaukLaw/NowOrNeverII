package com.wulala.entity;

import java.util.Date;

public class Tag {

	private String ID, ARTICLE_ID, TAG;
	private Date CREATE_DATE;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getARTICLE_ID() {
		return ARTICLE_ID;
	}

	public void setARTICLE_ID(String aRTICLE_ID) {
		ARTICLE_ID = aRTICLE_ID;
	}

	public String getTAG() {
		return TAG;
	}

	public void setTAG(String tAG) {
		TAG = tAG;
	}

	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(Date cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}

	@Override
	public String toString() {
		return "Tag [ID=" + ID + ", ARTICLE_ID=" + ARTICLE_ID + ", TAG=" + TAG + ", CREATE_DATE=" + CREATE_DATE + "]";
	}

}
