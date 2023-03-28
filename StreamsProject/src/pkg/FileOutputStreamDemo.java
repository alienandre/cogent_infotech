package pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		File f = null;
		File f2 = null;
		
		if(args[0] == null) {
			System.out.println("No source file provided");
			System.exit(0);
		}
		else {
			f = new File(args[0]);
			if(f.exists()) {
				System.out.println("Source exists");
			}
			else {
				System.out.println("Source file does not exists");
				System.exit(0);
			}
		}
		
		if(args[1] == null) {
			System.out.println("No destination file provided, creating file ");
			f2 = new File("destination");
		}
		else {
			f2 = new File(args[1]);
			if(f2.exists()) {
				System.out.println("Destination file exists, would you like to overwrite it? 1 for Yes, 2 for No ");
				if(in.nextInt() == 2) {
					System.exit(0);
				}
			}
		}
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(f);
			fos = new FileOutputStream(f2);
			int data;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			
			System.out.println("File copied succesfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
