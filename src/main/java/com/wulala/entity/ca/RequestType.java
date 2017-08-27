package com.wulala.entity.ca;

public class RequestType {
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
		return "ReqeustType [ID=" + ID + ", NAME=" + NAME + "]";
	}

}
