package Oops;

public class Employee {
	
	//variables
	int id;
	String name;
	int salary;
	String job;
	
	//methods
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(job);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.id=1000;
		emp1.name="gopal";
		emp1.salary=20000;
		emp1.job="junior software engineer";
		emp1.display();

	}

}
