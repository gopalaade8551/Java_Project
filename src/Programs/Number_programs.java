package Programs;

import java.util.Scanner;

public class Number_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1;
		int n3;
		int count;
		System.out.println("enter the number to count");
		count=sc.nextInt();
		System.out.print("The numbers are "+n1+" "+n2);
		for(int i=0;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3+" ");
			n1=n2;
			n2=n3;
			
		}
		
		
		


		
		
		

	}

}
