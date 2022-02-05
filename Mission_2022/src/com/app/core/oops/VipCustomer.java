package com.app.core.oops;

public class VipCustomer {

	private String name;
	private double credit_limit;
	private String email;
	
	public VipCustomer() {
		this("Ankur",10000.0,"ankur@gmail.com");
		System.out.println("calling default constructor");
	}
	
	

	public VipCustomer(String name, String email) {
		this(name,2000.0,email);
	}



	public VipCustomer(String name, double credit_limit, String email) {
		this.name = name;
		this.credit_limit = credit_limit;
		this.email = email;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
