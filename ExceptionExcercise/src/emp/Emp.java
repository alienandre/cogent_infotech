package emp;

import java.util.Scanner;

public class Emp {
	private int empId;
	private String empName;
	private String designation;
	private double basic;
	private double hra;
	
	public Emp(int empId, String empName, String designation, double basic) throws LowSalException{
		if(basic < 500) {
			throw new LowSalException("Salary amount is too low");
		}
		else {
			this.empId = empId;
			this.empName = empName;
			this.designation = designation;
			this.basic = basic;
		}
	}
	
	public void printDET() {
		System.out.println("Employee id: " + this.getEmpId());
		System.out.println("Employee name: " + this.getEmpName());
		System.out.println("Employe designation: " + this.getDesignation());
		System.out.println("Employee basic: " + this.getBasic());
	}
	
	public void calculateHRA() {
		if(this.getDesignation().equalsIgnoreCase("Manager")) {
			this.hra = .1*this.getBasic();
		}
		else if(this.getDesignation().equalsIgnoreCase("Officer")) {
			this.hra = .12*this.getBasic();
		}
		else if(this.getDesignation().equalsIgnoreCase("Clerk")) {
			this.hra = .05*this.getBasic();
		}
	}

	public double getHra() {
		return hra;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Emp id: ");
		int empID = in.nextInt();
		System.out.println("Employee name: ");
		String empName = in.next();
		System.out.println("Designation: (Manager, Officier, Clerk) ");
		String designation = in.next();
		System.out.println("BASIC: ");
		double basic = in.nextDouble();
		
		try {
			Emp e = new Emp(empID, empName, designation, basic);
			e.printDET();
			e.calculateHRA();
			System.out.println("The hra is " + e.getHra());
		}
		catch(LowSalException e) {
			System.out.println("Salary entered is too low");
		}
		
	}
	
}
