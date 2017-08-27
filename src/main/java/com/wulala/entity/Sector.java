package com.wulala.entity;

public class Sector {
	private String ID, NAME, DISCRIPTION, PARENT_SECTOR_ID;

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

	public String getDISCRIPTION() {
		return DISCRIPTION;
	}

	public void setDISCRIPTION(String dISCRIPTION) {
		DISCRIPTION = dISCRIPTION;
	}

	public String getPARENT_SECTOR_ID() {
		return PARENT_SECTOR_ID;
	}

	public void setPARENT_SECTOR_ID(String pARENT_SECTOR_ID) {
		PARENT_SECTOR_ID = pARENT_SECTOR_ID;
	}

	@Override
	public String toString() {
		return "Sector [ID=" + ID + ", NAME=" + NAME + ", DISCRIPTION=" + DISCRIPTION + ", PARENT_SECTOR_ID=" + PARENT_SECTOR_ID + "]";
	}

}
