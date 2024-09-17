package day_12;

public class Student {
	
	int id;
	String name;
	
	Student()
	{
		System.out.println("this is default constructor");
	}
	Student(int i,String n)
	{
		id=i;
		name=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		System.out.println("default constructor values "+s.id+" name "+s.name);
		Student s1=new Student(10,"ramesh");
		System.out.println("intialized constructor values id is  "+s1.id+" name "+s1.name);
		

	}

}
