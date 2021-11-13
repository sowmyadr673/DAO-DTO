package com.xworkz.smartwatch;

import com.xworkz.smartwatch.DAO.SmartWatchDAO;
import com.xworkz.smartwatch.DTO.SmartWatchDTO;

public class SmartWatchTester {

	public static void main(String[] args) {

		SmartWatchDAO smartWatchDAO = new SmartWatchDAO();

		SmartWatchDTO mi = new SmartWatchDTO("mi", "white", 23, 15000);
		smartWatchDAO.saveDTO(mi);
		SmartWatchDTO oneplus = new SmartWatchDTO("oneplus", "blue", 654, 12000);
		smartWatchDAO.saveDTO(oneplus);
		SmartWatchDTO smasung = new SmartWatchDTO("samsung", "black", 254, 10000);
		smartWatchDAO.saveDTO(smasung);
		SmartWatchDTO fossil = new SmartWatchDTO("fossil", "red", 554, 13000);
		smartWatchDAO.saveDTO(fossil);
		SmartWatchDTO noise = new SmartWatchDTO("noise", "pink", 984, 17000);
		smartWatchDAO.saveDTO(noise);

		System.out.println("before update");
		smartWatchDAO.displayByBrandName("fossil");
		smartWatchDAO.updateByBrand("fossil", 15000);
		System.out.println("after update");
		smartWatchDAO.displayByBrandName("fossil");

		System.out.println("before update");
		smartWatchDAO.displayByBrandName("oneplus");
		smartWatchDAO.updateBrandNamebybrandname("oneplus", "oneplus pro");
		System.out.println("after update");
		smartWatchDAO.displayByBrandName("oneplus pro");

		smartWatchDAO.deleteByBrand("samsung");
		smartWatchDAO.displayInfo();
	}
}
