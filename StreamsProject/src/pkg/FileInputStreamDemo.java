package pkg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		File f = null;
		try {
			f = new File("C:\\Users\\New\\Desktop\\Cogent Training\\Streams\\employee.txt");
			fis = new FileInputStream(f);
			System.out.println("File is opened");
			int i;
			
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
		}
		catch(FileNotFoundException fnf) {
			System.out.println(fnf);
		}
		catch(IOException io) {
			System.out.println(io);
		}	
	}

}
