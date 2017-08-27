package com.wulala.entity;

import java.util.Date;

public class MileStone {
	private String ID, MACHINE_ID, RESTAURANT_ID;
	private PlayList PLAYLIST;
	private Date UPDATE_TIME;

	public String getID() {
		return ID;
	}

	public PlayList getPLAYLIST() {
		return PLAYLIST;
	}

	public void setPLAYLIST(PlayList pLAYLIST) {
		PLAYLIST = pLAYLIST;
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

	public Date getUPDATE_TIME() {
		return UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}

	public String getRESTAURANT_ID() {
		return RESTAURANT_ID;
	}

	public void setRESTAURANT_ID(String rESTAURANT_ID) {
		RESTAURANT_ID = rESTAURANT_ID;
	}

	@Override
	public String toString() {
		return "MileStone [ID=" + ID + ", MACHINE_ID=" + MACHINE_ID + ", RESTAURANT_ID=" + RESTAURANT_ID + ", PLAYLIST=" + PLAYLIST + ", UPDATE_TIME="
				+ UPDATE_TIME + "]";
	}

}
