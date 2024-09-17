package Part_33;

class A
{
	
	public void x(int a)
	{
		System.out.println("this is x and the value of a is "+a);
	}
	public void y(int b)
	{
		System.out.println("this is y and the value of y is "+b);
	}
}

public class single_Inheritance extends A {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		single_Inheritance si=new single_Inheritance();
		
		si.x(2);
		si.y(20);

	}

}
