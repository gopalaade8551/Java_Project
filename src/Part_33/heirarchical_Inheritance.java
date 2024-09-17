package Part_33;

class u
{
	int a=20;
	public void x()
	{
		System.out.println("this my code for x");
	}    
	
}
class B extends u
{
	int b=10;
	public void y()
	{
		System.out.println("this is the code for y");
	}	
}
class C extends u
{
	int c=30;
	public void z()
	{
		System.out.println("this the code for z");
	}
}

public class heirarchical_Inheritance {

	public static void main(String[] args) {
		
		// methods and variables of b object
		B bobj=new B();
		System.out.println(bobj.a);
		bobj.x();
		System.out.println(bobj.b);
		bobj.y();
		
		//variables and methods of c object
		C cobj=new C();
		System.out.println(cobj.c);
		System.out.println(cobj.a);
		cobj.x();
		cobj.z();
		
		
		  

	}

}
