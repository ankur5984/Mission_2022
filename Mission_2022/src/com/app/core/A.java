package com.app.core;

public class A {
public A() {
	System.out.println("In a");
}

public void Show() {
	System.out.println("show of A called");
}
}
 
 class B extends A{
	public B() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("in b");
	}
	@Override
	public void Show() {
		System.out.println("show of B called");
	}
	
	public static void main(String [] args) {
		A a = new B();
		a.Show();
	}
 }
