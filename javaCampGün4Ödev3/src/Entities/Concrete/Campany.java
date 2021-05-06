package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campany implements Entity{
	
	private int id;
	private String campanyName;
	private String time;
	private String discountRate;
	
	public Campany() {
		
	}
	
	
	public Campany(int id, String campanyName, String time, String discountRate) {
		super();
		this.id = id;
		this.campanyName = campanyName;
		this.time = time;
		this.discountRate = discountRate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampanyName() {
		return campanyName;
	}


	public void setCampanyName(String campanyName) {
		this.campanyName = campanyName;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

}
