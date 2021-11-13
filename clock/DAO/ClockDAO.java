package com.xworkz.clock.DAO;

import com.xworkz.clock.DTO.ClockDTO;

public class ClockDAO {

	int index = 0;
	ClockDTO clock[] = new ClockDTO[3];

	public ClockDAO() {
		System.out.println("clock dao is created");
	}

	public void saveDTO(ClockDTO dto) {
		System.out.println("inside save method");
		clock[index] = dto;
		index++;

	}

	public void displayInfo() {
		for (int i = 0; i < clock.length; i++) {
			System.out.println(clock[i].getBrand());
			System.out.println(clock[i].getColor());
			System.out.println(clock[i].getPrice());
			System.out.println(clock[i].getSeries());
			System.out.println("--------------------");
		}
	}

	public void displayByBrandName(String brandName) {
		System.out.println("inside display method");
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(brandName)) {
				System.out.println(clock[i].getBrand());
				System.out.println(clock[i].getColor());
				System.out.println(clock[i].getPrice());
				System.out.println(clock[i].getSeries());
				System.out.println("--------------------");
			}

		}

	}

	public void updateByBrand(String Brand, int newprice) {
		System.out.println("inside update method");
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(Brand)) {
				clock[i].setPrice(newprice);
			}

		}
	}

	public void updateBrandNamebybrandname(String Brand, String newbrandname) {
		for (int j = 0; j < clock.length; j++) {
			if (clock[j].getBrand().equals(Brand)) {
				clock[j].setBrand(newbrandname);
				System.out.println("--------------------");
			}
		}
	}

	public void deleteByBrand(String Brand) {
		System.out.println("delete method");
		for (int i = 0; i < clock.length; i++) {
			if (clock[i].getBrand().equals(Brand)) {
				clock[i] = null;
			}
		}
	}
}