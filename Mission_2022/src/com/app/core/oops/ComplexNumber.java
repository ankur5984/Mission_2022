package com.app.core.oops;

public class ComplexNumber {

	private double real;
	private double imaginary;
	
	public ComplexNumber() {
		
	}

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
 
    public void add(ComplexNumber complexNumber) {
        add(complexNumber.real, complexNumber.imaginary);
    }
 
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
 
    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.real, complexNumber.imaginary);
    }
	
}
