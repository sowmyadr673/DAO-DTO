package com.xworkz.smartwatch.DAO;

import com.xworkz.smartwatch.DTO.SmartWatchDTO;

public class SmartWatchDAO {

	int index = 0;
	SmartWatchDTO smartwatch[] = new SmartWatchDTO[5];

	public SmartWatchDAO() {
		System.out.println("smart watch dao is created");
	}

	public void saveDTO(SmartWatchDTO dto) {
		System.out.println("inside save method");
		smartwatch[index] = dto;
		index++;

	}

	public void displayInfo() {
		for (int i = 0; i < smartwatch.length; i++) {
			System.out.println(smartwatch[i].getBrand());
			System.out.println(smartwatch[i].getColor());
			System.out.println(smartwatch[i].getPrice());
			System.out.println(smartwatch[i].getSerialnumber());
			System.out.println("--------------------");
		}
	}

	public void displayByBrandName(String brandName) {
		System.out.println("inside display method");
		for (int i = 0; i < smartwatch.length; i++) {
			if (smartwatch[i].getBrand().equals(brandName)) {
				System.out.println(smartwatch[i].getBrand());
				System.out.println(smartwatch[i].getColor());
				System.out.println(smartwatch[i].getPrice());
				System.out.println(smartwatch[i].getSerialnumber());
				System.out.println("--------------------");
			}

		}

	}

	public void updateByBrand(String Brand, int newprice) {
		System.out.println("inside update method");
		for (int i = 0; i < smartwatch.length; i++) {
			if (smartwatch[i].getBrand().equals(Brand)) {
				smartwatch[i].setPrice(newprice);
			}

		}
	}

	public void updateBrandNamebybrandname(String Brand, String newbrandname) {
		for (int j = 0; j < smartwatch.length; j++) {
			if (smartwatch[j].getBrand().equals(Brand)) {
				smartwatch[j].setBrand(newbrandname);
				System.out.println("--------------------");
			}
		}
	}

	public void deleteByBrand(String Brand) {
		System.out.println("delete method");
		for (int i = 0; i < smartwatch.length; i++) {
			if (smartwatch[i].getBrand().equals(Brand)) {
				smartwatch[i] = null;

			}
		}
	}
}