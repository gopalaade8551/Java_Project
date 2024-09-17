package Programs;

import java.util.Scanner;

public class Java_1 {

	public static void main(String[] args) {
		
		System.out.println(100+200);
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		if(a<0)
		{
			System.out.println(a+"is Negative number");
		}
		else if(a>0)
		{
			System.out.println(a+"is possitive number");
		}
		else
		{
			System.out.println(a+"is nuetral number");
		}

	}

}
