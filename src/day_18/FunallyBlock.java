package day_18;

public class FunallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program started");
		
		try {
		String s=null;
		int num=Integer.parseInt(s);
		System.out.println(s);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block excecuted");
		}
		
		System.out.println("program ended");
		
		

	}

}
