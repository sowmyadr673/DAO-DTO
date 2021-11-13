package com.xworkz.junctionbox;

import com.xworkz.junctionbox.DAO.JuctionBoxDAO;
import com.xworkz.junctionbox.DTO.JunctionBoxDTO;

public class JunctionBoxTester {

	public static void main(String[] args) {

		JuctionBoxDAO junctionboxdao = new JuctionBoxDAO();
		JunctionBoxDTO syska = new JunctionBoxDTO("syska", "white", 300, 2356);
		junctionboxdao.saveDTO(syska);
		JunctionBoxDTO indrico = new JunctionBoxDTO("Indrico", "gold", 1000, 5678);
		junctionboxdao.saveDTO(indrico);
		JunctionBoxDTO cona = new JunctionBoxDTO("cona", "red", 657, 6532);
		junctionboxdao.saveDTO(cona);

		// junctionboxdao.displayInfo();

		junctionboxdao.displayByBrandName("syska");

		System.out.println("before update");
		junctionboxdao.displayByBrandName("Indrico");
		junctionboxdao.updateByBrand("Indrico", 1200);
		System.out.println("after update");
		junctionboxdao.displayByBrandName("Indrico");

		junctionboxdao.deleteByBrand("cona");
		junctionboxdao.displayInfo();

	}

}
