package hydtutorial.strings;

import java.util.Scanner;

public class String_methods_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversed="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=sc.nextLine();
		
		for(int i=0;i<name.length();i++)
		{
			reversed=name.charAt(i)+reversed;
		}
		System.out.println("the reverse of the string is "+reversed);

	}

}
