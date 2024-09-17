package Oops;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//student s1=new student();
		
		
		// 1)Using object reference
//		s1.grade="A";
//		s1.sid=102;
//		s1.name="ramesh";
		
		// 2)using method we can assign value to the variable
//		s1.setstudentdata(101, "gopal", "A");
//		s1.printstudentdata();
		
		// 3)Using constructor
		
          student s1=new student(101,"Goapl","A");
          s1.printstudentdata();
	}

}
