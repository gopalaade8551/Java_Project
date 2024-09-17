package day_12;

public class Overloadmain {
	
	void main(String x)
	{
		System.out.println(x);
	}
	void main(String x,String y)
	{
		System.out.println(x+y);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadmain m=new Overloadmain();
		m.main("gopal");
		m.main("ramesh", "suresh");

	}

}
