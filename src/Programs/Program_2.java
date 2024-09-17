package Programs;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		do
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
			
			
		}
		while(n!=0);
		System.out.println("the sum of the digits is "+ sum);
		
		
		

	}

}
