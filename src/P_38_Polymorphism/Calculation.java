package P_38_Polymorphism;

public class Calculation {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		Calculation cl=new Calculation();
		int result=cl.add(2, 10,111);
		System.out.println(result);
		
		
	
		
		

	}

}
