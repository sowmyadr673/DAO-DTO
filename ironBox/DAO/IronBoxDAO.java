package com.xworkz.ironBox.DAO;

import com.xworkz.ironBox.DTO.IronBoxDTO;

public class IronBoxDAO {

	int i = 0;
	IronBoxDTO ironbox[] = new IronBoxDTO[3];

	public IronBoxDAO() {
		System.out.println("Ironbox dao created");
	}

	public void saveDTO(IronBoxDTO dto) {
		System.out.println("inside save method");
		ironbox[i] = dto;
		i++;

	}

	public void displayInfo() {
		for (int i = 0; i < ironbox.length; i++) {
			System.out.println(ironbox[i].getBrand());
			System.out.println(ironbox[i].getColor());
			System.out.println(ironbox[i].getPrice());
			System.out.println(ironbox[i].getVoltage());
			System.out.println("--------------------");
		}
	}

	public void displayByBrandname(String Brandname) {
		System.out.println("inside display method");
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(Brandname)) {
				System.out.println(ironbox[i].getBrand());
				System.out.println(ironbox[i].getColor());
				System.out.println(ironbox[i].getPrice());
				System.out.println(ironbox[i].getVoltage());
				System.out.println("--------------------");
			}
		}
	}

	public void updateByBrand(String Brand, int newprice) {
		System.out.println("inside update method");
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(Brand)) {
				ironbox[i].setPrice(newprice);
			}

		}
	}

	public void deleteByBrand(String Brand) {
		System.out.println("delete method");
		for (int i = 0; i < ironbox.length; i++) {
			if (ironbox[i].getBrand().equals(Brand)) {
				ironbox[i] = null;

			}
		}
	}

}
