package com;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {

	LinkedHashMap<Integer,  Product> db=new LinkedHashMap<Integer,Product>();
	Scanner ip=new Scanner(System.in);
	double totalBill=0;
	
	public void addProduct() {
		db.put(1, new Product("Bingo", 20, 20));
		db.put(2, new Product("Chocolate", 20, 35));
		db.put(3, new Product("CupCake", 20, 10));
	}
	
	public void displayProduct() {
		Set<Integer> keys=db.keySet();
		for(int key:keys) {
			Product p=db.get(key);
			System.out.println("Enter "+key+" to order "+p.getName());
			System.out.println("Available Quantity: "+p.getQuality());
			System.out.println("Cost: "+p.getCost());
			System.out.println("----------------------------------------------");
		}
	}
	
	public void buyProduct() {
		System.out.println("Enter Choice");
		int choice=ip.nextInt();		//choice -> key ->20
		
		Product p=db.get(choice);		//getting the product
		
		if(p!=null) {
			System.out.println("Enter Quantity:");
			int quantity=ip.nextInt();	//50
			
			if(quantity <= p.getQuality()) {
				
				//current product cost calculating
				double productCost=quantity*p.getCost();
				
				//adding current product cost total bill
				totalBill=totalBill+productCost; 		//totalBill+=productCost;
				
				//Updating new Quantity
				p.setQuality(p.getQuality()-quantity);
				
				System.out.println("Ordered "+quantity+" "+p.getName());
				System.out.println("Current Product Cost:Rs."+totalBill);
				
			}
			else { 
				System.out.println("Invalid Quantity");	 		//InvalidQuantityException
			}
		}
		
		else {
			System.out.println("Invalid Choice!!!");	 		//InvalidCohoiceException
		}
	}
	
	
	
	public void checkOut() {
		
		System.out.println("Total Bill: "+totalBill);
		System.out.println("Thank You For Shopping :)");
		System.out.println("-------------------------------------");
	}
}


















