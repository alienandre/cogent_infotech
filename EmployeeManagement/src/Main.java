import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<EmployeePojo> e = new ArrayList<EmployeePojo>();
		EmployeeDAOImpl emp = new EmployeeDAOImpl();
		int choice=0;
		do {
			System.out.println("MENU ");
			System.out.println("1- Create employee ");
			System.out.println("2- Update employee ");
			System.out.println("3- Delete employee ");
			System.out.println("4- Read employee ");
			System.out.println("5- Search employee ");
			System.out.println("6- Sorting employees on name");
			System.out.println("7- Exit ");
			choice=in.nextInt();
			
			switch(choice) {
			case 1:
				emp.create(e);
				break;
				
			case 2:
				emp.update(e);
				break;
				
			case 3: 
				emp.delete(e);
				break;
				
			case 4:
				emp.readAll(e);
				break;
				
			case 5:
				emp.search(e);
				break;
				
			case 6:
				Collections.sort(e);
				System.out.println("Employee list sorted ");
				break;
				
			case 7:
				in.close();
				System.exit(0);
				
			}
		}
		while(choice!=7);

	}

}
