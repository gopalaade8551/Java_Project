package day_13;

public class StaticDemo {
	
	
	//Static methods can access  static methods,variable directly
	//Static methods can access  non static methods,variable through objects
	//non static methods can acess evrything directly.
	
	
	
	static int a=10;//static variable
	int b=20;//non static variable
	
	
	public static void m1()//static method
	{
		System.out.println("this is static mathod");
	}
	
	void m2()//non static method
	{
		System.out.println("this is non static method");
	}
	
	void m3()
	{
		System.out.println(a);
		System.out.println(b);
	}
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		//m3();
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		StaticDemo s=new StaticDemo();
//		//System.out.println(a);
         //
//
//        s.m();
//class Test{
//	     
//	//static String s="welcome";
//
//	}
	//Test.s.length();
	
	
	//class System
	{
//		static printstream out'
//		System.out.println();
	}


	
}
