package day_12;

public class Adder {
	
	
	//Method overloading
	//4 rules
	//1.method names should be same
	//2.number of parameters should be different
	//3data type of parameters should be different
	//order of parameters should be different
	
	
	int a=10;
	int b=20;
	void sum() //1
	{
		System.out.println(a+b);
	}
	void sum(int x,int y)//2
	{
		System.out.println(x+y);
	}
	void sum(int x,int y,int z)//3
	{
		System.out.println(x+y+z);
	}
	void sum(int x,double y)//4
	{
		System.out.println(x+y);
	}
	void sum(double x,int y)//5
	{
		System.out.println(x+y);
	}
	
	
	void multiple()
	{
		System.out.println("Subtraction is "+a*b);
	}
	void multiple(int x,int y)
	{
		System.out.println(x*y);
	}
	void multiple(int x,double y)
	{
		System.out.println(x*y);
	}
	void multiple(int x,int y,int z)
	{
		System.out.println("the multiplication of x,y,z is "+x*y*z);
	}
	{
		
	}
	
	
	public static void main(String[] args)
	{
		Adder adderobj=new Adder();
		adderobj.sum();//1
		adderobj.sum(245, 679);//2
		adderobj.sum(10,20,30);//3
		adderobj.sum(10,268936);//4
		adderobj.sum(256383,786);//5
		
		
		//the multiplication method
		Adder mult=new Adder();
	    mult.multiple();
	}

}
