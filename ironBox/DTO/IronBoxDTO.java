package com.xworkz.ironBox.DTO;

public class IronBoxDTO {

	private String Brand;
	private String color;
	private int price;
	private int voltage;

	public IronBoxDTO(String brand, String color, int price, int voltage) {
		super();
		Brand = brand;
		this.color = color;
		this.price = price;
		this.voltage = voltage;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

}