package com.app.core.oops;

public class Account {

	private String number;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	//constructor
	public Account() {
	//this---> must be the first line. 
		this("56789",2.50,"Default name","default address","default phone");//calling constructor in another constructor
		System.out.println("Default constructor called");
		
	}
	
	public Account(String number, double balance, String customerName,String customerEmailAddress,String customerPhoneNumber) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.email = customerEmailAddress;
		this.phoneNumber = customerPhoneNumber;
		System.out.println("parametrised constructor is called");
	}
	
	//constructor chaining or calling one constructor on another constructor.	
	public Account(String customerName, String email, String phoneNumber) {
		this("5986783",29.0,customerName,email,phoneNumber);
//		this.customerName = customerName;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
	}

	//writing additional methods
	public void deposit(double balance) {
		if(this.balance < 0) {
			System.out.println("Invalid Amount" + balance + "is entered");
			return ;
		}
		this.balance += balance;
		System.out.println("==============================================");
		System.out.println("account is credited with amount: "+ balance);
		System.out.println("Current Balance is "+ this.balance + " amount");
	}
	
	public void withDraw(double withDrawBalance) {
		if(this.balance - withDrawBalance < 0) {
			System.out.println("==================================");
			System.out.println("Insufficient Fund");
			return;
		}
		this.balance -= withDrawBalance;
		System.out.println(balance +" amount is withdrawn");
		System.out.println("Current Balance is "+ this.balance + " amount");
	}
	
	
	// getters and setters.
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
