package com.wulala.entity.ca;

import java.util.Date;

import com.wulala.entity.SysUser;

public class Checkpoint {
	private String ID, CODE, SHORT_CODE, LINE_CODE, QR_CODE, LABEL_ID;
	private Date CREATE_TIME;
	private String OPERATOR_ID, REQUEST_TYPE_ID;

	private SysUser operator;
	private RequestType requestType;

	public String getLABEL_ID() {
		return LABEL_ID;
	}

	public void setLABEL_ID(String lABEL_ID) {
		LABEL_ID = lABEL_ID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCODE() {
		return CODE;
	}

	public void setCODE(String cODE) {
		CODE = cODE;
	}

	public String getSHORT_CODE() {
		return SHORT_CODE;
	}

	public void setSHORT_CODE(String sHORT_CODE) {
		SHORT_CODE = sHORT_CODE;
	}

	public String getLINE_CODE() {
		return LINE_CODE;
	}

	public void setLINE_CODE(String lINE_CODE) {
		LINE_CODE = lINE_CODE;
	}

	public String getQR_CODE() {
		return QR_CODE;
	}

	public void setQR_CODE(String qR_CODE) {
		QR_CODE = qR_CODE;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	public String getOPERATOR_ID() {
		return OPERATOR_ID;
	}

	public void setOPERATOR_ID(String oPERATOR_ID) {
		OPERATOR_ID = oPERATOR_ID;
	}

	public String getREQUEST_TYPE_ID() {
		return REQUEST_TYPE_ID;
	}

	public void setREQUEST_TYPE_ID(String rEQUEST_TYPE_ID) {
		REQUEST_TYPE_ID = rEQUEST_TYPE_ID;
	}

	public SysUser getOperator() {
		return operator;
	}

	public void setOperator(SysUser operator) {
		this.operator = operator;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	@Override
	public String toString() {
		return "Checkpoint [ID=" + ID + ", CODE=" + CODE + ", SHORT_CODE=" + SHORT_CODE + ", LINE_CODE=" + LINE_CODE + ", QR_CODE=" + QR_CODE
				+ ", LABEL_ID=" + LABEL_ID + ", CREATE_TIME=" + CREATE_TIME + ", OPERATOR_ID=" + OPERATOR_ID + ", REQUEST_TYPE_ID=" + REQUEST_TYPE_ID
				+ ", operator=" + operator + ", requestType=" + requestType + "]";
	}

}
