package Programs;

import java.util.Scanner;

public class Prime_number_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int num;
		Scanner nc=new Scanner(System.in);
		System.out.println("enter the number ");
		num=nc.nextInt();
		for(int i=1;i<num;i++)
		{
			fact=fact*i;
		}

	}
 
}
