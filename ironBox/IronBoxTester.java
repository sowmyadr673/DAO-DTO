package com.xworkz.ironBox;

import com.xworkz.ironBox.DAO.IronBoxDAO;
import com.xworkz.ironBox.DTO.IronBoxDTO;

public class IronBoxTester {

	public static void main(String[] args) {

		IronBoxDAO ironboxdao = new IronBoxDAO();
		IronBoxDTO Philips = new IronBoxDTO("Philips", "blue", 1500, 240);
		ironboxdao.saveDTO(Philips);
		IronBoxDTO BajajMX = new IronBoxDTO("BajajMX", "white", 500, 250);
		ironboxdao.saveDTO(BajajMX);
		IronBoxDTO UshaEi = new IronBoxDTO("UshaEi", "white", 1200, 230);
		ironboxdao.saveDTO(UshaEi);

//	iroboxdao.displayInfo();
		ironboxdao.displayByBrandname("Philips");

		System.out.println("before update");
		ironboxdao.displayByBrandname("UshaEi");
		ironboxdao.updateByBrand("UshaEi", 1800);
		System.out.println("after update");
		ironboxdao.displayByBrandname("UshaEi");

		ironboxdao.deleteByBrand("BajajMX");
		ironboxdao.displayInfo();
	}
}