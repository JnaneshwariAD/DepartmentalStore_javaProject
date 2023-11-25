package com;

public class Product {
	private String name;
	private int quality;
	private double cost;

	public Product(String name, int quality, double cost){
		this.name=name;
		this.quality=quality;
		this.cost=cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product Name=" + name + ", Quality=" + quality + ", Cost=" + cost;
	}
	
}
