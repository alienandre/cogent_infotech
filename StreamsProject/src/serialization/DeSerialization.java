package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) {
		FileInputStream fis;
		ObjectInputStream ois;
		File f;
		
		try {
			f = new File("Emp.ser");
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee emp = (Employee) obj;
			System.out.println("Employe id: " + emp.id);
			System.out.println("Employe name: " + emp.name);
			System.out.println("Employe salary: " + emp.salary);
			System.out.println("Employe ssn: " + emp.ssn);
			fis.close();
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
