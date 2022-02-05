package com.app.core.oops;

public class Main {

	public static void main(String[] args) {
		
		VipCustomer VipCustomer = new VipCustomer();
		//VipCustomer VipCustomer = new VipCustomer("12345",0.00,"ankur","admin@admin.com","(+91)-904191723212");
		
//		VipCustomer.withDraw(100.0);
//		
//		
//		VipCustomer.deposit(50.0);
//		VipCustomer.withDraw(100.0);
//		
//		VipCustomer.deposit(51.0);
//		VipCustomer.withDraw(100.0);
		
		VipCustomer newVipCustomer = new VipCustomer("Ankur", 123.0, "789456123");
		
		Wall wall = new Wall(-1.0,1.0);
//		wall.setWidth(-1.0);
//		wall.setHeight(1.0);
		
		double area = wall.getArea();
		System.out.println(area);
	}

}
