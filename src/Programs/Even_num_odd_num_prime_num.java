package Programs;

import java.util.Scanner;

public class Even_num_odd_num_prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=sc.nextInt();
		int count=0;
		int digit;
		do {
			digit=num%10;
			count++;
			num=num/10;
		}
		while(num!=0);
		System.out.println("the number of digits in a number is "+count);
		
			
		
		

	}

}
