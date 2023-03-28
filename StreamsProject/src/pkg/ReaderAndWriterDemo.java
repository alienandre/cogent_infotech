package pkg;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		File f = null;
		File f2 = null;
		
		try {
			f = new File("C:\\Users\\New\\Desktop\\Cogent Training\\Streams\\employee.txt");
			f2 = new File("C:\\Users\\New\\Desktop\\Cogent Training\\Streams\\xyz.txt");
			fr = new FileReader(f);
			fw = new FileWriter(f2);
			int ch;
			while((ch=fr.read()) != -1) {
				fw.write(ch);
			}
			System.out.println("File copied sucessfully");
			fr.close();
			fw.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
