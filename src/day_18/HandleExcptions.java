package day_18;

import java.util.Scanner;

public class HandleExcptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	
	try {
	System.out.println("enter the number");
	int num=sc.nextInt();
	System.out.println(100/num);
	}
	catch(ArithmeticException e)
	{
		
		System.out.println("Invalid number");
	}
	System.out.println("program completed");
	System.out.println("porogram exited");
	
		

	}

}
