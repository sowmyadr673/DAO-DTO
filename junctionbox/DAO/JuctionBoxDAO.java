package com.xworkz.junctionbox.DAO;

import com.xworkz.junctionbox.DTO.JunctionBoxDTO;

public class JuctionBoxDAO {

	int index = 0;
	JunctionBoxDTO junctionbox[] = new JunctionBoxDTO[3];

	public JuctionBoxDAO() {
		System.out.println("junctionbox dao created");
	}

	public void saveDTO(JunctionBoxDTO dto) {
		System.out.println("inside save method");
		junctionbox[index] = dto;
		index++;

	}

	public void displayInfo() {
		for (int i = 0; i < junctionbox.length; i++) {
			System.out.println(junctionbox[i].getBrand());
			System.out.println(junctionbox[i].getColor());
			System.out.println(junctionbox[i].getPrice());
			System.out.println(junctionbox[i].getSeries());
			System.out.println("-------------------------");

		}
	}

	public void displayByBrandName(String brandName) {
		System.out.println("inside display method");
		for (int i = 0; i < junctionbox.length; i++) {
			if (junctionbox[i].getBrand().equals(brandName)) {
				System.out.println(junctionbox[i].getBrand());
				System.out.println(junctionbox[i].getColor());
				System.out.println(junctionbox[i].getPrice());
				System.out.println(junctionbox[i].getSeries());
				System.out.println("--------------------");
			}

		}

	}

	public void updateByBrand(String Brand, int newprice) {
		System.out.println("inside update method");
		for (int i = 0; i < junctionbox.length; i++) {
			if (junctionbox[i].getBrand().equals(Brand)) {
				junctionbox[i].setPrice(newprice);
			}

		}
	}

	public void deleteByBrand(String Brand) {
		System.out.println("delete method");
		for (int i = 0; i < junctionbox.length; i++) {
			if (junctionbox[i].getBrand().equals(Brand)) {
				junctionbox[i] = null;

			}
		}
	}

}
