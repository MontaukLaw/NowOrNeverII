package com.wulala.entity;

public class BaseAdvProgram extends BaseProgram {

	protected AdvClient ADV_CLIENT;

	protected AdvSales ADV_SALES;

	// play heat which asked by client;
	// 0-10
	// Ref by program arrange center;
	protected int PLAY_HEAT;

	public BaseAdvProgram() {
		super();
	}

	public AdvClient getADV_CLIENT() {
		return ADV_CLIENT;
	}

	public void setADV_CLIENT(AdvClient aDV_CLIENT) {
		ADV_CLIENT = aDV_CLIENT;
	}

	public AdvSales getADV_SALES() {
		return ADV_SALES;
	}

	public void setADV_SALES(AdvSales aDV_SALES) {
		ADV_SALES = aDV_SALES;
	}

	public int getPLAY_HEAT() {
		return PLAY_HEAT;
	}

	public void setPLAY_HEAT(int pLAY_HEAT) {
		PLAY_HEAT = pLAY_HEAT;
	}
	

}
