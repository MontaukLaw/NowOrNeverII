package com.wulala.entity;

import java.util.ArrayList;
import java.util.Date;

public class Article {

	private String ID, AUTHOR_ID, SECTOR_ID, SUBJECT, MAIN_TEXT, TAGS;
	private boolean UP_TO_TOP;
	private int REPLIES, CLICKS, LIKES;
	private Date LAST_REPLY_TIME;
	private Date CREATE_TIME;
	private User AUTHOR;
	

	public String getTAGS() {
		return TAGS;
	}

	public void setTAGS(String tAGS) {
		TAGS = tAGS;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	private User author;
	private Sector sector;
	private String PIC0, PIC1, PIC2, PIC3, PIC4, PIC5, PIC6, PIC7, PIC8;

	public int getLIKES() {
		return LIKES;
	}

	public void setLIKES(int lIKES) {
		LIKES = lIKES;
	}

	public String getPIC0() {
		return PIC0;
	}

	public void setPIC0(String pIC0) {
		PIC0 = pIC0;
	}

	public String getPIC1() {
		return PIC1;
	}

	public void setPIC1(String pIC1) {
		PIC1 = pIC1;
	}

	public String getPIC2() {
		return PIC2;
	}

	public void setPIC2(String pIC2) {
		PIC2 = pIC2;
	}

	public String getPIC3() {
		return PIC3;
	}

	public void setPIC3(String pIC3) {
		PIC3 = pIC3;
	}

	public String getPIC4() {
		return PIC4;
	}

	public void setPIC4(String pIC4) {
		PIC4 = pIC4;
	}

	public String getPIC5() {
		return PIC5;
	}

	public void setPIC5(String pIC5) {
		PIC5 = pIC5;
	}

	public String getPIC6() {
		return PIC6;
	}

	public void setPIC6(String pIC6) {
		PIC6 = pIC6;
	}

	public String getPIC7() {
		return PIC7;
	}

	public void setPIC7(String pIC7) {
		PIC7 = pIC7;
	}

	public String getPIC8() {
		return PIC8;
	}

	public void setPIC8(String pIC8) {
		PIC8 = pIC8;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getAUTHOR_ID() {
		return AUTHOR_ID;
	}

	public void setAUTHOR_ID(String aUTHOR_ID) {
		AUTHOR_ID = aUTHOR_ID;
	}

	public String getSECTOR_ID() {
		return SECTOR_ID;
	}

	public void setSECTOR_ID(String sECTOR_ID) {
		SECTOR_ID = sECTOR_ID;
	}

	public String getSUBJECT() {
		return SUBJECT;
	}

	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}

	public String getMAIN_TEXT() {
		return MAIN_TEXT;
	}

	public void setMAIN_TEXT(String mAIN_TEXT) {
		MAIN_TEXT = mAIN_TEXT;
	}

	public int getREPLIES() {
		return REPLIES;
	}

	public void setREPLIES(int rEPLIES) {
		REPLIES = rEPLIES;
	}

	public int getCLICKS() {
		return CLICKS;
	}

	public void setCLICKS(int cLICKS) {
		CLICKS = cLICKS;
	}

	public Date getLAST_REPLY_TIME() {
		return LAST_REPLY_TIME;
	}

	public void setLAST_REPLY_TIME(Date lAST_REPLY_TIME) {
		LAST_REPLY_TIME = lAST_REPLY_TIME;
	}

	public boolean isUP_TO_TOP() {
		return UP_TO_TOP;
	}

	public void setUP_TO_TOP(boolean uP_TO_TOP) {
		UP_TO_TOP = uP_TO_TOP;
	}

	@Override
	public String toString() {
		return "Article [ID=" + ID + ", AUTHOR_ID=" + AUTHOR_ID + ", SECTOR_ID=" + SECTOR_ID + ", SUBJECT=" + SUBJECT + ", MAIN_TEXT=" + MAIN_TEXT
				+ ", TAGS=" + TAGS + ", UP_TO_TOP=" + UP_TO_TOP + ", REPLIES=" + REPLIES + ", CLICKS=" + CLICKS + ", LIKES=" + LIKES
				+ ", LAST_REPLY_TIME=" + LAST_REPLY_TIME + ", CREATE_TIME=" + CREATE_TIME + ", author=" + author + ", sector=" + sector + ", PIC0="
				+ PIC0 + ", PIC1=" + PIC1 + ", PIC2=" + PIC2 + ", PIC3=" + PIC3 + ", PIC4=" + PIC4 + ", PIC5=" + PIC5 + ", PIC6=" + PIC6 + ", PIC7="
				+ PIC7 + ", PIC8=" + PIC8 + "]";
	}

}
