package Entities.Concrete;

import Entities.Abstract.Entity;

public class Game implements Entity{
	
	private int id;
	private String name;
	private String payment;
	
	public Game() {
		
	}

	public Game(int id, String name, String payment) {
		super();
		this.id = id;
		this.name = name;
		this.payment = payment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

}
