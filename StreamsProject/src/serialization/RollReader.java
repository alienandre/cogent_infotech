package serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class RollReader {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		try {
			fis = new FileInputStream("roll.ser");
			ois = new ObjectInputStream(fis);
			while(true) {
				Object obj = ois.readObject();
				RollInfo r = (RollInfo) obj;
				System.out.println("Roll #: " + r.rollNo);
				System.out.println("Roll name: " + r.name);
				System.out.println("Roll age: " + r.age);
				System.out.println("Roll address: " + r.address);
			}
		} catch (EOFException e) {
			System.exit(0);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
