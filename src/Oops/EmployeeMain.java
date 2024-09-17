package Oops;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp1=new Employee();
		emp1.id=1000;
		emp1.name="gopal";
		emp1.salary=20000;
		emp1.job="junior software engineer";
		emp1.display();
		System.out.println("the second employee details are");
		emp1.id=1000;
		emp1.name="Rajesh";
		emp1.salary=40000;
		emp1.job="junior software engineer";
		emp1.display();
		



	}

}
