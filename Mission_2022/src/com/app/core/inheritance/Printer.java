package com.app.core.inheritance;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted = 0;
	private boolean duplex;
	
	public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
//		super();
		this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100)?tonerLevel:-1;
		this.pagesPrinted = pagesPrinted;
		this.duplex=duplex;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount >0 && tonerAmount <= 100) {
//			if(tonerAmount+this.tonerLevel > 100) {
//				return -1;
//			}
//			else {
//				return this.tonerLevel+tonerAmount;
//				
//			}
			return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
		}
		return -1;
	}
	
	public int printPages(int pages) {
		int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesPrinted += pagesToPrint; // add the pagesToPrint for this job to lifetime printer counter
        return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	
}
