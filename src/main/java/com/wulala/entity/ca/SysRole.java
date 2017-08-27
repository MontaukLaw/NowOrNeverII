package com.wulala.entity.ca;

public class SysRole {
	private String ID, NAME;

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

	@Override
	public String toString() {
		return "SysRole [ID=" + ID + ", NAME=" + NAME + "]";
	}

}
