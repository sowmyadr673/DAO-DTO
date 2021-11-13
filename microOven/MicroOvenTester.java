package com.xworkz.microOven;

import com.xworkz.microOven.DAO.MicroOvenDAO;
import com.xworkz.microOven.DTO.MicroOvenDTO;

public class MicroOvenTester {

	public static void main(String[] args) {
	
		MicroOvenDAO microovendao = new MicroOvenDAO();
		MicroOvenDTO pigeon = new MicroOvenDTO("pigeon", 25, 7000, "grey");
		microovendao.saveDTO(pigeon);
		MicroOvenDTO philips = new MicroOvenDTO("philips", 35, 9000, "black");
		microovendao.saveDTO(philips);
		MicroOvenDTO whirlpool = new MicroOvenDTO("whirlpool", 30, 8000, "blue");
		microovendao.saveDTO(whirlpool);
		MicroOvenDTO IFB = new MicroOvenDTO("IFB", 40, 10000, "red");
		microovendao.saveDTO(IFB);

		// microovendao.displayinfo();
		microovendao.displayByBrandName("pigeon");

		System.out.println("before update");
		microovendao.displayByBrandName("pigeon");
		microovendao.updateByBrand("pigeon", "white");
		System.out.println("after update");
		microovendao.displayByBrandName("pigeon");

		microovendao.deleteByBrand("whirlpool");
		microovendao.displayinfo();
	}

}
