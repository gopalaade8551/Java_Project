package Access_modifiers_34;

public class Student {
	protected int Rollno=111;
	
	protected Student()
	{
		Rollno=112;
	}
	protected void printRollno()
	{
		System.out.println(Rollno);
	}
	private void abc()
	{
		System.out.println(Rollno);
	}

}
