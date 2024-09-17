package Programs;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int digit=0;
		int num;
		int temp;
		int sum=0;
		System.out.println("enter a number");
		num=sc.nextInt();
		temp=num;
		do {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		
		}
		while(num!=0);
		System.out.println("the sum of digits of a number "+temp+" is "+sum);

	}

}
