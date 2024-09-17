package day_18;

import java.util.Scanner;

public class exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("the program started..........");
        Scanner sc=new Scanner(System.in);
        
        /* example 1
        
        System.out.println("Enter the number");// Arthimetic exception
        int number=sc.nextInt();
        System.out.println(100/number);//
        */
        
         // example 2   //Array out of indexbound exception
        /*
        int array[]=new int[5];
        System.out.println("Enter the position");
        int position=sc.nextInt();
        System.out.println("enter the value");
        int value=sc.nextInt();
        array[position]= value;
        System.out.println(array[position]);
        
        */
        
        //Number format exception
        /*
        String s="Welcome";
        int  number=Integer.parseInt(s);
        System.out.println(number);
        */
        
        
        //Null pointer exception
        String s=null;
        System.out.println(s.length());
        
        
        
        
        System.out.println("program is ended");
                
        

	}

}
