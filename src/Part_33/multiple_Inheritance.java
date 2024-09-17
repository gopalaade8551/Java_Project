package Part_33;

class m
{

	public void m1()
	{
		System.out.println("this is the code for m1");
	}

	
	
}
 class n extends m
{
	 
	 public void m2()
	{
		super.m1();
		System.out.println("this is the code for m2");
	}
	
	public void m1()
	{
		System.out.println("this is n 's m1 method");
	}
	
	
}

public class multiple_Inheritance extends m {
	
	public static void main(String[] args) {
		
		
	multiple_Inheritance mi=new multiple_Inheritance();
	
	mi.m1();
		
	n nobj=new n();
	nobj.m2();
		
		

	}

}
