package day_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("program started");
		System.out.println("program is in progress");
		
		
			FileInputStream fi=new FileInputStream("C:\\text.txt");
		
	
		Thread.sleep(3000);
	
		
		
		
		
		System.out.println("Program finished");
		
		System.out.println("program exited");

	
	}
		}
