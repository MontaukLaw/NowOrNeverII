package com.wulala.entity;

public class RestaurantPrivateProgram extends BaseProgram {

	public RestaurantPrivateProgram(Restaurant _restaurant) {
		super();
		this.IF_RESTAURANT_PRIVATE = true;
		this.RESTAURANT = _restaurant;
	}
	
	

}
