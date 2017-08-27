package com.wulala.entity;

import java.util.Date;

public class User {

	private String ID, USERNAME, PASSWORD, ICON, RECEIVE_MSG, STRANGER_ALBUM_ACCESS, CELLPHONE;
	private Date REG_TIME;
	private String STATUS, GENDER, EMAIL, OPEN_ID, HORNOR, QQ;
	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getICON() {
		return ICON;
	}

	public void setICON(String iCON) {
		ICON = iCON;
	}

	public String getRECEIVE_MSG() {
		return RECEIVE_MSG;
	}

	public void setRECEIVE_MSG(String rECEIVE_MSG) {
		RECEIVE_MSG = rECEIVE_MSG;
	}

	public String getSTRANGER_ALBUM_ACCESS() {
		return STRANGER_ALBUM_ACCESS;
	}

	public void setSTRANGER_ALBUM_ACCESS(String sTRANGER_ALBUM_ACCESS) {
		STRANGER_ALBUM_ACCESS = sTRANGER_ALBUM_ACCESS;
	}

	public String getCELLPHONE() {
		return CELLPHONE;
	}

	public void setCELLPHONE(String cELLPHONE) {
		CELLPHONE = cELLPHONE;
	}

	public Date getREG_TIME() {
		return REG_TIME;
	}

	public void setREG_TIME(Date rEG_TIME) {
		REG_TIME = rEG_TIME;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getOPEN_ID() {
		return OPEN_ID;
	}

	public void setOPEN_ID(String oPEN_ID) {
		OPEN_ID = oPEN_ID;
	}

	public String getHORNOR() {
		return HORNOR;
	}

	public void setHORNOR(String hORNOR) {
		HORNOR = hORNOR;
	}

	public String getQQ() {
		return QQ;
	}

	public void setQQ(String qQ) {
		QQ = qQ;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", USERNAME=" + USERNAME + ", PASSWORD=" + PASSWORD + ", ICON=" + ICON + ", RECEIVE_MSG=" + RECEIVE_MSG
				+ ", STRANGER_ALBUM_ACCESS=" + STRANGER_ALBUM_ACCESS + ", CELLPHONE=" + CELLPHONE + ", REG_TIME=" + REG_TIME + ", STATUS=" + STATUS
				+ ", GENDER=" + GENDER + ", EMAIL=" + EMAIL + ", OPEN_ID=" + OPEN_ID + ", HORNOR=" + HORNOR + ", QQ=" + QQ + "]";
	}

}
