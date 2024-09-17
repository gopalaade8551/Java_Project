package Memory_Management;

public class Employee {
	
	int orgId=45554;
	String orgname="HRYTutorial";
	String ceo="Yadagiri";
	int noofdepts=2;
	static double networth=500.00;
	

	public static void main(String[] args) {
      int empid=101;
      String empName="Jhon";
      double salary=5000.0;
      Employee e1=new Employee();
      System.out.println(e1.getorgid());
      Employee e2=new Employee();
      e2.deleteemployee(101);
      
	}
	
	public int getorgid()
	{
		return orgId;
	}
	public static double getNetworth()
	{
		return networth;
	}
	public void deleteemployee(int empid)
	{
		
	}

}
