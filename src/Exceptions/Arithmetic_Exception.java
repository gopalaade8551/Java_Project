package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Arithmetic_Exception {
	
	
	//stack trace
	//exceptions name---java.lang.arithmetic exception
	//exception message--/by zero
	//line number---
	//method info
	

	public static void main(String[] args)  throws FileNotFoundException,IOException  {
//		File path=new File("D://resume");
//		FileInputStream fin=new FileInputStream(path);
//		System.out.println(fin);
		method2();
	}
	
	public static void method1()
	{
System.out.println("the program started");
		
		
		int a=10;
		int b=0;
		int result=0;
		
		try {
		
			result=a/b;
		}
		catch(ArithmeticException  ae)  //Arithmetic Exception extends Runtime exception,Runtime exception extends Exception,Exception extends Throwable, Throwable implements Serializable
		{
			System.out.println(ae.getStackTrace());//write a login to enter this message into log file
			throw ae;
		}
		
		finally
		{
			System.out.println("the finally block executed");
		}
		System.out.println("the output is "+result);
		System.out.println("the program end");
	}
	
	public static void method2()
	{
method1();
	}

}
