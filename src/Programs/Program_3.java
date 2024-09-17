package Programs;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float sub1,sub2,sub3,sub4,sub5,sub6;
		String name;
		float total,averagemarks,percentage;
		System.out.println("enter the name of the student");
		name=sc.nextLine();
		System.out.println("enter subject 1 marks");
		sub1=sc.nextInt();
		System.out.println("enter the subject 2 marks");
		sub2=sc.nextInt();
		System.out.println("enter the subject 3 marks");
		sub3=sc.nextInt();
		System.out.println("enter the subject 4 marks");
		sub4=sc.nextInt();
		System.out.println("enter the subject 5 marks");
		sub5=sc.nextInt();
		System.out.println("enter the subject 6 marks");
		sub6=sc.nextInt();
		total=sub1+sub2+sub3+sub4+sub5+sub6;
		averagemarks=total/6;
		percentage=(total/600)*100;
		System.out.println("the total marks obtained by the student is "+total);
		System.out.println("the average marks are "+averagemarks);
		System.out.println("the percentage of marks are "+percentage);
	

	}

}
