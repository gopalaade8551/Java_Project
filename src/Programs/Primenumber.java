package Programs;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check");
		num=sc.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("the entered numberis prime number");
		}
		else
		{
			System.out.println("the entered number is not a prime number");
		}
		

	}

}
