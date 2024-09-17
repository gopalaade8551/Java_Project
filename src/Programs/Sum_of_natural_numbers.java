package Programs;

import java.util.Scanner;

public class Sum_of_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			sum=sum+i;
		}
		System.out.println("the sum  of natural number is "+sum);
		

	}

}
