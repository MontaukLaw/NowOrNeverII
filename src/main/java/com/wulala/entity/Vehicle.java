package com.wulala.entity;

public class Vehicle {
	private String ID, OWNER_ID, MANUFACTURER, MODLE, DETAIL_INFO, VOLUME, PLATE, MANUFACTURER_CODE, MANUFACTURER_NATION;

	public String getMANUFACTURER_CODE() {
		return MANUFACTURER_CODE;
	}

	public void setMANUFACTURER_CODE(String mANUFACTURER_CODE) {
		MANUFACTURER_CODE = mANUFACTURER_CODE;
	}

	public String getMANUFACTURER_NATION() {
		return MANUFACTURER_NATION;
	}

	public void setMANUFACTURER_NATION(String mANUFACTURER_NATION) {
		MANUFACTURER_NATION = mANUFACTURER_NATION;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getOWNER_ID() {
		return OWNER_ID;
	}

	public void setOWNER_ID(String oWNER_ID) {
		OWNER_ID = oWNER_ID;
	}

	public String getMANUFACTURER() {
		return MANUFACTURER;
	}

	public void setMANUFACTURER(String mANUFACTURER) {
		MANUFACTURER = mANUFACTURER;
	}

	public String getMODLE() {
		return MODLE;
	}

	public void setMODLE(String mODLE) {
		MODLE = mODLE;
	}

	public String getDETAIL_INFO() {
		return DETAIL_INFO;
	}

	public void setDETAIL_INFO(String dETAIL_INFO) {
		DETAIL_INFO = dETAIL_INFO;
	}

	public String getVOLUME() {
		return VOLUME;
	}

	public void setVOLUME(String vOLUME) {
		VOLUME = vOLUME;
	}

	public String getPLATE() {
		return PLATE;
	}

	public void setPLATE(String pLATE) {
		PLATE = pLATE;
	}

	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", OWNER_ID=" + OWNER_ID + ", MANUFACTURER=" + MANUFACTURER + ", MODLE=" + MODLE + ", DETAIL_INFO="
				+ DETAIL_INFO + ", VOLUME=" + VOLUME + ", PLATE=" + PLATE + ", MANUFACTURER_CODE=" + MANUFACTURER_CODE + ", MANUFACTURER_NATION="
				+ MANUFACTURER_NATION + "]";
	}

}
