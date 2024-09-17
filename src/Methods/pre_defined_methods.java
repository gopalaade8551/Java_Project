package Methods;

import java.util.Scanner;

public class pre_defined_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("enter a number num1");
		num1=sc.nextInt();
		System.out.println("enter a another number num 2");
		num2=sc.nextInt();
		//System.out.println(Math.sqrt(num));//square root of a number
		System.out.println("the maximum number is "+Math.max(num1, num2));
		System.out.println("the minimum number is "+Math.min(num1, num2));
		
		
		
		

	}

}
