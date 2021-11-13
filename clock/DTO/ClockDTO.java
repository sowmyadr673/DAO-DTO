package com.xworkz.clock.DTO;

public class ClockDTO {

	private String Brand;
	private String color;
	private int series;
	private int price;

	public ClockDTO(String brand, String color, int series, int price) {
		System.out.println("clock dto is created");
		Brand = brand;
		this.color = color;
		this.series = series;
		this.price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
