package com.wulala.entity;

import java.util.ArrayList;
import java.util.Date;

public class BaseProgram {
	public final static String PROGRAM_TYPE_VIDEO = "VIDEO";
	public final static String PICTURE_TYPE_PICTURE = "PICTURE";

	protected String ID,RESOURCE_FILENAME, RESOURCE_ADDRESS, REVIEWER, BROADCAST_TIME_PERIO;
	protected Date CREATE_TIME;
	protected boolean IF_RESTAURANT_PRIVATE;
	protected Restaurant RESTAURANT;
	protected String PROGRAM_CONTENT_DESCRIPTION;
	// protected boolean[] BROADCAST_TIME_PERIO;

	protected int CONTENT_LENGTH_SECONDS;

	protected ArrayList<Restaurant> DENY_RESTAURANT;
	protected boolean IF_ACTIVE;
	protected String PROGRAM_TYPE;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	

	public String getRESOURCE_FILENAME() {
		return RESOURCE_FILENAME;
	}

	public void setRESOURCE_FILENAME(String rESOURCE_FILENAME) {
		RESOURCE_FILENAME = rESOURCE_FILENAME;
	}

	public String getBROADCAST_TIME_PERIO() {
		return BROADCAST_TIME_PERIO;
	}

	public void setBROADCAST_TIME_PERIO(String bROADCAST_TIME_PERIO) {
		BROADCAST_TIME_PERIO = bROADCAST_TIME_PERIO;
	}

	public String getPROGRAM_TYPE() {
		return PROGRAM_TYPE;
	}

	public String getRESOURCE_ADDRESS() {
		return RESOURCE_ADDRESS;
	}

	public void setRESOURCE_ADDRESS(String rESOURCE_ADDRESS) {
		RESOURCE_ADDRESS = rESOURCE_ADDRESS;
	}

	public String getREVIEWER() {
		return REVIEWER;
	}

	public void setREVIEWER(String rEVIEWER) {
		REVIEWER = rEVIEWER;
	}

	public Date getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(Date cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	public int getCONTENT_LENGTH_SECONDS() {
		return CONTENT_LENGTH_SECONDS;
	}

	public void setCONTENT_LENGTH_SECONDS(int cONTENT_LENGTH_SECONDS) {
		CONTENT_LENGTH_SECONDS = cONTENT_LENGTH_SECONDS;
	}

	public boolean isIF_RESTAURANT_PRIVATE() {
		return IF_RESTAURANT_PRIVATE;
	}

	public void setIF_RESTAURANT_PRIVATE(boolean iF_RESTAURANT_PRIVATE) {
		IF_RESTAURANT_PRIVATE = iF_RESTAURANT_PRIVATE;
	}

	public Restaurant getRESTAURANT() {
		return RESTAURANT;
	}

	public void setRESTAURANT(Restaurant rESTAURANT) {
		RESTAURANT = rESTAURANT;
	}

	public String getPROGRAM_CONTENT_DESCRIPTION() {
		return PROGRAM_CONTENT_DESCRIPTION;
	}

	public void setPROGRAM_CONTENT_DESCRIPTION(String pROGRAM_CONTENT_DESCRIPTION) {
		PROGRAM_CONTENT_DESCRIPTION = pROGRAM_CONTENT_DESCRIPTION;
	}

	public boolean isIF_ACTIVE() {
		return IF_ACTIVE;
	}

	public void setIF_ACTIVE(boolean iF_ACTIVE) {
		IF_ACTIVE = iF_ACTIVE;
	}

	public ArrayList<Restaurant> getDENY_RESTAURANT() {
		return DENY_RESTAURANT;
	}

	public void setDENY_RESTAURANT(ArrayList<Restaurant> dENY_RESTAURANT) {
		DENY_RESTAURANT = dENY_RESTAURANT;
	}

	public static String getProgramTypeVideo() {
		return PROGRAM_TYPE_VIDEO;
	}

	public void setPROGRAM_TYPE(String pROGRAM_TYPE) {
		PROGRAM_TYPE = pROGRAM_TYPE;
	}

	public static String getPictureTypePicture() {
		return PICTURE_TYPE_PICTURE;
	}

	@Override
	public String toString() {
		return "BaseProgram [ID=" + ID + ", RESOURCE_FILENAME=" + RESOURCE_FILENAME + ", RESOURCE_ADDRESS=" + RESOURCE_ADDRESS + ", REVIEWER="
				+ REVIEWER + ", BROADCAST_TIME_PERIO=" + BROADCAST_TIME_PERIO + ", CREATE_TIME=" + CREATE_TIME + ", IF_RESTAURANT_PRIVATE="
				+ IF_RESTAURANT_PRIVATE + ", RESTAURANT=" + RESTAURANT + ", PROGRAM_CONTENT_DESCRIPTION=" + PROGRAM_CONTENT_DESCRIPTION
				+ ", CONTENT_LENGTH_SECONDS=" + CONTENT_LENGTH_SECONDS + ", DENY_RESTAURANT=" + DENY_RESTAURANT + ", IF_ACTIVE=" + IF_ACTIVE
				+ ", PROGRAM_TYPE=" + PROGRAM_TYPE + "]";
	}

}
