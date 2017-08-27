package com.wulala.entity;

import java.util.Date;

import com.wulala.entity.ca.SysRole;

public class SysUser {

	private String ID, NAME, GENDER, ID_NUMBER, CELLPHONE, CUSTOMER_ID, LOGIN_NAME, PASSWORD, ROLE_ID;
	private Date CREATE_TIME;
	private SysRole sysRole;

	@Override
	public String toString() {
		return "SysUser [ID=" + ID + ", NAME=" + NAME + ", GENDER=" + GENDER + ", ID_NUMBER=" + ID_NUMBER + ", CELLPHONE=" + CELLPHONE
				+ ", CUSTOMER_ID=" + CUSTOMER_ID + ", LOGIN_NAME=" + LOGIN_NAME + ", PASSWORD=" + PASSWORD + ", ROLE_ID=" + ROLE_ID
				+ ", CREATE_TIME=" + CREATE_TIME + ", sysRole=" + sysRole + "]";
	}

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getROLE_ID() {
		return ROLE_ID;
	}

	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}

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

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getID_NUMBER() {
		return ID_NUMBER;
	}

	public void setID_NUMBER(String iD_NUMBER) {
		ID_NUMBER = iD_NUMBER;
	}

	public String getCELLPHONE() {
		return CELLPHONE;
	}

	public void setCELLPHONE(String cELLPHONE) {
		CELLPHONE = cELLPHONE;
	}

	public String getLOGIN_NAME() {
		return LOGIN_NAME;
	}

	public void setLOGIN_NAME(String lOGIN_NAME) {
		LOGIN_NAME = lOGIN_NAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

}
