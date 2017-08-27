package com.wulala.entity;

import java.util.Date;

public class PlayList {
	private String ID, PLAY_LIST;
	private Date UPDATE_TIME;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPLAY_LIST() {
		return PLAY_LIST;
	}

	public void setPLAY_LIST(String pLAY_LIST) {
		PLAY_LIST = pLAY_LIST;
	}

	public Date getUPDATE_TIME() {
		return UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}

	@Override
	public String toString() {
		return "PlayList [ID=" + ID + ", PLAY_LIST=" + PLAY_LIST + ", UPDATE_TIME=" + UPDATE_TIME + "]";
	}

}
