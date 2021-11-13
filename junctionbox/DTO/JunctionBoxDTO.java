package com.xworkz.junctionbox.DTO;

public class JunctionBoxDTO {

	private String Brand;
	private String color;
	private int price;
	private int series;

	public JunctionBoxDTO(String brand, String color, int price, int series) {
		System.out.println("junctionbox dto created");
		Brand = brand;
		this.color = color;
		this.price = price;
		this.series = series;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

}
