package P_38_Polymorphism;


 class parent_class
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int multiple(int x,int y)
	{
		return x*y;
	}
}

public class child_class extends parent_class {

	    
	@Override
	    public int add(int x,int y)
	    {
	    	return x+y;
	    }
	

}
