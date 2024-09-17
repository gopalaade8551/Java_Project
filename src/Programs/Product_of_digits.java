package Programs;

import java.util.Scanner;

public class Product_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		num=sc.nextInt();
		int sum=0;
		int digit;
		int product=1;
		do
		{
			digit=num%10;
			product=product*digit;
			sum=sum+digit;
			num=num/10;
			
		}
		while(num!=0);
		if(sum==product) 
		{
			System.out.println("the entered number is spy number");
			
		}
		else
		{
			System.out.println("the entered number is not a spy number");
		}
		
		

	}

}
