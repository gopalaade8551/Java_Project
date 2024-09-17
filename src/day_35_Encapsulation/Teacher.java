package day_35_Encapsulation;

public class Teacher {

	public static void main(String[] args) {
		
		Student s=new Student(101);
		
		s.Setisattandance(true);
		s.Getisattandance();
		s.setRollno(88);
		System.out.println(s.getRollno());
//		s.setRollno(88);
// s.getRollno();
//	s.setName("gopal");
//	s.getName();
		
		

	}

}
