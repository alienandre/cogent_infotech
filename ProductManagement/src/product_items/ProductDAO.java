package product_items;

import java.util.Scanner;

public class ProductDAO {
	public static void create(Product[] products, int n) {
		Scanner in = new Scanner(System.in);
		Product p;
		
		for(int i=0; i<n; i++) {
			p = new Product();
			System.out.println("Please provide product id ");
			p.setProductId(in.nextInt());
			System.out.println("Please provide product Name ");
			p.setProductName(in.next());
			System.out.println("Please provide product price ");
			p.setPrice(in.nextDouble());
			products[i] = p;
		}
		
	}
	
	public static void read(Product[] products) {
		System.out.println("Here are your products");
		System.out.println("");
		for(Product p: products) {
			if(p != null) {
				System.out.println("Product ID: " + p.getProductId());
				System.out.println("Product Name: " + p.getProductName());
				System.out.println("Product Price: " + p.getPrice());
			}
		}
	}
	
	public static void update(Product[] products) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the product ID you want to update ");
		int updateId = in.nextInt();
		
		for(int i=0; i<products.length; i++) {
			if(products[i] != null) {
				if(products[i].getProductId() == updateId) {
					System.out.println("Product found ");
					System.out.println("What would you like to set the id to? ");
					products[i].setProductId(in.nextInt());
					System.out.println("What would you like to set the name to? ");
					products[i].setProductName(in.next());
					System.out.println("What would you like to set the price to? ");
					products[i].setPrice(in.nextDouble());
			}
			}
		}
	}
	
	public static void delete(Product[] products) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the product ID you want to delete ");
		int deleteId = in.nextInt();
		
		for(int i=0; i<products.length; i++) {
			if(products[i] != null){
				if(products[i].getProductId() == deleteId) {
					products[i] = null;
					System.out.println("Product deleted ");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Product[] products = new Product[10];
		Scanner in = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1- Create Record");
			System.out.println("2- Read Record");
			System.out.println("3- Update record");
			System.out.println("4- Delete record");
			System.out.println("5- Exit");
			choice = in.nextInt();
			if(choice == 1) {
				System.out.println("How many products? ");
				int numProducts = in.nextInt();
				ProductDAO.create(products, numProducts);
			}
			else if(choice == 2) {
				ProductDAO.read(products);
			}
			else if(choice == 3) {
				ProductDAO.update(products);
			}
			else if(choice == 4) {
				ProductDAO.delete(products);
			}
			else {
				System.exit(0);
			}
		}
		while(choice != 5);
		
	}

}
