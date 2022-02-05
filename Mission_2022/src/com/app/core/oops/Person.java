package com.app.core.oops;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0 || age>100) {
			this.age = 0;
		}
		else{
		    this.age = age;
		}
	}
	
	public boolean isTeen() {
		if(this.age >12 && age<20) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getFullName() {
		String s1 = this.firstName;
		String s2 = this.lastName;
		if(s1.isEmpty() && s2.isEmpty()) {
			return "";
		}
		else if(s1.isEmpty() || s2.isEmpty()){
			return s1+s2;
		}
		else {
			return s1+" "+s2;
		}
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-5);
		System.out.println(p.getAge());
	}
	
}

