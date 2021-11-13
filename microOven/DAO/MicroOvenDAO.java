package com.xworkz.microOven.DAO;

import com.xworkz.microOven.DTO.MicroOvenDTO;

public class MicroOvenDAO {

	public MicroOvenDAO() {
		System.out.println("microoven dao is created");
	}

	int i = 0;
	MicroOvenDTO microoven[] = new MicroOvenDTO[4];

	public void saveDTO(MicroOvenDTO dto) {
		System.out.println("inside save method");
		microoven[i] = dto;
		i++;

	}

	public void displayinfo() {
		System.out.println("inside display method");
		for (int i = 0; i < microoven.length; i++) {
			System.out.println(microoven[i].getBrand());
			System.out.println(microoven[i].getColor());
			System.out.println(microoven[i].getCapacity());
			System.out.println(microoven[i].getPrice());
			System.out.println("----------------------------");
		}
	}

	public void displayByBrandName(String Brand) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand() == Brand) {
				System.out.println(microoven[i].getBrand());
				System.out.println(microoven[i].getColor());
				System.out.println(microoven[i].getCapacity());
				System.out.println(microoven[i].getPrice());
				System.out.println("----------------------------");
			}
		}
	}

	public void updateByBrand(String Brand, String newcolor) {
		System.out.println("inside update method");
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand().equals(Brand)) {
				microoven[i].setColor(newcolor);
			}

		}
	}

	public void deleteByBrand(String Brand) {
		for (int i = 0; i < microoven.length; i++) {
			if (microoven[i].getBrand().equals(Brand)) {
				microoven[i] = null;
			}

		}
	}
}
