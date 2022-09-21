package oop1;

import java.io.ObjectInputStream.GetField;

public class main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.name = "kahve makinesi";
		product1.unitprice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "kahve.jpg.";

		Product product2 = new Product();
		product2.name = "bulasýk makinesi";
		product2.unitprice = 10200;
		product2.discount = 8;
		product2.unitsInStock = 3;
		product2.imageUrl = "bulasýk.jpg.";

		Product product3 = new Product();
		product3.setName("çamaþýr");  // doðru yazýmý not al
		product3.setUnitprice(12000);
		product3.setDiscount(9);
		product3.unitsInStock = 3;
		product3.imageUrl = "camasýr.jpg.";

		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.name);
			System.out.println(product.getDiscount());

		}
		
		IndividualCustomer IndividialCustomer  = new IndividualCustomer();
		IndividialCustomer.setId(1);
		IndividialCustomer.setPhone("12345");
		IndividialCustomer.setCustomerNumber("2022");
		IndividialCustomer.setFirstName("salih");
		IndividialCustomer.setLastName("atmacalar");
		
		CorporateCustomer CorporateCustomer = new CorporateCustomer();
		
		CorporateCustomer.setCompanyName("bim");
		CorporateCustomer.setCompanyNumber("1200");
		CorporateCustomer.setId(20);
		CorporateCustomer.setCustomerNumber("2023");
	    CorporateCustomer.setPhone("342435500");
		
		
		
		
	}

}
