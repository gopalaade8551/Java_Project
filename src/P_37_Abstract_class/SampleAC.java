package P_37_Abstract_class;

public abstract class SampleAC implements Laptop{
	

public void cut() {
		
		System.out.println("the lenovo cut code");
		
	}

	
	public void copy() {
		System.out.println("the lenovo copy related code");
		
	}

	
	public abstract void paste();

	public abstract void delete();
	
	

}
