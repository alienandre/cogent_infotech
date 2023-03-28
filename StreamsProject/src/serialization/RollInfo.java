package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RollInfo implements Serializable{
	int rollNo;
	String name;
	int age;
	String address;
	
	

	public RollInfo(int rollNo, String name, int age, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}	



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rollNo = 0;
		String name = null;
		int age = 0;
		String address = null;
		RollInfo r;
		int flag;
		do {
			System.out.println("1- Add object 2- Exit");
			flag = in.nextInt();
			if(flag == 1) {
				try {
					System.out.println("Roll #: ");
					rollNo = in.nextInt();
					System.out.println("Name: ");
					name = in.next();
					System.out.println("Age: ");
					age = in.nextInt();
					System.out.println("Address: ");
					address = in.next();
				}
				catch(InputMismatchException e) {
					System.out.println("Improper input");
					System.exit(0);
				}
				
				
				r = new RollInfo(rollNo, name, age, address);
				System.out.println("Object has been created ");
				System.out.println("Write to file? 1- Yes 2- No");
				int choice = in.nextInt();
				if(choice == 1) {
					FileOutputStream fos = null;
					ObjectOutputStream oos = null;
					try {
						fos = new FileOutputStream("roll.ser");
						oos = new ObjectOutputStream(fos);
						oos.writeObject(r);
						System.out.println("Object saved");
						
					} 
					catch (Exception e) {
						e.printStackTrace();
					} 
				}
				else {
					System.exit(0);
				}
			}
			else {
				System.exit(0);
			}
			
		}
		while(flag != 2);
		
		
	}

}
