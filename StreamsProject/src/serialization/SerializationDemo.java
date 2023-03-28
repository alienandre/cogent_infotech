package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		File f;
		
		try {
			f = new File("Emp.ser");
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1,"John", 10000, 1234);
			oos.writeObject(emp);
			System.out.println("Object serialized");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
