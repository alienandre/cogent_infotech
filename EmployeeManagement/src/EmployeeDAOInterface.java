import java.util.List;

public interface EmployeeDAOInterface {
	public void create(List<EmployeePojo> e);
	
	public void update(List<EmployeePojo> e);
	
	public void delete(List<EmployeePojo> e);
	
	public void readAll(List<EmployeePojo> e);
	
	public void search(List<EmployeePojo> e);
	
}
