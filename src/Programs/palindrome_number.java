package Programs;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int temp,r;
		
		int n;
		temp=num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		


	}

}
