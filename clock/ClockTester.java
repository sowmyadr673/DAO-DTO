package com.xworkz.clock;

import com.xworkz.clock.DAO.ClockDAO;
import com.xworkz.clock.DTO.ClockDTO;

public class ClockTester {

	public static void main(String[] args) {

		ClockDAO clockdao = new ClockDAO();
		ClockDTO mi = new ClockDTO("generic", "block", 34567, 500);
		clockdao.saveDTO(mi);
		ClockDTO lene = new ClockDTO("house_of_gifts", "white", 5621, 1000);
		clockdao.saveDTO(lene);
		ClockDTO de = new ClockDTO("ci", "blue", 5167, 400);
		clockdao.saveDTO(de);

		clockdao.displayInfo();
		System.out.println("before update");
		clockdao.displayByBrandName("generic");
		clockdao.updateByBrand("generic", 700);
		System.out.println("after update");
		clockdao.displayByBrandName("generic");

		System.out.println("before update");
		clockdao.displayByBrandName("generic");
		clockdao.updateBrandNamebybrandname("generic", "ajanta");
		System.out.println("after update");
		clockdao.displayByBrandName("ajanta");

		clockdao.deleteByBrand("house_of_gifts");
		clockdao.displayInfo();
	}

}
