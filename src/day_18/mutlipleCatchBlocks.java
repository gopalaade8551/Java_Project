package day_18;

public class mutlipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program started");
		String s=null;
		try {
	
		System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
		    System.out.println("Handled exception....");
		    System.out.println(e.getMessage());
			
		}
		catch(NullPointerException e  )
		{
		  
			System.out.println("Hnadled exception");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
		  
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
	
		
	
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
		}
		System.out.println("Program ended");
		}
		
		
		
		
	}
	
	


