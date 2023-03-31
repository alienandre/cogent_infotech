import java.util.List;
import java.util.Scanner;

public class EmployeeDAOImpl implements EmployeeDAOInterface{
	private Scanner in = new Scanner(System.in);
	
	public void create(List<EmployeePojo> e) {
		System.out.println("Employee id: ");
		int id=in.nextInt();
		System.out.println("Employee name: ");
		String name=in.next();
		System.out.println("Employee address: ");
		String address=in.next();
		System.out.println("Employee email: ");
		String email=in.next();
		System.out.println("Employee salary: ");
		double salary=in.nextDouble();
		
		e.add(new EmployeePojo(id, name, address, email, salary));
		System.out.println("Employee added ");
	}

	@Override
	public void update(List<EmployeePojo> e) {
		System.out.println("Employee id to update: ");
		int id=in.nextInt();
		
		for(int i=0; i<e.size(); i++) {
			if(e.get(i).getEmployeeId() == id) {
				System.out.println("Employee found ");
				System.out.println("New id: ");
				e.get(i).setEmployeeId(in.nextInt());
				System.out.println("New name: ");
				e.get(i).setEmployeeName(in.next());
				System.out.println("New address: ");
				e.get(i).setEmployeeAddress(in.next());
				System.out.println("New email: ");
				e.get(i).setEmployeeEmail(in.next());
				System.out.println("New salary: ");
				e.get(i).setEmployeeSalary(in.nextDouble());
				
				System.out.println("Employee information updated ");
			}
		}	
	}

	@Override
	public void delete(List<EmployeePojo> e) {
		System.out.println("Employee id to delete: ");
		int id=in.nextInt();
		
		for(int i=0; i<e.size(); i++) {
			if(e.get(i).getEmployeeId() == id) {
				e.remove(i);
				System.out.println("Employee deleted");
			}
		}
	}

	@Override
	public void readAll(List<EmployeePojo> e) {
		System.out.println("Printing all employees ");
		for(int i=0; i<e.size(); i++) {
			System.out.println("Employee id: " + e.get(i).getEmployeeId());
			System.out.println("Employee name: " + e.get(i).getEmployeeName());
			System.out.println("Employee address: " + e.get(i).getEmployeeAddress());
			System.out.println("Employee email: " + e.get(i).getEmployeeEmail());
			System.out.println("Employee salary: " + e.get(i).getEmployeeSalary());
		}
		
	}

	@Override
	public void search(List<EmployeePojo> e) {
		System.out.println("Employee id to search: ");
		int id=in.nextInt();
		
		for(int i=0; i<e.size(); i++) {
			if(e.get(i).getEmployeeId() == id) {
				System.out.println("Employee found ");
				System.out.println("Employee id: " + e.get(i).getEmployeeId());
				System.out.println("Employee name: " + e.get(i).getEmployeeName());
				System.out.println("Employee address: " + e.get(i).getEmployeeAddress());
				System.out.println("Employee email: " + e.get(i).getEmployeeEmail());
				System.out.println("Employee salary: " + e.get(i).getEmployeeSalary());
			}
		}
		
	}

}
