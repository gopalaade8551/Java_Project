package Programs;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int count=0;
		System.out.println("enter the number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				
			}
		}
		if(count>2)
		{
			System.out.println("the entered number is not prime number");
		}
		else
		{
			System.out.println("the entered number is prime number");
		}
		

	}

}
