package Programs;

import java.util.Scanner;

public class factors_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int count=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("the factors of "+num+"are");
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				count++;
				
			}
		}
		System.out.println("the count of factors is  "+count);

	}

}
