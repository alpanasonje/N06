package com.tnsif.jpaintro;

import java.util.Scanner;

public class Executor {
	public static void main(String args[]) {
		ProductService service = new ProductService();
		int pid, qty;
		String name;
		float rate;
		Product p;
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1. Insert Product");
			System.out.println("2. Update Product");
			System.out.println("3. Delete Product");
			System.out.println("4. Get Product");
			System.out.println("5. Exit");
			System.out.println("Enter your choice (1..5) : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Product Id, name, quantity and price ");
				pid = sc.nextInt();
				name = sc.next();
				qty = sc.nextInt();
				rate = sc.nextFloat();
				p = new Product();
				p.setProductId(pid);
				p.setProductName(name);
				p.setRate(rate);
				p.setQuantity(qty);
				service.addProduct(p);
				break;
			case 2:
				System.out.println("Enter Product Id and new rate : ");
				pid = sc.nextInt();
				rate = sc.nextFloat();
				service.updateProduct(pid, rate);
				break;

			case 3:
				System.out.println("Enter Product Id : ");
				pid = sc.nextInt();
				service.deleteProduct(pid);
				break;

			case 4:
				System.out.println("Enter Product Id : ");
				pid = sc.nextInt();
				Product newProduct = service.getProduct(pid);
				if (newProduct==null)
					System.out.println("No such product available..");
				else
					System.out.println(newProduct);
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (ch != 5);
	}
}
