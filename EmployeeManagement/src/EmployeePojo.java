
public class EmployeePojo implements Comparable<EmployeePojo>{
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeeEmail;
	private double employeeSalary;
	
	public EmployeePojo(int employeeId, String employeeName, String employeeAddress, String employeeEmail, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
		
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public int compareTo(EmployeePojo e) {
		return this.getEmployeeName().compareTo(e.getEmployeeName());
	}
	
	
}
